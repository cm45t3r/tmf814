package CosNotifyChannelAdmin;

/**
* CosNotifyChannelAdmin/EventChannelFactoryHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface for the event channel factory.
    */
public final class EventChannelFactoryHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyChannelAdmin.EventChannelFactory value = null;

  public EventChannelFactoryHolder ()
  {
  }

  public EventChannelFactoryHolder (CosNotifyChannelAdmin.EventChannelFactory initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyChannelAdmin.EventChannelFactoryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyChannelAdmin.EventChannelFactoryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyChannelAdmin.EventChannelFactoryHelper.type ();
  }

}
