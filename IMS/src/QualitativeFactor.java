public class QualitativeFactor extends Factor
{
  private QualitativeValue value;

  QualitativeFactor(String name, int point, double weight, boolean type, QualitativeValue value){
    super(name, point, weight, type);
    this.value = value;
  }

  public void setValue(QualitativeValue value){
    this.value = value;
  }

  public QualitativeValue getValue (){
    return value;
  }

  public boolean isHigherThan (QualitativeFactor factor){
    switch (factor)
    case
  }

}
