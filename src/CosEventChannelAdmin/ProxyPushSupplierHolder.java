package CosEventChannelAdmin;

/**
* CosEventChannelAdmin/ProxyPushSupplierHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosEventChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:31 PM COT
*/


/**
    * Interface for a proxy push supplier.
    */
public final class ProxyPushSupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public CosEventChannelAdmin.ProxyPushSupplier value = null;

  public ProxyPushSupplierHolder ()
  {
  }

  public ProxyPushSupplierHolder (CosEventChannelAdmin.ProxyPushSupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosEventChannelAdmin.ProxyPushSupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosEventChannelAdmin.ProxyPushSupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosEventChannelAdmin.ProxyPushSupplierHelper.type ();
  }

}
