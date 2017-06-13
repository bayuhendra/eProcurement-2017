package com.agit.eProcure.main.viewmodel.vendor;

import com.agit.eProcure.common.application.DataBankService;
import com.agit.eProcure.common.application.DataLoginService;
import com.agit.eProcure.common.application.DataPerusahaanService;
import com.agit.eProcure.common.application.DataSegmentasiService;
import com.agit.eProcure.common.dto.vendor.DataBankDTO;
import com.agit.eProcure.common.dto.vendor.DataLoginDTO;
import com.agit.eProcure.common.dto.vendor.DataPerusahaanDTO;
import com.agit.eProcure.common.dto.vendor.DataSegmentasiDTO;
import com.agit.eProcure.shared.zul.CommonViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
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

    /* Object Binding for Form Data Login */
    private DataLoginDTO dataLoginDTO = new DataLoginDTO();
    private List<DataLoginDTO> dataLoginDTOs = new ArrayList();
    
    private DataPerusahaanDTO dataPerusahaanDTO = new DataPerusahaanDTO();
    private List<DataPerusahaanDTO> dataPerusahaanDTOs = new ArrayList();
    
    private DataSegmentasiDTO dataSegmentasiDTO = new DataSegmentasiDTO();
    private List<DataSegmentasiDTO> dataSegmentasiDTOs = new ArrayList();
    
    private DataBankDTO dataBankDTO = new DataBankDTO();
    private List<DataBankDTO> dataBankDTOs = new ArrayList();
    
    /* for home instance */
    private String src = "/eProcure/vendor/data_login.zul";

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
    @Command("buttonKlikDataPerusahaanForm")
    @NotifyChange("dataPerusahaanDTO")
    public void buttonKlikDataPerusahaanForm(@BindingParam("object") DataPerusahaanDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        Map<String, Object> params = new HashMap<>();
        params.put("dataPerusahaanDTO", obj);
        CommonViewModel.navigateToWithoutDetach("/eProcure/vendor/data_perusahaan_form.zul", window, params);
    }
    @Command("buttonKlikBackDataPerusahaanForm")
    @NotifyChange("dataPerusahaanDTO")
    public void buttonKlikBackDataPerusahaanForm(@BindingParam("object") @ContextParam(ContextType.VIEW) Window window) {
        window.detach();
    }    
    @Command("buttonKlikSaveDataPerusahaanForm")
    @NotifyChange("dataPerusahaanDTO")
    public void buttonKlikSaveDataPerusahaanForm(@BindingParam("object") DataPerusahaanDTO obj, @ContextParam(ContextType.VIEW) Window window) {
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
    @Command("buttonKembaliDataSegmentasi")
    @NotifyChange("dataSegmentasiDTO")
    public void buttonKembaliDataSegmentasi(@BindingParam("object") DataSegmentasiDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        window.detach();
    }

    /* functional for page Data Bank */
    @Command("buttonKlikDataBank")
    @NotifyChange("src")
    public void buttonKlikDataBank (@ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/vendor/data_bank.zul";
    }
    @Command("buttonKlikDataBankForm")
    @NotifyChange("dataBankDTO")
    public void buttonKlikDataBankForm(@BindingParam("object") DataBankDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        Map<String, Object> params = new HashMap<>();
        params.put("dataBankDTO", obj);
        CommonViewModel.navigateToWithoutDetach("/eProcure/vendor/data_bank_form.zul", window, params);
    }    
    @Command("buttonKlikBackDataBankForm")
    @NotifyChange("dataBankDTO")
    public void buttonKlikBackDataBankForm(@BindingParam("object") @ContextParam(ContextType.VIEW) Window window) {
        window.detach();
    }    
    @Command("buttonKlikSaveDataBankForm")
    @NotifyChange({"dataBankDTO", "dataBankDTOs"})
    public void buttonKlikSaveDataBankForm(@BindingParam("object") DataBankDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        window.detach();
    }    

    /* functional for page Data Pengalaman*/
    @Command("buttonKlikDataPengalaman")
    @NotifyChange("src")
    public void buttonKlikDataPengalaman(@ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/vendor/data_pengalaman.zul";
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

}
