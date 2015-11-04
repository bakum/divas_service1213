package ua.divas.service.vo.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class DivisionSotrViewSDOImpl extends SDODataObject implements DivisionSotrViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 3;

   public DivisionSotrViewSDOImpl() {}

   public java.lang.String getId() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getDivId() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setDivId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getUserId() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setUserId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getDescription() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setDescription(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }


}

