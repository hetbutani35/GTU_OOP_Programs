import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class tictactoe extends Application
{
    @Override   //override the start method in the application class
    public void start(Stage primaryStage)
    {
        //create a pane
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                int random = (int)(Math.random() * 3);
                if (random != 2)
                {
                    String image = (random > 0) ? "/image/x.gif" : "/image/o.gif";
                    pane.add(new ImageView(new Image(image)), j, i);
                }
            }
        }
        //create a scene and place it in the stage
        Scene scene = new Scene(pane, 180, 180);
        primaryStage.setTitle("tictactoe");//set title for stage
        primaryStage.setScene(scene);//place the scene in the stage
        primaryStage.show();//display the stage
    }
    public static void main(String[] args)
    {
        Application.launch(args);
    }
}
