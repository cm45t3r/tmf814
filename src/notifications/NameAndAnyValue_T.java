package notifications;


/**
* notifications/NameAndAnyValue_T.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from notifications.idl
* Wednesday, June 15, 2016 7:24:40 PM COT
*/

public final class NameAndAnyValue_T implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public org.omg.CORBA.Any value = null;

  public NameAndAnyValue_T ()
  {
  } // ctor

  public NameAndAnyValue_T (String _name, org.omg.CORBA.Any _value)
  {
    name = _name;
    value = _value;
  } // ctor

} // class NameAndAnyValue_T
