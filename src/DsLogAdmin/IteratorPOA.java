package DsLogAdmin;


/**
* DsLogAdmin/IteratorPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/


// result of querying the Log
public abstract class IteratorPOA extends org.omg.PortableServer.Servant
 implements DsLogAdmin.IteratorOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("get", new java.lang.Integer (0));
    _methods.put ("destroy", new java.lang.Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // DsLogAdmin/Iterator/get
       {
         try {
           int position = in.read_ulong ();
           int how_many = in.read_ulong ();
           DsLogAdmin.LogRecord $result[] = null;
           $result = this.get (position, how_many);
           out = $rh.createReply();
           DsLogAdmin.RecordListHelper.write (out, $result);
         } catch (DsLogAdmin.InvalidParam $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidParamHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // DsLogAdmin/Iterator/destroy
       {
         this.destroy ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/DsLogAdmin/Iterator:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Iterator _this() 
  {
    return IteratorHelper.narrow(
    super._this_object());
  }

  public Iterator _this(org.omg.CORBA.ORB orb) 
  {
    return IteratorHelper.narrow(
    super._this_object(orb));
  }


} // class IteratorPOA
