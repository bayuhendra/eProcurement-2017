package com.agit.eProcure.main.order.vendor;

import com.agit.eProcure.common.application.DataBankService;
import com.agit.eProcure.common.dto.vendor.DataBankDTO;
import com.agit.eProcure.core.domain.vendor.DataBankRepository;
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
public class DataBankServiceTest {

    @Autowired
    private DataBankRepository dataBankRepository;

    @Autowired
    private DataBankService dataBankService;

    @Test
    public void testEnd2EndDataBank() {
        Validate.notNull(dataBankRepository);

        /* step 1 - get data dummy dataBank */
        printThisMessage("Step 1 - Get Data Dummy");
        DataBankDTO p = dataBankService.getDummyData();
        System.out.println("Data DataBank" + p.toString());

        /* step 2 - store data dataBank */
        printThisMessage("Step 2 - Store Data to DB");
        dataBankService.SaveOrUpdate(p);
        System.out.println("Data berhasil disimpan");

        /* step 3 - get Data DataBank by ID */
        printThisMessage("Step 3 - Get Data by ID");
        DataBankDTO dataBankByID = dataBankService.findByID(p.getIdDataBank());
        System.out.println("Data Data Bank by ID " + dataBankByID);

        /* step 4 - get All Data Data Bank */
        printThisMessage("Step 4 - Get All Data Data Bank");
        List<DataBankDTO> listDataBank = dataBankService.findAll();
        for (DataBankDTO pp : listDataBank) {
            System.out.println("Data Semua DataBank" + pp.toString());
        }

        /* step 5 - get data Bank by Params*/
        printThisMessage("Step 5 - Get Data Data Bank by Params");
        Map paramater = new HashMap();
        paramater.put("namaBank", "namaBank");

        List<DataBankDTO> listDataBankByParams = dataBankService.findByParams(paramater);
        for (DataBankDTO ppp : listDataBankByParams) {
            System.out.println("Data DataBank by Paramater" + ppp.toString());
        }

    }

    public void printThisMessage(String msg) {
        
        System.out.println("------------------------------------------------");
        System.out.println(msg);
        System.out.println("------------------------------------------------");

    }

}
