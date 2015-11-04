package ua.divas.service.vo.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class ContactDetailsViewSDOImpl extends SDODataObject implements ContactDetailsViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 5;

   public ContactDetailsViewSDOImpl() {}

   public java.lang.String getId() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.sql.Timestamp getVersion() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 1);
   }

   public void setVersion(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getKontragId() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setKontragId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getAdress() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setAdress(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getPhone() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setPhone(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getEmail() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setEmail(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }


}

