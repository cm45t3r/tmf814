package trafficDescriptor;


/**
* trafficDescriptor/ServiceCategory_THelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from trafficDescriptor.idl
* Wednesday, June 15, 2016 7:24:43 PM COT
*/


/**
   * <p>Represents Service Categories used by Traffic 
   * Descriptors. The current Service Categories are defined
   * as follows (note that Guaranteed Bit Rate (GBR) is not 
   * defined because it is generally not used):<p>
   * <ol>
   * <li> SC_CBR = Constant Bit Rate. For connections that require
   * a sstatic amount of bandwidth that is continuously available during
   * the lifetime of the connection.</li>
   * <li> SC_VBRRT = Variable Bit Rate - Real-Time. For connections that
   * require tightly constrained delay and delay variation.</li>
   * <li> SC_VBRNRT = Variable Bit Rate - NonReal-Time. For connections
   * that have bursty traffic.</li>
   * <li> SC_ABR = Available Bit Rate. For connections that do not require
   * bounding the delay or delay variation. Not intended for real-time
   * applications.</li> 
   * <li> SC_UBR = Unspecified Bit Rate. For connections that do not require
   * tightly constrained delay and delay variation.</li> 
   * <li> SC_GFR = Guaranteed Frame Rate. For non-real-time applications that 
   * may require a minimum rate guarantee and can benefit from accessing 
   * additional bandwidth dynamically available in the network.</li> 
   * <li> SC_NA = Not Applicable</li> 
   * </ol><br>
   **/
abstract public class ServiceCategory_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/trafficDescriptor/ServiceCategory_T:1.0";

  public static void insert (org.omg.CORBA.Any a, trafficDescriptor.ServiceCategory_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static trafficDescriptor.ServiceCategory_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (trafficDescriptor.ServiceCategory_THelper.id (), "ServiceCategory_T", new String[] { "SC_CBR", "SC_VBRRT", "SC_VBRNRT", "SC_ABR", "SC_UBR", "SC_GFR", "SC_NA"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static trafficDescriptor.ServiceCategory_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return trafficDescriptor.ServiceCategory_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, trafficDescriptor.ServiceCategory_T value)
  {
    ostream.write_long (value.value ());
  }

}
