package CosNotification;

/**
* CosNotification/FixedEventHeaderHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotification.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/

public final class FixedEventHeaderHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.FixedEventHeader value = null;

  public FixedEventHeaderHolder ()
  {
  }

  public FixedEventHeaderHolder (CosNotification.FixedEventHeader initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.FixedEventHeaderHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.FixedEventHeaderHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.FixedEventHeaderHelper.type ();
  }

}
