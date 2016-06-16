package protection;


/**
* protection/SwitchData_THelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from protection.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/

abstract public class SwitchData_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/protection/SwitchData_T:1.0";

  public static void insert (org.omg.CORBA.Any a, protection.SwitchData_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static protection.SwitchData_T extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [7];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = protection.ProtectionType_THelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "protectionType",
            _tcOf_members0,
            null);
          _tcOf_members0 = protection.SwitchReason_THelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "switchReason",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_short);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (transmissionParameters.LayerRate_THelper.id (), "LayerRate_T", _tcOf_members0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "layerRate",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributes_THelper.id (), "NamingAttributes_T", _tcOf_members0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "groupName",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributes_THelper.id (), "NamingAttributes_T", _tcOf_members0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "protectedTP",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributes_THelper.id (), "NamingAttributes_T", _tcOf_members0);
          _members0[5] = new org.omg.CORBA.StructMember (
            "switchToTP",
            _tcOf_members0,
            null);
          _tcOf_members0 = globaldefs.NameAndStringValue_THelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", _tcOf_members0);
          _members0[6] = new org.omg.CORBA.StructMember (
            "additionalInfo",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (protection.SwitchData_THelper.id (), "SwitchData_T", _members0);
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

  public static protection.SwitchData_T read (org.omg.CORBA.portable.InputStream istream)
  {
    protection.SwitchData_T value = new protection.SwitchData_T ();
    value.protectionType = protection.ProtectionType_THelper.read (istream);
    value.switchReason = protection.SwitchReason_THelper.read (istream);
    value.layerRate = istream.read_short ();
    value.groupName = globaldefs.NVSList_THelper.read (istream);
    value.protectedTP = globaldefs.NVSList_THelper.read (istream);
    value.switchToTP = globaldefs.NVSList_THelper.read (istream);
    value.additionalInfo = globaldefs.NVSList_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, protection.SwitchData_T value)
  {
    protection.ProtectionType_THelper.write (ostream, value.protectionType);
    protection.SwitchReason_THelper.write (ostream, value.switchReason);
    ostream.write_short (value.layerRate);
    globaldefs.NVSList_THelper.write (ostream, value.groupName);
    globaldefs.NVSList_THelper.write (ostream, value.protectedTP);
    globaldefs.NVSList_THelper.write (ostream, value.switchToTP);
    globaldefs.NVSList_THelper.write (ostream, value.additionalInfo);
  }

}
