package DsLogAdmin;


/**
* DsLogAdmin/LogListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/

public final class LogListHolder implements org.omg.CORBA.portable.Streamable
{
  public DsLogAdmin.Log value[] = null;

  public LogListHolder ()
  {
  }

  public LogListHolder (DsLogAdmin.Log[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DsLogAdmin.LogListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DsLogAdmin.LogListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DsLogAdmin.LogListHelper.type ();
  }

}