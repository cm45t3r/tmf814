package performance;


/**
* performance/PerformanceManagementMgr_I.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from performance.idl
* Wednesday, June 15, 2016 7:24:40 PM COT
*/


/**
   * <p>The PerformanceManagementMgr_I is used to gain access to operations
   * which deal with performance Monitoring</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation in 
   * managerInterface when the managerName "PerformanceManagement" is used.</p>
   **/
public interface PerformanceManagementMgr_I extends PerformanceManagementMgr_IOperations, common.Common_I, org.omg.CORBA.portable.IDLEntity 
{
} // interface PerformanceManagementMgr_I
