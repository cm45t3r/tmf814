package subnetworkConnection;


/**
* subnetworkConnection/RouteNameAndAdminStateList_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from subnetworkConnection.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/


/**
   * <p>Arbitrary sequence of RouteNameAndAdminState.</p>
   **/
public final class RouteNameAndAdminStateList_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.RouteNameAndAdminState_T value[] = null;

  public RouteNameAndAdminStateList_THolder ()
  {
  }

  public RouteNameAndAdminStateList_THolder (subnetworkConnection.RouteNameAndAdminState_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.RouteNameAndAdminStateList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.RouteNameAndAdminStateList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.RouteNameAndAdminStateList_THelper.type ();
  }

}
