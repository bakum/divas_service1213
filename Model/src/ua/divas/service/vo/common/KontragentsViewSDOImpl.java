package ua.divas.service.vo.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class KontragentsViewSDOImpl extends SDODataObject implements KontragentsViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 28;

   public KontragentsViewSDOImpl() {}

   public java.lang.String getId() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.Integer getIsGroup() {
      return getInt(START_PROPERTY_INDEX + 1);
   }

   public void setIsGroup(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getParentId() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setParentId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getFullname() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setFullname(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.Integer getDeleted() {
      return getInt(START_PROPERTY_INDEX + 4);
   }

   public void setDeleted(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getInn() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setInn(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getOkpo() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setOkpo(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.String getKpp() {
      return getString(START_PROPERTY_INDEX + 7);
   }

   public void setKpp(java.lang.String value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.String getNamefull() {
      return getString(START_PROPERTY_INDEX + 8);
   }

   public void setNamefull(java.lang.String value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.Integer getUrFiz() {
      return getInt(START_PROPERTY_INDEX + 9);
   }

   public void setUrFiz(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.sql.Timestamp getVersion() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 10);
   }

   public void setVersion(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.lang.Integer getPredefined() {
      return getInt(START_PROPERTY_INDEX + 11);
   }

   public void setPredefined(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.lang.Integer getIsSupplier() {
      return getInt(START_PROPERTY_INDEX + 12);
   }

   public void setIsSupplier(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.lang.Integer getIsBuyer() {
      return getInt(START_PROPERTY_INDEX + 13);
   }

   public void setIsBuyer(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.lang.Integer getIsMeasurer() {
      return getInt(START_PROPERTY_INDEX + 14);
   }

   public void setIsMeasurer(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }

   public java.lang.String getUserId() {
      return getString(START_PROPERTY_INDEX + 15);
   }

   public void setUserId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 15 , value);
   }

   public javax.activation.DataHandler getPhoto() {
      return (javax.activation.DataHandler)get(START_PROPERTY_INDEX + 16);
   }

   public void setPhoto(javax.activation.DataHandler value) {
      set(START_PROPERTY_INDEX + 16 , value);
   }

   public java.util.List getKontragentsView() {
      return getList(START_PROPERTY_INDEX + 17);
   }

   public void setKontragentsView(java.util.List value) {
      set(START_PROPERTY_INDEX + 17 , value);
   }

   public java.util.List getContactDetailsView() {
      return getList(START_PROPERTY_INDEX + 18);
   }

   public void setContactDetailsView(java.util.List value) {
      set(START_PROPERTY_INDEX + 18 , value);
   }

   public java.util.List getOrdersView() {
      return getList(START_PROPERTY_INDEX + 19);
   }

   public void setOrdersView(java.util.List value) {
      set(START_PROPERTY_INDEX + 19 , value);
   }

   public java.util.List getOrdersView1() {
      return getList(START_PROPERTY_INDEX + 20);
   }

   public void setOrdersView1(java.util.List value) {
      set(START_PROPERTY_INDEX + 20 , value);
   }

   public java.util.List getOrdersView2() {
      return getList(START_PROPERTY_INDEX + 21);
   }

   public void setOrdersView2(java.util.List value) {
      set(START_PROPERTY_INDEX + 21 , value);
   }

   public java.util.List getOrdersTpOplatyView() {
      return getList(START_PROPERTY_INDEX + 22);
   }

   public void setOrdersTpOplatyView(java.util.List value) {
      set(START_PROPERTY_INDEX + 22 , value);
   }

   public java.util.List getOrdersTpUslugiView() {
      return getList(START_PROPERTY_INDEX + 23);
   }

   public void setOrdersTpUslugiView(java.util.List value) {
      set(START_PROPERTY_INDEX + 23 , value);
   }

   public java.util.List getPkoView() {
      return getList(START_PROPERTY_INDEX + 24);
   }

   public void setPkoView(java.util.List value) {
      set(START_PROPERTY_INDEX + 24 , value);
   }

   public java.util.List getRkoView() {
      return getList(START_PROPERTY_INDEX + 25);
   }

   public void setRkoView(java.util.List value) {
      set(START_PROPERTY_INDEX + 25 , value);
   }

   public java.util.List getUserSettingsView() {
      return getList(START_PROPERTY_INDEX + 26);
   }

   public void setUserSettingsView(java.util.List value) {
      set(START_PROPERTY_INDEX + 26 , value);
   }

   public java.util.List getUserSettingsView1() {
      return getList(START_PROPERTY_INDEX + 27);
   }

   public void setUserSettingsView1(java.util.List value) {
      set(START_PROPERTY_INDEX + 27 , value);
   }

   public java.util.List getUserSettingsView2() {
      return getList(START_PROPERTY_INDEX + 28);
   }

   public void setUserSettingsView2(java.util.List value) {
      set(START_PROPERTY_INDEX + 28 , value);
   }


}

