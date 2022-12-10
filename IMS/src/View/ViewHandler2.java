package View;

import Model.ModelIMS;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class ViewHandler2
{
  private Scene currentScene;
  private Stage primaryStage;

  private ManageFactorsViewController manageFactorsViewController;
  private ModelIMS model;
  private Region root;

  public ViewHandler2(ModelIMS model)
  {
    this.currentScene = new Scene(new Region());
    this.model = model;
  }

  public void start(Stage primaryStage)
  {
    this.primaryStage = primaryStage;
    openView();
  }
  public void openView()
  {
    Region root = loadManageFactors("ManageFactorsViewController.fxml");
    currentScene.setRoot(root);
    String title = "";
    if (root.getUserData() != null)
    {
      title += root.getUserData();
    }
    primaryStage.setTitle(title);
    primaryStage.setScene(currentScene);
    primaryStage.setWidth(root.getPrefWidth());
    primaryStage.setHeight(root.getPrefHeight());
    primaryStage.show();
  }
  private Region loadManageFactors(String fxmlFile)
  {
    try
    {
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource(fxmlFile));
      root = loader.load();
      manageFactorsViewController = loader.getController();
      manageFactorsViewController.init(this,root,model);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    return root;
  }
}
