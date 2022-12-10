import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import java.io.IOException;

public class ViewHandler
{
  private Scene currentScene;

  private Region root;
  private Stage primaryStage;
  private ViewHandler viewHandler;
  private HomePageViewController homePageViewController;
  private ManageFactorsViewController manageFactorsViewController;


  public ViewHandler()
  {
    this.currentScene = new Scene(new Region());
  }

  public void start(Stage primaryStage) throws IOException
  {
    this.primaryStage = primaryStage;
    this.primaryStage.setTitle("IMS Calculator");
    openView("Home");
  }
  public void openView(String fxml)
  {

    switch (fxml){
      case "Home":
        System.out.println("1");
        root = loadHome("HomePageViewController.fxml");
        System.out.println("2");
        break;
      case "Manage Factors":
        root= loadManageFactors("ManageFactorsViewController.fxml");
        break;
    }
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
  public void closeView(){
    primaryStage.close();
  }
  private Region loadHome(String fxmlFile)
  {
    if (homePageViewController == null)
    {
      try{
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource(fxmlFile));
        System.out.println("3");
        root = loader.load();
        System.out.println("4");
      homePageViewController = loader.getController();
      homePageViewController.init(this, root);
    }    catch (Exception e){
     e.printStackTrace();
    }
  }
else
    {
      homePageViewController.reset();
    }
return homePageViewController.getRoot();

  }


  private Region loadManageFactors(String fxmlFile)
  {
    if (manageFactorsViewController == null)
    {
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        root = loader.load();
        manageFactorsViewController = loader.getController();
        manageFactorsViewController.init(this, root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    else{ manageFactorsViewController.reset();}
      return manageFactorsViewController.getRoot();

  }


}
