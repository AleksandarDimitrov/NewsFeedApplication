package com.pragmatic.atomReader.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PopUpAddButtonController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextField actionTargetGetRssText;

	@FXML
	private Button actionTargetAddRss;

	@FXML
	void handleButtonAddRss(ActionEvent event) throws IOException {
		System.out.println("handleButtonAddRss");
		if (!actionTargetGetRssText.getText().contains("http://")) {
			System.out.println("returnRSS");
			return;
		}
		System.out.println(actionTargetGetRssText.getText());
		startAddRssWindow().close();
	}

	public Stage startAddRssWindow() throws IOException {
		Parent homePageParent = FXMLLoader.load(getClass().getResource("UIPopUpAddRss.fxml"));
		Stage stage = new Stage();
		stage.setTitle("Add RSS");
		stage.setScene(new Scene(homePageParent, 380, 150));
		stage.show();

		return stage;
	}

}
