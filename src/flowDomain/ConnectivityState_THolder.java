package flowDomain;

/**
* flowDomain/ConnectivityState_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from flowDomain.idl
* Wednesday, June 15, 2016 7:24:36 PM COT
*/


/**
   * <p> This attribute provides an indication to the NMS about the server layer
   * connectivity between the MFDs associated to an FD. It shall have one of the 
   * following values: <br>
   * CS_UNKNOWN: The connectivity state of the FD is not known by the EMS<br>
   * CS_FULLY_CONNECTED: all FD Edge CPTPs are reachable to each other<br>
   * CS_NOT_FULLY_CONNECTED: At least one FD Edge CPTP is not reachable by
   * another FD Edge CPTP 
   * </p>
   **/
public final class ConnectivityState_THolder implements org.omg.CORBA.portable.Streamable
{
  public flowDomain.ConnectivityState_T value = null;

  public ConnectivityState_THolder ()
  {
  }

  public ConnectivityState_THolder (flowDomain.ConnectivityState_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = flowDomain.ConnectivityState_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    flowDomain.ConnectivityState_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return flowDomain.ConnectivityState_THelper.type ();
  }

}
