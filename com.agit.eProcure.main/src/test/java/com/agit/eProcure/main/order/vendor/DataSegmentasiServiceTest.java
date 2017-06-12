package com.agit.eProcure.main.order.vendor;

import com.agit.eProcure.common.application.DataSegmentasiService;
import com.agit.eProcure.common.dto.vendor.DataSegmentasiDTO;
import com.agit.eProcure.core.domain.vendor.DataSegmentasiRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.Validate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Bayu Hendra Setiawan
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
    "classpath:/eProcure-context-application.xml",
    "classpath:/eProcure-context-infrastructure.xml"})
public class DataSegmentasiServiceTest {

    @Autowired
    private DataSegmentasiRepository dataSegmentasiRepository;

    @Autowired
    private DataSegmentasiService dataSegmentasiService;

    @Test
    public void testEnd2EndDataSegmentasi() {
        Validate.notNull(dataSegmentasiRepository);

        /* step 1 - get data dummy dataSegmentasi */
        printThisMessage("Step 1 - Get Data Dummy");
        DataSegmentasiDTO p = dataSegmentasiService.getDummyData();
        System.out.println("Data DataSegmentasi" + p.toString());

        /* step 2 - store data dataSegmentasi */
        printThisMessage("Step 2 - Store Data to DB");
        dataSegmentasiService.SaveOrUpdate(p);
        System.out.println("Data berhasil disimpan");

        /* step 3 - get Data DataSegmentasi by ID */
        printThisMessage("Step 3 - Get Data by ID");
        DataSegmentasiDTO dataSegmentasiByID = dataSegmentasiService.findByID(p.getIdDataSegmentasi());
        System.out.println("Data Data Segmentasi by ID " + dataSegmentasiByID);

        /* step 4 - get All Data Data Segmentasi */
        printThisMessage("Step 4 - Get All Data Data Segmentasi");
        List<DataSegmentasiDTO> listDataSegmentasi = dataSegmentasiService.findAll();
        for (DataSegmentasiDTO pp : listDataSegmentasi) {
            System.out.println("Data Semua DataSegmentasi" + pp.toString());
        }

        /* step 5 - get data Segmentasi by Params*/
        printThisMessage("Step 5 - Get Data Data Segmentasi by Params");
        Map paramater = new HashMap();
        paramater.put("nomorAssosiasi", "nomorAssosiasi");

        List<DataSegmentasiDTO> listDataSegmentasiByParams = dataSegmentasiService.findByParams(paramater);
        for (DataSegmentasiDTO ppp : listDataSegmentasiByParams) {
            System.out.println("Data DataSegmentasi by Paramater" + ppp.toString());
        }

    }

    public void printThisMessage(String msg) {
        
        System.out.println("------------------------------------------------");
        System.out.println(msg);
        System.out.println("------------------------------------------------");

    }

}
