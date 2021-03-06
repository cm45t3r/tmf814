package CosEventComm;


/**
* CosEventComm/PushConsumerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosEventComm.idl
* Wednesday, June 15, 2016 7:24:31 PM COT
*/


/**
    * Interface for a push consumer.
    */
public interface PushConsumerOperations 
{

  /**
         * Push an event onto this consumer.
         * @parm <code>data</code> - The event data.
         * @raises Disconnected If this consumer is disconnected.
         */
  void push (org.omg.CORBA.Any data) throws CosEventComm.Disconnected;

  /**
         * Disconnect a push consumer.
         */
  void disconnect_push_consumer ();
} // interface PushConsumerOperations
