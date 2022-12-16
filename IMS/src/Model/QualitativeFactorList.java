package Model;
import java.util.*;

public class QualitativeFactorList
{
  private ArrayList<QualitativeFactor> factors;

public QualitativeFactorList(){
  factors = new ArrayList<>();
}

/*public QualitativeFactorList(ArrayList factors){
  this.factors = factors;
}*/

public void addFactor(QualitativeFactor factor){
  factors.add(factor);
}

public int getNumberOfFactors()
{
  return factors.size();
}

public QualitativeFactor getFactor(int index){
  return factors.get(index);
}

public QualitativeFactor[] getAllFactors(){
    return (QualitativeFactor[]) factors.toArray();
}

public void removeFactor (int index){
  factors.remove(index);
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
  public void removeAllFactors (){
    factors.removeAll(factors);
  }

  public ArrayList<QualitativeFactor> getMAFactors()
  {
    ArrayList<QualitativeFactor> MAFactors = new ArrayList<QualitativeFactor>();
    for (int i=0; i<factors.size(); i++ )
    {
      if (factors.get(i).isMA() )
        MAFactors.add(factors.get(i));
    }
    return MAFactors;
  }

  public ArrayList<QualitativeFactor> getCSFactors()
  {
    ArrayList<QualitativeFactor> CSFactors = new ArrayList<QualitativeFactor>();
    for (int i=0; i<factors.size(); i++ )
    {
      if (!(factors.get(i).isMA() ))
        CSFactors.add(factors.get(i));
    }
    return CSFactors;
  }

  public QualitativeFactorList copy(){
    QualitativeFactorList other = new QualitativeFactorList();
    for(int i = 0; i < factors.size(); i++){
      other.addFactor(factors.get(i).copy());
    }
    return other;
  }

  public QualitativeValue.QualitativeValues getValue(int index)
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
  public String toString(){
    return factors.toString();
  }

}


