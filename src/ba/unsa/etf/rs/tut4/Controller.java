package ba.unsa.etf.rs.tut4;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;


public class Controller {

    public TextArea ulaz;
    public TextArea izlaz;

    public void dodaj(ActionEvent actionEvent) {
        String ulazni = ulaz.getText();
        String[] red = ulazni.split("\n");
        for (int i = 0; i < red.length; i++) {
            izlaz.setText(izlaz.getText() + red[i]+"\n");
        }
    }
}
