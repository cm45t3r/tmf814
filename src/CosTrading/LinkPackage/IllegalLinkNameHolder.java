package CosTrading.LinkPackage;

/**
* CosTrading/LinkPackage/IllegalLinkNameHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class IllegalLinkNameHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.LinkPackage.IllegalLinkName value = null;

  public IllegalLinkNameHolder ()
  {
  }

  public IllegalLinkNameHolder (CosTrading.LinkPackage.IllegalLinkName initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.LinkPackage.IllegalLinkNameHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.LinkPackage.IllegalLinkNameHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.LinkPackage.IllegalLinkNameHelper.type ();
  }

}
