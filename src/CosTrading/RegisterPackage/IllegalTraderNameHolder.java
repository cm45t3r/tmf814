package CosTrading.RegisterPackage;

/**
* CosTrading/RegisterPackage/IllegalTraderNameHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class IllegalTraderNameHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.RegisterPackage.IllegalTraderName value = null;

  public IllegalTraderNameHolder ()
  {
  }

  public IllegalTraderNameHolder (CosTrading.RegisterPackage.IllegalTraderName initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.RegisterPackage.IllegalTraderNameHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.RegisterPackage.IllegalTraderNameHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.RegisterPackage.IllegalTraderNameHelper.type ();
  }

}
