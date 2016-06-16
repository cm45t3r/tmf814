package flowDomainFragment;


/**
* flowDomainFragment/MFDFrIterator_IOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from flowDomainFragment.idl
* Wednesday, June 15, 2016 7:24:36 PM COT
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   **/
public interface MFDFrIterator_IOperations 
{
  boolean next_n (int how_many, flowDomainFragment.MatrixFlowDomainFragmentList_THolder mfdfrList) throws globaldefs.ProcessingFailureException;
  int getLength () throws globaldefs.ProcessingFailureException;
  void destroy () throws globaldefs.ProcessingFailureException;
} // interface MFDFrIterator_IOperations
