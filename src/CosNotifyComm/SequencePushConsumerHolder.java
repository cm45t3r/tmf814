package CosNotifyComm;

/**
* CosNotifyComm/SequencePushConsumerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyComm.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface for sequence push consumers.
    */
public final class SequencePushConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.SequencePushConsumer value = null;

  public SequencePushConsumerHolder ()
  {
  }

  public SequencePushConsumerHolder (CosNotifyComm.SequencePushConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.SequencePushConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.SequencePushConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.SequencePushConsumerHelper.type ();
  }

}
