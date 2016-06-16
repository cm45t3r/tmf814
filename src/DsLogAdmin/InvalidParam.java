package DsLogAdmin;


/**
* DsLogAdmin/InvalidParam.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/

public final class InvalidParam extends org.omg.CORBA.UserException
{
  public String details = null;

  public InvalidParam ()
  {
    super(InvalidParamHelper.id());
  } // ctor

  public InvalidParam (String _details)
  {
    super(InvalidParamHelper.id());
    details = _details;
  } // ctor


  public InvalidParam (String $reason, String _details)
  {
    super(InvalidParamHelper.id() + "  " + $reason);
    details = _details;
  } // ctor

} // class InvalidParam
