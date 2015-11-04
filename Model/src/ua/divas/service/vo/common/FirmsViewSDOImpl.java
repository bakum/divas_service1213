package ua.divas.service.vo.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class FirmsViewSDOImpl extends SDODataObject implements FirmsViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 10;

   public FirmsViewSDOImpl() {}

   public java.lang.String getId() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getFullname() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setFullname(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getPrintname() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setPrintname(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.Integer getUrFiz() {
      return getInt(START_PROPERTY_INDEX + 3);
   }

   public void setUrFiz(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getInn() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setInn(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getOkpo() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setOkpo(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.sql.Timestamp getVersion() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 6);
   }

   public void setVersion(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.Integer getDeleted() {
      return getInt(START_PROPERTY_INDEX + 7);
   }

   public void setDeleted(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.Integer getPredefined() {
      return getInt(START_PROPERTY_INDEX + 8);
   }

   public void setPredefined(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.util.List getOrdersView() {
      return getList(START_PROPERTY_INDEX + 9);
   }

   public void setOrdersView(java.util.List value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.util.List getUserSettingsView() {
      return getList(START_PROPERTY_INDEX + 10);
   }

   public void setUserSettingsView(java.util.List value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }


}

