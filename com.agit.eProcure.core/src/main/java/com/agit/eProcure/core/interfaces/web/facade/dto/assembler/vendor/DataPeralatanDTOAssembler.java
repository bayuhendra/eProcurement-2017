/*
 */
package com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor;

import com.agit.eProcure.common.dto.vendor.DataPeralatanDTO;
import com.agit.eProcure.common.dto.vendor.DataPeralatanDTOBuilder;
import com.agit.eProcure.core.domain.vendor.DataPeralatan;
import com.agit.eProcure.core.domain.vendor.DataPeralatanBuilder;
import com.agit.eProcure.shared.object.IObjectAssembler;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zaky
 */
public class DataPeralatanDTOAssembler implements IObjectAssembler<DataPeralatan, DataPeralatanDTO>{

    @Override
    public DataPeralatanDTO toDTO(DataPeralatan domainObject) {
        return new DataPeralatanDTOBuilder()
                .setIdDataPeralatan(domainObject.getIdDataPeralatan())
                .setJenis(domainObject.getJenis())
                .setJumlah(domainObject.getJumlah())
                .setKapasitas(domainObject.getKapasitas())
                .setMerkTipe(domainObject.getMerkTipe())
                .setTahunPembuatan(domainObject.getTahunPembuatan())
                .setKondisiPeralatan(domainObject.getKondisiPeralatan())
                .setLokasi(domainObject.getLokasi())
                .setBuktiKepemilikan(domainObject.getBuktiKepemilikan())
                .setDokumenBuktiKepemilikan(domainObject.getDokumenBuktiKepemilikan())
                .setGambarPeralatanAset(domainObject.getGambarPeralatanAset())
                .setCreatedBy(domainObject.getCreatedBy())
                .setCreatedDate(domainObject.getCreatedDate())
                .setModifiedBy(domainObject.getModifiedBy())
                .setModifiedDate(domainObject.getModifiedDate())
                .createDataPeralatanDTO();
    }

    @Override
    public DataPeralatan toDomain(DataPeralatanDTO dtoObject) {
        return new DataPeralatanBuilder()
                .setIdDataPeralatan(dtoObject.getIdDataPeralatan())
                .setJenis(dtoObject.getJenis())
                .setJumlah(dtoObject.getJumlah())
                .setKapasitas(dtoObject.getKapasitas())
                .setMerkTipe(dtoObject.getMerkTipe())
                .setTahunPembuatan(dtoObject.getTahunPembuatan())
                .setKondisiPeralatan(dtoObject.getKondisiPeralatan())
                .setLokasi(dtoObject.getLokasi())
                .setBuktiKepemilikan(dtoObject.getBuktiKepemilikan())
                .setDokumenBuktiKepemilikan(dtoObject.getDokumenBuktiKepemilikan())
                .setGambarPeralatanAset(dtoObject.getGambarPeralatanAset())
                .setCreatedBy(dtoObject.getCreatedBy())
                .setCreatedDate(dtoObject.getCreatedDate())
                .setModifiedBy(dtoObject.getModifiedBy())
                .setModifiedDate(dtoObject.getModifiedDate())
                .createDataPeralatan();
    }
    
    public List<DataPeralatan> toDomain(List<DataPeralatanDTO> arg0) {
        List<DataPeralatan> res = new ArrayList<>();
        for (DataPeralatanDTO t : arg0) {
            res.add(new DataPeralatanDTOAssembler().toDomain(t));
        }
        return res;
    }

    public List<DataPeralatanDTO> toDTO(List<DataPeralatan> arg0) {
        List<DataPeralatanDTO> res = new ArrayList<>();
        for (DataPeralatan t : arg0) {
            res.add(this.toDTO(t));
        }
        return res;
    }
    
}
