package softwareAndDataManager;

/**
* softwareAndDataManager/SoftwareAndDataMgr_IHolder.java .
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
public final class SoftwareAndDataMgr_IHolder implements org.omg.CORBA.portable.Streamable
{
  public softwareAndDataManager.SoftwareAndDataMgr_I value = null;

  public SoftwareAndDataMgr_IHolder ()
  {
  }

  public SoftwareAndDataMgr_IHolder (softwareAndDataManager.SoftwareAndDataMgr_I initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = softwareAndDataManager.SoftwareAndDataMgr_IHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    softwareAndDataManager.SoftwareAndDataMgr_IHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return softwareAndDataManager.SoftwareAndDataMgr_IHelper.type ();
  }

}
