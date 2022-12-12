package GUI.src;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;

import java.util.ArrayList;

public class EditCountryViewController
{

  @FXML private Button backButton;
  private Region root;
  private ViewHandler viewHandler;




  public EditCountryViewController(){}


  public void init (ViewHandler viewHandler, Region root){
    this.viewHandler = viewHandler;
    this.root = root;
  }

  public void reset(){}

  public Region getRoot(){
    return root;
  }


  @FXML public void back(){
    viewHandler.openView("Home Page");
  }
/*
  ArrayList<Factor>  = new ArrayList<Factor>();

  public void setTableContent(ArrayList<Book> bookList) {
    ObservableList<Book> data = FXCollections.<Book>observableArrayList(new Book("Test", 1));
    data.addAll(bookList);

    tableBookList.setItems(data);

 */
}
