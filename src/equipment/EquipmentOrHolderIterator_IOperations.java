package equipment;


/**
* equipment/EquipmentOrHolderIterator_IOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from equipment.idl
* Wednesday, June 15, 2016 7:24:35 PM COT
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   * <p>See <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 SD1-15 iterator overview</a>
   * for information on how iterators are used in this interface.</p>
   **/
public interface EquipmentOrHolderIterator_IOperations 
{
  boolean next_n (int how_many, equipment.EquipmentOrHolderList_THolder equipmentOrHolderList) throws globaldefs.ProcessingFailureException;
  int getLength () throws globaldefs.ProcessingFailureException;
  void destroy () throws globaldefs.ProcessingFailureException;
} // interface EquipmentOrHolderIterator_IOperations
