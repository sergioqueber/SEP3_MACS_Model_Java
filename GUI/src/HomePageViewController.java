package GUI.src;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.Region;

public class HomePageViewController
{

  private Region root;
  private ViewHandler viewHandler;

  @FXML
  private Button manageCountriesButton;

  @FXML
  private Button manageFactorsButton;

  @FXML
  private Button IMScalculationButton;

  @FXML
  private Button deleteAllDataButton;

  @FXML
  private Label label1;

  public HomePageViewController(){}

  public void init (ViewHandler viewHandler, Region root){
    this.viewHandler = viewHandler;
    this.root = root;
  }

  public void reset(){}

  public Region getRoot(){
    return root;
  }

  @FXML private void ManageFactorsPressed(){
    viewHandler.openView("Manage Factors");
  }

  @FXML private void ManageCountriesPressed(){
    viewHandler.openView("Manage Countries");
  }


}
