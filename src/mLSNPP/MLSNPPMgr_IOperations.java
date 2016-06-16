package mLSNPP;


/**
* mLSNPP/MLSNPPMgr_IOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from mLSNPP.idl
* Wednesday, June 15, 2016 7:24:38 PM COT
*/


/**
   * <p>The mLSNPPMgr_I is used to gain access to MLSNPP and
   * their operations.</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation in Manager.</p>
   **/
public interface MLSNPPMgr_IOperations  extends common.Common_IOperations
{

  /** <p>This service returns an MLSNPP given its name.</p>
     *
     * <br>globaldefs::NamingAttributes_T mLSNPPName: The name of the MLSNPP
     * to retrieve.
     * <br>MLSNPP_T theMLSNPP: The MLSNPP returned.
     *
    * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is
     *  syntactically incorrect<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when any of the input parameters references
     *  an object that does not exist<br>
     * EXCPT_NE_COMM_LOSS - The EMS is unable to communicate with the Control
     *  Plane and communication is required to complete the request<br>
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request, 
     * and cannot determine the reason it could not comply, 
     * it may raise this exception. <br>
     **/
  void getMLSNPP (globaldefs.NameAndStringValue_T[] mLSNPPName, mLSNPP.MultiLayerSNPP_THolder theMLSNPP) throws globaldefs.ProcessingFailureException;

  /** 
     * <p>This operation allows the NMS requests the EMS to assign a TNA Name(s) 
     * to one or more components of a specified MLSNPP. 
     * This operation also allows the unsetting of TNANames by providing an empty
     * value in the TNA Names. The TNA Names assigned by this operation will
     * overwrite existing TNA Names.</p>
     * <br>globaldefs::NamingAttributes_T <b>mLSNPPName</b>: The name of the MLSNPP.
     * <br>mLSNPP::SNPTNAList_T sNPTNAList: The List of SNP Ids and the
     * corresponding TNA Names to be set. 
     *
     * <br>mLSNPP::SNPPTNAPairList_T <b>sNPPTNAPairList</b>: The List of SNPP Ids and the corresponding
     * TNA Names. 
     * <br>string <b>tNAName</b>: The TNAName to be assigned to the MLSNPP.
     * <br>string <b>tNAGroupName</b>: The TNAGroupName to be assigned to the MLSNPP.
     * <br> MLSNPP_T <b>mLSNPP</b>: The MLSNPP with TNAs set.
     *
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactical 
     *  incorrect (e.g. mLSNPPName does not refer to an MLSNPP object,
     *  or TNA is not valid).<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when mLSNPPName references an object
     *  that does not exist<br>
     * EXCPT_NE_COMM_LOSS - The EMS is unable to communicate with the Control
     *  Plane and communication is required to complete the request<br>
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request, 
     * and cannot determine the reason it could not comply, 
     * it may raise this exception. <br>
     **/
  void setTNANameForMLSNPP (globaldefs.NameAndStringValue_T[] mLSNPPName, mLSNPP.SNPTNAData_T[] sNPTNADataList, mLSNPP.SNPPTNAPair_T[] sNPPTNAPairList, String tNAName, String tNAGroupName, mLSNPP.MultiLayerSNPP_THolder mLSNPP) throws globaldefs.ProcessingFailureException;
} // interface MLSNPPMgr_IOperations
