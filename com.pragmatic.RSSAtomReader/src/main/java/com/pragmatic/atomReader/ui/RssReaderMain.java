package com.pragmatic.atomReader.ui;

import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @author Alex Main class
 */
public class RssReaderMain extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("UInine.fxml"));

		stage.setTitle("Rss Reader");
		stage.setScene(new Scene(root, 800, 480));
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(RssReaderMain.class, args);
	}

	public class Table {

		private List<String> tableRss;
		private List<String> tableNews;

		public Table(List<String> tableRss, List<String> tableNews) {
			super();
			this.tableRss = tableRss;
			this.tableNews = tableNews;
		}

		public List<String> getTableRss() {
			return tableRss;
		}

		public void setTableRss(List<String> tableRss) {
			this.tableRss = tableRss;
		}

		public List<String> getTableNews() {
			return tableNews;
		}

		public void setTableNews(List<String> tableNews) {
			this.tableNews = tableNews;
		}
	}
}