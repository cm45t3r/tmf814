package callSNC;

/**
* callSNC/CallCreateData_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from callSNC.idl
* Wednesday, June 15, 2016 7:24:30 PM COT
*/

public final class CallCreateData_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.CallCreateData_T value = null;

  public CallCreateData_THolder ()
  {
  }

  public CallCreateData_THolder (callSNC.CallCreateData_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.CallCreateData_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.CallCreateData_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.CallCreateData_THelper.type ();
  }

}
