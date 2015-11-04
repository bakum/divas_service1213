package ua.divas.service.vo.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class OrdersTpOplatyViewSDOImpl extends SDODataObject implements OrdersTpOplatyViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 7;

   public OrdersTpOplatyViewSDOImpl() {}

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

   public java.sql.Timestamp getDat() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 2);
   }

   public void setDat(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.math.BigDecimal getSum1() {
      return getBigDecimal(START_PROPERTY_INDEX + 3);
   }

   public void setSum1(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getUserId() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setUserId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getComments() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setComments(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getZamerId() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setZamerId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.String getKassaId() {
      return getString(START_PROPERTY_INDEX + 7);
   }

   public void setKassaId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }


}

