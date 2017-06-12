package com.agit.eProcure.main.order.vendor;

import com.agit.eProcure.common.application.DataPengalamanService;
import com.agit.eProcure.common.dto.vendor.DataPengalamanDTO;
import com.agit.eProcure.core.domain.vendor.DataPengalamanRepository;
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
 * @author 3AD
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
    "classpath:/eProcure-context-application.xml",
    "classpath:/eProcure-context-infrastructure.xml"})
public class DataPengalamanTest {

    @Autowired
    private DataPengalamanRepository dataLoginRepository;

    @Autowired
    private DataPengalamanService dataLoginService;

    @Test
    public void testEnd2EndDataLogin() {
        Validate.notNull(dataLoginRepository);

        /* step 1 - get data dummy dataLogin */
        printThisMessage("Step 1 - Get Data Dummy");
        DataPengalamanDTO p = dataLoginService.getDummyData();
        System.out.println("Data DataLogin" + p.toString());

        /* step 2 - store data dataLogin */
        printThisMessage("Step 2 - Store Data to DB");
        dataLoginService.SaveOrUpdate(p);
        System.out.println("Data berhasil disimpan");

        /* step 3 - get Data DataLogin by ID */
        printThisMessage("Step 3 - Get Data by ID");
        DataPengalamanDTO dataLoginByID = dataLoginService.findByID(p.getIdDataPengalaman());
        System.out.println("Data Data Login by ID " + dataLoginByID);

        /* step 4 - get All Data Data Login */
        printThisMessage("Step 4 - Get All Data Data Login");
        List<DataPengalamanDTO> listDataLogin = dataLoginService.findAll();
        for (DataPengalamanDTO pp : listDataLogin) {
            System.out.println("Data Semua DataLogin" + pp.toString());
        }

        /* step 5 - get data Login by Params*/
        printThisMessage("Step 5 - Get Data Data Login by Params");
        Map paramater = new HashMap();
        paramater.put("namaPengguna", "BAYU");

        List<DataPengalamanDTO> listDataLoginByParams = dataLoginService.findByParams(paramater);
        for (DataPengalamanDTO ppp : listDataLoginByParams) {
            System.out.println("Data DataLogin by Paramater" + ppp.toString());
        }

    }

    public void printThisMessage(String msg) {

        System.out.println("------------------------------------------------");
        System.out.println(msg);
        System.out.println("------------------------------------------------");

    }
}
