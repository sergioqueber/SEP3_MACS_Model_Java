import java.util.*;

public class CountryList
{
  private ArrayList<Country> countries;
  private ArrayList<double> ranges;


  public CountryList()
  {
    countries = new ArrayList<>();
  }

  public String toString()
  {
    return countries.toString();
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof CountryList))
      return false;

    CountryList other = (CountryList)obj;
      return (countries == other.countries);
  }


  public void addCountry(Country country)
  {
    countries.add(country);
  }

  public void removeCountry(int index)
  {
    countries.remove(index);
  }

  public void clear()
  {
    countries.clear();
  }

  public void defineRange(){
    for (int i = 0; i<countries.size(); i++){
      for (int c = 0; c<countries.get(0).getQuantitativeFactors()
          .getNumberOfFactors(); c++)
        countries.get(i).getQuantitativeFactors().getValue(c);
  }
  public void assignQuantitativePoints(){
    for (int i = 0; i<countries.size(); i++){
      countries.get(i).
    }
  }


  public  CountryList[] compareMarketingAttractivenessPunctuation()
  {
    for (int i; i<countries.size(); i++)
      

  }

}
