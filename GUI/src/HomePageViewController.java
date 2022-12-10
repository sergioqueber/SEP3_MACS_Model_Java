import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Region;

import java.io.IOException;

public class HomePageViewController
{
  @FXML
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

  private Region root;
  private ViewHandler viewHandler;

  public HomePageViewController(Region root, ViewHandler viewHandler)
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

  @FXML public void FactorsButtonPressed() throws IOException{
    viewHandler.openView("Manage Factors");
  }

  public Region getRoot()
  {
    return root;
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
