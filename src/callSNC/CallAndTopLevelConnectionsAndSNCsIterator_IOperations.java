package callSNC;


/**
* callSNC/CallAndTopLevelConnectionsAndSNCsIterator_IOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from callSNC.idl
* Wednesday, June 15, 2016 7:24:30 PM COT
*/

public interface CallAndTopLevelConnectionsAndSNCsIterator_IOperations 
{
  boolean next_n (int how_many, callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList) throws globaldefs.ProcessingFailureException;
  int getLength () throws globaldefs.ProcessingFailureException;
  void destroy () throws globaldefs.ProcessingFailureException;
} // interface CallAndTopLevelConnectionsAndSNCsIterator_IOperations
