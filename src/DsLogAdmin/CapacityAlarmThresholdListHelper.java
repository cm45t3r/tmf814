package DsLogAdmin;


/**
* DsLogAdmin/CapacityAlarmThresholdListHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/


// 0-100 %
abstract public class CapacityAlarmThresholdListHelper
{
  private static String  _id = "IDL:omg.org/DsLogAdmin/CapacityAlarmThresholdList:1.0";

  public static void insert (org.omg.CORBA.Any a, short[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static short[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ushort);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (DsLogAdmin.ThresholdHelper.id (), "Threshold", __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (DsLogAdmin.CapacityAlarmThresholdListHelper.id (), "CapacityAlarmThresholdList", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static short[] read (org.omg.CORBA.portable.InputStream istream)
  {
    short value[] = null;
    int _len0 = istream.read_long ();
    value = new short[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = DsLogAdmin.ThresholdHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, short[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      DsLogAdmin.ThresholdHelper.write (ostream, value[_i0]);
  }

}
