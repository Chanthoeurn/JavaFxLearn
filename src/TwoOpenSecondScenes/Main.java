package TwoOpenSecondScenes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene1,scene2;

    Label lblMessage;
    Button btn1,btn2;
    @Override
    public void start(Stage primaryStage) throws Exception {

        window=primaryStage;
        lblMessage=new Label("Wellcome First Scene");
        //button1
        btn1=new Button("Go to Scene 2");
        btn1.setOnAction(e-> window.setScene(scene2));

        //LayoutScene1
        VBox layout =new VBox(20);
        layout.getChildren().addAll(lblMessage,btn1);
        scene1=new Scene(layout,200,200);

        //button2
        btn2=new Button("Go to Scene 1");
        btn2.setOnAction(e->window.setScene(scene1));

        //LayoutScene2
        StackPane layout2=new StackPane();
        layout2.getChildren().add(btn2);
        scene2=new Scene(layout2,300,300);


        window.setScene(scene2);
        window.setTitle("My Scene");
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
