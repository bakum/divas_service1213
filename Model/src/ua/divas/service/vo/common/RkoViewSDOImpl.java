package ua.divas.service.vo.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class RkoViewSDOImpl extends SDODataObject implements RkoViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 16;

   public RkoViewSDOImpl() {}

   public java.lang.String getId() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.sql.Timestamp getDat() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 1);
   }

   public void setDat(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getNum() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setNum(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.Integer getDeleted() {
      return getInt(START_PROPERTY_INDEX + 3);
   }

   public void setDeleted(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.Integer getPosted() {
      return getInt(START_PROPERTY_INDEX + 4);
   }

   public void setPosted(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getDivisionId() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setDivisionId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getUserId() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setUserId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.String getComments() {
      return getString(START_PROPERTY_INDEX + 7);
   }

   public void setComments(java.lang.String value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.sql.Timestamp getVersion() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 8);
   }

   public void setVersion(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getCurrId() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setCurrId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.lang.String getKassaId() {
      return getString(START_PROPERTY_INDEX + 10);
   }

   public void setKassaId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.lang.String getActivitiesId() {
      return getString(START_PROPERTY_INDEX + 11);
   }

   public void setActivitiesId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.lang.String getOperationId() {
      return getString(START_PROPERTY_INDEX + 12);
   }

   public void setOperationId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.lang.String getKontragId() {
      return getString(START_PROPERTY_INDEX + 13);
   }

   public void setKontragId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.math.BigDecimal getSumma() {
      return getBigDecimal(START_PROPERTY_INDEX + 14);
   }

   public void setSumma(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }

   public java.lang.String getDestKassaId() {
      return getString(START_PROPERTY_INDEX + 15);
   }

   public void setDestKassaId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 15 , value);
   }

   public java.lang.String getOrderId() {
      return getString(START_PROPERTY_INDEX + 16);
   }

   public void setOrderId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 16 , value);
   }


}

