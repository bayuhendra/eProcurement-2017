package com.agit.eProcure.main.order.vendor;

import com.agit.eProcure.common.application.DataLoginService;
import com.agit.eProcure.common.dto.vendor.DataLoginDTO;
import com.agit.eProcure.core.domain.vendor.DataLoginRepository;
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
public class DataLoginServiceTest {

    @Autowired
    private DataLoginRepository dataLoginRepository;

    @Autowired
    private DataLoginService dataLoginService;

    @Test
    public void testEnd2EndDataLogin() {
        Validate.notNull(dataLoginRepository);

        /* step 1 - get data dummy dataLogin */
        printThisMessage("Step 1 - Get Data Dummy");
        DataLoginDTO p = dataLoginService.getDummyData();
        System.out.println("Data DataLogin" + p.toString());

        /* step 2 - store data dataLogin */
        printThisMessage("Step 2 - Store Data to DB");
        dataLoginService.SaveOrUpdate(p);
        System.out.println("Data berhasil disimpan");

        /* step 3 - get Data DataLogin by ID */
        printThisMessage("Step 3 - Get Data by ID");
        DataLoginDTO dataLoginByID = dataLoginService.findByID(p.getIdDataLogin());
        System.out.println("Data DataLogin by ID " + dataLoginByID);

        /* step 4 - get All Data DataLogin */
        printThisMessage("Step 4 - Get All Data DataLogin");
        List<DataLoginDTO> listDataLogin = dataLoginService.findAll();
        for (DataLoginDTO pp : listDataLogin) {
            System.out.println("Data Semua DataLogin" + pp.toString());
        }

        /* step 5 - get data dataLogin by Params*/
        printThisMessage("Step 5 - Get Data DataLogin by Params");
        Map paramater = new HashMap();
        paramater.put("namaPengguna", "BAYU");

        List<DataLoginDTO> listDataLoginByParams = dataLoginService.findByParams(paramater);
        for (DataLoginDTO ppp : listDataLoginByParams) {
            System.out.println("Data DataLogin by Paramater" + ppp.toString());
        }

    }

    public void printThisMessage(String msg) {
        
        System.out.println("------------------------------------------------");
        System.out.println(msg);
        System.out.println("------------------------------------------------");

    }

}
