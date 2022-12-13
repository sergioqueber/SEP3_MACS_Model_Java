package Model;

public class ModelIMS
{
  private QuantitativeFactorList list1;
  private QualitativeFactorList list2;
  private CountryList countryList;
  private int selectedCountry;

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

  public CountryList getCountryList(){
    return countryList;
  }

  public void setSelectedCountry(int index)
  {
    selectedCountry = index;
  }

  public int getSelectedCountryIndex()
  {
    return selectedCountry;
  }
}
