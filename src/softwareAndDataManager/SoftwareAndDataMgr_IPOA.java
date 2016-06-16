package softwareAndDataManager;


/**
* softwareAndDataManager/SoftwareAndDataMgr_IPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from softwareAndDataManager.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/


/**
   * <p>Managed Elements store configuration data and maintain this on a real 
   * time basis (the ME configuration data). This configuration data include 
   * service data, related to ports, facilities, cross connects etc. The format 
   * and structure of this data is proprietary in nature.</p>
   *
   * <p>Most service providers consider it important to take backup of this data 
   * periodically. This backup data can be archived outside of the ME and if 
   * necessary can be restored back onto the ME.</p>
   *
   * <p> The MTNM interface supports database backup on demand from the NMS. The 
   * storage of these backups is a local matter of the EMS and backup is not 
   * transferred across this interface to the NMS. The EMS may store more than 
   * one backup for each ME. How many backups are stored for each ME is a local 
   * matter of EMS (potentially configurable within the EMS). A new backup may 
   * override the oldest backup existing in the EMS.</p> 
   *
   * <p>To give an example, if an EMS is configured to store only 2 backups for 
   * each ME, the third backup will over-write the first backup (oldest).</p> 
   *
   * <p>Each backup is identified by the Managed Element Name and the Date and 
   * Time when the backup was taken by the EMS.</p>
   *
   * <p>The softwareAndDataManager is used to gain access to operations related 
   * to backing up ME configuration data.</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation in Manager.</p>
   **/
