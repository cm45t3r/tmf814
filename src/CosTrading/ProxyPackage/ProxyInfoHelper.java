package CosTrading.ProxyPackage;


/**
* CosTrading/ProxyPackage/ProxyInfoHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

abstract public class ProxyInfoHelper
{
  private static String  _id = "IDL:omg.org/CosTrading/Proxy/ProxyInfo:1.0";

  public static void insert (org.omg.CORBA.Any a, CosTrading.ProxyPackage.ProxyInfo that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosTrading.ProxyPackage.ProxyInfo extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [6];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosTrading.IstringHelper.id (), "Istring", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosTrading.ServiceTypeNameHelper.id (), "ServiceTypeName", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "type",
            _tcOf_members0,
            null);
          _tcOf_members0 = CosTrading.LookupHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "target",
            _tcOf_members0,
            null);
          _tcOf_members0 = CosTrading.PropertyHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosTrading.PropertySeqHelper.id (), "PropertySeq", _tcOf_members0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "properties",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_boolean);
          _members0[3] = new org.omg.CORBA.StructMember (
            "if_match_all",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosTrading.IstringHelper.id (), "Istring", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosTrading.ProxyPackage.ConstraintRecipeHelper.id (), "ConstraintRecipe", _tcOf_members0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "recipe",
            _tcOf_members0,
            null);
          _tcOf_members0 = CosTrading.PolicyHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CosTrading.PolicySeqHelper.id (), "PolicySeq", _tcOf_members0);
          _members0[5] = new org.omg.CORBA.StructMember (
            "policies_to_pass_on",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (CosTrading.ProxyPackage.ProxyInfoHelper.id (), "ProxyInfo", _members0);
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

  public static CosTrading.ProxyPackage.ProxyInfo read (org.omg.CORBA.portable.InputStream istream)
  {
    CosTrading.ProxyPackage.ProxyInfo value = new CosTrading.ProxyPackage.ProxyInfo ();
    value.type = istream.read_string ();
    value.target = CosTrading.LookupHelper.read (istream);
    value.properties = CosTrading.PropertySeqHelper.read (istream);
    value.if_match_all = istream.read_boolean ();
    value.recipe = istream.read_string ();
    value.policies_to_pass_on = CosTrading.PolicySeqHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosTrading.ProxyPackage.ProxyInfo value)
  {
    ostream.write_string (value.type);
    CosTrading.LookupHelper.write (ostream, value.target);
    CosTrading.PropertySeqHelper.write (ostream, value.properties);
    ostream.write_boolean (value.if_match_all);
    ostream.write_string (value.recipe);
    CosTrading.PolicySeqHelper.write (ostream, value.policies_to_pass_on);
  }

}
