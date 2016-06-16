package maintenanceOps;


/**
* maintenanceOps/MaintenanceMgr_I.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from maintenanceOps.idl
* Wednesday, June 15, 2016 7:24:37 PM COT
*/


/**
   * <p>The MaintenanceMgr_I is used as a handle to gain access to the
   * maintenance operation functionalities of the NML-EML interface.</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation in the managerInterface 
   * parameter when the managerName "Maintenance" is used.</p>
   **/
public interface MaintenanceMgr_I extends MaintenanceMgr_IOperations, common.Common_I, org.omg.CORBA.portable.IDLEntity 
{
} // interface MaintenanceMgr_I
