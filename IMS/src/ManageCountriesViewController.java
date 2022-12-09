import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
  public class ManageCountriesViewController {

    @FXML
    private Button back;

    @FXML
    private Label country;

    @FXML
    private TextField countryInput;

    @FXML
    private ListView<?> countryList;

    @FXML
    private Button deleteCountry;

    @FXML
    private Button manageFactors;

    @FXML
    private Button saveCountry;

    private Region root;

    private ViewHandler viewHandler;


  }



