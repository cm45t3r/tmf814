package CosTrading;

/**
* CosTrading/SupportAttributesHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/


/** This interface contains attributes that describe
 * type of functionality supported by a trader service.
 */
public final class SupportAttributesHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.SupportAttributes value = null;

  public SupportAttributesHolder ()
  {
  }

  public SupportAttributesHolder (CosTrading.SupportAttributes initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.SupportAttributesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.SupportAttributesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.SupportAttributesHelper.type ();
  }

}
