package emsMgr;

/**
* emsMgr/EMSMgr_IHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from emsMgr.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/


/**
   * <p>The EMSMgr_I is used to gain access to operations
   * which deal with the EMS itself.</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation in managerInterface when 
   * the managerName "EMS" is used.</p>
   **/
public final class EMSMgr_IHolder implements org.omg.CORBA.portable.Streamable
{
  public emsMgr.EMSMgr_I value = null;

  public EMSMgr_IHolder ()
  {
  }

  public EMSMgr_IHolder (emsMgr.EMSMgr_I initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = emsMgr.EMSMgr_IHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    emsMgr.EMSMgr_IHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return emsMgr.EMSMgr_IHelper.type ();
  }

}