public abstract class SoftwareAndDataMgr_IPOA extends org.omg.PortableServer.Servant
 implements softwareAndDataManager.SoftwareAndDataMgr_IOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("backupME", new java.lang.Integer (0));
    _methods.put ("getMEBackupStatus", new java.lang.Integer (1));
    _methods.put ("abortMEBackup", new java.lang.Integer (2));
    _methods.put ("getBackupList", new java.lang.Integer (3));
    _methods.put ("setNativeEMSName", new java.lang.Integer (4));
    _methods.put ("setUserLabel", new java.lang.Integer (5));
    _methods.put ("setOwner", new java.lang.Integer (6));
    _methods.put ("getCapabilities", new java.lang.Integer (7));
    _methods.put ("setAdditionalInfo", new java.lang.Integer (8));
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
     * <p>This method will initiate a backup request on the specified ME. This is 
     * an asynchronous operation. The EMS will send the results of the backup 
     * operation for the Managed Element via the Notification Service. The NMS 
     * can get the status of any backup operation on-demand (see 
     * getMEBackupStatus() ).</p>
     * 
     * <br>  globaldefs::NamingAttributes_T managedElementName: The name of the 
     * ME for which a backup of configuration data is required.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when input parameter are syntactical 
     *  incorrect<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when the ME does not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when communication to the ME is lost<br>
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request,
     *  and cannot determine the reason it could not comply,
     *  it may raise this exception. <br>
     * <br>
     **/
       case 0:  // softwareAndDataManager/SoftwareAndDataMgr_I/backupME
       {
         try {
           globaldefs.NameAndStringValue_T managedElementName[] = globaldefs.NamingAttributes_THelper.read (in);
           this.backupME (managedElementName);
           out = $rh.createReply();
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This method can be used by the NMS to get the current backup status of 
     * an individual ME.</p>
     * 
     * <br> globaldefs::NamingAttributes_T managedElementName: The name of the 
     * ME for which a status of the backup of configuration data is required.
     * <br> BackupStatus_T  backupStatus: The status of the backup of 
     * configuration data.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INVALID_INPUT - Raised when input parameter are syntactical 
     *  incorrect<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when the ME does not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request,
     *  and cannot determine the reason it could not comply,
     *  it may raise this exception. <br>
     * <br>
     **/
       case 1:  // softwareAndDataManager/SoftwareAndDataMgr_I/getMEBackupStatus
       {
         try {
           globaldefs.NameAndStringValue_T managedElementName[] = globaldefs.NamingAttributes_THelper.read (in);
           softwareAndDataManager.BackupStatus_THolder backupStatus = new softwareAndDataManager.BackupStatus_THolder ();
           this.getMEBackupStatus (managedElementName, backupStatus);
           out = $rh.createReply();
           softwareAndDataManager.BackupStatus_THelper.write (out, backupStatus.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p> This method will abort a backup of ME configuration data that is 
     * pending or in progress. If there is no backup of configuration data of the ME 
     * pending or in progress an exception will be thrown.</p>
     * 
     * <br>  globaldefs::NamingAttributes_T managedElementName: The name of the 
     * ME for which the backup of configuration data is to be aborted.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INVALID_INPUT - Raised when input parameter are syntactical 
     *  incorrect<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when the ME does not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when communication to the ME is lost<br>
     * EXCPT_NOT_IN_VALID_STATE - Raised when there is no pending/in progress 
     *  backup of configuration data on the named ME.<BR>
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request,
     *  and cannot determine the reason it could not comply,
     *  it may raise this exception. <br>
     * <br>
     **/
       case 2:  // softwareAndDataManager/SoftwareAndDataMgr_I/abortMEBackup
       {
         try {
           globaldefs.NameAndStringValue_T managedElementName[] = globaldefs.NamingAttributes_THelper.read (in);
           this.abortMEBackup (managedElementName);
           out = $rh.createReply();
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>The NMS will invoke this method to determine what configuration data 
     * backups exist in the EMS for a specified list of MEs.</p>
     *
     * <p>This method will return the list of the ids of all configuration data 
     * backups for specified MEs. If the list of MEs in the request is empty, the 
     * ids of all configuration data backups will be returned for all MEs.</p>
     * 
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     * 
     * <br>  globaldefs::NamingAttributesList_T managedElementNameList: The list 
     * of names of the MEs for which the ids of the conconfiguration data should 
     * be returned. If one or more of the MEs do not exist the operation will be 
     * aborted.
     * <br>  unsigned long how_many: Maximum number of configuration data backup 
     * ids to report in the first batch.
     * <br>  BackupIdList_T backupList: First batch of configuration data backup 
     * ids.
     * <br>  BackupIdIterator_I backupIt: Iterator to retrieve the remaining 
     * configuration data backup ids.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when input parameter are syntactical 
     *  incorrect<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when one or more MEs in the list do not 
     *  exist<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached.<br>
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request,
     *  and cannot determine the reason it could not comply,
     *  it may raise this exception. <br>
     * <br>
     **/
       case 3:  // softwareAndDataManager/SoftwareAndDataMgr_I/getBackupList
       {
         try {
           globaldefs.NameAndStringValue_T managedElementNameList[][] = globaldefs.NamingAttributesList_THelper.read (in);
           int how_many = in.read_ulong ();
           softwareAndDataManager.BackupIdList_THolder backupList = new softwareAndDataManager.BackupIdList_THolder ();
           softwareAndDataManager.BackupIdIterator_IHolder backupIt = new softwareAndDataManager.BackupIdIterator_IHolder ();
           this.getBackupList (managedElementNameList, how_many, backupList, backupIt);
           out = $rh.createReply();
           softwareAndDataManager.BackupIdList_THelper.write (out, backupList.value);
           softwareAndDataManager.BackupIdIterator_IHelper.write (out, backupIt.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>The nativeEMSName is owned by the EMS.  It represents how an EMS user 
     * addresses an object on the EMS GUI.  The EMS may or may not support 
     * changing this value.</p>
     *
     * <p>When an object is created by the EMS, the EMS selects the nativeEMSName 
     * for the object.</p>
     *
     * <p>When an object is created by an NMS, the NMS specifies the userLabel for  
     * the object. If the EMS supports setting of nativeEMSNames, the 
     * nativeEMSName should be set to the same value as the userLabel.  If the EMS 
     * does not support setting of nativeEMSNames, or if the nativeEMSName has 
     * constraints that the userLabel does not satisfy, the EMS selects the 
     * nativeEMSName for the object.</p>
     *
     * <p>After an object has been created, the nativeEMSName may be changed by 
     * the NMS, if the EMS supports this functionality, using the setNativeEMSName 
     * operation.</p>
     *
     * <br> globaldefs::NamingAttributes_T objectName
     * <br> string nativeEMSName
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - If EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when objectName is incorrectly formed<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when objectName references object which 
     *  does not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised when the nativeEMSName can not be set for 
     *  the specified object<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is lost
     * <br>
     **/
       case 4:  // common/Common_I/setNativeEMSName
       {
         try {
           globaldefs.NameAndStringValue_T objectName[] = globaldefs.NamingAttributes_THelper.read (in);
           String nativeEMSName = in.read_string ();
           this.setNativeEMSName (objectName, nativeEMSName);
           out = $rh.createReply();
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>The userLabel is owned by the NMSes.  It is a string assigned by an NMS 
     * to an object. The difference between the userLabel and the NamingAttributes 
     * name is that the userLabel is an attribute of the objects that 
     * may be "set" by the NMS through well defined interfaces (setUserLabel).</p>
     *
     * <p>When an object is created by an NMS, the NMS specifies the userLabel for 
     * the object.</p>
     *
     * <p>When an object is created by the EMS, the EMS sets the userLabel to the 
     * nativeEMSName.</p>
     *
     * <p>Once an object is created, the userLabel may only be changed by an NMS 
     * through the setUserLabel operation.</p>
     *
     * <br> globaldefs::NamingAttributes_T objectName: Name of the object for 
     *  which to change the userLabel.
     * <br> string userLabel: New user label to assign to the object
     * <br> boolean enforceUniqueness: Specifies whether or not userLabel should 
     * be checked for uniqueness amongst objects of the same class within the EMS.  
     * If true, then the operation will fail if userLabel is already in use.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - If EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when objectName is incorrectly formed<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when objectName references object which 
     *  does not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised when the userLabel can not be set for the 
     *  specified object<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost<br>
     * EXCPT_USERLABEL_IN_USE - Raised when the userLabel uniqueness constraint is 
     *  not met<br>
     * <br>
     **/
       case 5:  // common/Common_I/setUserLabel
       {
         try {
           globaldefs.NameAndStringValue_T objectName[] = globaldefs.NamingAttributes_THelper.read (in);
           String userLabel = in.read_string ();
           boolean enforceUniqueness = in.read_boolean ();
           this.setUserLabel (objectName, userLabel, enforceUniqueness);
           out = $rh.createReply();
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /** 
     * <p>This service sets the owner attribute of the specified object.</p>
     *
     * <br> globaldefs::NamingAttributes_T objectName
     * <br> string owner
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - If EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when objectName is incorrectly formed<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when objectName references an object
     *  that does not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised when the owner can not be set for the 
     *  specified object<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost<br>
     * <br>
     **/
       case 6:  // common/Common_I/setOwner
       {
         try {
           globaldefs.NameAndStringValue_T objectName[] = globaldefs.NamingAttributes_THelper.read (in);
           String owner = in.read_string ();
           this.setOwner (objectName, owner);
           out = $rh.createReply();
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /** 
     * <p>This service retrieves the capabilities of the manager.
     * All non-specified capabilities are assumed to be unsupported.</p>
     *
     * <br> CapabilityList_T capabilities
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of a non-specific EMS internal 
     *  failure<br>
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request, and cannot determine the reason it could not comply, it may raise this exception. <br>
     **/
       case 7:  // common/Common_I/getCapabilities
       {
         try {
           common.CapabilityList_THolder capabilities = new common.CapabilityList_THolder ();
           this.getCapabilities (capabilities);
           out = $rh.createReply();
           common.CapabilityList_THelper.write (out, capabilities.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This service sets the additional info attribute
     * of the object identified by objectName. This operation should be used
     * to set both vendor specific attributes as well as the attributes that
     * are formally defined in this interface specification. See <a 
     * href=../../../supportingDocumentation/SD1-1_AdditionalInfoUsage.pdf >SD1-1 
     * Additional Information Usage</a> for further details.</p>
     *
     * <p>As an input only the list of parameters to be changed, removed, or
     * added shall be provided.  If an entry is to be removed, "-" shall
     * be specified as a value.  If a parameter is specified that is currently
     * not part of the additionalInfo attribute of the specified object
     * that parameter is added by the EMS with the specified value.
     * The EMS may reject removal and addition requests, however.</p>
     *
     * <p> The operation is best effort (except where specified otherwise for a 
     * particular parameter).  The output specifies the
     * values which were actually set.</p>
     *
     * <br> globaldefs::NamingAttributes_T objectName: the managed object
     * whose additional info parameters are intended to get modified
     *
     * <br> globaldefs::NVSList_T additionalInfo: list of parameters
     * to be changed, added, or removed (input), updated to provide the
     * actually changed or added parameters (output)
     *
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this
     *  service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal
     *  failure (see errorReason attribute of ProcessingFailureException())<br>
     * EXCPT_INVALID_INPUT - Raised when objectName is incorrectly formed,
     *  raised when an input parameter is syntactical incorrect and raised when a 
     *  parameter is identified as only "settable" using a "specific operation" in 
     *  the <a href=../../../supportingDocumentation/SD1-1_AdditionalInfoUsage.pdf >SD1-1 
     *  Additional Information Usage</a> document<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when objectName references an object
     *  that does not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when the communication to the managed
     *  element containing or hosting objectName is lost<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised when the EMS is unable 
     *  to execute the request because at least one of the parameters although 
     *  valid can not be set and that parameter is identified as "not best effort" 
     *  in the <a href=../../../supportingDocumentation/SD1-1_AdditionalInfoUsage.pdf >SD1-1 
     *  Additional Information Usage</a> document)<br>
     * <br>
  
     **/
       case 8:  // common/Common_I/setAdditionalInfo
       {
         try {
           globaldefs.NameAndStringValue_T objectName[] = globaldefs.NamingAttributes_THelper.read (in);
           globaldefs.NVSList_THolder additionalInfo = new globaldefs.NVSList_THolder ();
           additionalInfo.value = globaldefs.NVSList_THelper.read (in);
           this.setAdditionalInfo (objectName, additionalInfo);
           out = $rh.createReply();
           globaldefs.NVSList_THelper.write (out, additionalInfo.value);
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
    "IDL:mtnm.tmforum.org/softwareAndDataManager/SoftwareAndDataMgr_I:1.0", 
    "IDL:mtnm.tmforum.org/common/Common_I:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public SoftwareAndDataMgr_I _this() 
  {
    return SoftwareAndDataMgr_IHelper.narrow(
    super._this_object());
  }

  public SoftwareAndDataMgr_I _this(org.omg.CORBA.ORB orb) 
  {
    return SoftwareAndDataMgr_IHelper.narrow(
    super._this_object(orb));
  }


} // class SoftwareAndDataMgr_IPOA