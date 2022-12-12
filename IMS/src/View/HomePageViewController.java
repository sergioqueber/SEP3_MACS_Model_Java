package View;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Region;
import Model.*;
public class HomePageViewController
{
  private Region root;
  private ViewHandler2 viewHandler2;
  private ModelIMS model;

  public HomePageViewController(){}

  @FXML
  private Button manageFactors;

  @FXML
  private Button manageCountries;

  @FXML
  private Button calculateIMS;
  @FXML
  private Button deletaAllData;
  @FXML
  private Label title;


  public void init(ViewHandler2 viewHandler2, Region root, ModelIMS model){
    this.viewHandler2 = viewHandler2;
    this.model = model;
    this.root = root;
  }



}
