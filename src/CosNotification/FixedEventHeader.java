package CosNotification;


/**
* CosNotification/FixedEventHeader.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotification.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/

public final class FixedEventHeader implements org.omg.CORBA.portable.IDLEntity
{
  public CosNotification.EventType event_type = null;
  public String event_name = null;

  public FixedEventHeader ()
  {
  } // ctor

  public FixedEventHeader (CosNotification.EventType _event_type, String _event_name)
  {
    event_type = _event_type;
    event_name = _event_name;
  } // ctor

} // class FixedEventHeader
