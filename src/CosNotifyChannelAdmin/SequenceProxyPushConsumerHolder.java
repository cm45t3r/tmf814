package CosNotifyChannelAdmin;

/**
* CosNotifyChannelAdmin/SequenceProxyPushConsumerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface for sequence proxy push consumers.
    */
public final class SequenceProxyPushConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyChannelAdmin.SequenceProxyPushConsumer value = null;

  public SequenceProxyPushConsumerHolder ()
  {
  }

  public SequenceProxyPushConsumerHolder (CosNotifyChannelAdmin.SequenceProxyPushConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyChannelAdmin.SequenceProxyPushConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyChannelAdmin.SequenceProxyPushConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyChannelAdmin.SequenceProxyPushConsumerHelper.type ();
  }

}
