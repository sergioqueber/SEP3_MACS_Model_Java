
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;


public class ViewHandler{

  private final Scene currentScene;
  private Stage primaryStage;
  private ViewHandler viewHandler;
  private Region root;
  private HomePageViewController homePageViewController;
  private ManageCountriesViewController manageCountriesViewController;
  private ManageFactorsViewController manageFactorsViewController;


  public ViewHandler(){
    this.currentScene= new Scene(new Region());
  }




  public void openView(String window){
    root = null;
    switch(window){
      case "Home Page":
        root = loadHomePageView("HomePageView.fxml");
        break;
      case "Manage Factors":
        root = loadManageFactorsView("ManageFactorsViewController.fxml");
        break;
      case "Manage Countries":
        root = loadManagCountriesView("ManageCountriesViewController.fxml");
        break;
    }
    currentScene.setRoot(root);
    String title = "";
    if (root.getUserData() != null){
      title += root.getUserData();
    }
    primaryStage.setTitle(title);
    primaryStage.setScene(currentScene);
    primaryStage.setWidth(root.getPrefWidth());
    primaryStage.setHeight(root.getPrefHeight());
    primaryStage.show();
  }

  public void start(Stage primaryStage) {
    this.primaryStage = primaryStage;
    openView("Home Page");
  }
  public void closeView(){
    primaryStage.close();
  }


  private Region loadHomePageView(String fxmFile){
    if (homePageViewController == null){
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmFile));
        root = loader.load();
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    return root;
  }


  private Region loadManageFactorsView(String fxmFile){
    if (manageFactorsViewController == null){
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmFile));
        root = loader.load();
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    return root;
  }

  private Region loadManagCountriesView(String fxmFile){
    if (manageFactorsViewController == null){
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmFile));
        root = loader.load();
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    return root;
  }
}



