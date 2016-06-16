package trafficConditioningProfile;


/**
* trafficConditioningProfile/TCProfileIterator_IPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from trafficConditioningProfile.idl
* Wednesday, June 15, 2016 7:24:43 PM COT
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   * <p>See <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
   * for information on how iterators are used in this interface.</p>
   **/
public abstract class TCProfileIterator_IPOA extends org.omg.PortableServer.Servant
 implements trafficConditioningProfile.TCProfileIterator_IOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("next_n", new java.lang.Integer (0));
    _methods.put ("getLength", new java.lang.Integer (1));
    _methods.put ("destroy", new java.lang.Integer (2));
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
       case 0:  // trafficConditioningProfile/TCProfileIterator_I/next_n
       {
         try {
           int how_many = in.read_ulong ();
           trafficConditioningProfile.TCProfileList_THolder tcProfileList = new trafficConditioningProfile.TCProfileList_THolder ();
           boolean $result = false;
           $result = this.next_n (how_many, tcProfileList);
           out = $rh.createReply();
           out.write_boolean ($result);
           trafficConditioningProfile.TCProfileList_THelper.write (out, tcProfileList.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // trafficConditioningProfile/TCProfileIterator_I/getLength
       {
         try {
           int $result = (int)0;
           $result = this.getLength ();
           out = $rh.createReply();
           out.write_ulong ($result);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 2:  // trafficConditioningProfile/TCProfileIterator_I/destroy
       {
         try {
           this.destroy ();
           out = $rh.createReply();
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:mtnm.tmforum.org/trafficConditioningProfile/TCProfileIterator_I:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public TCProfileIterator_I _this() 
  {
    return TCProfileIterator_IHelper.narrow(
    super._this_object());
  }

  public TCProfileIterator_I _this(org.omg.CORBA.ORB orb) 
  {
    return TCProfileIterator_IHelper.narrow(
    super._this_object(orb));
  }


} // class TCProfileIterator_IPOA