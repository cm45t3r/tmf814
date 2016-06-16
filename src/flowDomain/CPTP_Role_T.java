package flowDomain;


/**
* flowDomain/CPTP_Role_T.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from flowDomain.idl
* Wednesday, June 15, 2016 7:24:36 PM COT
*/


/**
   * <p> This parameter shall identify the role in the flow domain of
   * the requested CPTPs.
   * It shall have one of the following values: <br>
   * CPTPR_FD_EDGE: Return Flow Domain Edge CPTPs. <br>
   * CPTPR_FD_INTERNAL: Return Flow Domain Internal CPTPs. <br>
   * CPTPR_ALL: Return all CPTPs. <br>
   * </p>
   **/
public class CPTP_Role_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static flowDomain.CPTP_Role_T[] __array = new flowDomain.CPTP_Role_T [__size];

  public static final int _CPTPR_FD_EDGE = 0;
  public static final flowDomain.CPTP_Role_T CPTPR_FD_EDGE = new flowDomain.CPTP_Role_T(_CPTPR_FD_EDGE);
  public static final int _CPTPR_FD_INTERNAL = 1;
  public static final flowDomain.CPTP_Role_T CPTPR_FD_INTERNAL = new flowDomain.CPTP_Role_T(_CPTPR_FD_INTERNAL);
  public static final int _CPTPR_ALL = 2;
  public static final flowDomain.CPTP_Role_T CPTPR_ALL = new flowDomain.CPTP_Role_T(_CPTPR_ALL);

  public int value ()
  {
    return __value;
  }

  public static flowDomain.CPTP_Role_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected CPTP_Role_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class CPTP_Role_T
