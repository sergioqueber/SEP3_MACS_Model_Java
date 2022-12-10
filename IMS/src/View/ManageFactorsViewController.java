package View;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Region;
import Model.*;

public class ManageFactorsViewController
{

    private Region root;
    private ViewHandler2 viewHandler2;
    private ModelIMS model;

    @FXML
    private Button backButton;

    @FXML
    private Button deleteButton;

    @FXML
    private TableView <Factor> tableMA;

    @FXML
    private TableColumn<Factor,String> factorNameMA;
    @FXML
    private TableColumn<Factor,Double> factorWeightMA;

    @FXML
    private Label labelCS;

    @FXML
    private Label labelFactor;

    @FXML
    private Label labelMA;

    @FXML
    private Label labelWeight;

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
    private TableView<Factor> tableCS;

    @FXML
    private TableColumn<Factor, String> factorNamesCS;

    @FXML
    private CheckBox qualitativeCheck;

    @FXML
    private CheckBox quantitativeCheck;

    private TableColumn<Factor, Double> factorWeightCS;

    public ManageFactorsViewController(){};

    public void init(ViewHandler2 viewHandler2, Region root, ModelIMS model){
        this.viewHandler2 = viewHandler2;
        this.root = root;
        this.model = model;
    }

    public Region getRoot(){
        return root;
    }

    @FXML public void saveMA(){
        if (!(tableMA.getSelectionModel().isSelected(tableMA.getSelectionModel().getSelectedIndex()))){
            if(quantitativeCheck.isSelected())
            {
                double weight = Double.parseDouble(textFieldWeight.getText());
                QuantitativeFactor factor = new QuantitativeFactor(textFieldName.getText(), weight, true);
                model.getList1().addFactor(factor);
                System.out.println(model.getList1());
            }
            else if (qualitativeCheck.isSelected()){
                double weight = Double.parseDouble(textFieldWeight.getText());
                QualitativeFactor factor2 = new QualitativeFactor(textFieldName.getText(), weight, true);
                model.getList2().addFactor(factor2);
                System.out.println(model.getList1());
            }
        }
        else{
            if()
            model.getList1().getFactor(tableMA.getSelectionModel().getSelectedIndex()).setName(textFieldName.getText());
            model.getList1().getFactor(tableMA.getSelectionModel().getSelectedIndex()).setWeight(Double.parseDouble(textFieldWeight.getText()));
            System.out.println(model.getList1());
        }

        factorNameMA.setCellValueFactory(new PropertyValueFactory<>("name"));
        factorWeightMA.setCellValueFactory(new PropertyValueFactory<>("weight"));
        tableMA.getItems().clear();

        for (int i = 0; i < model.getList1().getNumberOfFactors(); i++)
        {
            tableMA.getItems().add(model.getList1().getFactor(i));
        }
        resetFields();
    }

    @FXML public void editFactor(){
        textFieldName.setText(tableMA.getSelectionModel().getSelectedItem().getName());
        textFieldWeight.setText(String.valueOf(tableMA.getSelectionModel().getSelectedItem().getWeight()));

    }
    public void resetFields()
    {
        textFieldName.setText("");
        textFieldWeight.setText("");
    }
}