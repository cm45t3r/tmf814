package CosEventChannelAdmin;

/**
* CosEventChannelAdmin/ProxyPullConsumerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosEventChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:31 PM COT
*/


/**
    * Interface for a proxy pull consumer.
    */
public final class ProxyPullConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public CosEventChannelAdmin.ProxyPullConsumer value = null;

  public ProxyPullConsumerHolder ()
  {
  }

  public ProxyPullConsumerHolder (CosEventChannelAdmin.ProxyPullConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosEventChannelAdmin.ProxyPullConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosEventChannelAdmin.ProxyPullConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosEventChannelAdmin.ProxyPullConsumerHelper.type ();
  }

}
