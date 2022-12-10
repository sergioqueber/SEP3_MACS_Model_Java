package Model;

import java.util.*;

public class QuantitativeFactorList
{
  private ArrayList<QuantitativeFactor> factors;


  public QuantitativeFactorList()
  {
  factors= new ArrayList<>();
  }

  public QuantitativeFactorList(ArrayList factors){
    this.factors = factors;
  }

  public void addFactor(QuantitativeFactor factor)
  {
    factors.add(factor);
  }

  public int getNumberOfFactors()
  {
    return factors.size();
  }

  public QuantitativeFactor[] getAllFactors()
  {
    return (QuantitativeFactor[]) factors.toArray();
  }

  public void removeFactor(int index)
  {
    factors.remove(index);
  }

  public void removeAllFactors()
  {
    factors.removeAll(factors);
  }

  public String toString()
  {
   return factors.toString();
  }

  public ArrayList<Factor> getMAFactors()
  {
    ArrayList<Factor> MAFactors = new ArrayList<Factor>();
    for (int i=0; i<factors.size(); i++ )
    {
      if (factors.get(i).isMA() )
    MAFactors.add(factors.get(i));
    }
      return MAFactors;
  }


  public ArrayList<Factor> getCSFactors()
  {
    ArrayList<Factor> CSFactors = new ArrayList<Factor>();
    for (int i=0; i<factors.size(); i++ )
    {
      if (!(factors.get(i).isMA() ))
        CSFactors.add(factors.get(i));
    }
    return CSFactors;
  }


public QuantitativeFactorList copy(){
    return new QuantitativeFactorList(factors);
}

public double getValue(int index)
{
  return factors.get(index).getValue();
}

public double calculateMAPercentage()
{
  double MAPercentage = 0;
  for (int i=0; i<factors.size(); i++ )
  {
    if (factors.get(i).isMA() )
      MAPercentage = MAPercentage + factors.get(i).getWeight() ;
  }
  return MAPercentage;
}

public double calculateCSPercentage()
{
  double result = 0;
  for (int i=0; i<factors.size(); i++ )
  {
    if (!(factors.get(i).isMA() ))
      result = result + factors.get(i).getWeight() ;
  }
  return result;
}
public QuantitativeFactor getFactor(int index)
{
  factors.get(index)
}






 }









