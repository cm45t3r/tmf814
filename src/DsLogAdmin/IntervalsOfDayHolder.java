package DsLogAdmin;


/**
* DsLogAdmin/IntervalsOfDayHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/

public final class IntervalsOfDayHolder implements org.omg.CORBA.portable.Streamable
{
  public DsLogAdmin.Time24Interval value[] = null;

  public IntervalsOfDayHolder ()
  {
  }

  public IntervalsOfDayHolder (DsLogAdmin.Time24Interval[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DsLogAdmin.IntervalsOfDayHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DsLogAdmin.IntervalsOfDayHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DsLogAdmin.IntervalsOfDayHelper.type ();
  }

}
