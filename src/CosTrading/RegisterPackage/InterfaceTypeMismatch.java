package CosTrading.RegisterPackage;


/**
* CosTrading/RegisterPackage/InterfaceTypeMismatch.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class InterfaceTypeMismatch extends org.omg.CORBA.UserException
{
  public String type = null;
  public org.omg.CORBA.Object reference = null;

  public InterfaceTypeMismatch ()
  {
    super(InterfaceTypeMismatchHelper.id());
  } // ctor

  public InterfaceTypeMismatch (String _type, org.omg.CORBA.Object _reference)
  {
    super(InterfaceTypeMismatchHelper.id());
    type = _type;
    reference = _reference;
  } // ctor


  public InterfaceTypeMismatch (String $reason, String _type, org.omg.CORBA.Object _reference)
  {
    super(InterfaceTypeMismatchHelper.id() + "  " + $reason);
    type = _type;
    reference = _reference;
  } // ctor

} // class InterfaceTypeMismatch