package Model;

public class Country
{
  private String name;
  private QualitativeFactorList qualitativeFactors;
  private QuantitativeFactorList quantitativeFactors;
  //private double finalPunctuation;
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

  /*public double getFinalPunctuation()
  {
    return finalPunctuation;
  }*/

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

  /*public void setFinalPunctuation(double finalPunctuation)
  {
    this.finalPunctuation = finalPunctuation;
  }*/

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

  public double getRemainingMAWeightPercentage()
  {
    return (100-((quantitativeFactors.calculateMAPercentage())+(qualitativeFactors.calculateMAPercentage())));
  }
  public double getRemainingCSWeightPercentage(){
    return (100-((quantitativeFactors.calculateCSPercentage())+(qualitativeFactors.calculateCSPercentage())));
  }
  public void setQualitativeValueMA(int index, QualitativeValue.QualitativeValues value)
  {
    qualitativeFactors.getMAFactors().get(index).setValue(value);
  }

  public void setQualitativeValueCS(int index, QualitativeValue.QualitativeValues value){
    qualitativeFactors.getCSFactors().get(index).setValue(value);
  }

  public void setQuantitativeValueMA(int index,  double value)
  {
    quantitativeFactors.getMAFactors().get(index).setValue(value);
  }

  public void setQuantitativeValueCS(int index, double value){
    quantitativeFactors.getCSFactors().get(index).setValue(value);
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Country))
      return false;

    Country other = (Country) obj;

    return name.equals(other.name)
        && marketAttractivenessPunctuation == other.marketAttractivenessPunctuation
        && competitiveStrengthPunctuation == other.competitiveStrengthPunctuation;
  }
  public String toString()
  {
    return "Name: " + name + "\nMarket Attractiveness Punctuation: "
        + marketAttractivenessPunctuation + "\nCompetitive Strength Punctuation: "
        + competitiveStrengthPunctuation;
  }


}