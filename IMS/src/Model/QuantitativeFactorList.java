package Model;

import java.util.*;

public class QuantitativeFactorList
{
  private ArrayList<QuantitativeFactor> factors;


  public QuantitativeFactorList()
  {
  factors= new ArrayList<QuantitativeFactor>();
  }

  /*public QuantitativeFactorList(ArrayList factors){
    this.factors = factors;
  }*/

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

  public void removeFactorByName(String name){
    for(int i = 0; i < factors.size(); i++){
      if (factors.get(i).getName() == name)
      {
        factors.remove(i);
        break;
      }
    }
  }

  public ArrayList<QuantitativeFactor> getMAFactors()
  {
    ArrayList<QuantitativeFactor> MAFactors = new ArrayList<QuantitativeFactor>();
    for (int i=0; i<factors.size(); i++ )
    {
      if (factors.get(i).isMA() )
    MAFactors.add(factors.get(i));
    }
      return MAFactors;
  }


  public ArrayList<QuantitativeFactor> getCSFactors()
  {
    ArrayList<QuantitativeFactor> CSFactors = new ArrayList<QuantitativeFactor>();
    for (int i=0; i<factors.size(); i++ )
    {
      if (!(factors.get(i).isMA() ))
        CSFactors.add(factors.get(i));
    }
    return CSFactors;
  }


  public QuantitativeFactorList copy(){
    QuantitativeFactorList other =  new QuantitativeFactorList();
    for (int i = 0; i < factors.size(); i++){
      other.addFactor((QuantitativeFactor)factors.get(i).copy());
    }
    return other;
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
    return factors.get(index);
  }

  public String toString()
  {
    return factors.toString();
  }

}









