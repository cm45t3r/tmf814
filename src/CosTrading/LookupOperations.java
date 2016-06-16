package CosTrading;


/**
* CosTrading/LookupOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/


/** This interface is used to query the trader and retrieve
 * offers which match specified conditions and constraints.
 */
public interface LookupOperations  extends CosTrading.TraderComponentsOperations, CosTrading.SupportAttributesOperations, CosTrading.ImportAttributesOperations
{

  /* doc: 25 */
  void query (String type, String constr, String pref, CosTrading.Policy[] policies, CosTrading.LookupPackage.SpecifiedProps desired_props, int how_many, CosTrading.OfferSeqHolder offers, CosTrading.OfferIteratorHolder offer_iter, CosTrading.PolicyNameSeqHolder limits_applied) throws CosTrading.IllegalServiceType, CosTrading.UnknownServiceType, CosTrading.IllegalConstraint, CosTrading.LookupPackage.IllegalPreference, CosTrading.LookupPackage.IllegalPolicyName, CosTrading.LookupPackage.PolicyTypeMismatch, CosTrading.LookupPackage.InvalidPolicyValue, CosTrading.IllegalPropertyName, CosTrading.DuplicatePropertyName, CosTrading.DuplicatePolicyName;
} // interface LookupOperations
