package softwareAndDataManager;


/**
* softwareAndDataManager/BackupStatus_T.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from softwareAndDataManager.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/

public final class BackupStatus_T implements org.omg.CORBA.portable.IDLEntity
{
  public softwareAndDataManager.Current_OperationStatus_T opStatus = null;
  public String failureReason = null;

  public BackupStatus_T ()
  {
  } // ctor

  public BackupStatus_T (softwareAndDataManager.Current_OperationStatus_T _opStatus, String _failureReason)
  {
    opStatus = _opStatus;
    failureReason = _failureReason;
  } // ctor

} // class BackupStatus_T
