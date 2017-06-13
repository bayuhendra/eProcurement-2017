package com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor;

import com.agit.eProcure.common.dto.vendor.DataKeuanganDTO;
import com.agit.eProcure.common.dto.vendor.DataKeuanganDTOBuilder;
import com.agit.eProcure.core.domain.vendor.DataKeuangan;
import com.agit.eProcure.core.domain.vendor.DataKeuanganBuilder;
import com.agit.eProcure.shared.object.IObjectAssembler;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 3AD
 */
public class DataKeuanganDTOAssembler implements IObjectAssembler<DataKeuangan, DataKeuanganDTO> {

    @Override
    public DataKeuanganDTO toDTO(DataKeuangan domainObject) {
        return new DataKeuanganDTOBuilder()
                .setAktivaLainnya(domainObject.getAktivaLainnya())
                .setAuditID(domainObject.getAuditID())
                .setBank(domainObject.getBank())
                .setCreatedBy(domainObject.getCreatedBy())
                .setCreatedDate(domainObject.getCreatedDate())
                .setGedung(domainObject.getGedung())
                .setHutangDagang(domainObject.getHutangDagang())
                .setHutangJangkaPanjang(domainObject.getHutangJangkaPanjang())
                .setHutangLainnya(domainObject.getHutangLainnya())
                .setHutangPajak(domainObject.getHutangPajak())
                .setInventaris(domainObject.getInventaris())
                .setKas(domainObject.getKas())
                .setKekayaanBerih(domainObject.getKekayaanBerih())
                .setModifiedBy(domainObject.getModifiedBy())
                .setNamaAudit(domainObject.getNamaAudit())
                .setPekerjaanDP(domainObject.getPekerjaanDP())
                .setPeralatan(domainObject.getPeralatan())
                .setPersediaanBarang(domainObject.getPersediaanBarang())
                .setTahunKeuangan(domainObject.getTahunKeuangan())
                .setTglAudit(domainObject.getTglAudit())
                .setTotal(domainObject.getTotal())
                .setTotalAktivaLainnya(domainObject.getTotalAktivaLainnya())
                .setTotalAktivaLancar(domainObject.getAktivaLainnya())
                .setTotalAktivaTetap(domainObject.getTotalAktivaTetap())
                .setTotalHutangJangkaPendek(domainObject.getTotalHutangJangkaPendek())
                .setTotalPiutang(domainObject.getTotalPiutang())
                .createDataKeuanganDTO();
    }

    @Override
    public DataKeuangan toDomain(DataKeuanganDTO dtoObject) {
        return new DataKeuanganBuilder()
                .setAktivaLainnya(dtoObject.getAktivaLainnya())
                .setAuditID(dtoObject.getAuditID())
                .setBank(dtoObject.getBank())
                .setCreatedBy(dtoObject.getCreatedBy())
                .setCreatedDate(dtoObject.getCreatedDate())
                .setGedung(dtoObject.getGedung())
                .setHutangDagang(dtoObject.getHutangDagang())
                .setHutangJangkaPanjang(dtoObject.getHutangJangkaPanjang())
                .setHutangLainnya(dtoObject.getHutangLainnya())
                .setHutangPajak(dtoObject.getHutangPajak())
                .setInventaris(dtoObject.getInventaris())
                .setKas(dtoObject.getKas())
                .setKekayaanBerih(dtoObject.getKekayaanBerih())
                .setModifiedBy(dtoObject.getModifiedBy())
                .setNamaAudit(dtoObject.getNamaAudit())
                .setPekerjaanDP(dtoObject.getPekerjaanDP())
                .setPeralatan(dtoObject.getPeralatan())
                .setPersediaanBarang(dtoObject.getPersediaanBarang())
                .setTahunKeuangan(dtoObject.getTahunKeuangan())
                .setTglAudit(dtoObject.getTglAudit())
                .setTotal(dtoObject.getTotal())
                .setTotalAktivaLainnya(dtoObject.getTotalAktivaLainnya())
                .setTotalAktivaLancar(dtoObject.getAktivaLainnya())
                .setTotalAktivaTetap(dtoObject.getTotalAktivaTetap())
                .setTotalHutangJangkaPendek(dtoObject.getTotalHutangJangkaPendek())
                .setTotalPiutang(dtoObject.getTotalPiutang())
                .createDataKeuangan();
    }

    public List<DataKeuangan> toDomains(List<DataKeuanganDTO> arg0) {
        List<DataKeuangan> res = new ArrayList<>();
        for (DataKeuanganDTO t : arg0) {
            res.add(new DataKeuanganDTOAssembler().toDomain(t));
        }
        return res;
    }

    public List<DataKeuanganDTO> toDTOs(List<DataKeuangan> arg0) {
        List<DataKeuanganDTO> res = new ArrayList<>();
        for (DataKeuangan t : arg0) {
            res.add(this.toDTO(t));
        }
        return res;
    }

}
