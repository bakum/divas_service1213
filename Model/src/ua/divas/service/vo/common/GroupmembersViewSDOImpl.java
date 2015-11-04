package ua.divas.service.vo.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class GroupmembersViewSDOImpl extends SDODataObject implements GroupmembersViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 2;

   public GroupmembersViewSDOImpl() {}

   public java.lang.String getId() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getGName() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setGName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getGMember() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setGMember(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }


}

