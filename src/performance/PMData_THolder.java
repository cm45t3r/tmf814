package performance;

/**
* performance/PMData_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from performance.idl
* Wednesday, June 15, 2016 7:24:40 PM COT
*/

public final class PMData_THolder implements org.omg.CORBA.portable.Streamable
{
  public performance.PMData_T value = null;

  public PMData_THolder ()
  {
  }

  public PMData_THolder (performance.PMData_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = performance.PMData_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    performance.PMData_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return performance.PMData_THelper.type ();
  }

}
