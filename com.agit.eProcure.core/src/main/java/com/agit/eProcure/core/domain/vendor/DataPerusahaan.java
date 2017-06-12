package com.agit.eProcure.core.domain.vendor;

import com.agit.eProcure.shared.object.EntityObject;
import com.agit.eProcure.shared.state.KualifikasiStatus;
import com.agit.eProcure.shared.state.PKPStatus;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public class DataPerusahaan implements EntityObject<DataPerusahaan> {

    long id;
    private String idPerusahaan;
    private PKPStatus pKPStatus;
    private KualifikasiStatus kualifikasiStatus;
    

    @Override
    public boolean sameIdentityAs(DataPerusahaan other) {
        return this.equals(other);
    }

}
