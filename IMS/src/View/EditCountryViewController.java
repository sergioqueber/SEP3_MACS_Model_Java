package View;

import Model.Factor;
import Model.ModelIMS;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Region;
import Model.*;

import javax.swing.text.View;

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
  private TextField textFieldValue;

  @FXML
  private TextField textFieldSource;
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
  @FXML
  private ChoiceBox<QualitativeValue.QualitativeValues> choiceBox;

  public EditCountryViewController(){}

  @FXML
  public void init(ViewHandler2 viewHandler2, Region root, ModelIMS model){
    this.viewHandler2 = viewHandler2;
    this.root = root;
    this.model = model;
    choiceBox.getItems().add(0,model.getQualitativeValues(0));
    choiceBox.getItems().add(1,model.getQualitativeValues(1));
    choiceBox.getItems().add(2,model.getQualitativeValues(2));
    choiceBox.getItems().add(3,model.getQualitativeValues(3));
    choiceBox.getItems().add(4,model.getQualitativeValues(4));
    refresh();
  }

  public Region getRoot(){
    return root;
  }
  @FXML public void refresh(){
    quantiFactorNameMA.setCellValueFactory(new PropertyValueFactory<>("name"));
    quantiFactorWeightMA.setCellValueFactory(new PropertyValueFactory<>("weight"));
    for (int i = 0; i < model.getList3().getCountry(model.getSelectedCountryIndex()).getQuantitativeFactors().getMAFactors().size(); i++)
    {
      quantiTableMA.getItems().add(model.getList3().getCountry(model.getSelectedCountryIndex()).getQuantitativeFactors().getMAFactors().get(i));
    }
  }
  @FXML public void saveMA(){
    if(quantitativeCheck.isSelected()){
      model.getList3().getCountry(model.getSelectedCountryIndex()).setQuantitativeValueMA(quantiTableMA.getSelectionModel().getSelectedIndex(),Double.parseDouble(textFieldValue.getText()));
      System.out.println(model.getList1());


      quantiFactorValueMA.setCellValueFactory(new PropertyValueFactory<>("value"));
      quantiTableMA.getItems().clear();

      for (int i = 0; i < model.getList3().getCountry(model.getSelectedCountryIndex()).getQuantitativeFactors().getMAFactors().size(); i++)
      {
        quantiTableMA.getItems().add(model.getList3().getCountry(model.getSelectedCountryIndex()).getQuantitativeFactors().getMAFactors().get(i));
      }
    }
    else if(qualitativeCheck.isSelected()){
      model.getList3().getCountry(model.getSelectedCountryIndex()).setQualitativeValue(qualiTableMA.getSelectionModel().getSelectedIndex(),choiceBox.getValue());

      System.out.println(model.getList2());


      qualiFactorNameMA.setCellValueFactory(new PropertyValueFactory<>("name"));
      qualiFactorWeightMA.setCellValueFactory(new PropertyValueFactory<>("weight"));qualiFactorValueMA.setCellValueFactory(new PropertyValueFactory<>("value"));
      qualiTableMA.getItems().clear();

      for (int i = 0; i < model.getList2().getMAFactors().size(); i++)
      {
        qualiTableMA.getItems().add(model.getList2().getMAFactors().get(i));
      }
    }

    resetFields();
  }

  @FXML public void saveCS(){
    if(quantitativeCheck.isSelected()){
      model.getList3().getCountry(model.getSelectedCountryIndex()).setQuantitativeValueCS(quantiTableCS.getSelectionModel().getSelectedIndex(),Double.parseDouble(textFieldValue.getText()));
      System.out.println(model.getList1());
      quantiFactorNameCS.setCellValueFactory(new PropertyValueFactory<>("value"));
      quantiTableCS.getItems().clear();

      for (int i = 0; i < model.getList3().getCountry(model.getSelectedCountryIndex()).getQuantitativeFactors().getMAFactors().size(); i++)
      {
        quantiTableCS.getItems().add(model.getList3().getCountry(model.getSelectedCountryIndex()).getQuantitativeFactors().getCSFactors().get(i));
      }
    }
    else if(qualitativeCheck.isSelected()){

      System.out.println(model.getList2());
      qualiFactorNameCS.setCellValueFactory(new PropertyValueFactory<>("name"));
      qualiFactorWeightCS.setCellValueFactory(new PropertyValueFactory<>("weight"));
      qualiTableCS.getItems().clear();

      for (int i = 0; i < model.getList2().getCSFactors().size(); i++)
      {
        qualiTableCS.getItems().add(model.getList2().getCSFactors().get(i));
      }
    }

    resetFields();
  }

  public void resetFields(){
     textFieldValue.setText("");
     textFieldSource.setText("");
  }
}
