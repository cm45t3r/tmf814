package CosTrading.RegisterPackage;

/**
* CosTrading/RegisterPackage/UnknownTraderNameHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class UnknownTraderNameHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.RegisterPackage.UnknownTraderName value = null;

  public UnknownTraderNameHolder ()
  {
  }

  public UnknownTraderNameHolder (CosTrading.RegisterPackage.UnknownTraderName initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.RegisterPackage.UnknownTraderNameHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.RegisterPackage.UnknownTraderNameHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.RegisterPackage.UnknownTraderNameHelper.type ();
  }

}
