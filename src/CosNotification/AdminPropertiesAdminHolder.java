package CosNotification;

/**
* CosNotification/AdminPropertiesAdminHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotification.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface for objects that have administrative settings.
    */
public final class AdminPropertiesAdminHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.AdminPropertiesAdmin value = null;

  public AdminPropertiesAdminHolder ()
  {
  }

  public AdminPropertiesAdminHolder (CosNotification.AdminPropertiesAdmin initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.AdminPropertiesAdminHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.AdminPropertiesAdminHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.AdminPropertiesAdminHelper.type ();
  }

}
