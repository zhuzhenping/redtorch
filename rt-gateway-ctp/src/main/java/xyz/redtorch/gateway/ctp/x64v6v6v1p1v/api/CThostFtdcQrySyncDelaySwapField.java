/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1v.api;

public class CThostFtdcQrySyncDelaySwapField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQrySyncDelaySwapField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQrySyncDelaySwapField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpv6v6v1p1x64apiJNI.delete_CThostFtdcQrySyncDelaySwapField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcQrySyncDelaySwapField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcQrySyncDelaySwapField_BrokerID_get(swigCPtr, this);
  }

  public void setDelaySwapSeqNo(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcQrySyncDelaySwapField_DelaySwapSeqNo_set(swigCPtr, this, value);
  }

  public String getDelaySwapSeqNo() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcQrySyncDelaySwapField_DelaySwapSeqNo_get(swigCPtr, this);
  }

  public CThostFtdcQrySyncDelaySwapField() {
    this(jctpv6v6v1p1x64apiJNI.new_CThostFtdcQrySyncDelaySwapField(), true);
  }

}