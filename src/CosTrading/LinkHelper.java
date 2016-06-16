package CosTrading;


/**
* CosTrading/LinkHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/


/** This interface is used to federate traders
 * together and manage the links between them.
 */
abstract public class LinkHelper
{
  private static String  _id = "IDL:omg.org/CosTrading/Link:1.0";

  public static void insert (org.omg.CORBA.Any a, CosTrading.Link that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosTrading.Link extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosTrading.LinkHelper.id (), "Link");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosTrading.Link read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_LinkStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosTrading.Link value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosTrading.Link narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosTrading.Link)
      return (CosTrading.Link)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosTrading._LinkStub stub = new CosTrading._LinkStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosTrading.Link unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosTrading.Link)
      return (CosTrading.Link)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosTrading._LinkStub stub = new CosTrading._LinkStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
