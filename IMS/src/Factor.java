public class Factor
{
  private String name;
  private int point;
  private double weight;
  private boolean type;

  public Factor(String name, int point, double weight, boolean type) {
    this.name = name;
    this.point = point;
    this.weight = weight;
    this.type = type;
  }

  public Factor(String name, boolean type){
    this.name = name;
    this.type = type;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setPoint(int point) {
    this.point = point;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setType(boolean type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public int getPoint() {
    return point;
  }

  public double getWeight() {
    return weight;
  }

  public boolean isType() {
    return type;
  }

  public String toString(){
    return "Name: " + name + "\nPoint: " + point + "\nWeight: " + weight + "\nType: " + type;
  }

  public boolean equals(Object obj){
    if(!(obj instanceof Factor))
      return false;

    Factor other = (Factor)obj;

    return name.equals(other.name)  && point == other.point && weight == other.weight && type == other.type;
  }

public Factor copy(){
    Factor factor = new Factor(name, point, weight, type);
   return factor;
}

}
