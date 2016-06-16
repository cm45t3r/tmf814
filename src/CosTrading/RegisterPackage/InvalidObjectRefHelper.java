package CosTrading.RegisterPackage;


/**
* CosTrading/RegisterPackage/InvalidObjectRefHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

abstract public class InvalidObjectRefHelper
{
  private static String  _id = "IDL:omg.org/CosTrading/Register/InvalidObjectRef:1.0";

  public static void insert (org.omg.CORBA.Any a, CosTrading.RegisterPackage.InvalidObjectRef that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosTrading.RegisterPackage.InvalidObjectRef extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [1];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ObjectHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "ref",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (CosTrading.RegisterPackage.InvalidObjectRefHelper.id (), "InvalidObjectRef", _members0);
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

  public static CosTrading.RegisterPackage.InvalidObjectRef read (org.omg.CORBA.portable.InputStream istream)
  {
    CosTrading.RegisterPackage.InvalidObjectRef value = new CosTrading.RegisterPackage.InvalidObjectRef ();
    // read and discard the repository ID
    istream.read_string ();
    value.ref = org.omg.CORBA.ObjectHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosTrading.RegisterPackage.InvalidObjectRef value)
  {
    // write the repository ID
    ostream.write_string (id ());
    org.omg.CORBA.ObjectHelper.write (ostream, value.ref);
  }

}
