package ua.divas.service.vo.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class UserSettingsViewSDOImpl extends SDODataObject implements UserSettingsViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 10;

   public UserSettingsViewSDOImpl() {}

   public java.lang.String getId() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getUserId() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setUserId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getDivisionId() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setDivisionId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getFirmaId() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setFirmaId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getCurrencyId() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setCurrencyId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getKassaId() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setKassaId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getMainUsluga() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setMainUsluga(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.String getActivitiesId() {
      return getString(START_PROPERTY_INDEX + 7);
   }

   public void setActivitiesId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.String getZamerkontragId() {
      return getString(START_PROPERTY_INDEX + 8);
   }

   public void setZamerkontragId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getKontragId() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setKontragId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.lang.String getNetId() {
      return getString(START_PROPERTY_INDEX + 10);
   }

   public void setNetId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }


}

