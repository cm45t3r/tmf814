package notifications;


/**
* notifications/EventList_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from notifications.idl
* Wednesday, June 15, 2016 7:24:40 PM COT
*/


/**
   * <p>Sequence of CosNotification::StructuredEvent</p>
   **/
public final class EventList_THolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.StructuredEvent value[] = null;

  public EventList_THolder ()
  {
  }

  public EventList_THolder (CosNotification.StructuredEvent[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.EventList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.EventList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.EventList_THelper.type ();
  }

}
