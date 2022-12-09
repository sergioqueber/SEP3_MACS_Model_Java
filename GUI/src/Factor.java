import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public class Factor
{
  private String name;
  private int value;

  public Factor(String name, int value){
    this.name = name;
    this.value = value;
  }

  public String getName()
  {
    return name;
  }

  public int getValue()
  {
    return value;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setValue(int value)
  {
    this.value = value;
  }
}
