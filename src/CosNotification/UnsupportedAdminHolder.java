package CosNotification;

/**
* CosNotification/UnsupportedAdminHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotification.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/

public final class UnsupportedAdminHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.UnsupportedAdmin value = null;

  public UnsupportedAdminHolder ()
  {
  }

  public UnsupportedAdminHolder (CosNotification.UnsupportedAdmin initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.UnsupportedAdminHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.UnsupportedAdminHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.UnsupportedAdminHelper.type ();
  }

}
