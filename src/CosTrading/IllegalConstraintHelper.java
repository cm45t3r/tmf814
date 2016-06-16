package CosTrading;


/**
* CosTrading/IllegalConstraintHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

abstract public class IllegalConstraintHelper
{
  private static String  _id = "IDL:omg.org/CosTrading/IllegalConstraint:1.0";

  public static void insert (org.omg.CORBA.Any a, CosTrading.IllegalConstraint that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosTrading.IllegalConstraint extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosTrading.IstringHelper.id (), "Istring", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosTrading.ConstraintHelper.id (), "Constraint", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "constr",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (CosTrading.IllegalConstraintHelper.id (), "IllegalConstraint", _members0);
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

  public static CosTrading.IllegalConstraint read (org.omg.CORBA.portable.InputStream istream)
  {
    CosTrading.IllegalConstraint value = new CosTrading.IllegalConstraint ();
    // read and discard the repository ID
    istream.read_string ();
    value.constr = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosTrading.IllegalConstraint value)
  {
    // write the repository ID
    ostream.write_string (id ());
    ostream.write_string (value.constr);
  }

}
