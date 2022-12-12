package GUI.src;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Region;

import java.util.ArrayList;

public class ManageCountriesViewController
{
  private Region root;
  private ViewHandler viewHandler;

  @FXML private Button addCountryButton;

  @FXML private Button backButton;

  @FXML private Label countryLabel;

  @FXML private TextField countryTextField;

  @FXML private Button editCountryButton;

  @FXML private Button manageFactorsButton;

  @FXML private ListView<Country> listView;

  ArrayList<Country> CountryList = new ArrayList<Country>();

  @FXML public void addCountry()
  {
    if (!(listView.getSelectionModel().isSelected(listView.getSelectionModel().getSelectedIndex())))
    {
      Country country = new Country(countryTextField.getText());
      CountryList.add(country);
      System.out.println(CountryList);
    }
    else
    {
      CountryList.get(listView.getSelectionModel().getSelectedIndex()).setName(countryTextField.getText());
    }
    listView.getItems().clear();

    for (int i = 0; i < CountryList.size(); i++)
    {
      listView.getItems().add(CountryList.get(i));
    }
    resetFields();
  }
  public void init (ViewHandler viewHandler, Region root){
    this.viewHandler = viewHandler;
    this.root = root;
  }

  public void resetFields()
  {
    countryTextField.setText("");
  }

  @FXML public void editCountry()
  {
    countryTextField.setText(listView.getSelectionModel().getSelectedItem().getName());

  }

  @FXML public void back(){
    viewHandler.openView("Home Page");
  }
  @FXML private void IMScalculatorPressed(){
    viewHandler.openView("IMS Calculator");
  }

}
