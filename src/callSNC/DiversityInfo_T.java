package callSNC;


/**
* callSNC/DiversityInfo_T.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from callSNC.idl
* Wednesday, June 15, 2016 7:24:30 PM COT
*/

public final class DiversityInfo_T implements org.omg.CORBA.portable.IDLEntity
{
  public String sRGType = null;
  public callSNC.SharedResource_T sharedResourceList[] = null;

  public DiversityInfo_T ()
  {
  } // ctor

  public DiversityInfo_T (String _sRGType, callSNC.SharedResource_T[] _sharedResourceList)
  {
    sRGType = _sRGType;
    sharedResourceList = _sharedResourceList;
  } // ctor

} // class DiversityInfo_T
