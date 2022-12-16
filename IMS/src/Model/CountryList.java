package Model;
import java.util.*;

public class CountryList
{
  private ArrayList<Country> countries;
  private ArrayList<Double> ranges = new ArrayList<Double>();
  private ArrayList<Double> maxValues = new ArrayList<Double>();
  private ArrayList<Double> minValues = new ArrayList<Double>();

  public CountryList()
  {
    countries = new ArrayList<>();
  }

  public Country getCountry(int index)
  {
    return countries.get(index);
  }

  public ArrayList<Country> getCountries()
  {
    return countries;
  }

  public void addCountry(Country country)
  {
    countries.add(country);
  }

  public void removeCountry(int index)
  {
    countries.remove(index);
  }

  public void removeAllCountries(){
    for(int i = 0; i < countries.size(); i++)
      countries.remove(i);
  }

  public void clear()
  {
    countries.clear();
  }

  public void defineRange()
  {
    for (int c = 0; c < countries.get(0).getQuantitativeFactors()
        .getNumberOfFactors(); c++)
    {
      ArrayList<Double> values = new ArrayList<Double>();
      for (int i = 0; i < countries.size(); i++)
      {
        values.add(countries.get(i).getQuantitativeFactors().getValue(c));
      }
      Collections.sort(values);
      ranges.add((double) values.get(values.size() - 1) - values.get(0));
      maxValues.add(values.get(values.size() - 1));
      minValues.add(values.get(0));
    }
  }

  public void assignQualitativePoints()
  {
    for (int c = 0; c < countries.get(0).getQualitativeFactors().getNumberOfFactors(); c++)
    {
      for (int i = 0; i < countries.size(); i++)
      {
        countries.get(i).getQualitativeFactors().getFactor(c).assignPoints();
      }
    }
  }

  public void assignQuantitativePoints()
  {
    for (int c = 0; c < countries.get(0).getQuantitativeFactors()
        .getNumberOfFactors(); c++)
    {
      for (int i = 0; i < countries.size(); i++)
      {
        if ((countries.get(i).getQuantitativeFactors().getValue(c)) >= (minValues.get(0))
            && (countries.get(i).getQuantitativeFactors().getValue(c)) <= (
            minValues.get(0) + (ranges.get(0) / 5)))
        {
          countries.get(i).getQuantitativeFactors().getFactor(c).setPoint(1);
        }
        else if ((countries.get(i).getQuantitativeFactors().getValue(c)) >= (
            minValues.get(0) + ((ranges.get(0)) / 5))
            && (countries.get(i).getQuantitativeFactors().getValue(c)) <= (
            minValues.get(0) + ((ranges.get(0)) / 5) * 2))
        {
          countries.get(i).getQuantitativeFactors().getFactor(c).setPoint(2);
        }
        else if ((countries.get(i).getQuantitativeFactors().getValue(c)) >= (
            minValues.get(0) + ((ranges.get(0)) / 5) * 2)
            && (countries.get(i).getQuantitativeFactors().getValue(c)) <= (
            minValues.get(0) + ((ranges.get(0)) / 5) * 3))
        {
          countries.get(i).getQuantitativeFactors().getFactor(c).setPoint(3);
        }
        else if ((countries.get(i).getQuantitativeFactors().getValue(c)) >= (
            minValues.get(0) + ((ranges.get(0)) / 5) * 3)
            && (countries.get(i).getQuantitativeFactors().getValue(c)) <= (
            minValues.get(0) + ((ranges.get(0)) / 5) * 4))
        {
          countries.get(i).getQuantitativeFactors().getFactor(c).setPoint(4);
        }
        else if ((countries.get(i).getQuantitativeFactors().getValue(c)) >= (
            minValues.get(0) + ((ranges.get(0)) / 5) * 4)
            && (countries.get(i).getQuantitativeFactors().getValue(c)) <= (
            minValues.get(0) + ((ranges.get(0)) / 5) * 5))
        {
          {
            countries.get(i).getQuantitativeFactors().getFactor(c).setPoint(5);
          }
        }
      }
    }
  }

  public ArrayList<Double> getRanges()
  {
    return ranges;
  }

  public void weightedMAPointsCalculation() {
    for (int i = 0; i < countries.size(); i++)
    {
      for (int c = 0;
           c < countries.get(0).getQuantitativeFactors().getMAFactors().size(); c++)
      {
        countries.get(i).getQuantitativeFactors().getMAFactors().get(c).setWeightedPoints(
            (countries.get(i).getQuantitativeFactors().getMAFactors().get(c).getPoint())
                * ((countries.get(i).getQuantitativeFactors().getMAFactors().get(c).getWeight())/100));
        countries.get(i).setMarketAttractivenessPunctuation(
            (countries.get(i).getMarketAttractivenessPunctuation()) + (countries.get(i).getQuantitativeFactors().getMAFactors()
                .get(c).getWeightedPoints()));
      }
      for (int c = 0;
           c < countries.get(0).getQualitativeFactors().getMAFactors().size(); c++)
      {
        countries.get(i).getQualitativeFactors().getMAFactors().get(c).setWeightedPoints(
            (countries.get(i).getQualitativeFactors().getMAFactors().get(c).getPoint())
                * ((countries.get(i).getQualitativeFactors().getMAFactors().get(c).getWeight())/100));
        countries.get(i).setMarketAttractivenessPunctuation(
            (countries.get(i).getMarketAttractivenessPunctuation()) + (countries.get(i).getQualitativeFactors().getMAFactors()
                .get(c).getWeightedPoints()));
      }
    }
  }

  public void weightedCSPointsCalculation()
  {
    for (int i = 0; i < countries.size(); i++)
    {
      for (int c = 0;
           c < countries.get(0).getQuantitativeFactors().getCSFactors().size(); c++)
      {
        countries.get(i).getQuantitativeFactors().getCSFactors().get(c).setWeightedPoints(
            (countries.get(i).getQuantitativeFactors().getCSFactors().get(c).getPoint())
                * ((countries.get(i).getQuantitativeFactors().getCSFactors().get(c).getWeight())/100));
        countries.get(i).setCompetitiveStrengthPunctuation(
            (countries.get(i).getCompetitiveStrengthPunctuation()) + (countries.get(i).getQuantitativeFactors().getCSFactors()
                .get(c).getWeightedPoints()));
      }
      for (int c = 0;
           c < countries.get(0).getQualitativeFactors().getCSFactors().size(); c++)
      {
        countries.get(i).getQualitativeFactors().getCSFactors().get(c).setWeightedPoints(
            (countries.get(i).getQualitativeFactors().getCSFactors().get(c).getPoint())
                * ((countries.get(i).getQualitativeFactors().getCSFactors().get(c).getWeight())/100));
        countries.get(i).setCompetitiveStrengthPunctuation(
            (countries.get(i).getCompetitiveStrengthPunctuation()) + (countries.get(i).getQualitativeFactors().getCSFactors()
                .get(c).getWeightedPoints()));
      }
    }
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof CountryList))
      return false;

    CountryList other = (CountryList) obj;
    return (countries == other.countries);
  }

  public String toString()
  {
    return countries.toString();
  }
}