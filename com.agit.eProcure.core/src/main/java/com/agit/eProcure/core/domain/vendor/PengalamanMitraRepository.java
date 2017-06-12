package com.agit.eProcure.core.domain.vendor;

import java.util.List;
import java.util.Map;

/**
 *
 * @author 3AD
 */
public interface PengalamanMitraRepository {
    
    void saveOrUpdate(PengalamanMitra pengalamanMitra);
    
    void delete(PengalamanMitra pengalamanMitra);
    
    PengalamanMitra findByID(String mitraID);
    
    List<PengalamanMitra> findAll();
    
    List<PengalamanMitra> findByParam(Map map);
}
