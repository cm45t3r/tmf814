package CosNotifyChannelAdmin;

/**
* CosNotifyChannelAdmin/StructuredProxyPushConsumerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface for structured proxy push consumers.
    */
public final class StructuredProxyPushConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyChannelAdmin.StructuredProxyPushConsumer value = null;

  public StructuredProxyPushConsumerHolder ()
  {
  }

  public StructuredProxyPushConsumerHolder (CosNotifyChannelAdmin.StructuredProxyPushConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyChannelAdmin.StructuredProxyPushConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyChannelAdmin.StructuredProxyPushConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyChannelAdmin.StructuredProxyPushConsumerHelper.type ();
  }

}
