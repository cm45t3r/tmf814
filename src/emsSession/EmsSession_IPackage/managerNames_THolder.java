package emsSession.EmsSession_IPackage;


/**
* emsSession/EmsSession_IPackage/managerNames_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from emsSession.idl
* Wednesday, June 15, 2016 7:24:35 PM COT
*/


/** Sequence of manager names
   **/
public final class managerNames_THolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public managerNames_THolder ()
  {
  }

  public managerNames_THolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = emsSession.EmsSession_IPackage.managerNames_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    emsSession.EmsSession_IPackage.managerNames_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return emsSession.EmsSession_IPackage.managerNames_THelper.type ();
  }

}
