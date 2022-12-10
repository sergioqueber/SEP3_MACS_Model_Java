package Model;

public class ModelIMS
{
  private QuantitativeFactorList list1;
  private QualitativeFactorList list2;

  public ModelIMS(){
    list1 = new QuantitativeFactorList();
    list2 = new QualitativeFactorList();
  }

  public QuantitativeFactorList getList1()
  {
    return list1;
  }

  public QualitativeFactorList getList2()
  {
    return list2;
  }
}
