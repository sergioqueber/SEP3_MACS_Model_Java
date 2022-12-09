import java.util.*;

public class CountryList
{
  private ArrayList<CountryList> countries;


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

    if(!(countries.size() == other.countries.size()))
      return false;


  }


  public void addCountry(int index)
  {
    countries.add(index)
  }

  public void removeCountry(int index)
  {
    countries.remove(index)
  }

  public void removeAll()
  {
    countries.removeAll();
  }

  public  CountryList[] compareMarketingAttractivenessPunctuation()
  {
    for (int i; i<CountryList; i++)
      

  }

}
