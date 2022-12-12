package GUI.src;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.text.Text;

public class HomeViewController
{ @FXML
private Button calculateIMSbutton;

  @FXML
  private Button deleteAllDataButton;

  @FXML
  private Button exportDataButton;

  @FXML
  private Label label1;

  @FXML
  private Button loadDataButton;

  @FXML
  private Button manageCountriesButton;

  @FXML
  private Button manageFactorsButton;

  @FXML
  private Text hola;


  private Region root;
  private ViewHandler viewHandler;

  public HomeViewController(Region root, ViewHandler viewHandler)
  {
    this.root = root;
    this.viewHandler = viewHandler;
  }

  public void init(ViewHandler viewHandler, Region root)
  {
    this.viewHandler= viewHandler;
    this.root= root;
  }

  public void reset(){

  }
  public Region getRoot()
  {
    return root;
  }

  @FXML public void FactorsButtonPressed()
  {
    viewHandler.openView("Manage Factors");
  }

  @FXML public void CountriesButtonPressed()
  {
    viewHandler.openView("Manage Countries");
  }


/*
  @FXML public void CountryButtonPressed() throws IOException{
    viewHandler.openView();
  }

  @FXML public void CalculateButtonPressed() throws IOException{
    viewHandler.openView();
  }
*/

}
