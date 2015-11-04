package ua.divas.service.vo.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class OrdersTpUslugiViewSDOImpl extends SDODataObject implements OrdersTpUslugiViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 12;

   public OrdersTpUslugiViewSDOImpl() {}

   public java.lang.String getId() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getOrderId() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setOrderId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getNomId() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setNomId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.math.BigDecimal getPrice() {
      return getBigDecimal(START_PROPERTY_INDEX + 3);
   }

   public void setPrice(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.math.BigDecimal getSumm() {
      return getBigDecimal(START_PROPERTY_INDEX + 4);
   }

   public void setSumm(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.sql.Timestamp getDatComplete() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 5);
   }

   public void setDatComplete(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getSotrId() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setSotrId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.sql.Timestamp getDatToPay() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 7);
   }

   public void setDatToPay(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.String getGroupId() {
      return getString(START_PROPERTY_INDEX + 8);
   }

   public void setGroupId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getMeasureId() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setMeasureId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.math.BigDecimal getQuantity() {
      return getBigDecimal(START_PROPERTY_INDEX + 10);
   }

   public void setQuantity(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.lang.String getAddWork() {
      return getString(START_PROPERTY_INDEX + 11);
   }

   public void setAddWork(java.lang.String value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.math.BigDecimal getPriceAdd() {
      return getBigDecimal(START_PROPERTY_INDEX + 12);
   }

   public void setPriceAdd(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }


}

