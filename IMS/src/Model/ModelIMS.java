package Model;

public class ModelIMS
{
  private QuantitativeFactorList list1;
  private QualitativeFactorList list2;
  private CountryList list3;
  private CountryList countryList;
  private int selectedCountry;

  public ModelIMS(){
    list1 = new QuantitativeFactorList();
    list2 = new QualitativeFactorList();
    list3= new CountryList();
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
}
