package OneUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyGui extends Application implements EventHandler<ActionEvent> {

    Button btnMessage;
    Button btnExit;
    Button btnHey;
    Button btnHello;
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of the Windows App");
        btnMessage=new Button();
        btnMessage.setText("Click Me");
        btnMessage.setOnAction(this);

        btnExit=new Button("Exit");
        btnExit.setOnAction(this);

        btnHey=new Button("Hey !");
        btnHey.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Alert alert =new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText(null);
                alert.setContentText("Hey Bro!");

                alert.showAndWait();
            }
        });

        btnHello=new Button("Hello");
        btnHello.setOnAction(event ->
        {
            Alert alert =new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Hello Bro!");

            alert.showAndWait();
        });
        StackPane layout=new StackPane();
        layout.getChildren().add(btnMessage);
        layout.getChildren().add(btnExit);
        layout.getChildren().add(btnHey);
        layout.getChildren().add(btnHello);

        Scene scene=new Scene(layout,300,250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource()==btnMessage)
        {
            Alert alert =new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Thank for Click me bro !");

            alert.showAndWait();
        }
        if (event.getSource()==btnExit)
        {
            System.exit(0);
        }
    }
}
