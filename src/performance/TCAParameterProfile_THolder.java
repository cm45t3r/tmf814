package performance;

/**
* performance/TCAParameterProfile_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from performance.idl
* Wednesday, June 15, 2016 7:24:40 PM COT
*/

public final class TCAParameterProfile_THolder implements org.omg.CORBA.portable.Streamable
{
  public performance.TCAParameterProfile_T value = null;

  public TCAParameterProfile_THolder ()
  {
  }

  public TCAParameterProfile_THolder (performance.TCAParameterProfile_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = performance.TCAParameterProfile_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    performance.TCAParameterProfile_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return performance.TCAParameterProfile_THelper.type ();
  }

}
