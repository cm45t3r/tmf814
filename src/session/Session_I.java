package session;


/**
* session/Session_I.java .
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
public interface Session_I extends Session_IOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
} // interface Session_I