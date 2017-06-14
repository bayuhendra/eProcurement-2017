package com.agit.eProcure.main.order.vendor;

import com.agit.eProcure.common.application.DataPenanggungJawabService;
import com.agit.eProcure.common.dto.vendor.DataPenanggungJawabDTO;
import com.agit.eProcure.core.domain.vendor.DataPenanggungJawabRepository;
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
public class DataPenanggungJawabServiceTest {
    @Autowired
    private DataPenanggungJawabRepository dataPenanggungJawabRepository;
    
    @Autowired
    private DataPenanggungJawabService dataPenanggungJawabService;

    @Test
    public void testEndToEndDataPenanggungJawab() {
        Validate.notNull(dataPenanggungJawabRepository);

        /* step 1 - get data dummy dataPenanggungJawab */
        printThisMessage("Step 1 - Get Data Dummy");
        DataPenanggungJawabDTO p = dataPenanggungJawabService.getDummyData();
        System.out.println("Data DataPenanggungJawab" + p.toString());

        /* step 2 - store data dataPenanggungJawab */
        printThisMessage("Step 2 - Store Data to DB");
        dataPenanggungJawabService.SaveOrUpdate(p);
        System.out.println("Data berhasil disimpan");

        /* step 3 - get Data DataPenanggungJawab by ID */
        printThisMessage("Step 3 - Get Data by ID");
        DataPenanggungJawabDTO dataPenanggungJawabByID = dataPenanggungJawabService.findByID(p.getIdPenanggungJawab());
        System.out.println("Data Data PenanggungJawab by ID " + dataPenanggungJawabByID);

        /* step 4 - get All Data Data PenanggungJawab */
        printThisMessage("Step 4 - Get All Data Data PenanggungJawab");
        List<DataPenanggungJawabDTO> listDataPenanggungJawab = dataPenanggungJawabService.findAll();
        for (DataPenanggungJawabDTO pp : listDataPenanggungJawab) {
            System.out.println("Data Semua DataPenanggungJawab" + pp.toString());
        }

        /* step 5 - get data PenanggungJawab by Params*/
        printThisMessage("Step 5 - Get Data Data PenanggungJawab by Params");
        Map paramater = new HashMap();
        paramater.put("namaPenanggungJawab", "namaPenanggungJawab");

        List<DataPenanggungJawabDTO> listDataPenanggungJawabByParams = dataPenanggungJawabService.findByParams(paramater);
        for (DataPenanggungJawabDTO ppp : listDataPenanggungJawabByParams) {
            System.out.println("Data DataPenanggungJawab by Paramater" + ppp.toString());
        }

    }

    public void printThisMessage(String msg) {
        
        System.out.println("------------------------------------------------");
        System.out.println(msg);
        System.out.println("------------------------------------------------");

    }
    
}
