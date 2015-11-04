package ua.divas.service.vo.common;

public interface UsersViewSDO extends java.io.Serializable {

   public java.lang.String getId();

   public void setId(java.lang.String value);

   public java.lang.String getFirstName();

   public void setFirstName(java.lang.String value);

   public java.lang.String getLastName();

   public void setLastName(java.lang.String value);

   public java.lang.String getEmail();

   public void setEmail(java.lang.String value);

   public java.lang.Integer getIsAdmin();

   public void setIsAdmin(java.lang.Integer value);

   public java.lang.String getPassWd();

   public void setPassWd(java.lang.String value);

   public java.lang.String getLogin();

   public void setLogin(java.lang.String value);

   public java.sql.Timestamp getVersion();

   public void setVersion(java.sql.Timestamp value);

   public java.lang.Integer getPredefined();

   public void setPredefined(java.lang.Integer value);

   public java.lang.String getUDescription();

   public void setUDescription(java.lang.String value);

   public java.lang.Integer getIsZamer();

   public void setIsZamer(java.lang.Integer value);

   public java.lang.Integer getIsActive();

   public void setIsActive(java.lang.Integer value);

   public java.sql.Timestamp getDateBefore();

   public void setDateBefore(java.sql.Timestamp value);

   public java.lang.Integer getDateBefireAccept();

   public void setDateBefireAccept(java.lang.Integer value);

   public javax.activation.DataHandler getPhoto();

   public void setPhoto(javax.activation.DataHandler value);

   public java.util.List getKontragentsView();

   public void setKontragentsView(java.util.List value);

   public java.util.List getDivisionsView();

   public void setDivisionsView(java.util.List value);

   public java.util.List getOrdersView();

   public void setOrdersView(java.util.List value);

   public java.util.List getOrdersTpOplatyView();

   public void setOrdersTpOplatyView(java.util.List value);

   public java.util.List getPkoView();

   public void setPkoView(java.util.List value);

   public java.util.List getKassaSettingsView();

   public void setKassaSettingsView(java.util.List value);

   public java.util.List getDivisionSotrView();

   public void setDivisionSotrView(java.util.List value);

   public java.util.List getRkoView();

   public void setRkoView(java.util.List value);

   public ua.divas.service.vo.common.UserSettingsViewSDO getUserSettingsView();

   public void setUserSettingsView(ua.divas.service.vo.common.UserSettingsViewSDO value);


}

