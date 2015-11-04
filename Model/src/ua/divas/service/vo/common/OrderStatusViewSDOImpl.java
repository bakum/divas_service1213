package ua.divas.service.vo.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class OrderStatusViewSDOImpl extends SDODataObject implements OrderStatusViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 4;

   public OrderStatusViewSDOImpl() {}

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

   public java.lang.String getName() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getFullname() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setFullname(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.util.List getOrdersView() {
      return getList(START_PROPERTY_INDEX + 4);
   }

   public void setOrdersView(java.util.List value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }


}

