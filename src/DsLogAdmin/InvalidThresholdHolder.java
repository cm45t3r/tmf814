package DsLogAdmin;

/**
* DsLogAdmin/InvalidThresholdHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/

public final class InvalidThresholdHolder implements org.omg.CORBA.portable.Streamable
{
  public DsLogAdmin.InvalidThreshold value = null;

  public InvalidThresholdHolder ()
  {
  }

  public InvalidThresholdHolder (DsLogAdmin.InvalidThreshold initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DsLogAdmin.InvalidThresholdHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DsLogAdmin.InvalidThresholdHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DsLogAdmin.InvalidThresholdHelper.type ();
  }

}
