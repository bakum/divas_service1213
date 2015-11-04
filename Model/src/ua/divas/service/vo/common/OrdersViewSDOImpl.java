package ua.divas.service.vo.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class OrdersViewSDOImpl extends SDODataObject implements OrdersViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 35;

   public OrdersViewSDOImpl() {}

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

   public java.lang.String getKontragId() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setKontragId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getKontragName() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setKontragName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getCurrId() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setCurrId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getKassaId() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setKassaId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.String getDivisionId() {
      return getString(START_PROPERTY_INDEX + 7);
   }

   public void setDivisionId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.String getDivisionName() {
      return getString(START_PROPERTY_INDEX + 8);
   }

   public void setDivisionName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getUserId() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setUserId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.lang.String getUserName() {
      return getString(START_PROPERTY_INDEX + 10);
   }

   public void setUserName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.math.BigDecimal getKurs() {
      return getBigDecimal(START_PROPERTY_INDEX + 11);
   }

   public void setKurs(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.lang.Long getKratnost() {
      return getLong(START_PROPERTY_INDEX + 12);
   }

   public void setKratnost(java.lang.Long value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.lang.String getDiscription() {
      return getString(START_PROPERTY_INDEX + 13);
   }

   public void setDiscription(java.lang.String value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.lang.Integer getDeleted() {
      return getInt(START_PROPERTY_INDEX + 14);
   }

   public void setDeleted(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }

   public java.sql.Timestamp getVersion() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 15);
   }

   public void setVersion(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 15 , value);
   }

   public java.lang.Integer getPosted() {
      return getInt(START_PROPERTY_INDEX + 16);
   }

   public void setPosted(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 16 , value);
   }

   public java.lang.String getFirmId() {
      return getString(START_PROPERTY_INDEX + 17);
   }

   public void setFirmId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 17 , value);
   }

   public java.lang.String getActivitiesId() {
      return getString(START_PROPERTY_INDEX + 18);
   }

   public void setActivitiesId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 18 , value);
   }

   public java.lang.String getStatusId() {
      return getString(START_PROPERTY_INDEX + 19);
   }

   public void setStatusId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 19 , value);
   }

   public java.lang.String getStatusName() {
      return getString(START_PROPERTY_INDEX + 20);
   }

   public void setStatusName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 20 , value);
   }

   public java.lang.String getZamerId() {
      return getString(START_PROPERTY_INDEX + 21);
   }

   public void setZamerId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 21 , value);
   }

   public java.lang.String getZamerName() {
      return getString(START_PROPERTY_INDEX + 22);
   }

   public void setZamerName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 22 , value);
   }

   public java.lang.String getZamerUserName() {
      return getString(START_PROPERTY_INDEX + 23);
   }

   public void setZamerUserName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 23 , value);
   }

   public java.lang.String getZamerUserId() {
      return getString(START_PROPERTY_INDEX + 24);
   }

   public void setZamerUserId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 24 , value);
   }

   public java.sql.Timestamp getDatZam() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 25);
   }

   public void setDatZam(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 25 , value);
   }

   public java.lang.String getTimeZam() {
      return getString(START_PROPERTY_INDEX + 26);
   }

   public void setTimeZam(java.lang.String value) {
      set(START_PROPERTY_INDEX + 26 , value);
   }

   public java.math.BigDecimal getSummPlan() {
      return getBigDecimal(START_PROPERTY_INDEX + 27);
   }

   public void setSummPlan(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 27 , value);
   }

   public java.sql.Timestamp getDatComplete() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 28);
   }

   public void setDatComplete(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 28 , value);
   }

   public java.lang.String getAgentId() {
      return getString(START_PROPERTY_INDEX + 29);
   }

   public void setAgentId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 29 , value);
   }

   public java.sql.Timestamp getDatCompleteFact() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 30);
   }

   public void setDatCompleteFact(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 30 , value);
   }

   public java.lang.String getDivisionDest() {
      return getString(START_PROPERTY_INDEX + 31);
   }

   public void setDivisionDest(java.lang.String value) {
      set(START_PROPERTY_INDEX + 31 , value);
   }

   public java.util.List getOrdersTpOplatyView() {
      return getList(START_PROPERTY_INDEX + 32);
   }

   public void setOrdersTpOplatyView(java.util.List value) {
      set(START_PROPERTY_INDEX + 32 , value);
   }

   public java.util.List getOrdersTpUslugiView() {
      return getList(START_PROPERTY_INDEX + 33);
   }

   public void setOrdersTpUslugiView(java.util.List value) {
      set(START_PROPERTY_INDEX + 33 , value);
   }

   public java.util.List getPkoView() {
      return getList(START_PROPERTY_INDEX + 34);
   }

   public void setPkoView(java.util.List value) {
      set(START_PROPERTY_INDEX + 34 , value);
   }

   public java.util.List getRkoView() {
      return getList(START_PROPERTY_INDEX + 35);
   }

   public void setRkoView(java.util.List value) {
      set(START_PROPERTY_INDEX + 35 , value);
   }


}

