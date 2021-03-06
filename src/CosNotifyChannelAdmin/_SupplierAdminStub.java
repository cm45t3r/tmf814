package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/_SupplierAdminStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface for supplier administration objects.
    */
public class _SupplierAdminStub extends org.omg.CORBA.portable.ObjectImpl implements CosNotifyChannelAdmin.SupplierAdmin
{


  /**
         * A unique identified for this administration object.
         */
  public int MyID ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_MyID", true);
                $in = _invoke ($out);
                int $result = CosNotifyChannelAdmin.AdminIDHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return MyID (        );
            } finally {
                _releaseReply ($in);
            }
  } // MyID


  /**
         * The event channel object that created this administration object.
         */
  public CosNotifyChannelAdmin.EventChannel MyChannel ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_MyChannel", true);
                $in = _invoke ($out);
                CosNotifyChannelAdmin.EventChannel $result = CosNotifyChannelAdmin.EventChannelHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return MyChannel (        );
            } finally {
                _releaseReply ($in);
            }
  } // MyChannel


  /**
         * Indicates whether AND or OR semantics is used when combining 
         * administration object filters and proxy filters.
         */
  public CosNotifyChannelAdmin.InterFilterGroupOperator MyOperator ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_MyOperator", true);
                $in = _invoke ($out);
                CosNotifyChannelAdmin.InterFilterGroupOperator $result = CosNotifyChannelAdmin.InterFilterGroupOperatorHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return MyOperator (        );
            } finally {
                _releaseReply ($in);
            }
  } // MyOperator


  /**
         * A list of pull consumer proxies created by the administration object.
         */
  public int[] pull_consumers ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_pull_consumers", true);
                $in = _invoke ($out);
                int $result[] = CosNotifyChannelAdmin.ProxyIDSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return pull_consumers (        );
            } finally {
                _releaseReply ($in);
            }
  } // pull_consumers


  /**
         * A list of pull consumer proxies created by the administration object.
         */
  public int[] push_consumers ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_push_consumers", true);
                $in = _invoke ($out);
                int $result[] = CosNotifyChannelAdmin.ProxyIDSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return push_consumers (        );
            } finally {
                _releaseReply ($in);
            }
  } // push_consumers


  /**
         * Get the proxy with the specified ID.
         * @parm <code>proxy_id</code> - The ID of the proxy to retrieve.
         * @raises ProxyNotFound If no proxy with the specified ID could 
         * be found.
         */
  public CosNotifyChannelAdmin.ProxyConsumer get_proxy_consumer (int proxy_id) throws CosNotifyChannelAdmin.ProxyNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_proxy_consumer", true);
                CosNotifyChannelAdmin.ProxyIDHelper.write ($out, proxy_id);
                $in = _invoke ($out);
                CosNotifyChannelAdmin.ProxyConsumer $result = CosNotifyChannelAdmin.ProxyConsumerHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyChannelAdmin/ProxyNotFound:1.0"))
                    throw CosNotifyChannelAdmin.ProxyNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_proxy_consumer (proxy_id        );
            } finally {
                _releaseReply ($in);
            }
  } // get_proxy_consumer


  /**
         * Obtain a pull consumer proxy for this administration object.
         * @parm <code>ctype</code> - The client type.
         * @parm <code>proxy_id</code> - The ID of the newly created proxy,
         * i.e. the return value.
         * @returns A ProxyConsumer object reference.
         * @raises AdminLimitExceeded If the number of proxies associated 
         * with this administration object exceeds the MaxConsumers property.
         */
  public CosNotifyChannelAdmin.ProxyConsumer obtain_notification_pull_consumer (CosNotifyChannelAdmin.ClientType ctype, org.omg.CORBA.IntHolder proxy_id) throws CosNotifyChannelAdmin.AdminLimitExceeded
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("obtain_notification_pull_consumer", true);
                CosNotifyChannelAdmin.ClientTypeHelper.write ($out, ctype);
                $in = _invoke ($out);
                CosNotifyChannelAdmin.ProxyConsumer $result = CosNotifyChannelAdmin.ProxyConsumerHelper.read ($in);
                proxy_id.value = CosNotifyChannelAdmin.ProxyIDHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyChannelAdmin/AdminLimitExceeded:1.0"))
                    throw CosNotifyChannelAdmin.AdminLimitExceededHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return obtain_notification_pull_consumer (ctype, proxy_id        );
            } finally {
                _releaseReply ($in);
            }
  } // obtain_notification_pull_consumer


  /**
         * Obtain a push consumer proxy for this administration object.
         * @parm <code>ctype</code> - The client type.
         * @parm <code>proxy_id</code> - The ID of the newly created proxy,
         * i.e. the return value.
         * @returns A ProxyConsumer object reference.
         * @raises AdminLimitExceeded If the number of proxies associated 
         * with this administration object exceeds the MaxConsumers property.
         */
  public CosNotifyChannelAdmin.ProxyConsumer obtain_notification_push_consumer (CosNotifyChannelAdmin.ClientType ctype, org.omg.CORBA.IntHolder proxy_id) throws CosNotifyChannelAdmin.AdminLimitExceeded
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("obtain_notification_push_consumer", true);
                CosNotifyChannelAdmin.ClientTypeHelper.write ($out, ctype);
                $in = _invoke ($out);
                CosNotifyChannelAdmin.ProxyConsumer $result = CosNotifyChannelAdmin.ProxyConsumerHelper.read ($in);
                proxy_id.value = CosNotifyChannelAdmin.ProxyIDHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyChannelAdmin/AdminLimitExceeded:1.0"))
                    throw CosNotifyChannelAdmin.AdminLimitExceededHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return obtain_notification_push_consumer (ctype, proxy_id        );
            } finally {
                _releaseReply ($in);
            }
  } // obtain_notification_push_consumer


  /**
         * Destroy this administration object and all proxies created by it.
         */
  public void destroy ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("destroy", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                destroy (        );
            } finally {
                _releaseReply ($in);
            }
  } // destroy


  /**
         * Returns the current quality of service settings for this object.
         * @returns A sequence of name-value pairs defining the quality of 
         * service settings.
         */
  public CosNotification.Property[] get_qos ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_qos", true);
                $in = _invoke ($out);
                CosNotification.Property $result[] = CosNotification.QoSPropertiesHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_qos (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_qos


  /**
         * Sets the quality of service settings for this object.
         * @parm <code>qos</code> - A sequence of name-value pairs defining
         * the desired quality of service settings.
         * @raises UnsupportedQoS If the requested settings are not supported.
         */
  public void set_qos (CosNotification.Property[] qos) throws CosNotification.UnsupportedQoS
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("set_qos", true);
                CosNotification.QoSPropertiesHelper.write ($out, qos);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotification/UnsupportedQoS:1.0"))
                    throw CosNotification.UnsupportedQoSHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                set_qos (qos        );
            } finally {
                _releaseReply ($in);
            }
  } // set_qos


  /**
         * Validates a set of quality of service requirements.
         * @parm <code>qos</code> -  A sequence of name-value pairs defining
         * quality of service settings that are to be validated.
         * @parm <code>available_qos</code> - A sequence of all additional
         * quality of service setting supported by this object.
         * @raises UnsupportedQoS If any of the setting in the input argument
         * are not supported.
         */
  public void validate_qos (CosNotification.Property[] required_qos, CosNotification.NamedPropertyRangeSeqHolder available_qos) throws CosNotification.UnsupportedQoS
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("validate_qos", true);
                CosNotification.QoSPropertiesHelper.write ($out, required_qos);
                $in = _invoke ($out);
                available_qos.value = CosNotification.NamedPropertyRangeSeqHelper.read ($in);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotification/UnsupportedQoS:1.0"))
                    throw CosNotification.UnsupportedQoSHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                validate_qos (required_qos, available_qos        );
            } finally {
                _releaseReply ($in);
            }
  } // validate_qos


  /**
         * Indicates that a supplier is changing the names of the types of
         * events it is publishing.
         * @parm <code>added</code> - The event types added.
         * @parm <code>removed</code> - The event types removed.
         * @raises InvalidEventType If any of the event type names in either 
         * the of the input sequences are invalid.
         */
  public void offer_change (CosNotification.EventType[] added, CosNotification.EventType[] removed) throws CosNotifyComm.InvalidEventType
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("offer_change", true);
                CosNotification.EventTypeSeqHelper.write ($out, added);
                CosNotification.EventTypeSeqHelper.write ($out, removed);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyComm/InvalidEventType:1.0"))
                    throw CosNotifyComm.InvalidEventTypeHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                offer_change (added, removed        );
            } finally {
                _releaseReply ($in);
            }
  } // offer_change


  /**
         * Add a filter to this object's list of filters. All these filters
         * are tried upon reception of an event.
         * @parm <code>new_filter</code> - The filter to add.
         * @returns An unique ID that identifies the added filter.
         */
  public int add_filter (CosNotifyFilter.Filter new_filter)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("add_filter", true);
                CosNotifyFilter.FilterHelper.write ($out, new_filter);
                $in = _invoke ($out);
                int $result = CosNotifyFilter.FilterIDHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return add_filter (new_filter        );
            } finally {
                _releaseReply ($in);
            }
  } // add_filter


  /**
         * Remove a filter from this object's list of filters.
         * @parm <code>filter</code> - The filter ID.
         * @raises FilterNotFound If the ID does not correspond to any
         * filter that has been added to this object.
         */
  public void remove_filter (int filter) throws CosNotifyFilter.FilterNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("remove_filter", true);
                CosNotifyFilter.FilterIDHelper.write ($out, filter);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/FilterNotFound:1.0"))
                    throw CosNotifyFilter.FilterNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                remove_filter (filter        );
            } finally {
                _releaseReply ($in);
            }
  } // remove_filter


  /**
         * Get a filter from the filter ID.
         * @parm <code>filter</code> - The filter ID.
         * @raises FilterNotFound If the ID does not correspond to any
         * filter that has been added to this object.
         */
  public CosNotifyFilter.Filter get_filter (int filter) throws CosNotifyFilter.FilterNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_filter", true);
                CosNotifyFilter.FilterIDHelper.write ($out, filter);
                $in = _invoke ($out);
                CosNotifyFilter.Filter $result = CosNotifyFilter.FilterHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/FilterNotFound:1.0"))
                    throw CosNotifyFilter.FilterNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_filter (filter        );
            } finally {
                _releaseReply ($in);
            }
  } // get_filter


  /**
         * Get all filters added to this administration object.
         * @returns A sequence of filter IDs.
         */
  public int[] get_all_filters ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_all_filters", true);
                $in = _invoke ($out);
                int $result[] = CosNotifyFilter.FilterIDSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_all_filters (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_all_filters


  /**
         * Remove all filters added to this administration object.
         */
  public void remove_all_filters ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("remove_all_filters", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                remove_all_filters (        );
            } finally {
                _releaseReply ($in);
            }
  } // remove_all_filters


  /**
         * Obtain a push consumer proxy for this administration object.
         * @returns A <code>ProxyPushConsumer</code> object reference.
         */
  public CosEventChannelAdmin.ProxyPushConsumer obtain_push_consumer ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("obtain_push_consumer", true);
                $in = _invoke ($out);
                CosEventChannelAdmin.ProxyPushConsumer $result = CosEventChannelAdmin.ProxyPushConsumerHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return obtain_push_consumer (        );
            } finally {
                _releaseReply ($in);
            }
  } // obtain_push_consumer


  /**
         * Obtain a pull consumer proxy for this administration object.
         * @returns A <code>ProxyPullConsumer</code> object reference.
         */
  public CosEventChannelAdmin.ProxyPullConsumer obtain_pull_consumer ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("obtain_pull_consumer", true);
                $in = _invoke ($out);
                CosEventChannelAdmin.ProxyPullConsumer $result = CosEventChannelAdmin.ProxyPullConsumerHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return obtain_pull_consumer (        );
            } finally {
                _releaseReply ($in);
            }
  } // obtain_pull_consumer

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotifyChannelAdmin/SupplierAdmin:1.0", 
    "IDL:omg.org/CosNotification/QoSAdmin:1.0", 
    "IDL:omg.org/CosNotifyComm/NotifyPublish:1.0", 
    "IDL:omg.org/CosNotifyFilter/FilterAdmin:1.0", 
    "IDL:omg.org/CosEventChannelAdmin/SupplierAdmin:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _SupplierAdminStub
