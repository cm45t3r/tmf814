package CosNaming;

/**
* CosNaming/NameComponentHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNaming.idl
* Wednesday, June 15, 2016 7:24:31 PM COT
*/

public final class NameComponentHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNaming.NameComponent value = null;

  public NameComponentHolder ()
  {
  }

  public NameComponentHolder (CosNaming.NameComponent initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNaming.NameComponentHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNaming.NameComponentHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNaming.NameComponentHelper.type ();
  }

}
