import javafx.application.Application;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MyApplication extends Application
{
  @Override
  public void start(Stage primaryStage) throws FileNotFoundException
  {
    ViewHandler view = new ViewHandler();
    view.start(primaryStage);
  }
}
