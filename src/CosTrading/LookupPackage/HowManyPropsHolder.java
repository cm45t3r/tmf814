package CosTrading.LookupPackage;

/**
* CosTrading/LookupPackage/HowManyPropsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/


/** This enum is used to determine whether to return
 * property information with returned offers.
 * <pre>
 * none	- Do not return properties.
 * some	- Return specified properties.
 * all	- Return all properties.
 * </pre>
 */
public final class HowManyPropsHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.LookupPackage.HowManyProps value = null;

  public HowManyPropsHolder ()
  {
  }

  public HowManyPropsHolder (CosTrading.LookupPackage.HowManyProps initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.LookupPackage.HowManyPropsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.LookupPackage.HowManyPropsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.LookupPackage.HowManyPropsHelper.type ();
  }

}
