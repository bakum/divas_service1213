package ua.divas.service.vo.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class CurrencyViewSDOImpl extends SDODataObject implements CurrencyViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 14;

   public CurrencyViewSDOImpl() {}

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

   public java.lang.Integer getDeleted() {
      return getInt(START_PROPERTY_INDEX + 3);
   }

   public void setDeleted(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getFullname() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setFullname(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getCode() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setCode(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getNamefull() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setNamefull(java.lang.String value) {
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

   public java.lang.String getIdXml() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setIdXml(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.util.List getKassaView() {
      return getList(START_PROPERTY_INDEX + 10);
   }

   public void setKassaView(java.util.List value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.util.List getOrdersView() {
      return getList(START_PROPERTY_INDEX + 11);
   }

   public void setOrdersView(java.util.List value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.util.List getPkoView() {
      return getList(START_PROPERTY_INDEX + 12);
   }

   public void setPkoView(java.util.List value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.util.List getRkoView() {
      return getList(START_PROPERTY_INDEX + 13);
   }

   public void setRkoView(java.util.List value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.util.List getUserSettingsView() {
      return getList(START_PROPERTY_INDEX + 14);
   }

   public void setUserSettingsView(java.util.List value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }


}

