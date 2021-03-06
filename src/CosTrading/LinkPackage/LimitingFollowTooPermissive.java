package CosTrading.LinkPackage;


/**
* CosTrading/LinkPackage/LimitingFollowTooPermissive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class LimitingFollowTooPermissive extends org.omg.CORBA.UserException
{
  public CosTrading.FollowOption limiting_follow_rule = null;
  public CosTrading.FollowOption max_link_follow_policy = null;

  public LimitingFollowTooPermissive ()
  {
    super(LimitingFollowTooPermissiveHelper.id());
  } // ctor

  public LimitingFollowTooPermissive (CosTrading.FollowOption _limiting_follow_rule, CosTrading.FollowOption _max_link_follow_policy)
  {
    super(LimitingFollowTooPermissiveHelper.id());
    limiting_follow_rule = _limiting_follow_rule;
    max_link_follow_policy = _max_link_follow_policy;
  } // ctor


  public LimitingFollowTooPermissive (String $reason, CosTrading.FollowOption _limiting_follow_rule, CosTrading.FollowOption _max_link_follow_policy)
  {
    super(LimitingFollowTooPermissiveHelper.id() + "  " + $reason);
    limiting_follow_rule = _limiting_follow_rule;
    max_link_follow_policy = _max_link_follow_policy;
  } // ctor

} // class LimitingFollowTooPermissive
