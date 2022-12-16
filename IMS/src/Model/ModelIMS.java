package Model;

public class ModelIMS
{
  private QuantitativeFactorList list1;
  private QualitativeFactorList list2;
  private CountryList list3;
  private QualitativeValue qualitativeValues;
  private int selectedCountry;

  public ModelIMS(){
    list1 = new QuantitativeFactorList();
    list2 = new QualitativeFactorList();
    list3= new CountryList();
    qualitativeValues = new QualitativeValue();
  }

  public QuantitativeFactorList getList1()
  {
    return list1;
  }

  public QualitativeFactorList getList2()
  {
    return list2;
  }

  public CountryList getList3(){
    return list3;
  }

  public void setSelectedCountry(int index)
  {
    selectedCountry = index;
  }

  public int getSelectedCountryIndex()
  {
    return selectedCountry;
  }

  public QualitativeValue.QualitativeValues getQualitativeValues(int index){
    if(index == 0)
      return QualitativeValue.QualitativeValues.BAD;
    if(index == 1)
      return QualitativeValue.QualitativeValues.MEDIUM_BAD;
    if(index == 2)
      return QualitativeValue.QualitativeValues.MEDIUM;
    if(index == 3)
      return QualitativeValue.QualitativeValues.MEDIUM_GOOD;
    if(index == 4)
      return QualitativeValue.QualitativeValues.GOOD;
    return null;
  }
}
