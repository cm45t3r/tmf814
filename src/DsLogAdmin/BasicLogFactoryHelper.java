package DsLogAdmin;


/**
* DsLogAdmin/BasicLogFactoryHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/

abstract public class BasicLogFactoryHelper
{
  private static String  _id = "IDL:omg.org/DsLogAdmin/BasicLogFactory:1.0";

  public static void insert (org.omg.CORBA.Any a, DsLogAdmin.BasicLogFactory that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static DsLogAdmin.BasicLogFactory extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (DsLogAdmin.BasicLogFactoryHelper.id (), "BasicLogFactory");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static DsLogAdmin.BasicLogFactory read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_BasicLogFactoryStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, DsLogAdmin.BasicLogFactory value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static DsLogAdmin.BasicLogFactory narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DsLogAdmin.BasicLogFactory)
      return (DsLogAdmin.BasicLogFactory)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      DsLogAdmin._BasicLogFactoryStub stub = new DsLogAdmin._BasicLogFactoryStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static DsLogAdmin.BasicLogFactory unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DsLogAdmin.BasicLogFactory)
      return (DsLogAdmin.BasicLogFactory)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      DsLogAdmin._BasicLogFactoryStub stub = new DsLogAdmin._BasicLogFactoryStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
