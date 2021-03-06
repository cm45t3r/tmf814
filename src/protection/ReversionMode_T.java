package protection;


/**
* protection/ReversionMode_T.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from protection.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/


/**
   * <p>Reversion mode is used to indicate whether, after repair of a
   * failed resource, an additional switch should be
   * made to revert to the preferred resource.
   * Revertive modes may require a wait to restore (WTR) time
   * setting.</p>
   **/
public class ReversionMode_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static protection.ReversionMode_T[] __array = new protection.ReversionMode_T [__size];

  public static final int _RM_UNKNOWN = 0;
  public static final protection.ReversionMode_T RM_UNKNOWN = new protection.ReversionMode_T(_RM_UNKNOWN);
  public static final int _RM_NON_REVERTIVE = 1;
  public static final protection.ReversionMode_T RM_NON_REVERTIVE = new protection.ReversionMode_T(_RM_NON_REVERTIVE);
  public static final int _RM_REVERTIVE = 2;
  public static final protection.ReversionMode_T RM_REVERTIVE = new protection.ReversionMode_T(_RM_REVERTIVE);

  public int value ()
  {
    return __value;
  }

  public static protection.ReversionMode_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ReversionMode_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ReversionMode_T
