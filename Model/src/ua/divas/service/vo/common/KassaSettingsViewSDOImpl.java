package ua.divas.service.vo.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class KassaSettingsViewSDOImpl extends SDODataObject implements KassaSettingsViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 3;

   public KassaSettingsViewSDOImpl() {}

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

   public java.lang.String getKassaId() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setKassaId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getKassaName() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setKassaName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }


}

