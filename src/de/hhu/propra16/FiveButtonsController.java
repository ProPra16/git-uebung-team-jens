package de.hhu.propra16;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;



/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtonsController {
	@FXML
	public void useButton(ActionEvent event){
		System.exit(0);
		
	}

	@FXML
	public void alertTest(ActionEvent e) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setContentText("Too Many Buttons!");
		alert.showAndWait();

	}

    @FXML
    protected void handleExitButton(ActionEvent event){

        System.exit(0);

    }

}
