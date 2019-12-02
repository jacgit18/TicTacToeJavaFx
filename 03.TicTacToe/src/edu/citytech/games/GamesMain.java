package edu.citytech.games; 

import java.net.URL;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GamesMain extends Application {


	public static void main(String[] args) {
		Application.launch(GamesMain.class, args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.
				 load(getClass().getResource("Games.fxml"));
		
		stage.setTitle("Tic Tac Toe");
		Scene scene = new Scene(root); 
		stage.setScene(scene);
		stage.show();		

		
		
		
		URL url = getClass().getResource("Games.css");
		if(url == null) {
			System.out.println("Resources not found Aborting");
			System.exit(-1);
		}
		
		
		
		String css = url .toExternalForm();
		scene.getStylesheets().add(css);
		

		
	}
	

}
