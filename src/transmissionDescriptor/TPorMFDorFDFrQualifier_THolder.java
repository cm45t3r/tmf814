package transmissionDescriptor;

/**
* transmissionDescriptor/TPorMFDorFDFrQualifier_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from transmissionDescriptor.idl
* Wednesday, June 15, 2016 7:24:43 PM COT
*/


/**
   * <p>Distinguishes between TP, MFD and FDFr in the following UNION type.</p>
   **/
public final class TPorMFDorFDFrQualifier_THolder implements org.omg.CORBA.portable.Streamable
{
  public transmissionDescriptor.TPorMFDorFDFrQualifier_T value = null;

  public TPorMFDorFDFrQualifier_THolder ()
  {
  }

  public TPorMFDorFDFrQualifier_THolder (transmissionDescriptor.TPorMFDorFDFrQualifier_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = transmissionDescriptor.TPorMFDorFDFrQualifier_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    transmissionDescriptor.TPorMFDorFDFrQualifier_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return transmissionDescriptor.TPorMFDorFDFrQualifier_THelper.type ();
  }

}
