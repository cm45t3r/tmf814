package DsLogAdmin;


/**
* DsLogAdmin/CapacityAlarmThresholdListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/


// 0-100 %
public final class CapacityAlarmThresholdListHolder implements org.omg.CORBA.portable.Streamable
{
  public short value[] = null;

  public CapacityAlarmThresholdListHolder ()
  {
  }

  public CapacityAlarmThresholdListHolder (short[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DsLogAdmin.CapacityAlarmThresholdListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DsLogAdmin.CapacityAlarmThresholdListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DsLogAdmin.CapacityAlarmThresholdListHelper.type ();
  }

}
