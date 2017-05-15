package observerPattern;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.Observable;
import java.util.Observer;

public class FirstController implements Observer {
    private Counter counter;

    @FXML
    private TextField text;

    @FXML
    public void buttonIncrementClicked(){
        counter.setCounter(counter.getCounter() + 1);
    }

    @FXML
    public void buttonDecrementClicked(){
        counter.setCounter(counter.getCounter() - 1);
    }

    @Override
    public void update(Observable o, Object arg) {
        text.setText(Integer.toString(counter.getCounter()));
    }

    public void setCounter(Counter counter) {
        this.counter = counter;
        counter.addObserver(this);
    }
}
