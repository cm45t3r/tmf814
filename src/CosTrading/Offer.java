package CosTrading;


/**
* CosTrading/Offer.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class Offer implements org.omg.CORBA.portable.IDLEntity
{
  public org.omg.CORBA.Object reference = null;
  public CosTrading.Property properties[] = null;

  public Offer ()
  {
  } // ctor

  public Offer (org.omg.CORBA.Object _reference, CosTrading.Property[] _properties)
  {
    reference = _reference;
    properties = _properties;
  } // ctor

} // class Offer