package Model;
public class QuantitativeFactor extends Factor
{
  private double value;

  public QuantitativeFactor(String name, int point,double weight, boolean type, double value)
  {
    super(name,point,weight,type);
    this.value=value;

  }
  public QuantitativeFactor(String name, double weight, boolean type){
    super(name,weight,type);
  }

  public double getValue()
  {
    return value;
  }

  public void setValue(double value)
  {
    this.value = value;
  }

  @Override public Factor copy()
  {
    return new QuantitativeFactor(super.getName(),super.getPoint(),super.getWeight(), super.isMA(), getValue());
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof QuantitativeFactor))
      return false;
    QuantitativeFactor other= ( QuantitativeFactor) obj;

    return super.equals(other) && value == other.value;
  }

  public String toString()
  {
    return super.toString() + "\nValue: " + value;
  }
}
