package GUI.src;

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
  private EditCountryViewController editCountryViewController;


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
        root = loadManageCountriesView("ManageCountriesViewController.fxml");
        break;
      case "IMS Calculator":
        root = loadEditCountryViewController("EditCountryViewController.fxml");
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
        homePageViewController = loader.getController();
        homePageViewController.init(this, root);
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
        manageFactorsViewController = loader.getController();
        manageFactorsViewController.init(this,root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    return root;
  }

  private Region loadManageCountriesView(String fxmFile){
    if (manageCountriesViewController == null){
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmFile));
        root = loader.load();
        manageCountriesViewController = loader.getController();
        manageCountriesViewController.init(this, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    return root;
  }

  private Region loadEditCountryViewController(String fxmFile){
    if (editCountryViewController == null){
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmFile));
        root = loader.load();
        editCountryViewController = loader.getController();
        editCountryViewController.init(this, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    return root;
  }

}



