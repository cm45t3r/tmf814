package callSNC;

/**
* callSNC/Diversity_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from callSNC.idl
* Wednesday, June 15, 2016 7:24:30 PM COT
*/

public final class Diversity_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.Diversity_T value = null;

  public Diversity_THolder ()
  {
  }

  public Diversity_THolder (callSNC.Diversity_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.Diversity_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.Diversity_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.Diversity_THelper.type ();
  }

}
