package guiCutThrough;

/**
* guiCutThrough/GuiCutThroughData_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from guiCutThrough.idl
* Wednesday, June 15, 2016 7:24:37 PM COT
*/

public final class GuiCutThroughData_THolder implements org.omg.CORBA.portable.Streamable
{
  public guiCutThrough.GuiCutThroughData_T value = null;

  public GuiCutThroughData_THolder ()
  {
  }

  public GuiCutThroughData_THolder (guiCutThrough.GuiCutThroughData_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = guiCutThrough.GuiCutThroughData_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    guiCutThrough.GuiCutThroughData_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return guiCutThrough.GuiCutThroughData_THelper.type ();
  }

}
