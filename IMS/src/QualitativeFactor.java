public class QualitativeFactor extends factor
{
  private QualitativeValue value;

  QualitativeFactor(String name, int point, double weight, boolean type, QualitativeValue value){
    super(name, point, weight, type);
    this.value = value;
  }


}
