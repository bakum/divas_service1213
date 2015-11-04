package ua.divas.service.vo.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class NomenklaturaViewSDOImpl extends SDODataObject implements NomenklaturaViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 10;

   public NomenklaturaViewSDOImpl() {}

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

   public java.lang.Integer getDeleted() {
      return getInt(START_PROPERTY_INDEX + 2);
   }

   public void setDeleted(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.Integer getIsGroup() {
      return getInt(START_PROPERTY_INDEX + 3);
   }

   public void setIsGroup(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getParentId() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setParentId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getParentname() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setParentname(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.Integer getUsluga() {
      return getInt(START_PROPERTY_INDEX + 6);
   }

   public void setUsluga(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.Integer getPredefined() {
      return getInt(START_PROPERTY_INDEX + 7);
   }

   public void setPredefined(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.sql.Timestamp getVersion() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 8);
   }

   public void setVersion(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getArtikul() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setArtikul(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.util.List getNomenklaturaView() {
      return getList(START_PROPERTY_INDEX + 10);
   }

   public void setNomenklaturaView(java.util.List value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }


}

