package CosNotifyComm;

/**
* CosNotifyComm/PullSupplierHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyComm.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface for pull suppliers.
    */
public final class PullSupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.PullSupplier value = null;

  public PullSupplierHolder ()
  {
  }

  public PullSupplierHolder (CosNotifyComm.PullSupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.PullSupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.PullSupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.PullSupplierHelper.type ();
  }

}
