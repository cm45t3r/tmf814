package flowDomain;


/**
* flowDomain/ConnectivityRequirement_THelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from flowDomain.idl
* Wednesday, June 15, 2016 7:24:36 PM COT
*/


/**
   * <p> This attribute shall identify (for a "connectivity-aware" EMS) 
   * the requested operation mode in case not all FPs have potential connectivity 
   * to one another. If the EMS is not connectivity-aware, this parameter is ignored.
   * It shall have one of the following values: <br>
   * CR_IGNORE: in case not all FPs have potential connectivity to one another, 
   * add all Flow Points regardless of potential connectivity (default value).
   * CR_REJECT: in case not all FPs have potential connectivity 
   * to one another, reject the request. <br>
   *    <br>
   * </p>
   **/
abstract public class ConnectivityRequirement_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/flowDomain/ConnectivityRequirement_T:1.0";

  public static void insert (org.omg.CORBA.Any a, flowDomain.ConnectivityRequirement_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static flowDomain.ConnectivityRequirement_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (flowDomain.ConnectivityRequirement_THelper.id (), "ConnectivityRequirement_T", new String[] { "CR_IGNORE", "CR_REJECT"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static flowDomain.ConnectivityRequirement_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return flowDomain.ConnectivityRequirement_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, flowDomain.ConnectivityRequirement_T value)
  {
    ostream.write_long (value.value ());
  }

}
