package terminationPoint;


/**
* terminationPoint/TPType_T.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from terminationPoint.idl
* Wednesday, June 15, 2016 7:24:42 PM COT
*/


/**
   * <p>As the interface is coarse grained, TPs are modeled as pure data objects
   * and do not appear as first class CORBA objects at the 
   * interface between the NMS and EMS.</p>
   *
   * <p>The PTP or Physical Termination Point represents a single port of an
   * NE. The PTP is an aggregate of G.805 TCPs, G.805 Termination Functions 
   * and G.805 CPs etc at many layers. The PTP approach is used for performance 
   * and interface simplification.</p>
   *
   * <p>A CTP in this model may correspond directly to a single G.805 CP or may
   * represent an aggregate of G.805 TCPs, G.805 Termination Functions 
   * and G.805 CPs etc at many layers. A CTP may also include the G.805 
   * adaptation function of IM (Inverse Multiplexing) in the aggregation or may
   * include the fragment TCP of IM.  See
   * <a href=../../../supportingDocumentation/SD1-14_IMOverview.pdf >SD1-14 Inverse Multiplexing 
   * overview</a> for further information on inverse multiplexing usage and
   * <a href=../../../supportingDocumentation/SD1-18_layers.pdf >
   * SD1-18 Functional Modelling Concepts</a>.</p>
   * for further information on CTP and FTP structure for IM. </p>
   *
   * <p>A CTP may be involved in SNCs on its server side to its aggregated TCP 
   * or to its aggregated CP depending upon its structure and relationship to 
   * the containing FTP/PTP (see 
   * <a href=../../../supportingDocumentation/SD1-18_layers.pdf >
   * SD1-18 Functional Modelling Concepts</a>.</p>
   * for more details).</p>
   *
   * <p>The FTP or Floating Termination Point represents a set of G.805 
   * termination functions and G.805 connection points that are not associated 
   * directly with a physical port of an NE. The FTP is an aggregate of G.805 
   * TCPs, G.805 Termination Functions and G.805 CPs etc at many layers.
   * The FTP always contains one or more client CTPs (same as a PTP). Unlike a 
   * PTP the FTP may contain server CTPs (strictly a CTP may also contain server 
   * CTPs). An FTP may also include the G.805 adaptation function of IM 
   * (inverse multiplexing) in the aggregation.  See
   * <a href=../../../supportingDocumentation/SD1-14_IMOverview.pdf >SD1-14  Inverse Multiplexing 
   * overview</a> for further information on inverse multiplexing usage and
   * <a href=../../../supportingDocumentation/SD1-18_layers.pdf >
   * SD1-18 Functional Modelling Concepts</a>.</p>
   * for further information on CTP and FTP structure for IM.</p>
   * 
   * <p>Like a CTP the FTP may be involved in an SNC on its server side 
   * (i.e. takes the role of a CTP). An FTP that is capable of being involved in 
   * an SNC on its server side does not contain server CTPs, an FTP that is not 
   * capable of being involved in an SNC on its server side must contain server 
   * CTPs. Like the PTP, the FTP is not contained in another 
   * TP and it effectively takes the role of a PTP from a containment 
   * perspective.</p>
   *
   * <p>The FTP is not represented in the TPType_T enum explicitly, but instead 
   * is identified as a TPT_PTP based upon its role in containment.  
   * This approach was taken in release 3.0 to maximise compatibility with 
   * release 2.0.</p>
   *
   * <p>A TPPool is a set of Termination Points (CTPs, PTPs or FTPs in any 
   * mix). This type has been initially introduced to support the concept of 
   * administrative partitioning of an ATM Network Interface (a VP TPPool is 
   * defined as a set of VP CTPs).</p>
   **/
public class TPType_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static terminationPoint.TPType_T[] __array = new terminationPoint.TPType_T [__size];

  public static final int _TPT_PTP = 0;
  public static final terminationPoint.TPType_T TPT_PTP = new terminationPoint.TPType_T(_TPT_PTP);
  public static final int _TPT_CTP = 1;
  public static final terminationPoint.TPType_T TPT_CTP = new terminationPoint.TPType_T(_TPT_CTP);
  public static final int _TPT_TPPool = 2;
  public static final terminationPoint.TPType_T TPT_TPPool = new terminationPoint.TPType_T(_TPT_TPPool);

  public int value ()
  {
    return __value;
  }

  public static terminationPoint.TPType_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected TPType_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class TPType_T
