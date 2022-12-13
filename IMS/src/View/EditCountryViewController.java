package View;

import Model.Factor;
import Model.ModelIMS;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import Model.*;

public class EditCountryViewController
{
  private Region root;
  private ViewHandler2 viewHandler2;
  private ModelIMS model;

  @FXML
  private Button backButton;

  @FXML
  private Button deleteButton;

  @FXML
  private TableView<Factor> qualiTableMA;

  @FXML
  private TableColumn<Factor,String> qualiFactorNameMA;
  @FXML
  private TableColumn<Factor,Double> qualiFactorWeightMA;
  @FXML
  private TableColumn<Factor,QualitativeFactor> qualiFactorValueMA;
  @FXML
  private TableColumn<Factor,String> qualiFactorSourceMA;

  @FXML
  private TableView <Factor> quantiTableMA;

  @FXML
  private TableColumn<Factor,String> quantiFactorNameMA;
  @FXML
  private TableColumn<Factor,Double> quantiFactorWeightMA;
  @FXML
  private TableColumn<Factor,Double> quantiFactorValueMA;
  @FXML
  private TableColumn<Factor,String> quantiFactorSourceMA;

  @FXML
  private Label labelCS;

  @FXML
  private Label labelValue;

  @FXML
  private Label labelMA;

  @FXML
  private Label labelSource;
  @FXML
  private Button saveCSButton;

  @FXML
  private Button saveMAButton;

  @FXML
  private Button edit;


  @FXML
  private TextField textFieldName;

  @FXML
  private TextField textFieldWeight;
  @FXML
  private TableView<Factor> qualiTableCS;

  @FXML
  private TableColumn<Factor, String> qualiFactorNameCS;

  @FXML
  private CheckBox qualitativeCheck;

  @FXML
  private CheckBox quantitativeCheck;

  @FXML
  private TableColumn<Factor, Double> qualiFactorWeightCS;
  @FXML
  private TableColumn<Factor,QualitativeFactor> qualiFactorValueCS;
  @FXML
  private TableColumn<Factor,String> qualiFactorSourceCS;

  @FXML
  private TableView<Factor> quantiTableCS;

  @FXML
  private TableColumn<Factor, String> quantiFactorNameCS;
  @FXML
  private TableColumn<Factor, Double> quantiFactorWeightCS;
  @FXML
  private TableColumn<Factor,Double> quantiFactorValueCS;
  @FXML
  private TableColumn<Factor,String> quantiFactorSourceCS;
}
