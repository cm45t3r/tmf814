package callSNC;

/**
* callSNC/SharedResource_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from callSNC.idl
* Wednesday, June 15, 2016 7:24:30 PM COT
*/

public final class SharedResource_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.SharedResource_T value = null;

  public SharedResource_THolder ()
  {
  }

  public SharedResource_THolder (callSNC.SharedResource_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.SharedResource_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.SharedResource_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.SharedResource_THelper.type ();
  }

}
