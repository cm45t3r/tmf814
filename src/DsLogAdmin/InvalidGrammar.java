package DsLogAdmin;


/**
* DsLogAdmin/InvalidGrammar.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/

public final class InvalidGrammar extends org.omg.CORBA.UserException
{

  public InvalidGrammar ()
  {
    super(InvalidGrammarHelper.id());
  } // ctor


  public InvalidGrammar (String $reason)
  {
    super(InvalidGrammarHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidGrammar
