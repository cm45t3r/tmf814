package DsLogAdmin;


/**
* DsLogAdmin/_BasicLogStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/

public class _BasicLogStub extends org.omg.CORBA.portable.ObjectImpl implements DsLogAdmin.BasicLog
{

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

  public DsLogAdmin.LogMgr my_factory ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("my_factory", true);
                $in = _invoke ($out);
                DsLogAdmin.LogMgr $result = DsLogAdmin.LogMgrHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return my_factory (        );
            } finally {
                _releaseReply ($in);
            }
  } // my_factory

  public int id ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("id", true);
                $in = _invoke ($out);
                int $result = DsLogAdmin.LogIdHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return id (        );
            } finally {
                _releaseReply ($in);
            }
  } // id

  public short[] get_log_qos ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_log_qos", true);
                $in = _invoke ($out);
                short $result[] = DsLogAdmin.QoSListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_log_qos (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_log_qos

  public void set_log_qos (short[] qos) throws DsLogAdmin.UnsupportedQoS
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("set_log_qos", true);
                DsLogAdmin.QoSListHelper.write ($out, qos);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/DsLogAdmin/UnsupportedQoS:1.0"))
                    throw DsLogAdmin.UnsupportedQoSHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                set_log_qos (qos        );
            } finally {
                _releaseReply ($in);
            }
  } // set_log_qos


  // life in seconds (0 infinite)
  public int get_max_record_life ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_max_record_life", true);
                $in = _invoke ($out);
                int $result = $in.read_ulong ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_max_record_life (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_max_record_life

  public void set_max_record_life (int life)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("set_max_record_life", true);
                $out.write_ulong (life);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                set_max_record_life (life        );
            } finally {
                _releaseReply ($in);
            }
  } // set_max_record_life


  // size in octets
  public long get_max_size ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_max_size", true);
                $in = _invoke ($out);
                long $result = $in.read_ulonglong ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_max_size (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_max_size

  public void set_max_size (long size) throws DsLogAdmin.InvalidParam
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("set_max_size", true);
                $out.write_ulonglong (size);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/DsLogAdmin/InvalidParam:1.0"))
                    throw DsLogAdmin.InvalidParamHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                set_max_size (size        );
            } finally {
                _releaseReply ($in);
            }
  } // set_max_size

  public long get_current_size ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_current_size", true);
                $in = _invoke ($out);
                long $result = $in.read_ulonglong ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_current_size (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_current_size


  // size in octets
  public long get_n_records ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_n_records", true);
                $in = _invoke ($out);
                long $result = $in.read_ulonglong ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_n_records (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_n_records


  // number of records
  public short get_log_full_action ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_log_full_action", true);
                $in = _invoke ($out);
                short $result = DsLogAdmin.LogFullActionTypeHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_log_full_action (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_log_full_action

  public void set_log_full_action (short action) throws DsLogAdmin.InvalidLogFullAction
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("set_log_full_action", true);
                DsLogAdmin.LogFullActionTypeHelper.write ($out, action);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/DsLogAdmin/InvalidLogFullAction:1.0"))
                    throw DsLogAdmin.InvalidLogFullActionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                set_log_full_action (action        );
            } finally {
                _releaseReply ($in);
            }
  } // set_log_full_action

  public DsLogAdmin.AdministrativeState get_administrative_state ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_administrative_state", true);
                $in = _invoke ($out);
                DsLogAdmin.AdministrativeState $result = DsLogAdmin.AdministrativeStateHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_administrative_state (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_administrative_state

  public void set_administrative_state (DsLogAdmin.AdministrativeState state)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("set_administrative_state", true);
                DsLogAdmin.AdministrativeStateHelper.write ($out, state);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                set_administrative_state (state        );
            } finally {
                _releaseReply ($in);
            }
  } // set_administrative_state

  public DsLogAdmin.ForwardingState get_forwarding_state ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_forwarding_state", true);
                $in = _invoke ($out);
                DsLogAdmin.ForwardingState $result = DsLogAdmin.ForwardingStateHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_forwarding_state (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_forwarding_state

  public void set_forwarding_state (DsLogAdmin.ForwardingState state)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("set_forwarding_state", true);
                DsLogAdmin.ForwardingStateHelper.write ($out, state);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                set_forwarding_state (state        );
            } finally {
                _releaseReply ($in);
            }
  } // set_forwarding_state

  public DsLogAdmin.OperationalState get_operational_state ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_operational_state", true);
                $in = _invoke ($out);
                DsLogAdmin.OperationalState $result = DsLogAdmin.OperationalStateHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_operational_state (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_operational_state


  // log duration
  public DsLogAdmin.TimeInterval get_interval ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_interval", true);
                $in = _invoke ($out);
                DsLogAdmin.TimeInterval $result = DsLogAdmin.TimeIntervalHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_interval (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_interval

  public void set_interval (DsLogAdmin.TimeInterval interval) throws DsLogAdmin.InvalidTime, DsLogAdmin.InvalidTimeInterval
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("set_interval", true);
                DsLogAdmin.TimeIntervalHelper.write ($out, interval);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/DsLogAdmin/InvalidTime:1.0"))
                    throw DsLogAdmin.InvalidTimeHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/DsLogAdmin/InvalidTimeInterval:1.0"))
                    throw DsLogAdmin.InvalidTimeIntervalHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                set_interval (interval        );
            } finally {
                _releaseReply ($in);
            }
  } // set_interval


  // availability status
  public DsLogAdmin.AvailabilityStatus get_availability_status ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_availability_status", true);
                $in = _invoke ($out);
                DsLogAdmin.AvailabilityStatus $result = DsLogAdmin.AvailabilityStatusHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_availability_status (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_availability_status


  // capacity alarm threshold
  public short[] get_capacity_alarm_thresholds ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_capacity_alarm_thresholds", true);
                $in = _invoke ($out);
                short $result[] = DsLogAdmin.CapacityAlarmThresholdListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_capacity_alarm_thresholds (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_capacity_alarm_thresholds

  public void set_capacity_alarm_thresholds (short[] threshs) throws DsLogAdmin.InvalidThreshold
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("set_capacity_alarm_thresholds", true);
                DsLogAdmin.CapacityAlarmThresholdListHelper.write ($out, threshs);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/DsLogAdmin/InvalidThreshold:1.0"))
                    throw DsLogAdmin.InvalidThresholdHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                set_capacity_alarm_thresholds (threshs        );
            } finally {
                _releaseReply ($in);
            }
  } // set_capacity_alarm_thresholds


  // weekly scheduling
  public DsLogAdmin.WeekMaskItem[] get_week_mask ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_week_mask", true);
                $in = _invoke ($out);
                DsLogAdmin.WeekMaskItem $result[] = DsLogAdmin.WeekMaskHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_week_mask (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_week_mask

  public void set_week_mask (DsLogAdmin.WeekMaskItem[] masks) throws DsLogAdmin.InvalidTime, DsLogAdmin.InvalidTimeInterval, DsLogAdmin.InvalidMask
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("set_week_mask", true);
                DsLogAdmin.WeekMaskHelper.write ($out, masks);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/DsLogAdmin/InvalidTime:1.0"))
                    throw DsLogAdmin.InvalidTimeHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/DsLogAdmin/InvalidTimeInterval:1.0"))
                    throw DsLogAdmin.InvalidTimeIntervalHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/DsLogAdmin/InvalidMask:1.0"))
                    throw DsLogAdmin.InvalidMaskHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                set_week_mask (masks        );
            } finally {
                _releaseReply ($in);
            }
  } // set_week_mask

  public DsLogAdmin.LogRecord[] query (String grammar, String c, DsLogAdmin.IteratorHolder i) throws DsLogAdmin.InvalidGrammar, DsLogAdmin.InvalidConstraint
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("query", true);
                $out.write_string (grammar);
                DsLogAdmin.ConstraintHelper.write ($out, c);
                $in = _invoke ($out);
                DsLogAdmin.LogRecord $result[] = DsLogAdmin.RecordListHelper.read ($in);
                i.value = DsLogAdmin.IteratorHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/DsLogAdmin/InvalidGrammar:1.0"))
                    throw DsLogAdmin.InvalidGrammarHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/DsLogAdmin/InvalidConstraint:1.0"))
                    throw DsLogAdmin.InvalidConstraintHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return query (grammar, c, i        );
            } finally {
                _releaseReply ($in);
            }
  } // query


  // negative how_many indicates backwards retrieval
  public DsLogAdmin.LogRecord[] retrieve (long from_time, int how_many, DsLogAdmin.IteratorHolder i)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("retrieve", true);
                DsLogAdmin.TimeTHelper.write ($out, from_time);
                $out.write_long (how_many);
                $in = _invoke ($out);
                DsLogAdmin.LogRecord $result[] = DsLogAdmin.RecordListHelper.read ($in);
                i.value = DsLogAdmin.IteratorHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return retrieve (from_time, how_many, i        );
            } finally {
                _releaseReply ($in);
            }
  } // retrieve


  // returns number of records matching constraint
  public int match (String grammar, String c) throws DsLogAdmin.InvalidGrammar, DsLogAdmin.InvalidConstraint
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("match", true);
                $out.write_string (grammar);
                DsLogAdmin.ConstraintHelper.write ($out, c);
                $in = _invoke ($out);
                int $result = $in.read_ulong ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/DsLogAdmin/InvalidGrammar:1.0"))
                    throw DsLogAdmin.InvalidGrammarHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/DsLogAdmin/InvalidConstraint:1.0"))
                    throw DsLogAdmin.InvalidConstraintHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return match (grammar, c        );
            } finally {
                _releaseReply ($in);
            }
  } // match


  // returns number of records deleted
  public int delete_records (String grammar, String c) throws DsLogAdmin.InvalidGrammar, DsLogAdmin.InvalidConstraint
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("delete_records", true);
                $out.write_string (grammar);
                DsLogAdmin.ConstraintHelper.write ($out, c);
                $in = _invoke ($out);
                int $result = $in.read_ulong ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/DsLogAdmin/InvalidGrammar:1.0"))
                    throw DsLogAdmin.InvalidGrammarHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/DsLogAdmin/InvalidConstraint:1.0"))
                    throw DsLogAdmin.InvalidConstraintHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return delete_records (grammar, c        );
            } finally {
                _releaseReply ($in);
            }
  } // delete_records

  public int delete_records_by_id (long[] ids)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("delete_records_by_id", true);
                DsLogAdmin.RecordIdListHelper.write ($out, ids);
                $in = _invoke ($out);
                int $result = $in.read_ulong ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return delete_records_by_id (ids        );
            } finally {
                _releaseReply ($in);
            }
  } // delete_records_by_id

  public void write_records (org.omg.CORBA.Any[] records) throws DsLogAdmin.LogFull, DsLogAdmin.LogOffDuty, DsLogAdmin.LogLocked, DsLogAdmin.LogDisabled
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("write_records", true);
                DsLogAdmin.AnysHelper.write ($out, records);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/DsLogAdmin/LogFull:1.0"))
                    throw DsLogAdmin.LogFullHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/DsLogAdmin/LogOffDuty:1.0"))
                    throw DsLogAdmin.LogOffDutyHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/DsLogAdmin/LogLocked:1.0"))
                    throw DsLogAdmin.LogLockedHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/DsLogAdmin/LogDisabled:1.0"))
                    throw DsLogAdmin.LogDisabledHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                write_records (records        );
            } finally {
                _releaseReply ($in);
            }
  } // write_records


  // set single record attributes
  public void set_record_attribute (long id, DsLogAdmin.NVPair[] attr_list) throws DsLogAdmin.InvalidRecordId, DsLogAdmin.InvalidAttribute
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("set_record_attribute", true);
                DsLogAdmin.RecordIdHelper.write ($out, id);
                DsLogAdmin.NVListHelper.write ($out, attr_list);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/DsLogAdmin/InvalidRecordId:1.0"))
                    throw DsLogAdmin.InvalidRecordIdHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/DsLogAdmin/InvalidAttribute:1.0"))
                    throw DsLogAdmin.InvalidAttributeHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                set_record_attribute (id, attr_list        );
            } finally {
                _releaseReply ($in);
            }
  } // set_record_attribute


  // returns number of records whose attributes have been set
  public int set_records_attribute (String grammar, String c, DsLogAdmin.NVPair[] attr_list) throws DsLogAdmin.InvalidGrammar, DsLogAdmin.InvalidConstraint, DsLogAdmin.InvalidAttribute
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("set_records_attribute", true);
                $out.write_string (grammar);
                DsLogAdmin.ConstraintHelper.write ($out, c);
                DsLogAdmin.NVListHelper.write ($out, attr_list);
                $in = _invoke ($out);
                int $result = $in.read_ulong ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/DsLogAdmin/InvalidGrammar:1.0"))
                    throw DsLogAdmin.InvalidGrammarHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/DsLogAdmin/InvalidConstraint:1.0"))
                    throw DsLogAdmin.InvalidConstraintHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/DsLogAdmin/InvalidAttribute:1.0"))
                    throw DsLogAdmin.InvalidAttributeHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return set_records_attribute (grammar, c, attr_list        );
            } finally {
                _releaseReply ($in);
            }
  } // set_records_attribute


  // get record attributes
  public DsLogAdmin.NVPair[] get_record_attribute (long id) throws DsLogAdmin.InvalidRecordId
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_record_attribute", true);
                DsLogAdmin.RecordIdHelper.write ($out, id);
                $in = _invoke ($out);
                DsLogAdmin.NVPair $result[] = DsLogAdmin.NVListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/DsLogAdmin/InvalidRecordId:1.0"))
                    throw DsLogAdmin.InvalidRecordIdHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_record_attribute (id        );
            } finally {
                _releaseReply ($in);
            }
  } // get_record_attribute

  public DsLogAdmin.Log copy (org.omg.CORBA.IntHolder id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("copy", true);
                $in = _invoke ($out);
                DsLogAdmin.Log $result = DsLogAdmin.LogHelper.read ($in);
                id.value = DsLogAdmin.LogIdHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return copy (id        );
            } finally {
                _releaseReply ($in);
            }
  } // copy

  public DsLogAdmin.Log copy_with_id (int id) throws DsLogAdmin.LogIdAlreadyExists
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("copy_with_id", true);
                DsLogAdmin.LogIdHelper.write ($out, id);
                $in = _invoke ($out);
                DsLogAdmin.Log $result = DsLogAdmin.LogHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/DsLogAdmin/LogIdAlreadyExists:1.0"))
                    throw DsLogAdmin.LogIdAlreadyExistsHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return copy_with_id (id        );
            } finally {
                _releaseReply ($in);
            }
  } // copy_with_id

  public void flush () throws DsLogAdmin.UnsupportedQoS
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("flush", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/DsLogAdmin/UnsupportedQoS:1.0"))
                    throw DsLogAdmin.UnsupportedQoSHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                flush (        );
            } finally {
                _releaseReply ($in);
            }
  } // flush

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/DsLogAdmin/BasicLog:1.0", 
    "IDL:omg.org/DsLogAdmin/Log:1.0"};

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
} // class _BasicLogStub
