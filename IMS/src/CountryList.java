import java.util.*;

public class CountryList
{
  private ArrayList<Country> countries;


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

  public  CountryList[] compareMarketingAttractivenessPunctuation()
  {
    for (int i; i<countries.size(); i++)
      

  }

}
