package DsLogAdmin;


/**
* DsLogAdmin/InvalidMask.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/

public final class InvalidMask extends org.omg.CORBA.UserException
{

  public InvalidMask ()
  {
    super(InvalidMaskHelper.id());
  } // ctor


  public InvalidMask (String $reason)
  {
    super(InvalidMaskHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidMask
