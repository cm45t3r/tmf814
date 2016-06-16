package CosTrading.LinkPackage;


/**
* CosTrading/LinkPackage/LinkInfo.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class LinkInfo implements org.omg.CORBA.portable.IDLEntity
{
  public CosTrading.Lookup target = null;
  public CosTrading.Register target_reg = null;
  public CosTrading.FollowOption def_pass_on_follow_rule = null;
  public CosTrading.FollowOption limiting_follow_rule = null;

  public LinkInfo ()
  {
  } // ctor

  public LinkInfo (CosTrading.Lookup _target, CosTrading.Register _target_reg, CosTrading.FollowOption _def_pass_on_follow_rule, CosTrading.FollowOption _limiting_follow_rule)
  {
    target = _target;
    target_reg = _target_reg;
    def_pass_on_follow_rule = _def_pass_on_follow_rule;
    limiting_follow_rule = _limiting_follow_rule;
  } // ctor

} // class LinkInfo
