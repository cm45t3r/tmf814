package transmissionDescriptor;


/**
* transmissionDescriptor/TPorMFDorFDFrQualifier_T.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from transmissionDescriptor.idl
* Wednesday, June 15, 2016 7:24:43 PM COT
*/


/**
   * <p>Distinguishes between TP, MFD and FDFr in the following UNION type.</p>
   **/
public class TPorMFDorFDFrQualifier_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static transmissionDescriptor.TPorMFDorFDFrQualifier_T[] __array = new transmissionDescriptor.TPorMFDorFDFrQualifier_T [__size];

  public static final int _aTP = 0;
  public static final transmissionDescriptor.TPorMFDorFDFrQualifier_T aTP = new transmissionDescriptor.TPorMFDorFDFrQualifier_T(_aTP);
  public static final int _aMFD = 1;
  public static final transmissionDescriptor.TPorMFDorFDFrQualifier_T aMFD = new transmissionDescriptor.TPorMFDorFDFrQualifier_T(_aMFD);
  public static final int _aFDFr = 2;
  public static final transmissionDescriptor.TPorMFDorFDFrQualifier_T aFDFr = new transmissionDescriptor.TPorMFDorFDFrQualifier_T(_aFDFr);

  public int value ()
  {
    return __value;
  }

  public static transmissionDescriptor.TPorMFDorFDFrQualifier_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected TPorMFDorFDFrQualifier_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class TPorMFDorFDFrQualifier_T
