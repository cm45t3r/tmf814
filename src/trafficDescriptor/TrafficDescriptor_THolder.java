package trafficDescriptor;

/**
* trafficDescriptor/TrafficDescriptor_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from trafficDescriptor.idl
* Wednesday, June 15, 2016 7:24:43 PM COT
*/

public final class TrafficDescriptor_THolder implements org.omg.CORBA.portable.Streamable
{
  public trafficDescriptor.TrafficDescriptor_T value = null;

  public TrafficDescriptor_THolder ()
  {
  }

  public TrafficDescriptor_THolder (trafficDescriptor.TrafficDescriptor_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = trafficDescriptor.TrafficDescriptor_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    trafficDescriptor.TrafficDescriptor_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return trafficDescriptor.TrafficDescriptor_THelper.type ();
  }

}
