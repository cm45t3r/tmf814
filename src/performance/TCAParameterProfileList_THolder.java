package performance;


/**
* performance/TCAParameterProfileList_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from performance.idl
* Wednesday, June 15, 2016 7:24:40 PM COT
*/


/**
   * <p>Sequence of TCAParameterProfile_T.</p>
   **/
public final class TCAParameterProfileList_THolder implements org.omg.CORBA.portable.Streamable
{
  public performance.TCAParameterProfile_T value[] = null;

  public TCAParameterProfileList_THolder ()
  {
  }

  public TCAParameterProfileList_THolder (performance.TCAParameterProfile_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = performance.TCAParameterProfileList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    performance.TCAParameterProfileList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return performance.TCAParameterProfileList_THelper.type ();
  }

}
