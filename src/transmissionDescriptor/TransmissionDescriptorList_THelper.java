package transmissionDescriptor;


/**
* transmissionDescriptor/TransmissionDescriptorList_THelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from transmissionDescriptor.idl
* Wednesday, June 15, 2016 7:24:43 PM COT
*/


/**
   * <p>A list of Transmission Descriptors.</p>
   **/
abstract public class TransmissionDescriptorList_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/transmissionDescriptor/TransmissionDescriptorList_T:1.0";

  public static void insert (org.omg.CORBA.Any a, transmissionDescriptor.TransmissionDescriptor_T[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static transmissionDescriptor.TransmissionDescriptor_T[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = transmissionDescriptor.TransmissionDescriptor_THelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (transmissionDescriptor.TransmissionDescriptorList_THelper.id (), "TransmissionDescriptorList_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static transmissionDescriptor.TransmissionDescriptor_T[] read (org.omg.CORBA.portable.InputStream istream)
  {
    transmissionDescriptor.TransmissionDescriptor_T value[] = null;
    int _len0 = istream.read_long ();
    value = new transmissionDescriptor.TransmissionDescriptor_T[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = transmissionDescriptor.TransmissionDescriptor_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, transmissionDescriptor.TransmissionDescriptor_T[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      transmissionDescriptor.TransmissionDescriptor_THelper.write (ostream, value[_i0]);
  }

}
