package com.agit.eProcure.main.order.vendor;

import com.agit.eProcure.common.application.DataPerusahaanService;
import com.agit.eProcure.common.dto.vendor.DataPerusahaanDTO;
import com.agit.eProcure.core.domain.vendor.DataPerusahaanRepository;
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
public class DataPerusahaanServiceTest {

    @Autowired
    private DataPerusahaanRepository dataPerusahaanRepository;

    @Autowired
    private DataPerusahaanService dataPerusahaanService;

    @Test
    public void testEnd2EndDataPerusahaan() {
        Validate.notNull(dataPerusahaanRepository);

        /* step 1 - get data dummy dataPerusahaan */
        printThisMessage("Step 1 - Get Data Dummy");
        DataPerusahaanDTO p = dataPerusahaanService.getDummyData();
        System.out.println("Data DataPerusahaan" + p.toString());

        /* step 2 - store data dataPerusahaan */
        printThisMessage("Step 2 - Store Data to DB");
        dataPerusahaanService.SaveOrUpdate(p);
        System.out.println("Data berhasil disimpan");

        /* step 3 - get Data DataPerusahaan by ID */
        printThisMessage("Step 3 - Get Data by ID");
        DataPerusahaanDTO dataPerusahaanByID = dataPerusahaanService.findByID(p.getIdPerusahaan());
        System.out.println("Data Data Login by ID " + dataPerusahaanByID);

        /* step 4 - get All Data Data Login */
        printThisMessage("Step 4 - Get All Data Data Login");
        List<DataPerusahaanDTO> listDataPerusahaan = dataPerusahaanService.findAll();
        for (DataPerusahaanDTO pp : listDataPerusahaan) {
            System.out.println("Data Semua DataPerusahaan" + pp.toString());
        }

        /* step 5 - get data Login by Params*/
        printThisMessage("Step 5 - Get Data Data Login by Params");
        Map paramater = new HashMap();
        paramater.put("namaPerusahaan", "namaPerusahaan");

        List<DataPerusahaanDTO> listDataPerusahaanByParams = dataPerusahaanService.findByParams(paramater);
        for (DataPerusahaanDTO ppp : listDataPerusahaanByParams) {
            System.out.println("Data DataPerusahaan by Paramater" + ppp.toString());
        }

    }

    public void printThisMessage(String msg) {
        
        System.out.println("------------------------------------------------");
        System.out.println(msg);
        System.out.println("------------------------------------------------");

    }

}
