package com.agit.eProcure.main.viewmodel.vendor;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zul.Window;

/**
 *
 * @author Bayu Hendra Setiawan
 */
@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class VendorVM {

    private String src = "/eProcure/vendor/form_vendor.zul";

    @Init
    public void init(Component comp) throws Exception {

    }
    
    @Command("buttonKlikDataLogin")
    @NotifyChange("src")
    public void buttonKlikDataLogin(
            @ContextParam(ContextType.VIEW) Window window) {
        src = "/eProcure/vendor/form_vendor.zul";
    }
    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

}
