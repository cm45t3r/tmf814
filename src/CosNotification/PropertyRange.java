package CosNotification;


/**
* CosNotification/PropertyRange.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotification.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/

public final class PropertyRange implements org.omg.CORBA.portable.IDLEntity
{
  public org.omg.CORBA.Any low_val = null;
  public org.omg.CORBA.Any high_val = null;

  public PropertyRange ()
  {
  } // ctor

  public PropertyRange (org.omg.CORBA.Any _low_val, org.omg.CORBA.Any _high_val)
  {
    low_val = _low_val;
    high_val = _high_val;
  } // ctor

} // class PropertyRange