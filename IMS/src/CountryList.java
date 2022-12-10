import java.util.*;

public class CountryList
{
  private ArrayList<Country> countries;
  private ArrayList<Double> ranges = new ArrayList<Double>();


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
    for (int c = 0; c<countries.get(0).getQuantitativeFactors()
        .getNumberOfFactors(); c++) {
      ArrayList<Double> values  = new ArrayList<Double>();
    for (int i = 0; i<countries.size(); i++) {
      values.add(countries.get(i).getQuantitativeFactors().getValue(c));
    }
    Collections.sort(values);
    System.out.println(values);
    ranges.add((double)values.get(values.size()-1) - values.get(0));
    }
  }
  /*public void assignQuantitativePoints(){
    for (int i = 0; i<countries.size(); i++){
      countries.get(i).
    }
  }*/

  public ArrayList<Double> getRanges()
  {
    return ranges;
  }

  /*public  CountryList[] compareMarketingAttractivenessPunctuation()
  {
    for (int i; i<countries.size(); i++)
      

  }*/

}
