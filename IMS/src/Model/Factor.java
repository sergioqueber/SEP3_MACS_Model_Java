package Model;
public abstract class Factor
{
  private String name;
  private int point;
  private double weight;
  private boolean type;
  private double weightedPoints = 0;


  public Factor(String name, int point, double weight, boolean type)
  {
    this.name = name;
    this.point = point;
    this.weight = weight;
    this.type = type;
  }

  public Factor(String name, double weight, boolean type){
    this.name = name;
    this.type = type;
    this.weight = weight;
  }
  /*public Factor(String name, boolean type)
  {
    this.name = name;
    this.type = type;
  }*/

  public void setName(String name)
  {
    this.name = name;
  }

  public void setPoint(int point)
  {
    this.point = point;
  }

  public void setWeight(double weight)
  {
    this.weight = weight;
  }

  public void setType(boolean type)
  {
    this.type = type;
  }

  public void setWeightedPoints(double weightedPoints)
  {
    this.weightedPoints = weightedPoints;
  }

  public String getName()
  {
    return name;
  }

  public int getPoint()
  {
    return point;
  }

  public double getWeight()
  {
    return weight;
  }

  public boolean isMA()
  {
    return type;
  }

  public double getWeightedPoints()
  {
    return weightedPoints;
  }

  public String toString()
  {
    return "Name: " + name + "\nPoint: " + point + "\nWeight: " + weight + "\nType: " + type;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Factor))
      return false;

    Factor other = (Factor) obj;

    return (name.equals(other.name) && point == other.point && weight == other.weight && type == other.type);
  }

  public abstract Factor copy();
}

