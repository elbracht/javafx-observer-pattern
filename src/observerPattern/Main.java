package observerPattern;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage firstStage) throws Exception{
        Counter counter = new Counter();

        // FirstView
        FXMLLoader firstLoader = new FXMLLoader();
        Parent firstView = firstLoader.load(getClass().getResource("firstView.fxml").openStream());

        firstStage.setTitle("First");
        firstStage.setScene(new Scene(firstView, 300, 275));
        firstStage.show();
        firstStage.setX(firstStage.getX() - 155);

        FirstController firstController = firstLoader.getController();
        firstController.setCounter(counter);

        // SecondView
        FXMLLoader secondLoader = new FXMLLoader();
        Parent secondView = secondLoader.load(getClass().getResource("secondView.fxml").openStream());

        Stage secondStage = new Stage();
        secondStage.setTitle("Second");
        secondStage.setScene(new Scene(secondView, 300, 275));
        secondStage.show();
        secondStage.setX(secondStage.getX() + 155);

        SecondController secondController = secondLoader.getController();
        secondController.setCounter(counter);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
