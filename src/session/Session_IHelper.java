package session;


/**
* session/Session_IHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from session.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/


/**
   * <p> The Session_I interface provides capabilities to manage the
   * client-server connection.
   * Its main purpose is to enable either a client or server to detect the 
   * loss of communication with the associated party.</p>
   *
   * <p>For a single communication session between an NMS and an EMS, there are
   * two Session_I objects.  One is maintained on the NMS; the other one is 
   * maintained on the EMS.  The Session_I object maintained on the EMS is 
   * actually an EmsSession_I, while the Session_I object maintained on the NMS 
   * is actually an NmsSession_I (both inherit from Session_I).</p>
   *
   * <p>Each Session_I object is responsible to "ping" the other Session_I 
   * object periodically to detect communication failures.  Exactly when this is 
   * done is up to the implementation.</p>
   *
   * <p>When a Session_I object detects a communication failure, or when the 
   * endSession operation is called on it, all resources allocated with that 
   * communication session must be freed and the Session_I object must be 
   * deleted.</p>
   **/
abstract public class Session_IHelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/session/Session_I:1.0";

  public static void insert (org.omg.CORBA.Any a, session.Session_I that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static session.Session_I extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (session.Session_IHelper.id (), "Session_I");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static session.Session_I read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_Session_IStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, session.Session_I value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static session.Session_I narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof session.Session_I)
      return (session.Session_I)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      session._Session_IStub stub = new session._Session_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static session.Session_I unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof session.Session_I)
      return (session.Session_I)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      session._Session_IStub stub = new session._Session_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
