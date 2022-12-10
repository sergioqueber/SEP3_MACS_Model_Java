
import java.util.*;
public class Country
{
  private String name;
  private QualitativeFactorList qualitativeFactors;
  private QuantitativeFactorList quantitativeFactors;
  private double finalPunctuation;
  private double marketAttractivenessPunctuation = 0;
  private double competitiveStrengthPunctuation = 0;

  public Country(String name)
  {
    this.name = name;
  }

  public Country(String name, QualitativeFactorList qualitativeFactors,
      QuantitativeFactorList quantitativeFactors)
  {
    this.name = name;
    this.qualitativeFactors = qualitativeFactors.copy();
    this.quantitativeFactors = quantitativeFactors.copy();
  }

  public Country(String name, QualitativeFactorList qualitativeFactors,
      QuantitativeFactorList quantitativeFactors, double finalPunctuation,
      double marketAttractivenessPunctuation, double competitiveStrengthPunctuation)
  {
    this.name = name;
    this.qualitativeFactors = qualitativeFactors.copy();
    this.quantitativeFactors = quantitativeFactors.copy();
    this.marketAttractivenessPunctuation = marketAttractivenessPunctuation;
    this.competitiveStrengthPunctuation = competitiveStrengthPunctuation;
  }

  public String getName()
  {
    return name;
  }

  public QualitativeFactorList getQualitativeFactors()
  {
    return qualitativeFactors;
  }

  public QuantitativeFactorList getQuantitativeFactors()
  {
    return quantitativeFactors;
  }

  public double getFinalPunctuation()
  {
    return finalPunctuation;
  }

  public double getMarketAttractivenessPunctuation()
  {
    return marketAttractivenessPunctuation;
  }

  public double getCompetitiveStrengthPunctuation()
  {
    return competitiveStrengthPunctuation;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setQualitativeFactors(QualitativeFactorList qualitativeFactors)
  {
    this.qualitativeFactors = qualitativeFactors;
  }

  public void setQuantitativeFactors(QuantitativeFactorList quantitativeFactors)
  {
    this.quantitativeFactors = quantitativeFactors;
  }

  public void setFinalPunctuation(double finalPunctuation)
  {
    this.finalPunctuation = finalPunctuation;
  }

  public void setMarketAttractivenessPunctuation(
      double marketAttractivenessPunctuation)
  {
    this.marketAttractivenessPunctuation = marketAttractivenessPunctuation;
  }

  public void setCompetitiveStrengthPunctuation(
      double competitiveStrengthPunctuation)
  {
    this.competitiveStrengthPunctuation = competitiveStrengthPunctuation;
  }

  public String toString()
  {
    return "Name: " + name + "\nFinal Punctuation: " + finalPunctuation + "\nMarket Attractiveness Punctuation: "
        + marketAttractivenessPunctuation + "\nCompetitive Strength Punctuation: "
        + competitiveStrengthPunctuation;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Country))
      return false;

    Country other = (Country) obj;

    return name.equals(other.name) && finalPunctuation == other.finalPunctuation
        && marketAttractivenessPunctuation == other.marketAttractivenessPunctuation
        && competitiveStrengthPunctuation == other.competitiveStrengthPunctuation;
  }

  public void setQualitativeValue(int index, QualitativeValue value)
  {
    qualitativeFactors.getFactor(index).setValue(value);
  }

  public void setQuantitativeValue(int index,  double value)
  {
    quantitativeFactors.getFactor(index).setValue(value);
  }

  public double getRemainingMAWeightPercentage()
  {
    return (100-((quantitativeFactors.calculateMAPercentage())+(qualitativeFactors.calculateMAPercentage())));
  }
  public double getRemainingCSWeightPercentage(){
    return (100-((quantitativeFactors.calculateCSPercentage())+(qualitativeFactors.calculateCSPercentage())));
  }
}