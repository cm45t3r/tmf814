package mLSNPPLink;

/**
* mLSNPPLink/SNPPLink_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from mLSNPPLink.idl
* Wednesday, June 15, 2016 7:24:38 PM COT
*/

public final class SNPPLink_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPPLink.SNPPLink_T value = null;

  public SNPPLink_THolder ()
  {
  }

  public SNPPLink_THolder (mLSNPPLink.SNPPLink_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPPLink.SNPPLink_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPPLink.SNPPLink_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPPLink.SNPPLink_THelper.type ();
  }

}
