package DsLogAdmin;


/**
* DsLogAdmin/Time24.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/

public final class Time24 implements org.omg.CORBA.portable.IDLEntity
{
  public short hour = (short)0;

  // 0-23
  public short minute = (short)0;

  public Time24 ()
  {
  } // ctor

  public Time24 (short _hour, short _minute)
  {
    hour = _hour;
    minute = _minute;
  } // ctor

} // class Time24
