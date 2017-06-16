package com.agit.eProcure.main.viewmodel.vendor;

import com.agit.eProcure.common.application.DataBankService;
import com.agit.eProcure.common.application.DataDokumenService;
import com.agit.eProcure.common.application.DataKeuanganService;
import com.agit.eProcure.common.application.DataLoginService;
import com.agit.eProcure.common.application.DataPenanggungJawabService;
import com.agit.eProcure.common.application.DataPengalamanService;
import com.agit.eProcure.common.application.DataPeralatanService;
import com.agit.eProcure.common.application.DataPerusahaanService;
import com.agit.eProcure.common.application.DataSegmentasiService;
import com.agit.eProcure.common.dto.vendor.DataBankDTO;
import com.agit.eProcure.common.dto.vendor.DataBankDTOBuilder;
import com.agit.eProcure.common.dto.vendor.DataDokumenDTO;
import com.agit.eProcure.common.dto.vendor.DataDokumenDTOBuilder;
import com.agit.eProcure.common.dto.vendor.DataKeuanganDTO;
import com.agit.eProcure.common.dto.vendor.DataKeuanganDTOBuilder;
import com.agit.eProcure.common.dto.vendor.DataLoginDTO;
import com.agit.eProcure.common.dto.vendor.DataLoginDTOBuilder;
import com.agit.eProcure.common.dto.vendor.DataPenanggungJawabDTO;
import com.agit.eProcure.common.dto.vendor.DataPenanggungJawabDTOBuilder;
import com.agit.eProcure.common.dto.vendor.DataPengalamanDTO;
import com.agit.eProcure.common.dto.vendor.DataPeralatanDTO;
import com.agit.eProcure.common.dto.vendor.DataPeralatanDTOBuilder;
import com.agit.eProcure.common.dto.vendor.DataPerusahaanDTO;
import com.agit.eProcure.common.dto.vendor.DataPerusahaanDTOBuilder;
import com.agit.eProcure.common.dto.vendor.DataSegmentasiDTO;
import com.agit.eProcure.common.dto.vendor.DataSegmentasiDTOBuilder;
import com.agit.eProcure.common.security.SecurityUtil;
import com.agit.eProcure.shared.type.AssosiasiType;
import com.agit.eProcure.shared.type.BidangUsahaType;
import com.agit.eProcure.shared.type.BuktiKepemilikan;
import com.agit.eProcure.shared.type.JabatanType;
import com.agit.eProcure.shared.type.KondisiPeralatan;
import com.agit.eProcure.shared.type.KualifikasiType;
import com.agit.eProcure.shared.type.MataUangType;
import com.agit.eProcure.shared.type.PKPType;
import com.agit.eProcure.shared.type.PerusahaanType;
import com.agit.eProcure.shared.type.UnitType;
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
import org.zkoss.zk.ui.event.Event;
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

    @WireVariable
    DataPerusahaanService dataPerusahaanService;

    @WireVariable
    DataBankService dataBankService;

    @WireVariable
    DataSegmentasiService dataSegmentasiService;

    @WireVariable
    DataPengalamanService dataPengalamanService;

    @WireVariable
    DataPenanggungJawabService dataPenanggungJawabService;

    @WireVariable
    DataDokumenService dataDokumenService;

    @WireVariable
    DataPeralatanService dataPeralatanService;

    @WireVariable
    DataKeuanganService dataKeuanganService;

    /* Paramater Data All Vendor */
    private String idDataLogin;
    private String idDataPerusahaan;
    private String idPenanggungJawab;
    private String idDataBank;
    private String idDataSegmentasi;
    private String nama;
    private JabatanType jabatan;
    private String email;
    private String dokumenID;
    private String idDataPeralatan;
    private String idDataKeuangan;

    /* Function For Combobox  */
    private ListModelList<KualifikasiType> kualifikasiTypes;
    private ListModelList<UnitType> unitTypes;
    private ListModelList<PerusahaanType> perusahaanTypes;
    private ListModelList<JabatanType> jabatanTypes;
    private ListModelList<MataUangType> mataUangTypes;
    private ListModelList<BidangUsahaType> bidangUsahaTypes;
    private ListModelList<AssosiasiType> assosiasiTypes;
    private ListModelList<PKPType> listPKPType = new ListModelList<>();
    private ListModelList<String> kota = new ListModelList<>();
    private ListModelList<String> propinsi = new ListModelList<>();
    private ListModelList<String> negara = new ListModelList<>();
    private ListModelList<String> namaBank = new ListModelList<>();
    private ListModelList<String> subjectDokumenLegal = new ListModelList<>();
    private ListModelList<String> subjectDokumenTeknis = new ListModelList<>();
    private ListModelList<KondisiPeralatan> kondisiPeralatans;
    private ListModelList<BuktiKepemilikan> buktiKepemilikans;


    /* Object Binding for Form Data Login */
    private DataLoginDTO dataLoginDTO = new DataLoginDTO();
    private List<DataLoginDTO> dataLoginDTOs = new ArrayList();
    private DataPerusahaanDTO dataPerusahaanDTO = new DataPerusahaanDTO();
    private List<DataPerusahaanDTO> dataPerusahaanDTOs = new ArrayList();
    private DataBankDTO dataBankDTO = new DataBankDTO();
    private List<DataBankDTO> dataBankDTOs = new ArrayList();
    private DataPenanggungJawabDTO dataPenanggungJawabDTO = new DataPenanggungJawabDTO();
    private List<DataPenanggungJawabDTO> dataPenanggungJawabDTOs = new ArrayList();
    private DataSegmentasiDTO dataSegmentasiDTO = new DataSegmentasiDTO();
    private List<DataSegmentasiDTO> dataSegmentasiDTOs = new ArrayList();
    private DataPengalamanDTO dataPengalamanDTO = new DataPengalamanDTO();
    private List<DataPengalamanDTO> dataPengalamanDTOs = new ArrayList();
    private DataDokumenDTO dataDokumenDTO = new DataDokumenDTO();
    private List<DataDokumenDTO> dataDokumenDTOs = new ArrayList();
    private DataPeralatanDTO dataPeralatanDTO = new DataPeralatanDTO();
    private List<DataPeralatanDTO> dataPeralatanDTOs = new ArrayList();
    private DataKeuanganDTO dataKeuanganDTO = new DataKeuanganDTO();
    private List<DataKeuanganDTO> dataKeuanganDTOs = new ArrayList();


    /* for home instance */
    private String src = "/eProcure/vendor/data_login.zul";
    private PKPType pKPType;
    private boolean disablePKP;
    private DataPerusahaanDTO pkpTypeDisable;

    /* attribut for upload file Data Login */
    private PageNavigation previous;
    Media mediaUploadLogo;
    Media mediaUploadDataDokumen;
    Media mediaUploadHeaderImage;
    Media mediaUploadBuktiKepemilikan;
    Media mediaUploadGambarPeralatan;

    String mediaNameUploadLogo;
    String mediaNameUploadDataDokumen;
    String mediaNameUploadHeaderImage;
    String mediaNameUploadBuktiKepemilikan;
    String mediaNameUploadGambarPeralatan;

    private String filepathUploadLogo;
    private String filepathUploadDataDokumen;
    private String filepathUploadHeaderImage;
    private String filepathUploadBuktiKepemilikan;
    private String filepathUploadGambarPeralatan;

    private String pathLocationUploadLogo;
    private String pathLocationUploadDataDokumen;
    private String pathLocationUploadHeaderImage;
    private String pathLocationUploadBuktiKepemilikan;
    private String pathLocationUploadGambarPeralatan;

    @Init
    public void init(
            @ExecutionArgParam("dataLoginDTO") DataLoginDTO dataLogin,
            @ExecutionArgParam("dataPerusahaanDTO") DataPerusahaanDTO dataPerusahaan,
            @ExecutionArgParam("dataPenanggungJawabDTO") DataPenanggungJawabDTO dataPenanggungJawab,
            @ExecutionArgParam("dataBankDTO") DataBankDTO dataBank,
            @ExecutionArgParam("dataSegmentasiDTO") DataSegmentasiDTO dataSegmentasi,
            @ExecutionArgParam("dataDokumenDTO") DataDokumenDTO dataDokumen,
            @ExecutionArgParam("dataPeralatanDTO") DataPeralatanDTO dataPeralatan,
            @ExecutionArgParam("dataKeuanganDTO") DataKeuanganDTO dataKeuangan,
            @ExecutionArgParam("previous") PageNavigation previous) {

        /* Load Data */
        initData();

        /* Check Validity */
        checkValidity(dataLogin, dataPerusahaan, dataBank, dataPenanggungJawab, dataSegmentasi, dataDokumen, dataPeralatan, dataKeuangan, previous);
    }

    private void initData() {
        dataLoginDTOs = dataLoginService.findAll();
        if (dataLoginDTOs.isEmpty()) {
            dataLoginDTOs = Collections.emptyList();
        }
        dataPerusahaanDTOs = dataPerusahaanService.findAll();
        if (dataPerusahaanDTOs.isEmpty()) {
            dataPerusahaanDTOs = Collections.emptyList();
        }
        dataBankDTOs = dataBankService.findAll();
        if (dataBankDTOs.isEmpty()) {
            dataBankDTOs = Collections.emptyList();
        }
        dataPenanggungJawabDTOs = dataPenanggungJawabService.findAll();
        if (dataPenanggungJawabDTOs.isEmpty()) {
            dataPenanggungJawabDTOs = Collections.emptyList();
        }
        dataSegmentasiDTOs = dataSegmentasiService.findAll();
        if (dataSegmentasiDTOs.isEmpty()) {
            dataSegmentasiDTOs = Collections.emptyList();
        }

        dataDokumenDTOs = dataDokumenService.findAll();
        if (dataDokumenDTOs.isEmpty()) {
            dataDokumenDTOs = Collections.emptyList();
        }

        dataPeralatanDTOs = dataPeralatanService.findAll();
        if (dataPeralatanDTOs.isEmpty()) {
            dataPeralatanDTOs = Collections.emptyList();
        }
        dataKeuanganDTOs = dataKeuanganService.findAll();
        if (dataKeuanganDTOs.isEmpty()) {
            dataKeuanganDTOs = Collections.emptyList();
        }

        kota.add("SEMARANG");
        kota.add("SURABAYA");
        kota.add("BANDUNG");

        propinsi.add("JAWA TENGAH");
        propinsi.add("JAWA TIMUR");
        propinsi.add("JAWA BARAT");

        negara.add("INDONESIA");
        negara.add("MALAYSIA");
        negara.add("SINGAPORE");

        namaBank.add("BANK BRI");
        namaBank.add("BANK BCA");
        namaBank.add("BANK DANAMON");

        subjectDokumenLegal.add("1. Vendor Registrasi Form");
        subjectDokumenLegal.add("2. Salinan Akte Pendirian Perusahaan dan Perubahannya");
        subjectDokumenLegal.add("3. Salinan Tanda Daftar Perusahaan (TDP)");
        subjectDokumenLegal.add("4. Salinan Surat Ijin Usaha (SIUP/SIUJK)");
        subjectDokumenLegal.add("5. Bukti Fisik Perusahaan");
        subjectDokumenLegal.add("6. Dokumen Quality yang dimiliki");
        subjectDokumenLegal.add("7. Dokumen Teknik");
    }

    private void checkValidity(DataLoginDTO dataLogin, DataPerusahaanDTO dataPerusahaan, DataBankDTO dataBank, DataPenanggungJawabDTO dataPenanggungJawab, DataSegmentasiDTO dataSegmentasi, DataDokumenDTO dataDokumen, DataPeralatanDTO dataPeralatan, DataKeuanganDTO dataKeuangan, PageNavigation previous) {
        if (dataLogin == null) {
            ListModelList<DataLoginDTO> parameterList = new ListModelList<>(dataLoginService.findAll());
            String idDataLogin = "";
            if (parameterList.isEmpty()) {
                idDataLogin = "1";
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
        if (dataPerusahaan == null) {
            ListModelList<DataPerusahaanDTO> parameterList = new ListModelList<>(dataPerusahaanService.findAll());
            String idPerusahaan = "";
            if (parameterList.isEmpty()) {
                idPerusahaan = "1";
            } else {
                idPerusahaan = getLatestObjectID(parameterList, "idPerusahaan");
            }
            dataPerusahaanDTO = new DataPerusahaanDTOBuilder()
                    .setIdPerusahaan(idPerusahaan)
                    .setCreatedBy(SecurityUtil.getUserName())
                    .setCreatedDate(new Date())
                    .createDataPerusahaanDTO();
        } else {
            this.dataPerusahaanDTO = dataPerusahaan;
            idDataPerusahaan = dataPerusahaanDTO.getIdPerusahaan();

            this.previous = previous;
        }
        if (dataBank == null) {
            ListModelList<DataBankDTO> parameterList = new ListModelList<>(dataBankService.findAll());
            String idDataBank = "";
            if (parameterList.isEmpty()) {
                idDataBank = "1";
            } else {
                idDataBank = getLatestObjectID(parameterList, "idDataBank");
            }
            dataBankDTO = new DataBankDTOBuilder()
                    .setIdDataBank(idDataBank)
                    .setCreatedBy(SecurityUtil.getUserName())
                    .setCreatedDate(new Date())
                    .createDataBankDTO();
        } else {
            this.dataBankDTO = dataBank;
            idDataBank = dataBankDTO.getIdDataBank();
            this.previous = previous;
        }

        if (dataPenanggungJawab == null) {
            ListModelList<DataPenanggungJawabDTO> parameterList = new ListModelList<>(dataPenanggungJawabService.findAll());
            String idPenanggungJawab = "";
            if (parameterList.isEmpty()) {
                idPenanggungJawab = "1";
            } else {
                idPenanggungJawab = getLatestObjectID(parameterList, "idPenanggungJawab");
            }
            dataPenanggungJawabDTO = new DataPenanggungJawabDTOBuilder()
                    .setIdPerusahaan(idDataPerusahaan)
                    .setIdPenanggungJawab(idPenanggungJawab)
                    .setCreatedBy(SecurityUtil.getUserName())
                    .setCreatedDate(new Date())
                    .createDataPenanggungJawabDTO();
        } else {
            this.dataPenanggungJawabDTO = dataPenanggungJawab;
            idPenanggungJawab = dataPenanggungJawabDTO.getIdPenanggungJawab();
            idDataPerusahaan = dataPenanggungJawabDTO.getIdPerusahaan();
            this.previous = previous;
        }
        if (dataSegmentasi == null) {
            ListModelList<DataSegmentasiDTO> parameterList = new ListModelList<>(dataSegmentasiService.findAll());
            String idDataSegmentasi = "";
            if (parameterList.isEmpty()) {
                idDataSegmentasi = "1";
            } else {
                idDataSegmentasi = getLatestObjectID(parameterList, "idDataSegmentasi");
            }
            dataSegmentasiDTO = new DataSegmentasiDTOBuilder()
                    .setIdDataSegmentasi(idDataSegmentasi)
                    .setCreatedBy(SecurityUtil.getUserName())
                    .setCreatedDate(new Date())
                    .createDataSegmentasiDTO();
        } else {
            this.dataSegmentasiDTO = dataSegmentasi;
            idDataSegmentasi = dataSegmentasiDTO.getIdDataSegmentasi();
            this.previous = previous;
        }
        if (dataDokumen == null) {
            ListModelList<DataDokumenDTO> parameterList = new ListModelList<>(dataDokumenService.findAll());
            String dokumenID = "";
            if (parameterList.isEmpty()) {
                dokumenID = "1";
            } else {
                dokumenID = getLatestObjectID(parameterList, "dokumenID");
            }
            dataDokumenDTO = new DataDokumenDTOBuilder()
                    .setDokumenID(dokumenID)
                    .setCreateBy(SecurityUtil.getUserName())
                    .setCreateDate(new Date())
                    .createDataDokumenDTO();
        } else {
            this.dataDokumenDTO = dataDokumen;
            mediaNameUploadDataDokumen = dataDokumenDTO.getUploadFile();
            dokumenID = dataDokumenDTO.getDokumenID();
            this.previous = previous;
        }
        if (dataPeralatan == null) {
            ListModelList<DataPeralatanDTO> parameterList = new ListModelList<>(dataPeralatanService.findAll());
            String idDataPeralatan = "";
            if (parameterList.isEmpty()) {
                idDataPeralatan = "1";
            } else {
                idDataPeralatan = getLatestObjectID(parameterList, "idDataPeralatan");
            }
            dataPeralatanDTO = new DataPeralatanDTOBuilder()
                    .setIdDataPeralatan(idDataPeralatan)
                    .setCreatedBy(SecurityUtil.getUserName())
                    .setCreatedDate(new Date())
                    .createDataPeralatanDTO();
        } else {
            this.dataPeralatanDTO = dataPeralatan;
            idDataPeralatan = dataPeralatanDTO.getIdDataPeralatan();
            mediaNameUploadBuktiKepemilikan = dataPeralatanDTO.getDokumenBuktiKepemilikan();
            this.previous = previous;
        }
        if (dataKeuangan == null) {
            ListModelList<DataKeuanganDTO> parameterList = new ListModelList<>(dataKeuanganService.findAll());
            String idDataKeuangan = "";
            if (parameterList.isEmpty()) {
                idDataKeuangan = "1";
            } else {
                idDataKeuangan = getLatestObjectID(parameterList, "idDataKeuangan");
            }
            dataKeuanganDTO = new DataKeuanganDTOBuilder()
                    .setIdDataKeuangan(idDataKeuangan)
                    .setCreatedBy(SecurityUtil.getUserName())
                    .setCreatedDate(new Date())
                    .createDataKeuanganDTO();
        } else {
            this.dataKeuanganDTO = dataKeuangan;
            idDataPeralatan = dataKeuanganDTO.getIdDataKeuangan();
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

    /* Function upload data login for login */
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

    /* Function upload data dokumen */
    @Command("uploadFileDataDokumen")
    @NotifyChange({"mediaNameUploadDataDokumen", "pathLocationUploadDataDokumen"})
    public void uploadFileDataDokumen(@ContextParam(ContextType.BIND_CONTEXT) BindContext ctx) throws IOException {
        UploadEvent upEvent = null;
        Object objUploadEvent = ctx.getTriggerEvent();

        if (objUploadEvent != null && (objUploadEvent instanceof UploadEvent)) {
            upEvent = (UploadEvent) objUploadEvent;
        }

        if (upEvent != null) {
            mediaUploadDataDokumen = upEvent.getMedia();
            Calendar now = Calendar.getInstance();
            int year = now.get(Calendar.YEAR);
            int month = now.get(Calendar.MONTH);
            int day = now.get(Calendar.DAY_OF_MONTH);
            filepathUploadDataDokumen = Executions.getCurrent().getDesktop().getWebApp().getRealPath("/");
            filepathUploadDataDokumen = filepathUploadDataDokumen + "\\" + "files" + "\\" + "eProcure-dokument" + "\\" + year + "\\" + month + "\\" + day + "\\";

            File baseDir = new File(filepathUploadDataDokumen);
            if (!baseDir.exists()) {
                baseDir.mkdirs();
            }

            Files.copy(new File(filepathUploadDataDokumen + mediaUploadDataDokumen.getName()), mediaUploadDataDokumen.getStreamData());
            setMediaNameUploadDataDokumen(filepathUploadDataDokumen + mediaUploadDataDokumen.getName());
            pathLocationUploadDataDokumen = "/" + "files" + "/" + "eProcure-dokument" + "/" + year + "/" + month + "/" + day + "/" + mediaUploadDataDokumen.getName();
        } else {
            Calendar now = Calendar.getInstance();
            int year = now.get(Calendar.YEAR);
            int month = now.get(Calendar.MONTH);
            int day = now.get(Calendar.DAY_OF_MONTH);
            mediaNameUploadDataDokumen = "";
            pathLocationUploadDataDokumen = "/" + "files" + "/" + "eProcure-logo" + "/" + year + "/" + month + "/" + day + "/" + mediaUploadDataDokumen.getName();
            Messagebox.show("File : " + mediaUploadDataDokumen + " Bukan File PDF", "Error", Messagebox.OK, Messagebox.ERROR);
        }

    }

    /* Function upload data dokumen */
    @Command("uploadFileBuktiKepemilikan")
    @NotifyChange({"mediaNameUploadBuktiKepemilikan", "pathLocationUploadBuktiKepemilikan"})
    public void uploadFileBuktiKepemilikan(@ContextParam(ContextType.BIND_CONTEXT) BindContext ctx) throws IOException {
        UploadEvent upEvent = null;
        Object objUploadEvent = ctx.getTriggerEvent();

        if (objUploadEvent != null && (objUploadEvent instanceof UploadEvent)) {
            upEvent = (UploadEvent) objUploadEvent;
        }

        if (upEvent != null) {
            mediaUploadBuktiKepemilikan = upEvent.getMedia();
            Calendar now = Calendar.getInstance();
            int year = now.get(Calendar.YEAR);
            int month = now.get(Calendar.MONTH);
            int day = now.get(Calendar.DAY_OF_MONTH);
            filepathUploadBuktiKepemilikan = Executions.getCurrent().getDesktop().getWebApp().getRealPath("/");
            filepathUploadBuktiKepemilikan = filepathUploadBuktiKepemilikan + "\\" + "files" + "\\" + "eProcure-dokument" + "\\" + year + "\\" + month + "\\" + day + "\\";

            File baseDir = new File(filepathUploadBuktiKepemilikan);
            if (!baseDir.exists()) {
                baseDir.mkdirs();
            }

            Files.copy(new File(filepathUploadBuktiKepemilikan + mediaUploadBuktiKepemilikan.getName()), mediaUploadBuktiKepemilikan.getStreamData());
            setMediaNameUploadBuktiKepemilikan(filepathUploadBuktiKepemilikan + mediaUploadBuktiKepemilikan.getName());
            pathLocationUploadBuktiKepemilikan = "/" + "files" + "/" + "eProcure-dokument" + "/" + year + "/" + month + "/" + day + "/" + mediaUploadBuktiKepemilikan.getName();
        } else {
            Calendar now = Calendar.getInstance();
            int year = now.get(Calendar.YEAR);
            int month = now.get(Calendar.MONTH);
            int day = now.get(Calendar.DAY_OF_MONTH);
            mediaNameUploadBuktiKepemilikan = "";
            pathLocationUploadBuktiKepemilikan = "/" + "files" + "/" + "eProcure-logo" + "/" + year + "/" + month + "/" + day + "/" + mediaUploadBuktiKepemilikan.getName();
            Messagebox.show("File : " + mediaUploadBuktiKepemilikan + " Bukan File PDF", "Error", Messagebox.OK, Messagebox.ERROR);
        }

    }

    /* Function upload data login for header image */
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

    /* Function upload data login for header image */
    @Command("uploadFileGambarPeralatan")
    @NotifyChange({"mediaNameUploadGambarPeralatan", "pathLocationUploadGambarPeralatan"})
    public void uploadFileGambarPeralatan(@ContextParam(ContextType.BIND_CONTEXT) BindContext ctx) throws IOException {
        UploadEvent upEvent = null;
        Object objUploadEvent = ctx.getTriggerEvent();

        if (objUploadEvent != null && (objUploadEvent instanceof UploadEvent)) {
            upEvent = (UploadEvent) objUploadEvent;
        }

        if (upEvent != null) {
            mediaUploadGambarPeralatan = upEvent.getMedia();

            if (mediaUploadGambarPeralatan instanceof org.zkoss.image.Image) {
                if (mediaUploadGambarPeralatan.getByteData().length > 1024 * 1024) {
                    Messagebox.show("Ukuran Gambar/Foto yang diupload tidak boleh lebih dari 1 Mb ", "Peringatan", Messagebox.OK, Messagebox.EXCLAMATION);
                    return;
                }
                Calendar now = Calendar.getInstance();
                int year = now.get(Calendar.YEAR);
                int month = now.get(Calendar.MONTH);
                int day = now.get(Calendar.DAY_OF_MONTH);
                filepathUploadGambarPeralatan = Executions.getCurrent().getDesktop().getWebApp().getRealPath("/");
                filepathUploadGambarPeralatan = filepathUploadGambarPeralatan + "\\" + "files" + "\\" + "eProcure-header-image" + "\\" + year + "\\" + month + "\\" + day + "\\";

                File baseDir = new File(filepathUploadGambarPeralatan);
                if (!baseDir.exists()) {
                    baseDir.mkdirs();
                }

                Files.copy(new File(filepathUploadGambarPeralatan + mediaUploadGambarPeralatan.getName()), mediaUploadGambarPeralatan.getStreamData());
                setMediaNameUploadGambarPeralatan(filepathUploadGambarPeralatan + mediaUploadGambarPeralatan.getName());
                pathLocationUploadGambarPeralatan = "/" + "files" + "/" + "eProcure-header-image" + "/" + year + "/" + month + "/" + day + "/" + mediaUploadGambarPeralatan.getName();
            } else {
                Calendar now = Calendar.getInstance();
                int year = now.get(Calendar.YEAR);
                int month = now.get(Calendar.MONTH);
                int day = now.get(Calendar.DAY_OF_MONTH);
                mediaNameUploadGambarPeralatan = "";
                pathLocationUploadGambarPeralatan = "/" + "files" + "/" + "eProcure-header-image" + "/" + year + "/" + month + "/" + day + "/" + mediaUploadGambarPeralatan.getName();
                Messagebox.show("File : " + mediaUploadGambarPeralatan + " Bukan File Gambar", "Error", Messagebox.OK, Messagebox.ERROR);
            }

        }
    }

    /* Function button save data login */
    @Command("buttonSaveDataLogin")
    @NotifyChange({"dataLoginDTO", "dataLoginDTOs", "mediaNameUploadHeaderImage", "pathLocationUploadHeaderImage", "mediaNameUploadLogo", "pathLocationUploadLogo", "src"})
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
        CommonViewModel.navigateTo("/eProcure/vendor/data_login.zul", window, params);
    }

    /* Function button save data perusahaan */
    @Command("buttonSaveDataPerusahaan")
    @NotifyChange({"dataPerusahaanDTO"})
    public void buttonSaveDataPerusahaan(@BindingParam("object") DataPerusahaanDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        dataPerusahaanService.SaveOrUpdate(dataPerusahaanDTO);
        showInformationMessagebox("Data Perusahaan Berhasil Disimpan");
        BindUtils.postGlobalCommand(null, null, "refreshDataPerusahaan", null);
        Map<String, Object> params = new HashMap<>();
        params.put("dataPerusahaanDTO", obj);
        CommonViewModel.navigateTo("/eProcure/vendor/data_perusahaan.zul", window, params);
    }

    /* Function button save data penanggung jawab */
    @Command("buttonKlikSaveDataPenanggungJawabForm")
    @NotifyChange({"dataPenanggungJawabDTO", "dataPenanggungJawabDTOs"})
    public void buttonKlikSaveDataPenanggungJawabForm(@BindingParam("object") DataPenanggungJawabDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        dataPenanggungJawabService.SaveOrUpdate(dataPenanggungJawabDTO);
        showInformationMessagebox("Data PenanggungJawab Berhasil Disimpan");
        BindUtils.postGlobalCommand(null, null, "refreshDataPenanggungJawab", null);
        window.detach();

    }

    /* Function button save data peralatan */
    @Command("buttonSaveDataPeralatan")
    @NotifyChange({"dataPeralatanDTO"})
    public void buttonSaveDataPeralatan(@BindingParam("object") DataPeralatanDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        if (pathLocationUploadBuktiKepemilikan == null) {
            pathLocationUploadBuktiKepemilikan = dataPeralatanDTO.getDokumenBuktiKepemilikan();
        }

        dataPeralatanDTO.setDokumenBuktiKepemilikan(pathLocationUploadBuktiKepemilikan);
        dataPeralatanService.SaveOrUpdate(dataPeralatanDTO);
        showInformationMessagebox("Data Peralatan Berhasil Disimpan");
        BindUtils.postGlobalCommand(null, null, "refreshDataPeralatan", null);
        Map<String, Object> params = new HashMap<>();
        params.put("dataPeralatanDTO", obj);
        CommonViewModel.navigateTo("/eProcure/vendor/data_peralatan.zul", window, params);
    }

    /* Function button save data bank */
    @Command("buttonSaveDataBank")
    @NotifyChange({"dataBankDTO", "dataBankDTOs"})
    public void buttonSaveDataBank(@BindingParam("object") DataBankDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        dataBankService.SaveOrUpdate(dataBankDTO);
        showInformationMessagebox("Data Bank Berhasil Disimpan");
        BindUtils.postGlobalCommand(null, null, "refreshDataBank", null);
        window.detach();
    }

    /* Function button save data segmentasi */
    @Command("buttonSaveDataSegmentasi")
    @NotifyChange({"dataSegmentasiDTO", "dataSegmentasiDTOs"})
    public void buttonSaveDataSegmentasi(@BindingParam("object") DataSegmentasiDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        dataSegmentasiService.SaveOrUpdate(dataSegmentasiDTO);
        showInformationMessagebox("Data Segmentasi Berhasil Disimpan");
        BindUtils.postGlobalCommand(null, null, "refreshDataSegmentasi", null);
        window.detach();
    }

    /* Function button save data Dokumen */
    @Command("buttonSaveDataDokumen")
    @NotifyChange({"dataDokumenDTO", "dataDokumenDTOs"})
    public void buttonSaveDataDokumen(@BindingParam("object") DataDokumenDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        if (pathLocationUploadDataDokumen == null) {
            pathLocationUploadDataDokumen = dataDokumenDTO.getUploadFile();
        }
        dataDokumenDTO.setUploadFile(pathLocationUploadDataDokumen);
        dataDokumenService.saveOrUpdate(dataDokumenDTO);
        showInformationMessagebox("Data Dokumen Berhasil Disimpan");
        BindUtils.postGlobalCommand(null, null, "refreshDataDokumen", null);
        Map<String, Object> params = new HashMap<>();
        params.put("dataDokumenDTO", obj);
        CommonViewModel.navigateTo("/eProcure/vendor/data_dokumen.zul", window, params);
    }

    /* Function button detail data bank */
    @Command("detailDataBank")
    @NotifyChange("dataBankDTO")
    public void detailDataBank(@BindingParam("object") DataBankDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        Map<String, Object> params = new HashMap<>();
        params.put("dataBankDTO", obj);
        CommonViewModel.navigateToWithoutDetach("/eProcure/vendor/data_bank_form.zul", window, params);
    }

    /* Function button detail data peralatan */
    @Command("detailDataPeralatan")
    @NotifyChange("dataPeralatanDTO")
    public void detailDataPeralatan(@BindingParam("object") DataPeralatanDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        Map<String, Object> params = new HashMap<>();
        params.put("dataPeralatanDTO", obj);
        CommonViewModel.navigateToWithoutDetach("/eProcure/vendor/data_peralatan_form.zul", window, params);
    }

    /* Function button detail data segmentasi */
    @Command("detailDataSegmentasi")
    @NotifyChange("dataSegmentasiDTO")
    public void detailDataSegmentasi(@BindingParam("object") DataSegmentasiDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        Map<String, Object> params = new HashMap<>();
        params.put("dataSegmentasiDTO", obj);
        CommonViewModel.navigateToWithoutDetach("/eProcure/vendor/data_tambah_segmentasi.zul", window, params);
    }

    /* Function button detele data bank */
    @Command("deleteDataBank")
    @NotifyChange("dataBankDTOs")
    public void deleteDataBank(@BindingParam("object") DataBankDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        dataBankDTO = (DataBankDTO) obj;

        Messagebox.show("Apakah anda yakin ingin menghapus Data Bank?", "Konfirmasi", Messagebox.OK | Messagebox.CANCEL, Messagebox.QUESTION,
                new org.zkoss.zk.ui.event.EventListener() {
            @Override
            public void onEvent(Event evt) throws InterruptedException {
                if (evt.getName().equals("onOK")) {
                    dataBankService.deleteData(dataBankDTO);
                    showInformationMessagebox("Data Bank Berhasil Dihapus");
                    BindUtils.postGlobalCommand(null, null, "refreshDataBank", null);
                } else {
                    System.out.println("Operasi dibatalkan");
                }
            }
        }
        );

    }

    /* Function button detele data peralatan */
    @Command("deleteDataPeralatan")
    @NotifyChange("dataPeralatanDTOs")
    public void deleteDataPeralatan(@BindingParam("object") DataPeralatanDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        dataPeralatanDTO = (DataPeralatanDTO) obj;

        Messagebox.show("Apakah anda yakin ingin menghapus Data Peralatan?", "Konfirmasi", Messagebox.OK | Messagebox.CANCEL, Messagebox.QUESTION,
                new org.zkoss.zk.ui.event.EventListener() {
            @Override
            public void onEvent(Event evt) throws InterruptedException {
                if (evt.getName().equals("onOK")) {
                    dataPeralatanService.deleteData(dataPeralatanDTO);
                    showInformationMessagebox("Data Peralatan Berhasil Dihapus");
                    BindUtils.postGlobalCommand(null, null, "refreshDataPeralatan", null);
                } else {
                    System.out.println("Operasi dibatalkan");
                }
            }
        }
        );

    }

    /* Function button detele data bank */
    @Command("deleteDataDokumen")
    @NotifyChange("dataDokumenDTOs")
    public void deleteDataDokumen(@BindingParam("object") DataDokumenDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        dataDokumenDTO = (DataDokumenDTO) obj;

        Messagebox.show("Apakah anda yakin ingin menghapus Data Dokumen?", "Konfirmasi", Messagebox.OK | Messagebox.CANCEL, Messagebox.QUESTION,
                new org.zkoss.zk.ui.event.EventListener() {
            @Override
            public void onEvent(Event evt) throws InterruptedException {
                if (evt.getName().equals("onOK")) {
                    dataDokumenService.delete(dataDokumenDTO);
                    showInformationMessagebox("Data Dokumen Berhasil Dihapus");
                    BindUtils.postGlobalCommand(null, null, "refreshDataDokumen", null);
                } else {
                    System.out.println("Operasi dibatalkan");
                }
            }
        }
        );

    }

    /* Function button delete data segmentasi */
    @Command("deleteDataSegmentasi")
    @NotifyChange("dataSegmentasiDTOs")
    public void deleteDataSegmentasi(@BindingParam("object") DataSegmentasiDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        dataSegmentasiDTO = (DataSegmentasiDTO) obj;

        Messagebox.show("Apakah anda yakin ingin menghapus Data Segmentasi?", "Konfirmasi", Messagebox.OK | Messagebox.CANCEL, Messagebox.QUESTION,
                new org.zkoss.zk.ui.event.EventListener() {
            @Override
            public void onEvent(Event evt) throws InterruptedException {
                if (evt.getName().equals("onOK")) {
                    dataSegmentasiService.deleteData(dataSegmentasiDTO);
                    showInformationMessagebox("Data Segmentasi Berhasil Dihapus");
                    BindUtils.postGlobalCommand(null, null, "refreshDataSegmentasi", null);
                } else {
                    System.out.println("Operasi dibatalkan");
                }
            }
        }
        );

    }

    /* Function refresh data login */
    @GlobalCommand
    @NotifyChange("dataLoginDTOs")
    public void refreshDataLogin() {
        dataLoginDTOs = dataLoginService.findAll();
    }

    /* Function refresh data bank */
    @GlobalCommand
    @NotifyChange("dataBankDTOs")
    public void refreshDataBank() {
        dataBankDTOs = dataBankService.findAll();
    }

    /* Function refresh data perusahaan */
    @GlobalCommand
    @NotifyChange("dataPerusahaanDTOs")
    public void refreshDataPerusahaan() {
        dataPerusahaanDTOs = dataPerusahaanService.findAll();
    }

    /* Function refresh data segmentasi */
    @GlobalCommand
    @NotifyChange("dataSegmentasiDTOs")
    public void refreshDataSegmentasi() {
        dataSegmentasiDTOs = dataSegmentasiService.findAll();
    }

    /* Function refresh data dokumen */
    @GlobalCommand
    @NotifyChange("dataDokumenDTOs")
    public void refreshDataDokumen() {
        dataDokumenDTOs = dataDokumenService.findAll();
    }

    /* Function refresh data penanggung jawab */
    @GlobalCommand
    @NotifyChange("dataPenanggungJawabDTOs")
    public void refreshDataPenanggungJawab() {
        dataPenanggungJawabDTOs = dataPenanggungJawabService.findAll();
    }

    /* Function refresh data penanggung jawab */
    @GlobalCommand
    @NotifyChange("dataPeralatanDTOs")
    public void refreshDataPeralatan() {
        dataPeralatanDTOs = dataPeralatanService.findAll();
    }

    /* Function button klik data login */
    @Command("buttonKlikDataLogin")
    @NotifyChange("src")
    public void buttonKlikDataLogin(@BindingParam("object") DataLoginDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/vendor/data_login.zul";
    }

    /* Function button klik data perusahaan */
    @Command("buttonKlikDataPerusahaan")
    @NotifyChange("src")
    public void buttonKlikDataPerusahaan(@ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/vendor/data_perusahaan.zul";
    }

    /* Function button klik data perusahaan form */
    @Command("buttonKlikDataPerusahaanForm")
    @NotifyChange("dataPerusahaanDTO")
    public void buttonKlikDataPerusahaanForm(@BindingParam("object") DataPerusahaanDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        Map<String, Object> params = new HashMap<>();
        params.put("dataPerusahaanDTO", obj);
        CommonViewModel.navigateToWithoutDetach("/eProcure/vendor/data_perusahaan_form.zul", window, params);
    }

    /* Function button klik back data perusahaan form */
    @Command("buttonKlikBackDataPerusahaanForm")
    @NotifyChange("dataPerusahaanDTO")
    public void buttonKlikBackDataPerusahaanForm(@BindingParam("object") DataPerusahaanDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        window.detach();
    }

    /* Function button klik save data perusahaan form */
    @Command("buttonKlikSaveDataPerusahaanForm")
    @NotifyChange("dataPerusahaanDTO")
    public void buttonKlikSaveDataPerusahaanForm(@BindingParam("object") DataPerusahaanDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        dataPerusahaanService.SaveOrUpdate(dataPerusahaanDTO);
        window.detach();
    }

    /* Function button klik data bank*/
    @Command("buttonKlikDataBank")
    @NotifyChange("src")
    public void buttonKlikDataBank(@ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/vendor/data_bank.zul";
    }

    /* Function button klik data bank form*/
    @Command("buttonKlikDataBankForm")
    @NotifyChange("dataBankDTO")
    public void buttonKlikDataBankForm(@BindingParam("object") DataBankDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        Map<String, Object> params = new HashMap<>();
        params.put("dataBankDTO", obj);
        CommonViewModel.navigateToWithoutDetach("/eProcure/vendor/data_bank_form.zul", window, params);
    }

    /* Function button klik back data bank */
    @Command("buttonKlikBackDataBankForm")
    @NotifyChange("dataBankDTO")
    public void buttonKlikBackDataBankForm(@BindingParam("object") DataBankDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        window.detach();
    }

    /* Function button klik save data bank */
    @Command("buttonKlikSaveDataBankForm")
    @NotifyChange("dataBankDTO")
    public void buttonKlikSaveDataBankForm(@BindingParam("object") DataBankDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        window.detach();
    }

    /*======================================= functional for page Data Segmentasi =======================================*/
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

    @Command("buttonKembaliDataSegmentasi")
    @NotifyChange("dataSegmentasiDTO")
    public void buttonKembaliDataSegmentasi(@BindingParam("object") DataSegmentasiDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        window.detach();
    }

    /*======================================= functional for page Data Peralatan =======================================*/
    @Command("buttonKlikDataPeralatan")
    @NotifyChange("src")
    public void buttonKlikDataPeralatan(@ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/vendor/data_peralatan.zul";
    }

    @Command("buttonKlikDataPeralatanForm")
    @NotifyChange("dataPeralatanDTO")
    public void buttonKlikDataPeralatanForm(@BindingParam("object") DataPeralatanDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        Map<String, Object> params = new HashMap<>();
        params.put("DataPeralatanDTO", obj);
        CommonViewModel.navigateToWithoutDetach("/eProcure/vendor/data_peralatan_form.zul", window, params);
    }

    @Command("buttonKlikBackDataPeralatanForm")
    @NotifyChange("dataPeralatanDTO")
    public void buttonKlikBackDataPeralatanForm(@BindingParam("object") DataPeralatanDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        window.detach();
    }

    /*======================================= functional for page Data Keuangan =======================================*/
    @Command("buttonKlikDataKeuangan")
    @NotifyChange("src")
    public void buttonKlikDataKeuangan(@ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/vendor/data_keuangan.zul";
    }

    @Command("buttonKlikDataKeuanganForm")
    @NotifyChange("dataKeuanganDTO")
    public void buttonKlikDataKeuanganForm(@BindingParam("object") DataKeuanganDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        Map<String, Object> params = new HashMap<>();
        params.put("DataKeuanganDTO", obj);
        CommonViewModel.navigateToWithoutDetach("/eProcure/vendor/data_keuangan_form.zul", window, params);
    }

    @Command("buttonKlikBackDataKeuanganForm")
    @NotifyChange("dataKeuanganDTO")
    public void buttonKlikBackDataKeuanganForm(@BindingParam("object") DataKeuanganDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        window.detach();
    }

    /*======================================= functional for page Data Dokumentasi  =======================================*/
    @Command("buttonKlikDataDokumen")
    @NotifyChange("src")
    public void buttonKlikDataDokumen(@ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/vendor/data_dokumen.zul";
    }

    /*======================================= functional for page Data Pengalaman =======================================*/
    @Command("buttonKlikDataPengalaman")
    @NotifyChange("src")
    public void buttonKlikDataPengalaman(@ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/vendor/data_pengalaman.zul";
    }

    @Command("buttonKlikDataPengalamanPelanggan")
    @NotifyChange("dataPengalamanDTO")
    public void buttonKlikDataPengalamanPelanggan(@BindingParam("object") DataPengalamanDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        Map<String, Object> params = new HashMap<>();
        params.put("dataPengalamanDTO", obj);
        CommonViewModel.navigateToWithoutDetach("/eProcure/vendor/data_pengalaman_pelanggan.zul", window, params);
    }

    @Command("buttonKlikDataPengalamanMitra")
    @NotifyChange("dataPengalamanDTO")
    public void buttonKlikDataPengalamanMitra(@BindingParam("object") DataPengalamanDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        Map<String, Object> params = new HashMap<>();
        params.put("dataPengalamanDTO", obj);
        CommonViewModel.navigateToWithoutDetach("/eProcure/vendor/data_pengalaman_mitra.zul", window, params);
    }

    @Command("buttonKlikDataPengalamanBerjalan")
    @NotifyChange("dataPengalamanDTO")
    public void buttonKlikDataPengalamanBerjalan(@BindingParam("object") DataPengalamanDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        Map<String, Object> params = new HashMap<>();
        params.put("dataPengalamanDTO", obj);
        CommonViewModel.navigateToWithoutDetach("/eProcure/vendor/data_pengalaman_berjalan.zul", window, params);
    }

    @Command("buttonKlikBackDataPengalaman")
    @NotifyChange("dataPengalamanDTO")
    public void buttonKlikBackDataBankForm(@BindingParam("object") DataPengalamanDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        window.detach();
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

    public DataBankDTO getDataBankDTO() {
        return dataBankDTO;
    }

    public void setDataBankDTO(DataBankDTO dataBankDTO) {
        this.dataBankDTO = dataBankDTO;
    }

    public List<DataBankDTO> getDataBankDTOs() {
        return dataBankDTOs;
    }

    public void setDataBankDTOs(List<DataBankDTO> dataBankDTOs) {
        this.dataBankDTOs = dataBankDTOs;
    }

    public DataPengalamanDTO getDataPengalamanDTO() {
        return dataPengalamanDTO;
    }

    public void setDataPengalamanDTO(DataPengalamanDTO dataPengalamanDTO) {
        this.dataPengalamanDTO = dataPengalamanDTO;
    }

    public List<DataPengalamanDTO> getDataPengalamanDTOs() {
        return dataPengalamanDTOs;
    }

    public void setDataPengalamanDTOs(List<DataPengalamanDTO> dataPengalamanDTOs) {
        this.dataPengalamanDTOs = dataPengalamanDTOs;
    }

    public ListModelList<String> getKota() {
        return kota;
    }

    public void setKota(ListModelList<String> kota) {
        this.kota = kota;
    }

    public ListModelList<String> getPropinsi() {
        return propinsi;
    }

    public void setPropinsi(ListModelList<String> propinsi) {
        this.propinsi = propinsi;
    }

    public PageNavigation getPrevious() {
        return previous;
    }

    public void setPrevious(PageNavigation previous) {
        this.previous = previous;
    }

    public ListModelList<KualifikasiType> getKualifikasiTypes() {
        return new ListModelList<>(KualifikasiType.values());
    }

    public void setIdDataLogin(String idDataLogin) {
        this.idDataLogin = idDataLogin;
    }

    public void setIdDataPerusahaan(String idDataPerusahaan) {
        this.idDataPerusahaan = idDataPerusahaan;
    }

    public void setKualifikasiTypes(ListModelList<KualifikasiType> kualifikasiTypes) {
        this.kualifikasiTypes = kualifikasiTypes;
    }

    public ListModelList<UnitType> getUnitTypes() {
        return new ListModelList<>(UnitType.values());
    }

    public void setUnitTypes(ListModelList<UnitType> unitTypes) {
        this.unitTypes = unitTypes;
    }

    public ListModelList<PerusahaanType> getPerusahaanTypes() {
        return new ListModelList<>(PerusahaanType.values());
    }

    public void setPerusahaanTypes(ListModelList<PerusahaanType> perusahaanTypes) {
        this.perusahaanTypes = perusahaanTypes;
    }

    public ListModelList<PKPType> getListPKPType() {
        return new ListModelList<>(PKPType.values());
    }

    public void setListPKPType(ListModelList<PKPType> listPKPType) {
        this.listPKPType = listPKPType;
    }

    public PKPType getpKPType() {
        return pKPType;
    }

    public void setpKPType(PKPType pKPType) {
        this.pKPType = pKPType;
    }

    public boolean isDisablePKP() {
        return disablePKP;
    }

    public void setDisablePKP(boolean disablePKP) {
        this.disablePKP = disablePKP;
    }

    public DataPerusahaanDTO getPkpTypeDisable() {
        return pkpTypeDisable;
    }

    public void setPkpTypeDisable(DataPerusahaanDTO pkpTypeDisable) {
        this.pkpTypeDisable = pkpTypeDisable;
    }

    public ListModelList<JabatanType> getJabatanTypes() {
        return new ListModelList<>(JabatanType.values());
    }

    public void setJabatanTypes(ListModelList<JabatanType> jabatanTypes) {
        this.jabatanTypes = jabatanTypes;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public JabatanType getJabatan() {
        return jabatan;
    }

    public void setJabatan(JabatanType jabatan) {
        this.jabatan = jabatan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ListModelList<MataUangType> getMataUangTypes() {
        return new ListModelList<>(MataUangType.values());
    }

    public void setMataUangTypes(ListModelList<MataUangType> mataUangTypes) {
        this.mataUangTypes = mataUangTypes;
    }

    public ListModelList<String> getNegara() {
        return negara;
    }

    public void setNegara(ListModelList<String> negara) {
        this.negara = negara;
    }

    public ListModelList<String> getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(ListModelList<String> namaBank) {
        this.namaBank = namaBank;
    }

    public DataPenanggungJawabDTO getDataPenanggungJawabDTO() {
        return dataPenanggungJawabDTO;
    }

    public void setDataPenanggungJawabDTO(DataPenanggungJawabDTO dataPenanggungJawabDTO) {
        this.dataPenanggungJawabDTO = dataPenanggungJawabDTO;
    }

    public List<DataPenanggungJawabDTO> getDataPenanggungJawabDTOs() {
        return dataPenanggungJawabDTOs;
    }

    public void setDataPenanggungJawabDTOs(List<DataPenanggungJawabDTO> dataPenanggungJawabDTOs) {
        this.dataPenanggungJawabDTOs = dataPenanggungJawabDTOs;
    }

    public String getIdPenanggungJawab() {
        return idPenanggungJawab;
    }

    public void setIdPenanggungJawab(String idPenanggungJawab) {
        this.idPenanggungJawab = idPenanggungJawab;
    }

    public String getIdDataBank() {
        return idDataBank;
    }

    public void setIdDataBank(String idDataBank) {
        this.idDataBank = idDataBank;
    }

    public String getIdDataSegmentasi() {
        return idDataSegmentasi;
    }

    public void setIdDataSegmentasi(String idDataSegmentasi) {
        this.idDataSegmentasi = idDataSegmentasi;
    }

    public ListModelList<BidangUsahaType> getBidangUsahaTypes() {
        return new ListModelList<>(BidangUsahaType.values());
    }

    public void setBidangUsahaTypes(ListModelList<BidangUsahaType> bidangUsahaTypes) {
        this.bidangUsahaTypes = bidangUsahaTypes;
    }

    public ListModelList<AssosiasiType> getAssosiasiTypes() {
        return new ListModelList<>(AssosiasiType.values());
    }

    public void setAssosiasiTypes(ListModelList<AssosiasiType> assosiasiTypes) {
        this.assosiasiTypes = assosiasiTypes;
    }

    public String getDokumenID() {
        return dokumenID;
    }

    public void setDokumenID(String dokumenID) {
        this.dokumenID = dokumenID;
    }

    public DataDokumenDTO getDataDokumenDTO() {
        return dataDokumenDTO;
    }

    public void setDataDokumenDTO(DataDokumenDTO dataDokumenDTO) {
        this.dataDokumenDTO = dataDokumenDTO;
    }

    public List<DataDokumenDTO> getDataDokumenDTOs() {
        return dataDokumenDTOs;
    }

    public void setDataDokumenDTOs(List<DataDokumenDTO> dataDokumenDTOs) {
        this.dataDokumenDTOs = dataDokumenDTOs;
    }

    public ListModelList<String> getSubjectDokumenLegal() {
        return subjectDokumenLegal;
    }

    public void setSubjectDokumenLegal(ListModelList<String> subjectDokumenLegal) {
        this.subjectDokumenLegal = subjectDokumenLegal;
    }

    public ListModelList<String> getSubjectDokumenTeknis() {
        return subjectDokumenTeknis;
    }

    public void setSubjectDokumenTeknis(ListModelList<String> subjectDokumenTeknis) {
        this.subjectDokumenTeknis = subjectDokumenTeknis;
    }

    public String getFilepathUploadDataDokumen() {
        return filepathUploadDataDokumen;
    }

    public void setFilepathUploadDataDokumen(String filepathUploadDataDokumen) {
        this.filepathUploadDataDokumen = filepathUploadDataDokumen;
    }

    public String getPathLocationUploadDataDokumen() {
        return pathLocationUploadDataDokumen;
    }

    public void setPathLocationUploadDataDokumen(String pathLocationUploadDataDokumen) {
        this.pathLocationUploadDataDokumen = pathLocationUploadDataDokumen;
    }

    public Media getMediaUploadDataDokumen() {
        return mediaUploadDataDokumen;
    }

    public void setMediaUploadDataDokumen(Media mediaUploadDataDokumen) {
        this.mediaUploadDataDokumen = mediaUploadDataDokumen;
    }

    public String getMediaNameUploadDataDokumen() {
        return mediaNameUploadDataDokumen;
    }

    public void setMediaNameUploadDataDokumen(String mediaNameUploadDataDokumen) {
        this.mediaNameUploadDataDokumen = mediaNameUploadDataDokumen;
    }

    public DataPeralatanDTO getDataPeralatanDTO() {
        return dataPeralatanDTO;
    }

    public void setDataPeralatanDTO(DataPeralatanDTO dataPeralatanDTO) {
        this.dataPeralatanDTO = dataPeralatanDTO;
    }

    public List<DataPeralatanDTO> getDataPeralatanDTOs() {
        return dataPeralatanDTOs;
    }

    public void setDataPeralatanDTOs(List<DataPeralatanDTO> dataPeralatanDTOs) {
        this.dataPeralatanDTOs = dataPeralatanDTOs;
    }

    public ListModelList<KondisiPeralatan> getKondisiPeralatans() {
        return new ListModelList<>(KondisiPeralatan.values());
    }

    public void setKondisiPeralatans(ListModelList<KondisiPeralatan> kondisiPeralatans) {
        this.kondisiPeralatans = kondisiPeralatans;
    }

    public ListModelList<BuktiKepemilikan> getBuktiKepemilikans() {
        return new ListModelList<>(BuktiKepemilikan.values());
    }

    public void setBuktiKepemilikans(ListModelList<BuktiKepemilikan> buktiKepemilikans) {
        this.buktiKepemilikans = buktiKepemilikans;
    }

    public String getIdDataPeralatan() {
        return idDataPeralatan;
    }

    public void setIdDataPeralatan(String idDataPeralatan) {
        this.idDataPeralatan = idDataPeralatan;
    }

    public Media getMediaUploadBuktiKepemilikan() {
        return mediaUploadBuktiKepemilikan;
    }

    public void setMediaUploadBuktiKepemilikan(Media mediaUploadBuktiKepemilikan) {
        this.mediaUploadBuktiKepemilikan = mediaUploadBuktiKepemilikan;
    }

    public Media getMediaUploadGambarPeralatan() {
        return mediaUploadGambarPeralatan;
    }

    public void setMediaUploadGambarPeralatan(Media mediaUploadGambarPeralatan) {
        this.mediaUploadGambarPeralatan = mediaUploadGambarPeralatan;
    }

    public String getMediaNameUploadBuktiKepemilikan() {
        return mediaNameUploadBuktiKepemilikan;
    }

    public void setMediaNameUploadBuktiKepemilikan(String mediaNameUploadBuktiKepemilikan) {
        this.mediaNameUploadBuktiKepemilikan = mediaNameUploadBuktiKepemilikan;
    }

    public String getMediaNameUploadGambarPeralatan() {
        return mediaNameUploadGambarPeralatan;
    }

    public void setMediaNameUploadGambarPeralatan(String mediaNameUploadGambarPeralatan) {
        this.mediaNameUploadGambarPeralatan = mediaNameUploadGambarPeralatan;
    }

    public String getFilepathUploadBuktiKepemilikan() {
        return filepathUploadBuktiKepemilikan;
    }

    public void setFilepathUploadBuktiKepemilikan(String filepathUploadBuktiKepemilikan) {
        this.filepathUploadBuktiKepemilikan = filepathUploadBuktiKepemilikan;
    }

    public String getFilepathUploadGambarPeralatan() {
        return filepathUploadGambarPeralatan;
    }

    public void setFilepathUploadGambarPeralatan(String filepathUploadGambarPeralatan) {
        this.filepathUploadGambarPeralatan = filepathUploadGambarPeralatan;
    }

    public String getPathLocationUploadBuktiKepemilikan() {
        return pathLocationUploadBuktiKepemilikan;
    }

    public void setPathLocationUploadBuktiKepemilikan(String pathLocationUploadBuktiKepemilikan) {
        this.pathLocationUploadBuktiKepemilikan = pathLocationUploadBuktiKepemilikan;
    }

    public String getPathLocationUploadGambarPeralatan() {
        return pathLocationUploadGambarPeralatan;
    }

    public void setPathLocationUploadGambarPeralatan(String pathLocationUploadGambarPeralatan) {
        this.pathLocationUploadGambarPeralatan = pathLocationUploadGambarPeralatan;
    }

    public String getIdDataKeuangan() {
        return idDataKeuangan;
    }

    public void setIdDataKeuangan(String idDataKeuangan) {
        this.idDataKeuangan = idDataKeuangan;
    }

    public DataKeuanganDTO getDataKeuanganDTO() {
        return dataKeuanganDTO;
    }

    public void setDataKeuanganDTO(DataKeuanganDTO dataKeuanganDTO) {
        this.dataKeuanganDTO = dataKeuanganDTO;
    }

    public List<DataKeuanganDTO> getDataKeuanganDTOs() {
        return dataKeuanganDTOs;
    }

    public void setDataKeuanganDTOs(List<DataKeuanganDTO> dataKeuanganDTOs) {
        this.dataKeuanganDTOs = dataKeuanganDTOs;
    }

}
