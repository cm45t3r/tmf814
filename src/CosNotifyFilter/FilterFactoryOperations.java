package CosNotifyFilter;


/**
* CosNotifyFilter/FilterFactoryOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyFilter.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/


/**
    * Interface for a filter factory.
    */
public interface FilterFactoryOperations 
{

  /**
         * Create a filter with the specified grammer.
         * @parm <code>constraint_grammar</code> - The constraint grammer to
         * be used by the filter.
         * @returns A filter object reference.
         * @raises InvalidGrammar If the specified grammer is not supported.
         */
  CosNotifyFilter.Filter create_filter (String constraint_grammar) throws CosNotifyFilter.InvalidGrammar;

  /**
         * Create a mapping filter with the specified grammer.
         * @parm <code>constraint_grammar</code> - The constraint grammer to
         * be used by the filter.
         * @parm <code>default_value</code> - The default value to be returned
         * by match operations invoked on the mapping filter if no match is
         * found.
         * @returns A mapping filter object reference.
         * @raises InvalidGrammar If the specified grammer is not supported.
         */
  CosNotifyFilter.MappingFilter create_mapping_filter (String constraint_grammar, org.omg.CORBA.Any default_value) throws CosNotifyFilter.InvalidGrammar;
} // interface FilterFactoryOperations
