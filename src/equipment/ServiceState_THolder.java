package equipment;

/**
* equipment/ServiceState_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from equipment.idl
* Wednesday, June 15, 2016 7:24:35 PM COT
*/


/**
   * <p>Basic administration state equipment objects.</p>
   * <p>It has the following values:<br>
   * IN_SERVICE means the entity has been put into operation and is operating as 
   * provisioned (completely or partially).<br>
   * OUT_OF_SERVICE means the entity is entirely not capable of performing its 
   * provisioned functions and is not restricted by administrative actions.<br>
   * OUT_OF_SERVICE_BY_MAINTENANCE means that the entity has been taken 
   * intentionally out of service by a management action.<br>
   * SERV_NA means that the service state is not applicable.<br></p>
   **/
public final class ServiceState_THolder implements org.omg.CORBA.portable.Streamable
{
  public equipment.ServiceState_T value = null;

  public ServiceState_THolder ()
  {
  }

  public ServiceState_THolder (equipment.ServiceState_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = equipment.ServiceState_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    equipment.ServiceState_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return equipment.ServiceState_THelper.type ();
  }

}
