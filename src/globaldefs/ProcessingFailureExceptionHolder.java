package globaldefs;

/**
* globaldefs/ProcessingFailureExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from globaldefs.idl
* Wednesday, June 15, 2016 7:24:37 PM COT
*/

public final class ProcessingFailureExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public globaldefs.ProcessingFailureException value = null;

  public ProcessingFailureExceptionHolder ()
  {
  }

  public ProcessingFailureExceptionHolder (globaldefs.ProcessingFailureException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = globaldefs.ProcessingFailureExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    globaldefs.ProcessingFailureExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return globaldefs.ProcessingFailureExceptionHelper.type ();
  }

}
