package CosNotifyComm;

/**
* CosNotifyComm/NotifySubscribeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyComm.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface used by event subscribers.
    */
public final class NotifySubscribeHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.NotifySubscribe value = null;

  public NotifySubscribeHolder ()
  {
  }

  public NotifySubscribeHolder (CosNotifyComm.NotifySubscribe initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.NotifySubscribeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.NotifySubscribeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.NotifySubscribeHelper.type ();
  }

}
