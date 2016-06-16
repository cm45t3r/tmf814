package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/ConsumerAdminPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface for consumer administration objects.
    */
public abstract class ConsumerAdminPOA extends org.omg.PortableServer.Servant
 implements CosNotifyChannelAdmin.ConsumerAdminOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_MyID", new java.lang.Integer (0));
    _methods.put ("_get_MyChannel", new java.lang.Integer (1));
    _methods.put ("_get_MyOperator", new java.lang.Integer (2));
    _methods.put ("_get_priority_filter", new java.lang.Integer (3));
    _methods.put ("_set_priority_filter", new java.lang.Integer (4));
    _methods.put ("_get_lifetime_filter", new java.lang.Integer (5));
    _methods.put ("_set_lifetime_filter", new java.lang.Integer (6));
    _methods.put ("_get_pull_suppliers", new java.lang.Integer (7));
    _methods.put ("_get_push_suppliers", new java.lang.Integer (8));
    _methods.put ("get_proxy_supplier", new java.lang.Integer (9));
    _methods.put ("obtain_notification_pull_supplier", new java.lang.Integer (10));
    _methods.put ("obtain_notification_push_supplier", new java.lang.Integer (11));
    _methods.put ("destroy", new java.lang.Integer (12));
    _methods.put ("get_qos", new java.lang.Integer (13));
    _methods.put ("set_qos", new java.lang.Integer (14));
    _methods.put ("validate_qos", new java.lang.Integer (15));
    _methods.put ("subscription_change", new java.lang.Integer (16));
    _methods.put ("add_filter", new java.lang.Integer (17));
    _methods.put ("remove_filter", new java.lang.Integer (18));
    _methods.put ("get_filter", new java.lang.Integer (19));
    _methods.put ("get_all_filters", new java.lang.Integer (20));
    _methods.put ("remove_all_filters", new java.lang.Integer (21));
    _methods.put ("obtain_push_supplier", new java.lang.Integer (22));
    _methods.put ("obtain_pull_supplier", new java.lang.Integer (23));
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

  /**
         * A unique identifier for this administration object.
         */
       case 0:  // CosNotifyChannelAdmin/ConsumerAdmin/_get_MyID
       {
         int $result = (int)0;
         $result = this.MyID ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }


  /**
         * The event channel object that created this administration object.
         */
       case 1:  // CosNotifyChannelAdmin/ConsumerAdmin/_get_MyChannel
       {
         CosNotifyChannelAdmin.EventChannel $result = null;
         $result = this.MyChannel ();
         out = $rh.createReply();
         CosNotifyChannelAdmin.EventChannelHelper.write (out, $result);
         break;
       }


  /**
         * Indicates whether AND or OR semantics is used when combining 
         * administration object filters and proxy filters.
         */
       case 2:  // CosNotifyChannelAdmin/ConsumerAdmin/_get_MyOperator
       {
         CosNotifyChannelAdmin.InterFilterGroupOperator $result = null;
         $result = this.MyOperator ();
         out = $rh.createReply();
         CosNotifyChannelAdmin.InterFilterGroupOperatorHelper.write (out, $result);
         break;
       }


  /**
         * A mapping filter which if a non-nil reference will be consulted 
         * for resolving the priority of the event.
         */
       case 3:  // CosNotifyChannelAdmin/ConsumerAdmin/_get_priority_filter
       {
         CosNotifyFilter.MappingFilter $result = null;
         $result = this.priority_filter ();
         out = $rh.createReply();
         CosNotifyFilter.MappingFilterHelper.write (out, $result);
         break;
       }


  /**
         * A mapping filter which if a non-nil reference will be consulted 
         * for resolving the priority of the event.
         */
       case 4:  // CosNotifyChannelAdmin/ConsumerAdmin/_set_priority_filter
       {
         CosNotifyFilter.MappingFilter newPriority_filter = CosNotifyFilter.MappingFilterHelper.read (in);
         this.priority_filter (newPriority_filter);
         out = $rh.createReply();
         break;
       }


  /**
         * A mapping filter which if a non-nil reference will be consulted 
         * for resolving the lifetime of the event.
         */
       case 5:  // CosNotifyChannelAdmin/ConsumerAdmin/_get_lifetime_filter
       {
         CosNotifyFilter.MappingFilter $result = null;
         $result = this.lifetime_filter ();
         out = $rh.createReply();
         CosNotifyFilter.MappingFilterHelper.write (out, $result);
         break;
       }


  /**
         * A mapping filter which if a non-nil reference will be consulted 
         * for resolving the lifetime of the event.
         */
       case 6:  // CosNotifyChannelAdmin/ConsumerAdmin/_set_lifetime_filter
       {
         CosNotifyFilter.MappingFilter newLifetime_filter = CosNotifyFilter.MappingFilterHelper.read (in);
         this.lifetime_filter (newLifetime_filter);
         out = $rh.createReply();
         break;
       }


  /**
         * A list of pull supplier proxies created by the administration object.
         */
       case 7:  // CosNotifyChannelAdmin/ConsumerAdmin/_get_pull_suppliers
       {
         int $result[] = null;
         $result = this.pull_suppliers ();
         out = $rh.createReply();
         CosNotifyChannelAdmin.ProxyIDSeqHelper.write (out, $result);
         break;
       }


  /**
         * A list of push supplier proxies created by the administration object.
         */
       case 8:  // CosNotifyChannelAdmin/ConsumerAdmin/_get_push_suppliers
       {
         int $result[] = null;
         $result = this.push_suppliers ();
         out = $rh.createReply();
         CosNotifyChannelAdmin.ProxyIDSeqHelper.write (out, $result);
         break;
       }


  /**
         * Get the proxy with the specified ID.
         * @parm <code>proxy_id</code> - The ID of the proxy to retrieve.
         * @raises ProxyNotFound If no proxy with the specified ID could 
         * be found.
         */
       case 9:  // CosNotifyChannelAdmin/ConsumerAdmin/get_proxy_supplier
       {
         try {
           int proxy_id = CosNotifyChannelAdmin.ProxyIDHelper.read (in);
           CosNotifyChannelAdmin.ProxySupplier $result = null;
           $result = this.get_proxy_supplier (proxy_id);
           out = $rh.createReply();
           CosNotifyChannelAdmin.ProxySupplierHelper.write (out, $result);
         } catch (CosNotifyChannelAdmin.ProxyNotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyChannelAdmin.ProxyNotFoundHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Obtain a pull supplier proxy for this administration object.
         * @parm <code>ctype</code> - The client type.
         * @parm <code>proxy_id</code> - The ID of the newly created proxy,
         * i.e. the return value.
         * @returns A ProxySupplier object reference.
         * @raises AdminLimitExceeded If the number of proxies associated 
         * with this administration object exceeds the MaxConsumers property.
         */
       case 10:  // CosNotifyChannelAdmin/ConsumerAdmin/obtain_notification_pull_supplier
       {
         try {
           CosNotifyChannelAdmin.ClientType ctype = CosNotifyChannelAdmin.ClientTypeHelper.read (in);
           org.omg.CORBA.IntHolder proxy_id = new org.omg.CORBA.IntHolder ();
           CosNotifyChannelAdmin.ProxySupplier $result = null;
           $result = this.obtain_notification_pull_supplier (ctype, proxy_id);
           out = $rh.createReply();
           CosNotifyChannelAdmin.ProxySupplierHelper.write (out, $result);
           CosNotifyChannelAdmin.ProxyIDHelper.write (out, proxy_id.value);
         } catch (CosNotifyChannelAdmin.AdminLimitExceeded $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyChannelAdmin.AdminLimitExceededHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Obtain a push supplier proxy for this administration object.
         * @parm <code>ctype</code> - The client type.
         * @parm <code>proxy_id</code> - The ID of the newly created proxy,
         * i.e. the return value.
         * @returns A ProxySupplier object reference.
         * @raises AdminLimitExceeded If the number of proxies associated 
         * with this administration object exceeds the MaxConsumers property.
         */
       case 11:  // CosNotifyChannelAdmin/ConsumerAdmin/obtain_notification_push_supplier
       {
         try {
           CosNotifyChannelAdmin.ClientType ctype = CosNotifyChannelAdmin.ClientTypeHelper.read (in);
           org.omg.CORBA.IntHolder proxy_id = new org.omg.CORBA.IntHolder ();
           CosNotifyChannelAdmin.ProxySupplier $result = null;
           $result = this.obtain_notification_push_supplier (ctype, proxy_id);
           out = $rh.createReply();
           CosNotifyChannelAdmin.ProxySupplierHelper.write (out, $result);
           CosNotifyChannelAdmin.ProxyIDHelper.write (out, proxy_id.value);
         } catch (CosNotifyChannelAdmin.AdminLimitExceeded $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyChannelAdmin.AdminLimitExceededHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Destroy this administration object and all proxies created by it.
         */
       case 12:  // CosNotifyChannelAdmin/ConsumerAdmin/destroy
       {
         this.destroy ();
         out = $rh.createReply();
         break;
       }


  /**
         * Returns the current quality of service settings for this object.
         * @returns A sequence of name-value pairs defining the quality of 
         * service settings.
         */
       case 13:  // CosNotification/QoSAdmin/get_qos
       {
         CosNotification.Property $result[] = null;
         $result = this.get_qos ();
         out = $rh.createReply();
         CosNotification.PropertySeqHelper.write (out, $result);
         break;
       }


  /**
         * Sets the quality of service settings for this object.
         * @parm <code>qos</code> - A sequence of name-value pairs defining
         * the desired quality of service settings.
         * @raises UnsupportedQoS If the requested settings are not supported.
         */
       case 14:  // CosNotification/QoSAdmin/set_qos
       {
         try {
           CosNotification.Property qos[] = CosNotification.QoSPropertiesHelper.read (in);
           this.set_qos (qos);
           out = $rh.createReply();
         } catch (CosNotification.UnsupportedQoS $ex) {
           out = $rh.createExceptionReply ();
           CosNotification.UnsupportedQoSHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Validates a set of quality of service requirements.
         * @parm <code>qos</code> -  A sequence of name-value pairs defining
         * quality of service settings that are to be validated.
         * @parm <code>available_qos</code> - A sequence of all additional
         * quality of service setting supported by this object.
         * @raises UnsupportedQoS If any of the setting in the input argument
         * are not supported.
         */
       case 15:  // CosNotification/QoSAdmin/validate_qos
       {
         try {
           CosNotification.Property required_qos[] = CosNotification.QoSPropertiesHelper.read (in);
           CosNotification.NamedPropertyRangeSeqHolder available_qos = new CosNotification.NamedPropertyRangeSeqHolder ();
           this.validate_qos (required_qos, available_qos);
           out = $rh.createReply();
           CosNotification.NamedPropertyRangeSeqHelper.write (out, available_qos.value);
         } catch (CosNotification.UnsupportedQoS $ex) {
           out = $rh.createExceptionReply ();
           CosNotification.UnsupportedQoSHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Indicates that a consumer is changing the names of the types of
         * events it is subscribed to.
         * @parm <code>added</code> - The event types added.
         * @parm <code>removed</code> - The event types removed.
         * @raises InvalidEventType If any of the event type names in either 
         * the of the input sequences are invalid.
         */
       case 16:  // CosNotifyComm/NotifySubscribe/subscription_change
       {
         try {
           CosNotification.EventType added[] = CosNotification.EventTypeSeqHelper.read (in);
           CosNotification.EventType removed[] = CosNotification.EventTypeSeqHelper.read (in);
           this.subscription_change (added, removed);
           out = $rh.createReply();
         } catch (CosNotifyComm.InvalidEventType $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyComm.InvalidEventTypeHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Add a filter to this object's list of filters. All these filters
         * are tried upon reception of an event.
         * @parm <code>new_filter</code> - The filter to add.
         * @returns An unique ID that identifies the added filter.
         */
       case 17:  // CosNotifyFilter/FilterAdmin/add_filter
       {
         CosNotifyFilter.Filter new_filter = CosNotifyFilter.FilterHelper.read (in);
         int $result = (int)0;
         $result = this.add_filter (new_filter);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }


  /**
         * Remove a filter from this object's list of filters.
         * @parm <code>filter</code> - The filter ID.
         * @raises FilterNotFound If the ID does not correspond to any
         * filter that has been added to this object.
         */
       case 18:  // CosNotifyFilter/FilterAdmin/remove_filter
       {
         try {
           int filter = CosNotifyFilter.FilterIDHelper.read (in);
           this.remove_filter (filter);
           out = $rh.createReply();
         } catch (CosNotifyFilter.FilterNotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.FilterNotFoundHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Get a filter from the filter ID.
         * @parm <code>filter</code> - The filter ID.
         * @raises FilterNotFound If the ID does not correspond to any
         * filter that has been added to this object.
         */
       case 19:  // CosNotifyFilter/FilterAdmin/get_filter
       {
         try {
           int filter = CosNotifyFilter.FilterIDHelper.read (in);
           CosNotifyFilter.Filter $result = null;
           $result = this.get_filter (filter);
           out = $rh.createReply();
           CosNotifyFilter.FilterHelper.write (out, $result);
         } catch (CosNotifyFilter.FilterNotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.FilterNotFoundHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Get all filters added to this administration object.
         * @returns A sequence of filter IDs.
         */
       case 20:  // CosNotifyFilter/FilterAdmin/get_all_filters
       {
         int $result[] = null;
         $result = this.get_all_filters ();
         out = $rh.createReply();
         CosNotifyFilter.FilterIDSeqHelper.write (out, $result);
         break;
       }


  /**
         * Remove all filters added to this administration object.
         */
       case 21:  // CosNotifyFilter/FilterAdmin/remove_all_filters
       {
         this.remove_all_filters ();
         out = $rh.createReply();
         break;
       }


  /**
         * Obtain a push supplier proxy for this administration object.
         * @returns A <code>ProxyPushSupplier</code> object reference.
         */
       case 22:  // CosEventChannelAdmin/ConsumerAdmin/obtain_push_supplier
       {
         CosEventChannelAdmin.ProxyPushSupplier $result = null;
         $result = this.obtain_push_supplier ();
         out = $rh.createReply();
         CosEventChannelAdmin.ProxyPushSupplierHelper.write (out, $result);
         break;
       }


  /**
         * Obtain a pull supplier proxy for this administration object.
         * @returns A <code>ProxyPullSupplier</code> object reference.
         */
       case 23:  // CosEventChannelAdmin/ConsumerAdmin/obtain_pull_supplier
       {
         CosEventChannelAdmin.ProxyPullSupplier $result = null;
         $result = this.obtain_pull_supplier ();
         out = $rh.createReply();
         CosEventChannelAdmin.ProxyPullSupplierHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotifyChannelAdmin/ConsumerAdmin:1.0", 
    "IDL:omg.org/CosNotification/QoSAdmin:1.0", 
    "IDL:omg.org/CosNotifyComm/NotifySubscribe:1.0", 
    "IDL:omg.org/CosNotifyFilter/FilterAdmin:1.0", 
    "IDL:omg.org/CosEventChannelAdmin/ConsumerAdmin:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public ConsumerAdmin _this() 
  {
    return ConsumerAdminHelper.narrow(
    super._this_object());
  }

  public ConsumerAdmin _this(org.omg.CORBA.ORB orb) 
  {
    return ConsumerAdminHelper.narrow(
    super._this_object(orb));
  }


} // class ConsumerAdminPOA
