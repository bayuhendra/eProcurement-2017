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
import com.agit.eProcure.common.dto.vendor.DataDokumenDTO;
import com.agit.eProcure.common.dto.vendor.DataKeuanganDTO;
import com.agit.eProcure.common.dto.vendor.DataLoginDTO;
import com.agit.eProcure.common.dto.vendor.DataPeralatanDTO;
import com.agit.eProcure.common.dto.vendor.DataPerusahaanDTO;
import com.agit.eProcure.common.dto.vendor.DataSegmentasiDTO;
import com.agit.eProcure.shared.type.BankType;
import com.agit.eProcure.shared.type.BidangUsahaType;
import com.agit.eProcure.shared.type.KondisiPeralatan;
import com.agit.eProcure.shared.zul.CommonViewModel;
import com.agit.eProcure.shared.zul.PageNavigation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.bind.annotation.ExecutionArgParam;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Window;

/**
 *
 * @author 3AD
 */
@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class DashboardVendorVM {

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
    DataPeralatanService dataPeralatanService;

    @WireVariable
    DataDokumenService dataDokumenService;

    @WireVariable
    DataKeuanganService dataKeuanganService;

    //    parameter Filter DataLogin
    private String idDatalogin;
    private String namaPengguna;
    private String idUser;
    //    parameter Filter DataPerusahaan
    private String idPerusahaan;
    private String namaPerusahaan;
    //    parameter Filter DataBank
    private String idDataBank;
    private BankType namaBank;
    private String noRekening;
    private String namaNasabah;
    //    Parameter Filter DataSegmentasi
    private String idDataSegmentasi;
    private String nomorAssosiasi;
    private BidangUsahaType bidangUsahaSelect;
    private Date tanggalMulai;
    //    Parameter Filter DataSegmentasi
    private String dokumenID;
    private String subject;
    //    Parameter Filter DataKeuangan
    private String idDataKeuangan;
    private String tahunKeuangan;
    //    Parameter Filter DataPeralatan
    private String idDataPeralatan;
    private String tahunPembuatan;
    private String jenis;
    private KondisiPeralatan kondisiPeralatanSelect;


    /* ----------Function ComboBox---------------   */
    private ListModelList<BankType> bankTypes;
    private ListModelList<BidangUsahaType> bidangUsahaTypes;
    private ListModelList<String> subjectDokumenLegal = new ListModelList<>();
    private ListModelList<KondisiPeralatan> kondisiPeralatans;

    //    Object Binding For Data Grid
    private DataLoginDTO dataLoginDTO = new DataLoginDTO();
    private List<DataLoginDTO> dataLoginDTOs = new ArrayList();

    private DataPerusahaanDTO dataPerusahaanDTO = new DataPerusahaanDTO();
    private List<DataPerusahaanDTO> dataPerusahaanDTOs = new ArrayList();

    private DataBankDTO dataBankDTO = new DataBankDTO();
    private List<DataBankDTO> dataBankDTOs = new ArrayList();

    private DataSegmentasiDTO dataSegmentasiDTO = new DataSegmentasiDTO();
    private List<DataSegmentasiDTO> dataSegmentasiDTOs = new ArrayList<>();

    private DataDokumenDTO dataDokumenDTO = new DataDokumenDTO();
    private List<DataDokumenDTO> dataDokumenDTOs = new ArrayList<>();

    private DataKeuanganDTO dataKeuanganDTO = new DataKeuanganDTO();
    private List<DataKeuanganDTO> dataKeuanganDTOs = new ArrayList<>();

    private DataPeralatanDTO dataPeralatanDTO = new DataPeralatanDTO();
    private List<DataPeralatanDTO> dataPeralatanDTOs = new ArrayList<>();

    // Paging
    private PageNavigation previous;
    private boolean checked;
    private int pageSize = 5;
    private int activePage = 0;
    private int selectedIndex;
    private int totalSize = 0;

    //  Default Dashboard firsttime
    private String src = "/eProcure/dashboard_vendor/Dashboard_DataLogin.zul";

    @Init
    public void init(
            @ExecutionArgParam("dataLoginDTO") DataLoginDTO dataLogin,
            @ExecutionArgParam("dataPerusahaanDTO") DataPerusahaanDTO dataPerusahaan,
            @ExecutionArgParam("dataBankDTO") DataBankDTO dataBank,
            @ExecutionArgParam("dataSegmentasiDTO") DataSegmentasiDTO dataSegmentasi,
            @ExecutionArgParam("dataDokumenDTO") DataDokumenDTO dataDokumen,
            @ExecutionArgParam("dataKeuanganDTO") DataKeuanganDTO dataKeuangan,
            @ExecutionArgParam("dataPeralatanDTO") DataPeralatanDTO dataPeralatan,
            @ExecutionArgParam("previous") PageNavigation previous) {

        initData();
//        checkValidity(dataLogin, dataBank, dataPerusahaan, previous);

    }

    public void initData() {

        //Load Data
        dataLoginDTOs = dataLoginService.findAll();
        dataBankDTOs = dataBankService.findAll();
        dataPerusahaanDTOs = dataPerusahaanService.findAll();
        dataSegmentasiDTOs = dataSegmentasiService.findAll();
        dataDokumenDTOs = dataDokumenService.findAll();
        dataKeuanganDTOs = dataKeuanganService.findAll();
        dataPeralatanDTOs = dataPeralatanService.findAll();

        //vaidate data is empty
        if (dataLoginDTOs.isEmpty()) {
            dataLoginDTOs = Collections.emptyList();
        }
        if (dataPerusahaanDTOs.isEmpty()) {
            dataPerusahaanDTOs = Collections.emptyList();
        }
        if (dataBankDTOs.isEmpty()) {
            dataBankDTOs = Collections.emptyList();
        }
        if (dataSegmentasiDTOs.isEmpty()) {
            dataSegmentasiDTOs = Collections.emptyList();
        }
        if (dataDokumenDTOs.isEmpty()) {
            dataDokumenDTOs = Collections.emptyList();
        }
        if (dataKeuanganDTOs.isEmpty()) {
            dataKeuanganDTOs = Collections.emptyList();
        }
        if (dataPeralatanDTOs.isEmpty()) {
            dataPeralatanDTOs = Collections.emptyList();
        }

        subjectDokumenLegal.add("1. Vendor Registrasi Form");
        subjectDokumenLegal.add("2. Salinan Akte Pendirian Perusahaan dan Perubahannya");
        subjectDokumenLegal.add("3. Salinan Tanda Daftar Perusahaan (TDP)");
        subjectDokumenLegal.add("4. Salinan Surat Ijin Usaha (SIUP/SIUJK)");
        subjectDokumenLegal.add("5. Bukti Fisik Perusahaan");
        subjectDokumenLegal.add("6. Dokumen Quality yang dimiliki");
        subjectDokumenLegal.add("7. Dokumen Teknik");

    }

//    private void checkValidity(DataLoginDTO dataLogin, DataBankDTO dataBank, DataPerusahaanDTO dataPerusahaan, PageNavigation previous) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    /*======================================= functional for page Data Login =======================================*/
    @Command("buttonKlikDataLogin")
    @NotifyChange("src")
    public void buttonKlikDataLogin(@BindingParam("object") DataLoginDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/dashboard_vendor/Dashboard_DataLogin.zul";
    }

    @Command("searchDataLogin")
    @NotifyChange("dataLoginDTOs")
    public void searchDataLogin(@ContextParam(ContextType.VIEW) Window window) {
        Map params = new HashMap();
        params.put("idUser", idUser);
        params.put("namaPengguna", namaPengguna);

        dataLoginDTOs = dataLoginService.findByParams(params);
    }

    @Command("detailDataLogin")
    @NotifyChange("dataLogin")
    public void detailDataLogin(@BindingParam("object") DataLoginDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        Map<String, Object> params = new HashMap<>();
        params.put("dataLoginDTO", obj);
        CommonViewModel.navigateToWithoutDetach("/eProcure/vendor/data_login.zul", window, params);
    }

    /*======================================= functional for page Data Perusahaan =======================================*/
    @Command("buttonKlikDataPerusahaan")
    @NotifyChange("src")
    public void buttonKlikDataPerusahaan(@ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/dashboard_vendor/Dashboard_DataPerusahaan.zul";
    }

    @Command("searchDataPerusahaan")
    @NotifyChange("dataPerusahaanDTOs")
    public void searchDataPerusahaan(@ContextParam(ContextType.VIEW) Window window) {
        Map params = new HashMap();
        params.put("idPerusahaan", idPerusahaan);
        params.put("namaPerusahaan", namaPerusahaan);

        dataPerusahaanDTOs = dataPerusahaanService.findByParams(params);
    }

    @Command("detailDataPerusahaan")
    @NotifyChange("dataPerusahaan")
    public void detailDataPerusahaan(@BindingParam("object") DataPerusahaanDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        Map<String, Object> params = new HashMap<>();
        params.put("dataPerusahaanDTO", obj);
        CommonViewModel.navigateToWithoutDetach("/eProcure/vendor/data_perusahaan.zul", window, params);
    }

    /*======================================= functional for page Data Bank =======================================*/
    @Command("buttonKlikDataBank")
    @NotifyChange("src")
    public void buttonKlikDataBank(@ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/dashboard_vendor/Dashboard_DataBank.zul";
    }

    @Command("searchDataBank")
    @NotifyChange("dataBankDTOs")
    public void searchDataBank(@ContextParam(ContextType.VIEW) Window window) {
        Map params = new HashMap();
        params.put("idDataBank", idDataBank);
        params.put("namaBank", namaBank);
        params.put("noRekening", noRekening);
        params.put("namaNasabah", namaNasabah);

        dataBankDTOs = dataBankService.findByParams(params);
    }

    @Command("detailDataBank")
    @NotifyChange("dataPerusahaan")
    public void detailDataBank(@BindingParam("object") DataBankDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        Map<String, Object> params = new HashMap<>();
        params.put("dataBankDTO", obj);
        CommonViewModel.navigateToWithoutDetach("/eProcure/vendor/data_bank_form.zul", window, params);
    }

    /*======================================= functional for page Data Segmentasi =======================================*/
    @Command("buttonKlikDataSegmentasi")
    @NotifyChange("src")
    public void buttonKlikDataSegmentasi(@ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/dashboard_vendor/Dashboard_DataSegmentasi.zul";
    }

    @Command("searchDataSegmentasi")
    @NotifyChange("dataSegmentasiDTOs")
    public void searchDataSegmentasi(@ContextParam(ContextType.VIEW) Window window) {
        Map params = new HashMap();
        params.put("idDataSegmentasi", idDataSegmentasi);
        params.put("nomorAssosiasi", nomorAssosiasi);
        params.put("bidangUsahaSelect", bidangUsahaSelect);
        params.put("tanggalMulai", tanggalMulai);

        dataSegmentasiDTOs = dataSegmentasiService.findByParams(params);
    }

    @Command("detailDataSegmentasi")
    @NotifyChange("dataSegmentasi")
    public void detailDataSegmentasi(@BindingParam("object") DataSegmentasiDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        Map<String, Object> params = new HashMap<>();
        params.put("dataSegmentasiDTO", obj);
        CommonViewModel.navigateToWithoutDetach("/eProcure/vendor/data_tambah_segmentasi.zul", window, params);
    }

    /*======================================= functional for page Data Dokumen =======================================*/
    @Command("buttonKlikDataDokumen")
    @NotifyChange("src")
    public void buttonKlikDataDokumen(@ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/dashboard_vendor/Dashboard_DataDokumen.zul";
    }

    @Command("searchDataDokumen")
    @NotifyChange("dataDokumenDTOs")
    public void searchDataDokumen(@ContextParam(ContextType.VIEW) Window window) {
        Map params = new HashMap();
        params.put("dokumenID", dokumenID);
        params.put("subject", subject);

        dataDokumenDTOs = dataDokumenService.findByParams(params);
    }

    @Command("detailDataDokumen")
    @NotifyChange("dataSegmentasi")
    public void detailDataDokumen(@BindingParam("object") DataDokumenDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        Map<String, Object> params = new HashMap<>();
        params.put("dataDokumenDTO", obj);
        CommonViewModel.navigateToWithoutDetach("/eProcure/vendor/data_dokumen.zul", window, params);
    }

    /*======================================= functional for page Data Peralatan =======================================*/
    @Command("buttonKlikDataPeralatan")
    @NotifyChange("src")
    public void buttonKlikDataPeralatan(@ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/dashboard_vendor/Dashboard_DataPeralatan.zul";
    }

    @Command("searchDataPeralatan")
    @NotifyChange("dataPeralatanDTOs")
    public void searchDataPeralatan(@ContextParam(ContextType.VIEW) Window window) {
        Map params = new HashMap();
        params.put("idDataPeralatan", idDataPeralatan);
        params.put("tahunPembuatan", tahunPembuatan);
        params.put("jenis", jenis);
        params.put("kondisiPeralatanSelect", kondisiPeralatanSelect);

        dataPeralatanDTOs = dataPeralatanService.findByParams(params);
    }

    @Command("detailDataPeralatan")
    @NotifyChange("dataPeralatan")
    public void detailDataPeralatan(@BindingParam("object") DataPeralatanDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        Map<String, Object> params = new HashMap<>();
        params.put("dataPeralatanDTO", obj);
        CommonViewModel.navigateToWithoutDetach("/eProcure/vendor/data_peralatan_form.zul", window, params);
    }

    /*======================================= functional for page Data Keuangan =======================================*/
    @Command("buttonKlikDataKeuangan")
    @NotifyChange("src")
    public void buttonKlikDataKeuangan(@ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/dashboard_vendor/Dashboard_DataKeuangan.zul";
    }

    @Command("searchDataKeuangan")
    @NotifyChange("dataKeuanganDTOs")
    public void searchDataKeuangan(@ContextParam(ContextType.VIEW) Window window) {
        Map params = new HashMap();
        params.put("idDataKeuangan", idDataKeuangan);
        params.put("tahunKeuangan", tahunKeuangan);

        dataKeuanganDTOs = dataKeuanganService.findByParams(params);
    }

    @Command("detailDataKeuangan")
    @NotifyChange("dataSegmentasi")
    public void detailDataKeuangan(@BindingParam("object") DataKeuanganDTO obj, @ContextParam(ContextType.VIEW) Window window) {
        Map<String, Object> params = new HashMap<>();
        params.put("dataKeuanganDTO", obj);
        CommonViewModel.navigateToWithoutDetach("/eProcure/vendor/data_keuangan_form.zul", window, params);
    }
    /*======================================= functional for page Data Pengalaman =======================================*/

    @Command("buttonKlikDataPengalaman")
    @NotifyChange("src")
    public void buttonKlikDataPengalaman(@ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/dashboard_vendor/Dashboard_DataPengalaman.zul";
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getIdDatalogin() {
        return idDatalogin;
    }

    public void setIdDatalogin(String idDatalogin) {
        this.idDatalogin = idDatalogin;
    }

    public String getNamaPengguna() {
        return namaPengguna;
    }

    public void setNamaPengguna(String namaPengguna) {
        this.namaPengguna = namaPengguna;
    }

    public String getIdPerusahaan() {
        return idPerusahaan;
    }

    public void setIdPerusahaan(String idPerusahaan) {
        this.idPerusahaan = idPerusahaan;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getIdDataBank() {
        return idDataBank;
    }

    public void setIdDataBank(String idDataBank) {
        this.idDataBank = idDataBank;
    }

    public BankType getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(BankType namaBank) {
        this.namaBank = namaBank;
    }

    public String getIdDataSegmentasi() {
        return idDataSegmentasi;
    }

    public void setIdDataSegmentasi(String idDataSegmentasi) {
        this.idDataSegmentasi = idDataSegmentasi;
    }

    public BidangUsahaType getBidangUsahaSelect() {
        return bidangUsahaSelect;
    }

    public void setBidangUsahaSelect(BidangUsahaType bidangUsahaSelect) {
        this.bidangUsahaSelect = bidangUsahaSelect;
    }

    public Date getTanggalMulai() {
        return tanggalMulai;
    }

    public void setTanggalMulai(Date tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }

    public ListModelList<BidangUsahaType> getBidangUsahaTypes() {
        return new ListModelList<>(BidangUsahaType.values());
    }

    public void setBidangUsahaTypes(ListModelList<BidangUsahaType> bidangUsahaTypes) {
        this.bidangUsahaTypes = bidangUsahaTypes;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    public DataLoginDTO getDataLoginDTO() {
        return dataLoginDTO;
    }

    public void setDataLoginDTO(DataLoginDTO dataLoginDTO) {
        this.dataLoginDTO = dataLoginDTO;
    }

    public List<DataLoginDTO> getDataLoginDTOs() {
        return dataLoginDTOs;
    }

    public void setDataLoginDTOs(List<DataLoginDTO> dataLoginDTOs) {
        this.dataLoginDTOs = dataLoginDTOs;
    }

    public DataPerusahaanDTO getDataPerusahaanDTO() {
        return dataPerusahaanDTO;
    }

    public void setDataPerusahaanDTO(DataPerusahaanDTO dataPerusahaanDTO) {
        this.dataPerusahaanDTO = dataPerusahaanDTO;
    }

    public List<DataPerusahaanDTO> getDataPerusahaanDTOs() {
        return dataPerusahaanDTOs;
    }

    public void setDataPerusahaanDTOs(List<DataPerusahaanDTO> dataPerusahaanDTOs) {
        this.dataPerusahaanDTOs = dataPerusahaanDTOs;
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

    public PageNavigation getPrevious() {
        return previous;
    }

    public void setPrevious(PageNavigation previous) {
        this.previous = previous;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public int getActivePage() {
        return activePage;
    }

    public void setActivePage(int activePage) {
        this.activePage = activePage;
    }

    public int getSelectedIndex() {
        return selectedIndex;
    }

    public void setSelectedIndex(int selectedIndex) {
        this.selectedIndex = selectedIndex;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public String getNomorAssosiasi() {
        return nomorAssosiasi;
    }

    public void setNomorAssosiasi(String nomorAssosiasi) {
        this.nomorAssosiasi = nomorAssosiasi;
    }

    public ListModelList<BankType> getBankTypes() {
        return new ListModelList<>(BankType.values());
    }

    public void setBankTypes(ListModelList<BankType> bankTypes) {
        this.bankTypes = bankTypes;
    }

    public DataSegmentasiDTO getDataSegmentasiDTO() {
        return dataSegmentasiDTO;
    }

    public void setDataSegmentasiDTO(DataSegmentasiDTO dataSegmentasiDTO) {
        this.dataSegmentasiDTO = dataSegmentasiDTO;
    }

    public List<DataSegmentasiDTO> getDataSegmentasiDTOs() {
        return dataSegmentasiDTOs;
    }

    public void setDataSegmentasiDTOs(List<DataSegmentasiDTO> dataSegmentasiDTOs) {
        this.dataSegmentasiDTOs = dataSegmentasiDTOs;
    }

    public String getDokumenID() {
        return dokumenID;
    }

    public void setDokumenID(String dokumenID) {
        this.dokumenID = dokumenID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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

    public String getIdDataKeuangan() {
        return idDataKeuangan;
    }

    public void setIdDataKeuangan(String idDataKeuangan) {
        this.idDataKeuangan = idDataKeuangan;
    }

    public String getTahunKeuangan() {
        return tahunKeuangan;
    }

    public void setTahunKeuangan(String tahunKeuangan) {
        this.tahunKeuangan = tahunKeuangan;
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

    public String getIdDataPeralatan() {
        return idDataPeralatan;
    }

    public void setIdDataPeralatan(String idDataPeralatan) {
        this.idDataPeralatan = idDataPeralatan;
    }

    public String getTahunPembuatan() {
        return tahunPembuatan;
    }

    public void setTahunPembuatan(String tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public KondisiPeralatan getKondisiPeralatanSelect() {
        return kondisiPeralatanSelect;
    }

    public void setKondisiPeralatanSelect(KondisiPeralatan kondisiPeralatanSelect) {
        this.kondisiPeralatanSelect = kondisiPeralatanSelect;
    }

    public ListModelList<KondisiPeralatan> getKondisiPeralatans() {
        return new ListModelList<>(KondisiPeralatan.values());
    }

    public void setKondisiPeralatans(ListModelList<KondisiPeralatan> kondisiPeralatans) {
        this.kondisiPeralatans = kondisiPeralatans;
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

}
