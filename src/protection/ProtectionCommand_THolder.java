package protection;

/**
* protection/ProtectionCommand_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from protection.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/


/**
   * <p> This type identifies the possible protection switch commands.
   * See ITU-T Recommendation G.841 for definitions.</p>
   **/
public final class ProtectionCommand_THolder implements org.omg.CORBA.portable.Streamable
{
  public protection.ProtectionCommand_T value = null;

  public ProtectionCommand_THolder ()
  {
  }

  public ProtectionCommand_THolder (protection.ProtectionCommand_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = protection.ProtectionCommand_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    protection.ProtectionCommand_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return protection.ProtectionCommand_THelper.type ();
  }

}
