package com.pragmatic.atomReader.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.text.TableView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;

/**
 * @author Alexander Dimitrov 
 * 
 * Class RssReaderControler is controller on the fxml file
 *         
 */
public class RssReaderControler implements Initializable {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Button actionTargetAdd;

	@FXML
	private Button actionTargetRemove;

	@FXML
	private CheckBox actionTargetReaded;

	@FXML
	private Button actionTargetPrevious;

	@FXML
	private Button actionTargetNext;

	@FXML
	void handleButtonAdd(ActionEvent event) {
		System.out.println("handleButtonAdd");

		PopUpAddButtonController rssWindowControler = new PopUpAddButtonController();
		try {
			rssWindowControler.startAddRssWindow();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	void handleButtonNext(ActionEvent event) {
		System.out.println("handleButtonNext");
	}

	@FXML
	void handleButtonPrevious(ActionEvent event) {
		System.out.println("handleButtonPrevious");
	}

	@FXML
	void handleButtonReaded(ActionEvent event) {
		System.out.println("handleButtonReaded");

		if (actionTargetReaded.isSelected()) {
			System.out.println("Pressed button unread.");
		} else {
			System.out.println("Pressed button read.");
		}
	}

	@FXML
	void handleButtonRemove(ActionEvent event) {
		System.out.println("handleButtonRemove");
	}

	public void initialize(URL location, ResourceBundle resources) {

	}

}
