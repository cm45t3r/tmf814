package subnetworkConnection;


/**
* subnetworkConnection/RouteNameAndAdminState_T.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from subnetworkConnection.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/

public final class RouteNameAndAdminState_T implements org.omg.CORBA.portable.IDLEntity
{
  public String id = null;
  public String administrativeState = null;
  public globaldefs.NameAndStringValue_T additionalInfo[] = null;

  public RouteNameAndAdminState_T ()
  {
  } // ctor

  public RouteNameAndAdminState_T (String _id, String _administrativeState, globaldefs.NameAndStringValue_T[] _additionalInfo)
  {
    id = _id;
    administrativeState = _administrativeState;
    additionalInfo = _additionalInfo;
  } // ctor

} // class RouteNameAndAdminState_T