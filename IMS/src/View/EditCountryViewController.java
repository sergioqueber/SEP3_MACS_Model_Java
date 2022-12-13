package View;

import Model.ModelIMS;
import View.ViewHandler2;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;

import java.util.ArrayList;

public class EditCountryViewController
{

  @FXML private Button backButton;
  private Region root;
  private ViewHandler2 viewHandler2;
  private ModelIMS model;



  public EditCountryViewController(){}


  public void init (ViewHandler2 viewHandler2, Region root, ModelIMS model){
    this.viewHandler2 = viewHandler2;
    this.root = root;
    this.model = model;
  }

  public void reset(){}

  public Region getRoot(){
    return root;
  }


  @FXML public void back(){
    viewHandler2.openView("Manage Countries");
  }

}
