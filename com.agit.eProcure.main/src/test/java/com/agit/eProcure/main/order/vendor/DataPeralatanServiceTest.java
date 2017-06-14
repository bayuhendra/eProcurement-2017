package com.agit.eProcure.main.order.vendor;

import com.agit.eProcure.common.application.DataPeralatanService;
import com.agit.eProcure.common.dto.vendor.DataPeralatanDTO;
import com.agit.eProcure.core.domain.vendor.DataPeralatanRepository;
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
 * @author Zaky
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
    "classpath:/eProcure-context-application.xml",
    "classpath:/eProcure-context-infrastructure.xml"})
public class DataPeralatanServiceTest {
    
    @Autowired
    private DataPeralatanRepository dataPeralatanRepository;
    
    @Autowired
    private DataPeralatanService dataPeralatanService;
    
    @Test
    public void testEndToEndDataPeralatan(){
        
        Validate.notNull(dataPeralatanRepository);

        /* step 1 - get data dummy dataPeralatan */
        printThisMessage("Step 1 - Get Data Dummy");
        DataPeralatanDTO p = dataPeralatanService.getDummyData();
        System.out.println("Data DataPeralatan" + p.toString());

        /* step 2 - store data dataPeralatan */
        printThisMessage("Step 2 - Store Data to DB");
        dataPeralatanService.SaveOrUpdate(p);
        System.out.println("Data berhasil disimpan");

        /* step 3 - get Data DataPeralatan by ID */
        printThisMessage("Step 3 - Get Data by ID");
        DataPeralatanDTO dataPeralatanByID = dataPeralatanService.findByID(p.getIdDataPeralatan());
        System.out.println("Data Data Peralatan by ID " + dataPeralatanByID);

        /* step 4 - get All Data Data Peralatan */
        printThisMessage("Step 4 - Get All Data Data Peralatan");
        List<DataPeralatanDTO> listDataPeralatan = dataPeralatanService.findAll();
        for (DataPeralatanDTO pp : listDataPeralatan) {
            System.out.println("Data Semua DataPeralatan" + pp.toString());
        }

        /* step 5 - get data Peralatan by Params*/
        printThisMessage("Step 5 - Get Data Data Peralatan by Params");
        Map paramater = new HashMap();
        paramater.put("namaPeralatan", "namaPeralatan");

        List<DataPeralatanDTO> listDataPeralatanByParams = dataPeralatanService.findByParams(paramater);
        for (DataPeralatanDTO ppp : listDataPeralatanByParams) {
            System.out.println("Data DataPeralatan by Paramater" + ppp.toString());
        }

    }

    public void printThisMessage(String msg) {
        
        System.out.println("------------------------------------------------");
        System.out.println(msg);
        System.out.println("------------------------------------------------");

    }
    
}
