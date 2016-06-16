package performance;


/**
* performance/TCAParameter_T.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from performance.idl
* Wednesday, June 15, 2016 7:24:40 PM COT
*/

public final class TCAParameter_T implements org.omg.CORBA.portable.IDLEntity
{
  public String pmParameterName = null;
  public String granularity = null;
  public String pmLocation = null;
  public performance.PMThresholdType_T thresholdType = null;
  public boolean triggerFlag = false;
  public float value = (float)0;
  public String unit = null;

  public TCAParameter_T ()
  {
  } // ctor

  public TCAParameter_T (String _pmParameterName, String _granularity, String _pmLocation, performance.PMThresholdType_T _thresholdType, boolean _triggerFlag, float _value, String _unit)
  {
    pmParameterName = _pmParameterName;
    granularity = _granularity;
    pmLocation = _pmLocation;
    thresholdType = _thresholdType;
    triggerFlag = _triggerFlag;
    value = _value;
    unit = _unit;
  } // ctor

} // class TCAParameter_T
