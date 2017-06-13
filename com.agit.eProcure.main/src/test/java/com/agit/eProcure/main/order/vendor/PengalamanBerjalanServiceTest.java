package com.agit.eProcure.main.order.vendor;

import com.agit.eProcure.common.application.PengalamanBerjalanService;
import com.agit.eProcure.common.dto.vendor.PengalamanBerjalanDTO;
import com.agit.eProcure.core.domain.vendor.PengalamanBerjalanRepository;
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
public class PengalamanBerjalanServiceTest {

    @Autowired
    private PengalamanBerjalanRepository dataLoginRepository;

    @Autowired
    private PengalamanBerjalanService dataLoginService;

    @Test
    public void testEnd2EndDataLogin() {
        Validate.notNull(dataLoginRepository);

        /* step 1 - get data dummy dataLogin */
        printThisMessage("Step 1 - Get Data Dummy");
        PengalamanBerjalanDTO p = dataLoginService.getDummy();
        System.out.println("Data DataLogin" + p.toString());

        /* step 2 - store data dataLogin */
        printThisMessage("Step 2 - Store Data to DB");
        dataLoginService.saveOrUpdate(p);
        System.out.println("Data berhasil disimpan");

        /* step 3 - get Data DataLogin by ID */
        printThisMessage("Step 3 - Get Data by ID");
        PengalamanBerjalanDTO dataLoginByID = dataLoginService.findByID(p.getIdPengalamanBerjalan());
        System.out.println("Data Data Login by ID " + dataLoginByID);

        /* step 4 - get All Data Data Login */
        printThisMessage("Step 4 - Get All Data Data Login");
        List<PengalamanBerjalanDTO> listDataLogin = dataLoginService.findAll();
        for (PengalamanBerjalanDTO pp : listDataLogin) {
            System.out.println("Data Semua DataLogin" + pp.toString());
        }

        /* step 5 - get data Login by Params*/
        printThisMessage("Step 5 - Get Data Data Login by Params");
        Map paramater = new HashMap();
        paramater.put("namaPengguna", "BAYU");

        List<PengalamanBerjalanDTO> listDataLoginByParams = dataLoginService.findByParams(paramater);
        for (PengalamanBerjalanDTO ppp : listDataLoginByParams) {
            System.out.println("Data DataLogin by Paramater" + ppp.toString());
        }

    }

    public void printThisMessage(String msg) {

        System.out.println("------------------------------------------------");
        System.out.println(msg);
        System.out.println("------------------------------------------------");

    }
}
