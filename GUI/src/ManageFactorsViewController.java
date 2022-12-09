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

    @FXML private Button backButton;

    @FXML private Button deleteButton;

    @FXML private TableView<Integer> tableMA;

    @FXML private TableColumn<Integer, String> factorColumnMA;
    @FXML private TableColumn<Integer, String> factorColumnCS;

    @FXML private Label labelCS;

    @FXML private Label labelFactor;

    @FXML private Label labelMA;

    @FXML private Label labelWeight;

    @FXML private Button saveCSbutton;

    @FXML private Button saveMAbutton;

    @FXML private TableView<Integer> tableCS;

    @FXML private TextField textFieldFactor;

    @FXML private TextField textFieldWeight;

    @FXML private TableColumn<Integer, Integer> weightColumnCS;

    @FXML private TableColumn<Integer, Integer> weightColumnMA;

    ArrayList MAFactor = new ArrayList();
    ArrayList MAWeight = new ArrayList();

    @FXML public void addFactor()
    {
        MAFactor.add(textFieldFactor.getText());
        System.out.println(MAFactor);
        factorColumnMA.setCellValueFactory(new PropertyValueFactory<>(textFieldFactor.getText()));
        resetField();

        MAWeight.add(textFieldWeight.getText());
        System.out.println(MAWeight);
        weightColumnMA.setCellValueFactory(new PropertyValueFactory<>(textFieldWeight.getText()));
        resetField();

    }

    public void resetField()
    {
        textFieldFactor.setText("");
        textFieldWeight.setText((""));

    }

/*
public void initialize(URL url, ResourceBundle resourceBundle){}
factorColumnMA.setCellValueFactory(new PropertyValueFactory<>(textFieldFactor.getText()));
weightColumnMA.setCellValueFactory(new PropertyValueFactory<>(textFieldWeight.getText()));
table.setItems(get)
}*/
}