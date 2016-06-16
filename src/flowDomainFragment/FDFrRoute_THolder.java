package flowDomainFragment;


/**
* flowDomainFragment/FDFrRoute_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from flowDomainFragment.idl
* Wednesday, June 15, 2016 7:24:36 PM COT
*/


/**
   * <p>A route for an FDFr is defined as a list of
   * matrix flow domain fragments.</p>
   * 
   **/
public final class FDFrRoute_THolder implements org.omg.CORBA.portable.Streamable
{
  public flowDomainFragment.MatrixFlowDomainFragment_T value[] = null;

  public FDFrRoute_THolder ()
  {
  }

  public FDFrRoute_THolder (flowDomainFragment.MatrixFlowDomainFragment_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = flowDomainFragment.FDFrRoute_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    flowDomainFragment.FDFrRoute_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return flowDomainFragment.FDFrRoute_THelper.type ();
  }

}
