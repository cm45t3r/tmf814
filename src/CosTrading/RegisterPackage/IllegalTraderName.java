package CosTrading.RegisterPackage;


/**
* CosTrading/RegisterPackage/IllegalTraderName.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class IllegalTraderName extends org.omg.CORBA.UserException
{
  public String name[] = null;

  public IllegalTraderName ()
  {
    super(IllegalTraderNameHelper.id());
  } // ctor

  public IllegalTraderName (String[] _name)
  {
    super(IllegalTraderNameHelper.id());
    name = _name;
  } // ctor


  public IllegalTraderName (String $reason, String[] _name)
  {
    super(IllegalTraderNameHelper.id() + "  " + $reason);
    name = _name;
  } // ctor

} // class IllegalTraderName
