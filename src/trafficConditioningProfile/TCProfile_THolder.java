package trafficConditioningProfile;

/**
* trafficConditioningProfile/TCProfile_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from trafficConditioningProfile.idl
* Wednesday, June 15, 2016 7:24:43 PM COT
*/

public final class TCProfile_THolder implements org.omg.CORBA.portable.Streamable
{
  public trafficConditioningProfile.TCProfile_T value = null;

  public TCProfile_THolder ()
  {
  }

  public TCProfile_THolder (trafficConditioningProfile.TCProfile_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = trafficConditioningProfile.TCProfile_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    trafficConditioningProfile.TCProfile_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return trafficConditioningProfile.TCProfile_THelper.type ();
  }

}