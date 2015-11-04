package ua.divas.service.vo.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class LastPricesViewSDOImpl extends SDODataObject implements LastPricesViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 5;

   public LastPricesViewSDOImpl() {}

   public java.lang.String getId() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getNomId() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setNomId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.sql.Timestamp getPeriod() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 2);
   }

   public void setPeriod(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getEdIzm() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setEdIzm(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.math.BigDecimal getPriceUsl() {
      return getBigDecimal(START_PROPERTY_INDEX + 4);
   }

   public void setPriceUsl(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.math.BigDecimal getPriceGoods() {
      return getBigDecimal(START_PROPERTY_INDEX + 5);
   }

   public void setPriceGoods(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }


}

