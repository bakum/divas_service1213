package ua.divas.service.beans;

import java.io.IOException;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.servlet.http.HttpServletRequest;

public class LoginBean {
    public LoginBean() {
    }

    public void logout(ActionEvent actionEvent) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        //String logoutUrl = "faces" + ctx.getViewRoot().getViewId();
        String logoutUrl = "adfAuthentication?logout=true&end_url=/faces/logout.jsf";
        ((HttpServletRequest) ectx.getRequest()).getSession().invalidate();
        try {
            ectx.redirect(logoutUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
