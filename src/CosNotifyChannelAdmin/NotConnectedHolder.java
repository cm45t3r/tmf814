package CosNotifyChannelAdmin;

/**
* CosNotifyChannelAdmin/NotConnectedHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/

public final class NotConnectedHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyChannelAdmin.NotConnected value = null;

  public NotConnectedHolder ()
  {
  }

  public NotConnectedHolder (CosNotifyChannelAdmin.NotConnected initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyChannelAdmin.NotConnectedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyChannelAdmin.NotConnectedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyChannelAdmin.NotConnectedHelper.type ();
  }

}
