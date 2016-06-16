package trafficDescriptor;

/**
* trafficDescriptor/ServiceCategory_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from trafficDescriptor.idl
* Wednesday, June 15, 2016 7:24:43 PM COT
*/


/**
   * <p>Represents Service Categories used by Traffic 
   * Descriptors. The current Service Categories are defined
   * as follows (note that Guaranteed Bit Rate (GBR) is not 
   * defined because it is generally not used):<p>
   * <ol>
   * <li> SC_CBR = Constant Bit Rate. For connections that require
   * a sstatic amount of bandwidth that is continuously available during
   * the lifetime of the connection.</li>
   * <li> SC_VBRRT = Variable Bit Rate - Real-Time. For connections that
   * require tightly constrained delay and delay variation.</li>
   * <li> SC_VBRNRT = Variable Bit Rate - NonReal-Time. For connections
   * that have bursty traffic.</li>
   * <li> SC_ABR = Available Bit Rate. For connections that do not require
   * bounding the delay or delay variation. Not intended for real-time
   * applications.</li> 
   * <li> SC_UBR = Unspecified Bit Rate. For connections that do not require
   * tightly constrained delay and delay variation.</li> 
   * <li> SC_GFR = Guaranteed Frame Rate. For non-real-time applications that 
   * may require a minimum rate guarantee and can benefit from accessing 
   * additional bandwidth dynamically available in the network.</li> 
   * <li> SC_NA = Not Applicable</li> 
   * </ol><br>
   **/
public final class ServiceCategory_THolder implements org.omg.CORBA.portable.Streamable
{
  public trafficDescriptor.ServiceCategory_T value = null;

  public ServiceCategory_THolder ()
  {
  }

  public ServiceCategory_THolder (trafficDescriptor.ServiceCategory_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = trafficDescriptor.ServiceCategory_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    trafficDescriptor.ServiceCategory_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return trafficDescriptor.ServiceCategory_THelper.type ();
  }

}
