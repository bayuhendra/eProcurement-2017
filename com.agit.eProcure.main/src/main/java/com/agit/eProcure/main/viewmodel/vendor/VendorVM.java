package com.agit.eProcure.main.viewmodel.vendor;

import com.agit.eProcure.common.application.DataLoginService;
import com.agit.eProcure.common.dto.vendor.DataLoginDTO;
import com.agit.eProcure.common.dto.vendor.DataLoginDTOBuilder;
import com.agit.eProcure.common.dto.vendor.DataPerusahaanDTO;
import com.agit.eProcure.common.dto.vendor.DataSegmentasiDTO;
import com.agit.eProcure.common.security.SecurityUtil;
import com.agit.eProcure.shared.zul.CommonViewModel;
import static com.agit.eProcure.shared.zul.CommonViewModel.showInformationMessagebox;
import com.agit.eProcure.shared.zul.PageNavigation;
import com.agit.eProcure.util.CommonUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.codehaus.groovy.ast.tools.GeneralUtils.params;
import org.zkoss.bind.BindContext;
import org.zkoss.bind.BindUtils;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.bind.annotation.ExecutionArgParam;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.io.Files;
import org.zkoss.util.media.Media;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.UploadEvent;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Window;

/**
 *
 * @author Bayu Hendra Setiawan
 */
