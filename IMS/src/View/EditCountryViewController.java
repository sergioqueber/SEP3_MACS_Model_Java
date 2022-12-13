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

  public EditCountryViewController(){}

  public void init(ViewHandler2 viewHandler2, Region root, ModelIMS model){
    this.viewHandler2 = viewHandler2;
    this.root = root;
    this.model = model;
  }

  public Region getRoot(){
    return root;
  }

  @FXML public void saveMA(){
    if(quantitativeCheck.isSelected()){
      model.getCountryList().getCountry(model.getSelectedCountryIndex()).getQuantitativeFactors().getMAFactors().get(quantiTableMA.getSelectionModel().getSelectedIndex()).se

      model.getList1().getCSFactors().get(quantiTableMA.getSelectionModel().getSelectedIndex()).setName(textFieldName.getText());
      model.getList1().getCSFactors().get(quantiTableMA.getSelectionModel().getSelectedIndex()).setWeight(Double.parseDouble(textFieldWeight.getText()));
      //model.getList1().getFactor(quantiTableMA.getSelectionModel().getSelectedIndex()).setName(textFieldName.getText());
      //model.getList1().getFactor(quantiTableMA.getSelectionModel().getSelectedIndex()).setWeight(Double.parseDouble(textFieldWeight.getText()));
      System.out.println(model.getList1());
      quantiFactorNameMA.setCellValueFactory(new PropertyValueFactory<>("name"));
      quantiFactorWeightMA.setCellValueFactory(new PropertyValueFactory<>("weight"));
      quantiTableMA.getItems().clear();

      for (int i = 0; i < model.getList1().getMAFactors().size(); i++)
      {
        quantiTableMA.getItems().add(model.getList1().getMAFactors().get(i));
      }
    }
    else if(qualitativeCheck.isSelected()){
      if (!(qualiTableMA.getSelectionModel().isSelected(qualiTableMA.getSelectionModel().getSelectedIndex()))){
        double weight = Double.parseDouble(textFieldWeight.getText());
        QualitativeFactor factor2 = new QualitativeFactor(textFieldName.getText(), weight, true);
        model.getList2().addFactor(factor2);
        System.out.println(model.getList2());
      }
      else
      {
        model.getList2().getCSFactors().get(qualiTableMA.getSelectionModel().getSelectedIndex()).setName(textFieldName.getText());
        model.getList2().getCSFactors().get(qualiTableMA.getSelectionModel().getSelectedIndex()).setWeight(Double.parseDouble(textFieldWeight.getText()));
        //model.getList2().getFactor(qualiTableMA.getSelectionModel().getSelectedIndex()).setName(textFieldName.getText());
        //model.getList2().getFactor(qualiTableMA.getSelectionModel().getSelectedIndex()).setWeight(Double.parseDouble(textFieldWeight.getText()));
        System.out.println(model.getList2());
      }
      qualiFactorNameMA.setCellValueFactory(new PropertyValueFactory<>("name"));
      qualiFactorWeightMA.setCellValueFactory(new PropertyValueFactory<>("weight"));
      qualiTableMA.getItems().clear();

      for (int i = 0; i < model.getList2().getMAFactors().size(); i++)
      {
        qualiTableMA.getItems().add(model.getList2().getMAFactors().get(i));
      }
    }

    resetFields();
  }

  public void resetFields(){
     textFieldValue.setText("");
     textFieldSource.setText("");
  }
}
