package notifications;

/**
* notifications/AlarmId_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from notifications.idl
* Wednesday, June 15, 2016 7:24:40 PM COT
*/

public final class AlarmId_THolder implements org.omg.CORBA.portable.Streamable
{
  public notifications.AlarmId_T value = null;

  public AlarmId_THolder ()
  {
  }

  public AlarmId_THolder (notifications.AlarmId_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.AlarmId_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.AlarmId_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.AlarmId_THelper.type ();
  }

}
