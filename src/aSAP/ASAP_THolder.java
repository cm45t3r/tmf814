package aSAP;

/**
* aSAP/ASAP_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from aSAP.idl
* Wednesday, June 15, 2016 7:24:30 PM COT
*/

public final class ASAP_THolder implements org.omg.CORBA.portable.Streamable
{
  public aSAP.ASAP_T value = null;

  public ASAP_THolder ()
  {
  }

  public ASAP_THolder (aSAP.ASAP_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = aSAP.ASAP_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    aSAP.ASAP_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return aSAP.ASAP_THelper.type ();
  }

}