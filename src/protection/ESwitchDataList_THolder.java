package protection;


/**
* protection/ESwitchDataList_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from protection.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/


/**
   * <p>Sequence of ESwitchData_T.</p>
   **/
public final class ESwitchDataList_THolder implements org.omg.CORBA.portable.Streamable
{
  public protection.ESwitchData_T value[] = null;

  public ESwitchDataList_THolder ()
  {
  }

  public ESwitchDataList_THolder (protection.ESwitchData_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = protection.ESwitchDataList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    protection.ESwitchDataList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return protection.ESwitchDataList_THelper.type ();
  }

}
