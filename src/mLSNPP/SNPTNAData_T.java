package mLSNPP;


/**
* mLSNPP/SNPTNAData_T.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from mLSNPP.idl
* Wednesday, June 15, 2016 7:24:38 PM COT
*/

public final class SNPTNAData_T implements org.omg.CORBA.portable.IDLEntity
{
  public String sNPPId = null;
  public short layerRate = (short)0;
  public String rAId = null;
  public mLSNPP.SNPTNAPair_T sNPTNAPairList[] = null;

  public SNPTNAData_T ()
  {
  } // ctor

  public SNPTNAData_T (String _sNPPId, short _layerRate, String _rAId, mLSNPP.SNPTNAPair_T[] _sNPTNAPairList)
  {
    sNPPId = _sNPPId;
    layerRate = _layerRate;
    rAId = _rAId;
    sNPTNAPairList = _sNPTNAPairList;
  } // ctor

} // class SNPTNAData_T
