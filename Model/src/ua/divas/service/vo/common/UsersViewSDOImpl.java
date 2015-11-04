package ua.divas.service.vo.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class UsersViewSDOImpl extends SDODataObject implements UsersViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 23;

   public UsersViewSDOImpl() {}

   public java.lang.String getId() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getFirstName() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setFirstName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getLastName() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setLastName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getEmail() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setEmail(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.Integer getIsAdmin() {
      return getInt(START_PROPERTY_INDEX + 4);
   }

   public void setIsAdmin(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getPassWd() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setPassWd(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getLogin() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setLogin(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.sql.Timestamp getVersion() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 7);
   }

   public void setVersion(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.Integer getPredefined() {
      return getInt(START_PROPERTY_INDEX + 8);
   }

   public void setPredefined(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getUDescription() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setUDescription(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.lang.Integer getIsZamer() {
      return getInt(START_PROPERTY_INDEX + 10);
   }

   public void setIsZamer(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.lang.Integer getIsActive() {
      return getInt(START_PROPERTY_INDEX + 11);
   }

   public void setIsActive(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.sql.Timestamp getDateBefore() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 12);
   }

   public void setDateBefore(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.lang.Integer getDateBefireAccept() {
      return getInt(START_PROPERTY_INDEX + 13);
   }

   public void setDateBefireAccept(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public javax.activation.DataHandler getPhoto() {
      return (javax.activation.DataHandler)get(START_PROPERTY_INDEX + 14);
   }

   public void setPhoto(javax.activation.DataHandler value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }

   public java.util.List getKontragentsView() {
      return getList(START_PROPERTY_INDEX + 15);
   }

   public void setKontragentsView(java.util.List value) {
      set(START_PROPERTY_INDEX + 15 , value);
   }

   public java.util.List getDivisionsView() {
      return getList(START_PROPERTY_INDEX + 16);
   }

   public void setDivisionsView(java.util.List value) {
      set(START_PROPERTY_INDEX + 16 , value);
   }

   public java.util.List getOrdersView() {
      return getList(START_PROPERTY_INDEX + 17);
   }

   public void setOrdersView(java.util.List value) {
      set(START_PROPERTY_INDEX + 17 , value);
   }

   public java.util.List getOrdersTpOplatyView() {
      return getList(START_PROPERTY_INDEX + 18);
   }

   public void setOrdersTpOplatyView(java.util.List value) {
      set(START_PROPERTY_INDEX + 18 , value);
   }

   public java.util.List getPkoView() {
      return getList(START_PROPERTY_INDEX + 19);
   }

   public void setPkoView(java.util.List value) {
      set(START_PROPERTY_INDEX + 19 , value);
   }

   public java.util.List getKassaSettingsView() {
      return getList(START_PROPERTY_INDEX + 20);
   }

   public void setKassaSettingsView(java.util.List value) {
      set(START_PROPERTY_INDEX + 20 , value);
   }

   public java.util.List getDivisionSotrView() {
      return getList(START_PROPERTY_INDEX + 21);
   }

   public void setDivisionSotrView(java.util.List value) {
      set(START_PROPERTY_INDEX + 21 , value);
   }

   public java.util.List getRkoView() {
      return getList(START_PROPERTY_INDEX + 22);
   }

   public void setRkoView(java.util.List value) {
      set(START_PROPERTY_INDEX + 22 , value);
   }

   public ua.divas.service.vo.common.UserSettingsViewSDO getUserSettingsView() {
      return (ua.divas.service.vo.common.UserSettingsViewSDO)get(START_PROPERTY_INDEX + 23);
   }

   public void setUserSettingsView(ua.divas.service.vo.common.UserSettingsViewSDO value) {
      set(START_PROPERTY_INDEX + 23 , value);
   }


}

