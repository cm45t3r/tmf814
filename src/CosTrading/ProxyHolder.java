package CosTrading;

/**
* CosTrading/ProxyHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/


/** This interface supports proxy offers.
 * It is not yet supported.
 */
public final class ProxyHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.Proxy value = null;

  public ProxyHolder ()
  {
  }

  public ProxyHolder (CosTrading.Proxy initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.ProxyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.ProxyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.ProxyHelper.type ();
  }

}
