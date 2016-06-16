package trafficConditioningProfile;


/**
* trafficConditioningProfile/TCProfileMgr_IOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from trafficConditioningProfile.idl
* Wednesday, June 15, 2016 7:24:43 PM COT
*/


/**
   * <p>The TC Profile Manager is used to gain access to operations
   * that deal with Traffic Conditioning Profile.</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager()  operation in Manager.</p>
   **/
public interface TCProfileMgr_IOperations  extends common.Common_IOperations
{

  /**
     * <p>This allows an NMS to request all of the TC Profiles that
     * are under the control of the TCProfileMgr_I.</p>
     * 
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     * 
     * <br>unsigned long how_many: number of iterators to return in 
     * tcProfileList.
     * <br>trafficConditioningProfile::TCProfileList 
     * tcProfileList: the first batch of iterators.
     * <br>trafficConditioningProfile::TCProfileIterator_I 
     * tcProfileIt: the iterator used to access the remaining TC 
     * Profiles.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators
     *  that the EMS can support has been reached<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request,
     *  and cannot determine the reason it could not comply,
     *  it may raise this exception. <br>
     * <br>
     **/
  void getAllTCProfiles (int how_many, trafficConditioningProfile.TCProfileList_THolder tcProfileList, trafficConditioningProfile.TCProfileIterator_IHolder tcProfileIt) throws globaldefs.ProcessingFailureException;

  /** 
     * <p>This service returns the Traffic Conditioning Profile struct for the given 
     * tcProfileName. The Traffic Conditioning Profile structure contains an NVSList of 
     * traffic parameters.  The traffic parameters returned will be the parameters
     * in place on the actual Traffic Conditioning Profile.  If there are no
     * traffic parameters, then the NVSList will be empty.</p>
     * <br>globaldefs::NamingAttributes_T tcProfileName: name of the TC 
     * Profile.
     * <br>TCProfile_T tcProfile : the returned Traffic Conditioning Profile.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when tcProfileName does not reference 
     *  a TC Profile object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when tcProfileName references object which does 
     *  not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost<br>
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request,
     *  and cannot determine the reason it could not comply,
     *  it may raise this exception. <br>
     * <br>
     **/
  void getTCProfile (globaldefs.NameAndStringValue_T[] tcProfileName, trafficConditioningProfile.TCProfile_THolder tcProfile) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This allows an NMS to request all of the TPs associated with the  
     * specified TC Profile. If there are no TPs which are 
     * associated with the specified TC Profile, then an empty list 
     * is returned. </p>
     * 
     * <p>In order to allow the NMS to deal with a large number of objects
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     * 
     * <br>globaldefs::NamingAttributes_T tcProfileName: the name of 
     * the TC Profile.
     * <br>unsigned long how_many: maximum number of TPs to return in the 
     * first batch.
     * <br>terminationPoint::TerminationPointList_T tpList: first batch of 
     * TPs.
     * <br>terminationPoint::TerminationPointIterator_I tpIt: iterator to 
     * access the remaining TPs.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when tcProfileName does not 
     *  reference a Transmission Descriptor object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when tcProfileName references
     *  an object that does not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators
     *  that the EMS can support has been reached<br>
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request,
     *  and cannot determine the reason it could not comply,
     *  it may raise this exception. <br>
     * <br>
     **/
  void getTCProfileAssociatedTPs (globaldefs.NameAndStringValue_T[] tcProfileName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;

  /**
     * <p>The createTCProfile operation is used to create
     * a new Traffic Conditioning Profile on the server. A Traffic Conditioning Profile 
     * Create Data structure, representing the new Traffic Conditioning Profile, is 
     * passed as input. The resulting Traffic Conditioning Profile is 
     * returned as a result.</p>
     *
     * <br>TCProfileCreateData_T newTCProfileCreateData: information about the TC 
     * Profile to be created.
     * <br>TCProfile_T newTCProfile: result of the 
     * creation.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS does not support creation of TC Profiles via 
     *  this interface<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised if newTCProfileCreateData contains invalid data<br>
     * EXCPT_USERLABEL_IN_USE - Raised when the userLabel uniqueness constraint is 
     *  not met<br>
     * EXCPT_CAPACITY_EXCEEDED - Raised when maximum number of TC 
     *  Profiles has been reached<br>
     * EXCPT_NE_COMM_LOSS - Raised when communication is lost to a managed element 
     * involved in this operation <br>
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request,
     *  and cannot determine the reason it could not comply,
     *  it may raise this exception. <br>
     * <br>
     **/
  void createTCProfile (trafficConditioningProfile.TCProfileCreateData_T newTCProfileCreateData, trafficConditioningProfile.TCProfile_THolder newTCProfile) throws globaldefs.ProcessingFailureException;

  /**
     * <p>The delete Traffic Conditioning Profile operation is used to 
     * delete a Traffic Conditioning Profile on the server. This operation is
     * idempotent. If the service is called with the
     * name of a non-existent Traffic Conditioning Profile, it will succeed.</p>
     *
     * <br>globaldefs::NamingAttributes_T tcProfileName: 
     *  The name of the Traffic Conditioning profile to be deleted.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS does not support deletion of TC Profiles via 
     *  this interface<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_OBJECT_IN_USE - Raised if there are TPs that are using
     *  the Traffic Conditioning Profile<br>
     * EXCPT_INVALID_INPUT - Raised when input parameter is syntactical incorrect.
     * EXCPT_NE_COMM_LOSS - Raised when communication is lost to a managed element 
     * involved in this operation
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request,
     *  and cannot determine the reason it could not comply,
     *  it may raise this exception. <br>
     * <br>
    **/
  void deleteTCProfile (globaldefs.NameAndStringValue_T[] tcProfileName) throws globaldefs.ProcessingFailureException;

  /**
     * <p>The NMS invokes the modifyTCProfile service to request from the EMS to modify an 
     * existing Traffic Conditioning Profile as specified by the parameters passed in the method.</p>
     * A Traffic Conditioning Profile 
     * Modify Data structure, representing the data to be changed, is 
     * passed as input. The resulting Traffic Conditioning Profile is 
     * returned as a result.</p>
     *
     * <br>globaldefs::NamingAttributes_T tcProfileName: 
     *  The name of the Traffic Conditioning profile to be modified.
     *
     * <br>TCProfileCreateData_T tcProfileModifyData: TC 
     * Profile data to be changed.
     *
     * <br>TPDataList_T tpsToModify: The TPs to be modified. 
     * The modified TPs are returned.
     *
     * <br>TCProfile_T modifiedTCProfile: the modified TC Profile. <br>
     *   
     * <br>string errorReason: In case a "best effort" parameter could not be set   
     * an indication of the fault reason is provided by the EMS
     *   
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS does not support modification of TC Profiles via 
     *  this interface<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised if tcProfileName or tcProfileModifyData contains invalid data<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when the Traffic Conditioning Profile to be modified does not exist.<br>
     * EXCPT_USERLABEL_IN_USE - Raised when the userLabel uniqueness constraint is 
     *  not met<br>
     * EXCPT_NE_COMM_LOSS - Raised when communication is lost to a managed element involved in this operation.
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request,
     *  and cannot determine the reason it could not comply,
     *  it may raise this exception. <br>
     * <br>
     **/
  void modifyTCProfile (globaldefs.NameAndStringValue_T[] tcProfileName, trafficConditioningProfile.TCProfileCreateData_T tcProfileModifyData, subnetworkConnection.TPDataList_THolder tpsToModify, trafficConditioningProfile.TCProfile_THolder modifiedTCProfile, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
} // interface TCProfileMgr_IOperations