@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class VendorVM extends SelectorComposer<Window> {

    /* Import Service Data Login */
    @WireVariable
    DataLoginService dataLoginService;

    private String idDataLogin;

    /* Object Binding for Form Data Login */
    private List<DataLoginDTO> dataLoginDTOs = new ArrayList();
    private DataLoginDTO dataLoginDTO = new DataLoginDTO();

    private List<DataSegmentasiDTO> dataSegmentasiDTOs = new ArrayList();
    private DataSegmentasiDTO dataSegmentasiDTO = new DataSegmentasiDTO();

    private List<DataPerusahaanDTO> dataPerusahaanDTOs = new ArrayList();
    private DataPerusahaanDTO dataPerusahaanDTO = new DataPerusahaanDTO();

    private String src = "/eProcure/vendor/data_login.zul";

    /* attribut for upload file Data Login */
    private PageNavigation previous;
    Media mediaUploadLogo;
    Media mediaUploadHeaderImage;
    String mediaNameUploadLogo;
    String mediaNameUploadHeaderImage;
    private String filepathUploadLogo;
    private String filepathUploadHeaderImage;
    private String pathLocationUploadLogo;
    private String pathLocationUploadHeaderImage;

    @Init
    public void init(
            @ExecutionArgParam("petunjukRKAPDTO") DataLoginDTO dataLogin,
            @ExecutionArgParam("previous") PageNavigation previous) {

        /* Load Data */
        initData();

        /* Check Validity */
        checkValidity(dataLogin, previous);
    }

    private void initData() {
        /* get all pelayanan */
        dataLoginDTOs = dataLoginService.findAll();
        if (dataLoginDTOs.isEmpty()) {
            dataLoginDTOs = Collections.emptyList();
        }

    }

    private void checkValidity(DataLoginDTO dataLogin, PageNavigation previous) {
        if (dataLogin == null) {
            ListModelList<DataLoginDTO> parameterList = new ListModelList<>(dataLoginService.findAll());
            String idDataLogin = "";
            if (parameterList.isEmpty()) {
                idDataLogin = "P001";
            } else {
                idDataLogin = getLatestObjectID(parameterList, "idDataLogin");
            }
            dataLoginDTO = new DataLoginDTOBuilder()
                    .setIdDataLogin(idDataLogin)
                    .setCreatedBy(SecurityUtil.getUserName())
                    .setCreatedDate(new Date())
                    .createDataLoginDTO();
        } else {
            this.dataLoginDTO = dataLogin;
            mediaNameUploadLogo = dataLoginDTO.getLogo();
            mediaNameUploadHeaderImage = dataLoginDTO.getHeaderImage();
            idDataLogin = dataLoginDTO.getIdDataLogin();
            this.previous = previous;
        }

    }

    protected String getLatestObjectID(ListModelList list, String attribute) {
        int count = 0;
        int pointer = 0;
        int max = 0;
        String s = "";
        for (Object obj : list) {
            Map<String, Object> map = CommonUtil.convertObject2Map(obj);
            String att = attribute;
            String[] arr = new String[attribute.length()];
            String key = "";

            if (att.contains(".")) {
                arr = att.split("\\.");
                int f = 1;
                for (Object x : arr) {
                    if (f != arr.length) {
                        map = CommonUtil.convertObject2Map(map.get(x.toString()));
                    } else {
                        key = x.toString();
                    }
                    f += 1;
                }
            } else {
                key = att;
            }

            att = map.get(key).toString();

            String temp = "";
            int countTemp = 0;
            for (int i = att.length(); i > 0; i--) {
                if (Character.isLetter(att.charAt(i - 1))) {
                    pointer = i;
                    s = att.substring(0, pointer);
                    break;
                }
                countTemp += 1;
                temp = att.charAt(i - 1) + temp;
            }
            if (Integer.parseInt(temp) > max) {
                max = Integer.parseInt(temp);
            }
            count = countTemp;
        }

        return s + String.format("%0" + count + "d", max + 1);
    }

    @Command("uploadFileLogo")
    @NotifyChange({"mediaNameUploadLogo", "pathLocationUploadLogo"})
    public void uploadFileLogo(@ContextParam(ContextType.BIND_CONTEXT) BindContext ctx) throws IOException {
        UploadEvent upEvent = null;
        Object objUploadEvent = ctx.getTriggerEvent();

        if (objUploadEvent != null && (objUploadEvent instanceof UploadEvent)) {
            upEvent = (UploadEvent) objUploadEvent;
        }

        if (upEvent != null) {
            mediaUploadLogo = upEvent.getMedia();

            if (mediaUploadLogo instanceof org.zkoss.image.Image) {
                if (mediaUploadLogo.getByteData().length > 1024 * 1024) {
                    Messagebox.show("Ukuran Gambar/Foto yang diupload tidak boleh lebih dari 1 Mb ", "Peringatan", Messagebox.OK, Messagebox.EXCLAMATION);
                    return;
                }
                Calendar now = Calendar.getInstance();
                int year = now.get(Calendar.YEAR);
                int month = now.get(Calendar.MONTH);
                int day = now.get(Calendar.DAY_OF_MONTH);
                filepathUploadLogo = Executions.getCurrent().getDesktop().getWebApp().getRealPath("/");
                filepathUploadLogo = filepathUploadLogo + "\\" + "files" + "\\" + "eProcure-logo" + "\\" + year + "\\" + month + "\\" + day + "\\";

                File baseDir = new File(filepathUploadLogo);
                if (!baseDir.exists()) {
                    baseDir.mkdirs();
                }

                Files.copy(new File(filepathUploadLogo + mediaUploadLogo.getName()), mediaUploadLogo.getStreamData());
                setMediaNameUploadLogo(filepathUploadLogo + mediaUploadLogo.getName());
                pathLocationUploadLogo = "/" + "files" + "/" + "eProcure-logo" + "/" + year + "/" + month + "/" + day + "/" + mediaUploadLogo.getName();
            } else {
                Calendar now = Calendar.getInstance();
                int year = now.get(Calendar.YEAR);
                int month = now.get(Calendar.MONTH);
                int day = now.get(Calendar.DAY_OF_MONTH);
                mediaNameUploadLogo = "";
                pathLocationUploadLogo = "/" + "files" + "/" + "eProcure-logo" + "/" + year + "/" + month + "/" + day + "/" + mediaUploadLogo.getName();
                Messagebox.show("File : " + mediaUploadLogo + " Bukan File Gambar", "Error", Messagebox.OK, Messagebox.ERROR);
            }

        }
    }

    @Command("uploadFileHeaderImage")
    @NotifyChange({"mediaNameUploadHeaderImage", "pathLocationUploadHeaderImage"})
    public void uploadFileHeaderImage(@ContextParam(ContextType.BIND_CONTEXT) BindContext ctx) throws IOException {
        UploadEvent upEvent = null;
        Object objUploadEvent = ctx.getTriggerEvent();

        if (objUploadEvent != null && (objUploadEvent instanceof UploadEvent)) {
            upEvent = (UploadEvent) objUploadEvent;
        }

        if (upEvent != null) {
            mediaUploadHeaderImage = upEvent.getMedia();

            if (mediaUploadHeaderImage instanceof org.zkoss.image.Image) {
                if (mediaUploadHeaderImage.getByteData().length > 1024 * 1024) {
                    Messagebox.show("Ukuran Gambar/Foto yang diupload tidak boleh lebih dari 1 Mb ", "Peringatan", Messagebox.OK, Messagebox.EXCLAMATION);
                    return;
                }
                Calendar now = Calendar.getInstance();
                int year = now.get(Calendar.YEAR);
                int month = now.get(Calendar.MONTH);
                int day = now.get(Calendar.DAY_OF_MONTH);
                filepathUploadHeaderImage = Executions.getCurrent().getDesktop().getWebApp().getRealPath("/");
                filepathUploadHeaderImage = filepathUploadHeaderImage + "\\" + "files" + "\\" + "eProcure-header-image" + "\\" + year + "\\" + month + "\\" + day + "\\";

                File baseDir = new File(filepathUploadHeaderImage);
                if (!baseDir.exists()) {
                    baseDir.mkdirs();
                }

                Files.copy(new File(filepathUploadHeaderImage + mediaUploadHeaderImage.getName()), mediaUploadHeaderImage.getStreamData());
                setMediaNameUploadHeaderImage(filepathUploadHeaderImage + mediaUploadHeaderImage.getName());
                pathLocationUploadHeaderImage = "/" + "files" + "/" + "eProcure-header-image" + "/" + year + "/" + month + "/" + day + "/" + mediaUploadHeaderImage.getName();
            } else {
                Calendar now = Calendar.getInstance();
                int year = now.get(Calendar.YEAR);
                int month = now.get(Calendar.MONTH);
                int day = now.get(Calendar.DAY_OF_MONTH);
                mediaNameUploadHeaderImage = "";
                pathLocationUploadHeaderImage = "/" + "files" + "/" + "eProcure-header-image" + "/" + year + "/" + month + "/" + day + "/" + mediaUploadHeaderImage.getName();
                Messagebox.show("File : " + mediaUploadHeaderImage + " Bukan File Gambar", "Error", Messagebox.OK, Messagebox.ERROR);
            }

        }
    }

    @Command("buttonSaveDataLogin")
    @NotifyChange({"dataLoginDTO", "mediaNameUploadHeaderImage", "pathLocationUploadHeaderImage", "mediaNameUploadLogo", "pathLocationUploadLogo","src"})
    public void buttonSaveDataLogin(@BindingParam("object") DataLoginDTO obj, @ContextParam(ContextType.VIEW) Window window) {

        if (pathLocationUploadLogo == null) {
            pathLocationUploadLogo = dataLoginDTO.getLogo();
        } else if (pathLocationUploadHeaderImage == null) {
            pathLocationUploadHeaderImage = dataLoginDTO.getHeaderImage();
        }

        dataLoginDTO.setLogo(pathLocationUploadLogo);
        dataLoginDTO.setHeaderImage(pathLocationUploadHeaderImage);
        dataLoginService.SaveOrUpdate(dataLoginDTO);
        showInformationMessagebox("Data Login Berhasil Disimpan");
        BindUtils.postGlobalCommand(null, null, "refreshDataLogin", null);
        Map<String, Object> params = new HashMap<>();
        params.put("dataLoginDTO", obj);
        CommonViewModel.navigateTo("/eProcure/vendor/data_perusahaan.zul", window, params);
    }

    @GlobalCommand
    @NotifyChange("dataLoginDTOs")
    public void refreshDataLogin() {
        dataLoginDTOs = dataLoginService.findAll();
    }

    /* functional for page Data Login */
    @Command("buttonKlikDataLogin")
    @NotifyChange("src")
    public void buttonKlikDataLogin(@BindingParam("object") DataLoginDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/vendor/data_login.zul";
    }

    /* functional for page Data Perusahaan */
    @Command("buttonKlikDataPerusahaan")
    @NotifyChange("src")
    public void buttonKlikDataPerusahaan(@ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/vendor/data_perusahaan.zul";
    }

    @Command("buttonKlikDataPerusahaanPICForm")
    @NotifyChange("dataPerusahaanDTO")
    public void buttonKlikDataPerusahaanPICForm(@BindingParam("object") DataPerusahaanDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        Map<String, Object> params = new HashMap<>();
        params.put("dataPerusahaanDTO", obj);
        CommonViewModel.navigateToWithoutDetach("/eProcure/vendor/data_perusahaan_form.zul", window, params);
    }

    @Command("buttonKlikBackFormPIC")
//    @NotifyChange({"dataPerusahaanDTO", "dataPerusahaanDTOs"})
    public void buttonBackFormPIC(@BindingParam("object") @ContextParam(ContextType.VIEW) Window window) {
        window.detach();
    }

    @Command("buttonKlikSaveFormPIC")
    @NotifyChange({"dataPerusahaanDTO", "dataPerusahaanDTOs"})
    public void buttonSaveFormPIC(@BindingParam("object") DataPerusahaanDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        window.detach();
    }

    /* functional for page Data Segmentasi */
    @Command("buttonKlikDataSegmentasi")
    @NotifyChange("src")
    public void buttonKlikDataSegmentasi(@ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/vendor/data_segmentasi.zul";
    }

    @Command("buttonKlikDataTambahSegmentasi")
    @NotifyChange("dataSegmentasiDTO")
    public void buttonKlikDataTambahSegmentasi(@BindingParam("object") DataSegmentasiDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        Map<String, Object> params = new HashMap<>();
        params.put("dataSegmentasiDTO", obj);
        CommonViewModel.navigateToWithoutDetach("/eProcure/vendor/data_tambah_segmentasi.zul", window, params);
    }

    /* functional for page Data Bank */
    @Command("buttonKlikDataBank")
    @NotifyChange("src")
    public void buttonKlikDataBank(@ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/vendor/data_bank.zul";
    }

    @Command("buttonKembaliDataSegmentasi")
    @NotifyChange("dataSegmentasiDTO")
    public void buttonKembaliDataSegmentasi(@BindingParam("object") DataSegmentasiDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        window.detach();
    }

    /* functional for page Data Pengalaman*/
    @Command("buttonKlikDataPengalaman")
    @NotifyChange("src")
    public void buttonKlikDataPengalaman(@ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/vendor/data_pengalaman.zul";
    }

    /* functional for page Data Pengalaman*/
    @Command("buttonKlikDataDokumen")
    @NotifyChange("src")
    public void buttonKlikDataDokumen(@ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/vendor/data_dokumen.zul";
    }

    /* getter setter */
    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public List<DataLoginDTO> getDataLoginDTOs() {
        return dataLoginDTOs;
    }

    public void setDataLoginDTOs(List<DataLoginDTO> dataLoginDTOs) {
        this.dataLoginDTOs = dataLoginDTOs;
    }

    public DataLoginDTO getDataLoginDTO() {
        return dataLoginDTO;
    }

    public void setDataLoginDTO(DataLoginDTO dataLoginDTO) {
        this.dataLoginDTO = dataLoginDTO;
    }

    public List<DataSegmentasiDTO> getDataSegmentasiDTOs() {
        return dataSegmentasiDTOs;
    }

    public void setDataSegmentasiDTOs(List<DataSegmentasiDTO> dataSegmentasiDTOs) {
        this.dataSegmentasiDTOs = dataSegmentasiDTOs;
    }

    public DataSegmentasiDTO getDataSegmentasiDTO() {
        return dataSegmentasiDTO;
    }

    public void setDataSegmentasiDTO(DataSegmentasiDTO dataSegmentasiDTO) {
        this.dataSegmentasiDTO = dataSegmentasiDTO;
    }

    public List<DataPerusahaanDTO> getDataPerusahaanDTOs() {
        return dataPerusahaanDTOs;
    }

    public void setDataPerusahaanDTOs(List<DataPerusahaanDTO> dataPerusahaanDTOs) {
        this.dataPerusahaanDTOs = dataPerusahaanDTOs;
    }

    public DataPerusahaanDTO getDataPerusahaanDTO() {
        return dataPerusahaanDTO;
    }

    public void setDataPerusahaanDTO(DataPerusahaanDTO dataPerusahaanDTO) {
        this.dataPerusahaanDTO = dataPerusahaanDTO;
    }

    public Media getMediaUploadLogo() {
        return mediaUploadLogo;
    }

    public void setMediaUploadLogo(Media mediaUploadLogo) {
        this.mediaUploadLogo = mediaUploadLogo;
    }

    public Media getMediaUploadHeaderImage() {
        return mediaUploadHeaderImage;
    }

    public void setMediaUploadHeaderImage(Media mediaUploadHeaderImage) {
        this.mediaUploadHeaderImage = mediaUploadHeaderImage;
    }

    public String getMediaNameUploadLogo() {
        return mediaNameUploadLogo;
    }

    public void setMediaNameUploadLogo(String mediaNameUploadLogo) {
        this.mediaNameUploadLogo = mediaNameUploadLogo;
    }

    public String getMediaNameUploadHeaderImage() {
        return mediaNameUploadHeaderImage;
    }

    public void setMediaNameUploadHeaderImage(String mediaNameUploadHeaderImage) {
        this.mediaNameUploadHeaderImage = mediaNameUploadHeaderImage;
    }

    public String getFilepathUploadLogo() {
        return filepathUploadLogo;
    }

    public void setFilepathUploadLogo(String filepathUploadLogo) {
        this.filepathUploadLogo = filepathUploadLogo;
    }

    public String getFilepathUploadHeaderImage() {
        return filepathUploadHeaderImage;
    }

    public void setFilepathUploadHeaderImage(String filepathUploadHeaderImage) {
        this.filepathUploadHeaderImage = filepathUploadHeaderImage;
    }

    public String getPathLocationUploadLogo() {
        return pathLocationUploadLogo;
    }

    public void setPathLocationUploadLogo(String pathLocationUploadLogo) {
        this.pathLocationUploadLogo = pathLocationUploadLogo;
    }

    public String getPathLocationUploadHeaderImage() {
        return pathLocationUploadHeaderImage;
    }

    public void setPathLocationUploadHeaderImage(String pathLocationUploadHeaderImage) {
        this.pathLocationUploadHeaderImage = pathLocationUploadHeaderImage;
    }

}
