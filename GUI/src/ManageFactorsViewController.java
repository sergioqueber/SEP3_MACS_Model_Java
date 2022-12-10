import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Region;

public class ManageFactorsViewController
{
    private Region root;
    private ViewHandler viewHandler;

    @FXML
    private Button backButton;

    @FXML
    private Button deleteButton;

    @FXML
    private TableView <Integer> tableMA;

    @FXML
    private TableColumn<Integer,String> factorColumnMA;
    @FXML
    private TableColumn<Integer,String> factorColumnCS;

    @FXML
    private Label labelCS;

    @FXML
    private Label labelFactor;

    @FXML
    private Label labelMA;

    @FXML
    private Label labelWeight;

    @FXML
    private Button saveCSbutton;

    @FXML
    private Button saveMAbutton;

    @FXML
    private Button edit;


    @FXML
    private TextField textFieldFactor;


    @FXML
    private TextField textFieldWeight;
    @FXML
    private TableView<Factor> tableCS;

    @FXML
    private TableColumn<Factor, String> factorNames;

    @FXML
    private TableColumn<Factor, Integer> weightColumn;

  ArrayList<Factor> MAFactor = new ArrayList<Factor>();

    @FXML public void addFactor()
    {
        if(!(tableCS.getSelectionModel().isSelected(tableCS.getSelectionModel().getSelectedIndex())))
        {
            int weight = Integer.parseInt(textFieldWeight.getText());
            Factor factor = new Factor(textFieldFactor.getText(), weight);
            MAFactor.add(factor);
            System.out.println(MAFactor);
        }
        else
        {
            MAFactor.get(tableCS.getSelectionModel().getSelectedIndex()).setName(textFieldFactor.getText());
            MAFactor.get(tableCS.getSelectionModel().getSelectedIndex()).setValue(Integer.parseInt(textFieldWeight.getText()));
        }
        factorNames.setCellValueFactory(new PropertyValueFactory<>("name"));
        weightColumn.setCellValueFactory(new PropertyValueFactory<>("value"));
        tableCS.getItems().clear();

        for (int i = 0; i < MAFactor.size(); i++)
        {
            tableCS.getItems().add(MAFactor.get(i));
        }
        resetFields();
    }

    @FXML public void editFactor(){
        textFieldFactor.setText(tableCS.getSelectionModel().getSelectedItem().getName());
        textFieldWeight.setText(String.valueOf(tableCS.getSelectionModel().getSelectedItem().getValue()));

    }


    /*@FXML public void addWeight(){
        MAWeight.add(textFieldWeight.getText());
        System.out.println(MAWeight);
        weightColumnMA.setCellValueFactory(new PropertyValueFactory<>(textFieldWeight.getText()));
        resetField();

    }*/
public void resetFields(){
  textFieldFactor.setText("");
  textFieldWeight.setText("");
}

public Region getRoot(){
    return root;
}

    public void reset()
    {
    }

    public void init(ViewHandler viewHandler, Region root)
    {
        this.viewHandler = viewHandler;
        this.root= root;
    }


/*public void initialize(URL url, ResourceBundle resourceBundle){}
factorColumnMA.setCellValueFactory(new PropertyValueFactory<>(textFieldFactor.getText()));
weightColumnMA.setCellValueFactory(new PropertyValueFactory<>(textFieldWeight.getText()));
table.setItems(get)*/
}