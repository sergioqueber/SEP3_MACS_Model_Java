public class QuantitativeFactor
  extends Factor
{
  private double value;

  public QuantitativeFactor(String name, int point,double weight, double value)
  {
    super(name,point, weight);
    this.value=value;

  }

  public boolean equals(Object obj)
    {
      if (!(obj instanceof QuantitativeFactor))
        return false;
      QuantitativeFactor other= ( QuantitativeFactor) obj;

      return  factor
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

  public int assignPoint()
  {

  }



}
