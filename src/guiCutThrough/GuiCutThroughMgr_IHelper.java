package guiCutThrough;


/**
* guiCutThrough/GuiCutThroughMgr_IHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from guiCutThrough.idl
* Wednesday, June 15, 2016 7:24:37 PM COT
*/


/**
   * <p>The GuiCutThroughMgr_I is used to access the GUI Cut-Through data
   * available at the EMS and launch an NMS display of the EMS GUI.</p>
   *
   * <p>A handle to this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation in the managerInterface 
   * parameter when the managerName "GuiCutThrough" is used.</p>
   **/
abstract public class GuiCutThroughMgr_IHelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/guiCutThrough/GuiCutThroughMgr_I:1.0";

  public static void insert (org.omg.CORBA.Any a, guiCutThrough.GuiCutThroughMgr_I that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static guiCutThrough.GuiCutThroughMgr_I extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (guiCutThrough.GuiCutThroughMgr_IHelper.id (), "GuiCutThroughMgr_I");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static guiCutThrough.GuiCutThroughMgr_I read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_GuiCutThroughMgr_IStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, guiCutThrough.GuiCutThroughMgr_I value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static guiCutThrough.GuiCutThroughMgr_I narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof guiCutThrough.GuiCutThroughMgr_I)
      return (guiCutThrough.GuiCutThroughMgr_I)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      guiCutThrough._GuiCutThroughMgr_IStub stub = new guiCutThrough._GuiCutThroughMgr_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static guiCutThrough.GuiCutThroughMgr_I unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof guiCutThrough.GuiCutThroughMgr_I)
      return (guiCutThrough.GuiCutThroughMgr_I)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      guiCutThrough._GuiCutThroughMgr_IStub stub = new guiCutThrough._GuiCutThroughMgr_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}