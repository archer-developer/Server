package application;

import gui.ServerInterface;
import javafx.application.Application;
import javafx.stage.Stage;
import server.Server;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		new ServerInterface();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
