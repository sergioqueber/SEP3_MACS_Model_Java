package GUI.src;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;


public class ViewHandler{

  private Scene currentScene;
  private Stage primaryStage;
  private ViewHandler viewHandler;
  private Region root;
  private HomeViewController homeViewController;
  private ManageCountriesViewController manageCountriesViewController;
  //private ManageFactorsViewController manageFactorsViewController;


  public ViewHandler(){
//    root = new Region();
    Scene s = new Scene(new Pane());
    this.currentScene= new Scene(new Region());
  }




  public void openView(String window){
    root = null;
    switch(window){
      case "Home Page":
        root = loadHomeViewController("HomeView.fxml");
  /*     break;
      case "Manage Factors":
        root = loadManageFactorsView("ManageFactorsViewController.fxml");
        break;
      case "Manage Countries":
        root = loadManagCountriesView("ManageCountriesViewController.fxml");
        break;*/
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


  private Region loadHomeViewController(String fxmFile){
    if (homeViewController == null){
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmFile));
        root = loader.load();
        homeViewController = loader.getController();
        homeViewController.init(this, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    return root;
  }

/*
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
*/
  /*
  private Region loadManagCountriesView(String fxmFile){
    if (manageCountriesViewController == null){
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
  */
}



