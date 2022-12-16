package Model;

public class QualitativeFactor extends Factor
{
  private QualitativeValue.QualitativeValues value;

  public QualitativeFactor(String name, int point, double weight, boolean type, QualitativeValue.QualitativeValues value){
    super(name, point, weight, type);
    this.value = value;
  }

  public QualitativeFactor(String name,double weight, boolean type){
    super(name,weight,type);
  }

  public void setValue(QualitativeValue.QualitativeValues value)
  {
    this.value = value;
  }

  public QualitativeValue.QualitativeValues getValue()
  {
    return value;
  }

  @Override public QualitativeFactor copy()
  {
    return new QualitativeFactor(super.getName(),super.getPoint(),super.getWeight(), super.isMA(), getValue());
  }

  public void assignPoints()
  {
    if (value.equals(QualitativeValue.QualitativeValues.BAD))
      setPoint(1);
    if (value.equals(QualitativeValue.QualitativeValues.MEDIUM_BAD))
      setPoint(2);
    if (value.equals(QualitativeValue.QualitativeValues.MEDIUM))
      setPoint(3);
    if (value.equals(QualitativeValue.QualitativeValues.MEDIUM_GOOD))
      setPoint(4);
    if (value.equals(QualitativeValue.QualitativeValues.GOOD))
      setPoint(5);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof QualitativeFactor))
      return false;
    QualitativeFactor other= (QualitativeFactor) obj;

    return super.equals(other) && value == other.value;
  }

  public String toString()
  {
    return super.toString() + "\nValue: " + value;
  }


}

