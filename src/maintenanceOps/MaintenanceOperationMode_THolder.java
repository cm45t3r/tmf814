package maintenanceOps;

/**
* maintenanceOps/MaintenanceOperationMode_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from maintenanceOps.idl
* Wednesday, June 15, 2016 7:24:37 PM COT
*/


/**
   * <p>Describes the mode of the operation, i.e. operate the maintenance
   * operation or release the maintenance operation.</p>
   **/
public final class MaintenanceOperationMode_THolder implements org.omg.CORBA.portable.Streamable
{
  public maintenanceOps.MaintenanceOperationMode_T value = null;

  public MaintenanceOperationMode_THolder ()
  {
  }

  public MaintenanceOperationMode_THolder (maintenanceOps.MaintenanceOperationMode_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = maintenanceOps.MaintenanceOperationMode_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    maintenanceOps.MaintenanceOperationMode_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return maintenanceOps.MaintenanceOperationMode_THelper.type ();
  }

}
