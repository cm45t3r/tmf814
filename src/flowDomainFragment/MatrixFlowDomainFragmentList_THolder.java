package flowDomainFragment;


/**
* flowDomainFragment/MatrixFlowDomainFragmentList_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from flowDomainFragment.idl
* Wednesday, June 15, 2016 7:24:36 PM COT
*/


/**
   * <p>A list of MFDFrs.</p>
   **/
public final class MatrixFlowDomainFragmentList_THolder implements org.omg.CORBA.portable.Streamable
{
  public flowDomainFragment.MatrixFlowDomainFragment_T value[] = null;

  public MatrixFlowDomainFragmentList_THolder ()
  {
  }

  public MatrixFlowDomainFragmentList_THolder (flowDomainFragment.MatrixFlowDomainFragment_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = flowDomainFragment.MatrixFlowDomainFragmentList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    flowDomainFragment.MatrixFlowDomainFragmentList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return flowDomainFragment.MatrixFlowDomainFragmentList_THelper.type ();
  }

}
