package ua.divas.service.vo.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class OperationRkoViewSDOImpl extends SDODataObject implements OperationRkoViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 3;

   public OperationRkoViewSDOImpl() {}

   public java.lang.String getId() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getName() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getFullname() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setFullname(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.util.List getRkoView() {
      return getList(START_PROPERTY_INDEX + 3);
   }

   public void setRkoView(java.util.List value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }


}

