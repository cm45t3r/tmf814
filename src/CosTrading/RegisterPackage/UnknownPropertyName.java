package CosTrading.RegisterPackage;


/**
* CosTrading/RegisterPackage/UnknownPropertyName.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class UnknownPropertyName extends org.omg.CORBA.UserException
{
  public String name = null;

  public UnknownPropertyName ()
  {
    super(UnknownPropertyNameHelper.id());
  } // ctor

  public UnknownPropertyName (String _name)
  {
    super(UnknownPropertyNameHelper.id());
    name = _name;
  } // ctor


  public UnknownPropertyName (String $reason, String _name)
  {
    super(UnknownPropertyNameHelper.id() + "  " + $reason);
    name = _name;
  } // ctor

} // class UnknownPropertyName
