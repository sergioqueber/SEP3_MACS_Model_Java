package View;

import Model.Factor;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Region;
import Model.*;

import java.util.ArrayList;

public class ManageFactorsViewController
{ private
    private Region root;
    private ViewHandler viewHandler;
    private Model model;

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

    @FXML
    private CheckBox qualitativeCheck;

    @FXML
    private CheckBox quantitativeCheck;

    private TableColumn<Factor, Double> factorWeightCS;

    public ManageFactorsViewController;

    public void init(ViewHandler viewHandler, Region root){
        this.viewHandler = viewHandler;
        this.root = root;
    }

    public Region getRoot(){
        return root;
    }

    @FXML public void saveMA(){
        if (!(tableMA.getSelectionModel().isSelected(tableMA.getSelectionModel().getSelectedIndex()))){
            double weight =  Integer.parseInt(textFieldWeight.getText());
            QuantitativeFactor factor = new QuantitativeFactor(textFieldName.getText(), weight, quantitativeCheck.isSelected());


        }
    }
}