package softwareAndDataManager;


/**
* softwareAndDataManager/BackupIdList_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from softwareAndDataManager.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/


/**
   * <p>This is a list of Database backups.</p>
   **/
public final class BackupIdList_THolder implements org.omg.CORBA.portable.Streamable
{
  public softwareAndDataManager.BackupId_T value[] = null;

  public BackupIdList_THolder ()
  {
  }

  public BackupIdList_THolder (softwareAndDataManager.BackupId_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = softwareAndDataManager.BackupIdList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    softwareAndDataManager.BackupIdList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return softwareAndDataManager.BackupIdList_THelper.type ();
  }

}
