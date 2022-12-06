import java.util.*;
public class QuantitativeFactor extends Factor
{
  private double value;

  public QuantitativeFactor(String name, int point,double weight, boolean type, double value)
  {
    super(name,point,weight,type);
    this.value=value;

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
      return super.toString() + value;
    }

  public double getValue()
  {
    return value;
  }

  public void setValue(double value)
  {
    this.value = value;
  }


  public boolean isHigherThan(QuantitativeFactor quantitativeFactor)
  {

  }

  @Override public int assignPoints()
  {

  }

  @Override public Factor copy()
  {
    return null;
  }
}
