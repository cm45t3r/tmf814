package CosTrading;


/**
* CosTrading/MissingMandatoryPropertyHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

abstract public class MissingMandatoryPropertyHelper
{
  private static String  _id = "IDL:omg.org/CosTrading/MissingMandatoryProperty:1.0";

  public static void insert (org.omg.CORBA.Any a, CosTrading.MissingMandatoryProperty that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosTrading.MissingMandatoryProperty extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosTrading.IstringHelper.id (), "Istring", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosTrading.ServiceTypeNameHelper.id (), "ServiceTypeName", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "type",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosTrading.IstringHelper.id (), "Istring", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosTrading.PropertyNameHelper.id (), "PropertyName", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "name",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (CosTrading.MissingMandatoryPropertyHelper.id (), "MissingMandatoryProperty", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosTrading.MissingMandatoryProperty read (org.omg.CORBA.portable.InputStream istream)
  {
    CosTrading.MissingMandatoryProperty value = new CosTrading.MissingMandatoryProperty ();
    // read and discard the repository ID
    istream.read_string ();
    value.type = istream.read_string ();
    value.name = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosTrading.MissingMandatoryProperty value)
  {
    // write the repository ID
    ostream.write_string (id ());
    ostream.write_string (value.type);
    ostream.write_string (value.name);
  }

}
