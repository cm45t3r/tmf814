package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/_SequenceProxyPushSupplierStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface for sequence proxy push suppliers.
    */
public class _SequenceProxyPushSupplierStub extends org.omg.CORBA.portable.ObjectImpl implements CosNotifyChannelAdmin.SequenceProxyPushSupplier
{


  /**
         * Connect a sequence type push consumer to this proxy.
         * @parm <code>push_consumer</code> - The <code>PushConsumer</code>
         * object reference.
         * @raises AlreadyConnected If this consumer is already connected.
         * @raises TypeError Illegal consumer type.
         */
  public void connect_sequence_push_consumer (CosNotifyComm.SequencePushConsumer push_consumer) throws CosEventChannelAdmin.AlreadyConnected, CosEventChannelAdmin.TypeError
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("connect_sequence_push_consumer", true);
                CosNotifyComm.SequencePushConsumerHelper.write ($out, push_consumer);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosEventChannelAdmin/AlreadyConnected:1.0"))
                    throw CosEventChannelAdmin.AlreadyConnectedHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosEventChannelAdmin/TypeError:1.0"))
                    throw CosEventChannelAdmin.TypeErrorHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                connect_sequence_push_consumer (push_consumer        );
            } finally {
                _releaseReply ($in);
            }
  } // connect_sequence_push_consumer


  /**
         * Causes this proxy to stop sending events to its consumer. Note
         * that events will still be queued while the connection is suspended.
         * @raises ConnectionAlreadyInactive Proxy already stopped.
         * @raises NotConnected Proxy not connected.
         */
  public void suspend_connection () throws CosNotifyChannelAdmin.ConnectionAlreadyInactive, CosNotifyChannelAdmin.NotConnected
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("suspend_connection", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyChannelAdmin/ConnectionAlreadyInactive:1.0"))
                    throw CosNotifyChannelAdmin.ConnectionAlreadyInactiveHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNotifyChannelAdmin/NotConnected:1.0"))
                    throw CosNotifyChannelAdmin.NotConnectedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                suspend_connection (        );
            } finally {
                _releaseReply ($in);
            }
  } // suspend_connection


  /**
         * Causes this proxy to start sending events to its consumer.
         * All queued events will be forwarded to the consumers.
         * @raises ConnectionAlreadyActive Proxy already started.
         * @raises NotConnected Proxy not connected.
         */
  public void resume_connection () throws CosNotifyChannelAdmin.ConnectionAlreadyActive, CosNotifyChannelAdmin.NotConnected
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("resume_connection", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyChannelAdmin/ConnectionAlreadyActive:1.0"))
                    throw CosNotifyChannelAdmin.ConnectionAlreadyActiveHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNotifyChannelAdmin/NotConnected:1.0"))
                    throw CosNotifyChannelAdmin.NotConnectedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                resume_connection (        );
            } finally {
                _releaseReply ($in);
            }
  } // resume_connection


  /**
         * The type of this proxy.
         */
  public CosNotifyChannelAdmin.ProxyType MyType ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_MyType", true);
                $in = _invoke ($out);
                CosNotifyChannelAdmin.ProxyType $result = CosNotifyChannelAdmin.ProxyTypeHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return MyType (        );
            } finally {
                _releaseReply ($in);
            }
  } // MyType


  /**
         * The administration object that created this proxy.
         */
  public CosNotifyChannelAdmin.ConsumerAdmin MyAdmin ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_MyAdmin", true);
                $in = _invoke ($out);
                CosNotifyChannelAdmin.ConsumerAdmin $result = CosNotifyChannelAdmin.ConsumerAdminHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return MyAdmin (        );
            } finally {
                _releaseReply ($in);
            }
  } // MyAdmin


  /**
         * A mapping filter which if a non-nil reference will be consulted 
         * for resolving the priority of the event.
         */
  public CosNotifyFilter.MappingFilter priority_filter ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_priority_filter", true);
                $in = _invoke ($out);
                CosNotifyFilter.MappingFilter $result = CosNotifyFilter.MappingFilterHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return priority_filter (        );
            } finally {
                _releaseReply ($in);
            }
  } // priority_filter


  /**
         * A mapping filter which if a non-nil reference will be consulted 
         * for resolving the priority of the event.
         */
  public void priority_filter (CosNotifyFilter.MappingFilter newPriority_filter)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_set_priority_filter", true);
                CosNotifyFilter.MappingFilterHelper.write ($out, newPriority_filter);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                priority_filter (newPriority_filter        );
            } finally {
                _releaseReply ($in);
            }
  } // priority_filter


  /**
         * A filter which if a non-nil reference will be consulted 
         * for resolving the priority of the event.
         */
  public CosNotifyFilter.MappingFilter lifetime_filter ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_lifetime_filter", true);
                $in = _invoke ($out);
                CosNotifyFilter.MappingFilter $result = CosNotifyFilter.MappingFilterHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return lifetime_filter (        );
            } finally {
                _releaseReply ($in);
            }
  } // lifetime_filter


  /**
         * A filter which if a non-nil reference will be consulted 
         * for resolving the priority of the event.
         */
  public void lifetime_filter (CosNotifyFilter.MappingFilter newLifetime_filter)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_set_lifetime_filter", true);
                CosNotifyFilter.MappingFilterHelper.write ($out, newLifetime_filter);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                lifetime_filter (newLifetime_filter        );
            } finally {
                _releaseReply ($in);
            }
  } // lifetime_filter


  /**
         * Get a list of event type names that this proxy can potentially
         * forward to its associated consumers.
         * @parm <code>mode</code> - The mode of type retrieval.
         * @returns A sequence of event type names.
         */
  public CosNotification.EventType[] obtain_offered_types (CosNotifyChannelAdmin.ObtainInfoMode mode)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("obtain_offered_types", true);
                CosNotifyChannelAdmin.ObtainInfoModeHelper.write ($out, mode);
                $in = _invoke ($out);
                CosNotification.EventType $result[] = CosNotification.EventTypeSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return obtain_offered_types (mode        );
            } finally {
                _releaseReply ($in);
            }
  } // obtain_offered_types


  /**
         * Validate whether or not this proxy can honour the specified 
         * quality of service requirements.
         * @parm <code>required_qos</code> - Quality of service name-value
         * pairs which a client is interested in validating.
         * @parm <code>available_qos</code> - Quality of service settings that
         * this proxy can support in addition to the ones in the input sequence.
         * @raises UnsupportedQoS If any of the quality of service settings
         * in the input sequence could not be honoured.
         */
  public void validate_event_qos (CosNotification.Property[] required_qos, CosNotification.NamedPropertyRangeSeqHolder available_qos) throws CosNotification.UnsupportedQoS
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("validate_event_qos", true);
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
                validate_event_qos (required_qos, available_qos        );
            } finally {
                _releaseReply ($in);
            }
  } // validate_event_qos


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
         * Disconnect this push supplier.
         */
  public void disconnect_sequence_push_supplier ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("disconnect_sequence_push_supplier", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                disconnect_sequence_push_supplier (        );
            } finally {
                _releaseReply ($in);
            }
  } // disconnect_sequence_push_supplier


  /**
         * Indicates that a consumer is changing the names of the types of
         * events it is subscribed to.
         * @parm <code>added</code> - The event types added.
         * @parm <code>removed</code> - The event types removed.
         * @raises InvalidEventType If any of the event type names in either 
         * the of the input sequences are invalid.
         */
  public void subscription_change (CosNotification.EventType[] added, CosNotification.EventType[] removed) throws CosNotifyComm.InvalidEventType
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("subscription_change", true);
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
                subscription_change (added, removed        );
            } finally {
                _releaseReply ($in);
            }
  } // subscription_change

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotifyChannelAdmin/SequenceProxyPushSupplier:1.0", 
    "IDL:omg.org/CosNotifyChannelAdmin/ProxySupplier:1.0", 
    "IDL:omg.org/CosNotification/QoSAdmin:1.0", 
    "IDL:omg.org/CosNotifyFilter/FilterAdmin:1.0", 
    "IDL:omg.org/CosNotifyComm/SequencePushSupplier:1.0", 
    "IDL:omg.org/CosNotifyComm/NotifySubscribe:1.0"};

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
} // class _SequenceProxyPushSupplierStub
