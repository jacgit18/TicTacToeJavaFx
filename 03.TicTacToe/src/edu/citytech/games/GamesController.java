package edu.citytech.games;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;

// try to get rest to replace everything with the question marks
// then if you finish everything try to turn each value red
// also when changing things like adding label after you save it then view and show at the bottom and copy variable close
// scene builder and refresh code folder also look at fxml file for changes
public class GamesController {

    @FXML
    private FlowPane fpGames;

    @FXML
    private Label lbl_1;

    @FXML
    private Label lbl_2;

    @FXML
    private Label lbl_3;

    @FXML
    private Label lbl_4;

    @FXML
    private Label lbl_5;

    @FXML
    private Label lbl_6;

    @FXML
    private Label lbl_7;

    @FXML
    private Label lbl_8;

    @FXML
    private Label lbl_9;

    @FXML
    private Button btnReset;

    @FXML
    private Label lblMessage;


	private boolean isX = false;

	@FXML
	void onMouseClicked(MouseEvent event) {
		Label label = (Label) event.getSource();
		if (!label.getText().equals("?")) {
			String value = "illegal move";
			lblMessage.setText(value);

			return;
		}

		String nextMove = isX ? "X" : "O";
		label.setText(nextMove);
		isX = !isX;

		String p1, p2, p3, p4, p5, p6, p7, p8, p9;
		p1 = lbl_1.getText();
		p2 = lbl_2.getText();
		p3 = lbl_3.getText();
		p4 = lbl_4.getText();
		p5 = lbl_5.getText();
		p6 = lbl_6.getText();
		p7 = lbl_7.getText();
		p8 = lbl_8.getText();
		p9 = lbl_9.getText();

		// Draw
//		Label mylist [] [] [] = new Label[3][] [];

		
//		for(int i = 0; i == mylist.length; i++ )
//			
//			    for (int j = i; j == mylist.length; ++j)
//			    	
//			        for (int k = j; k == mylist.length; ++k)
			        
			        	
		
		 if (p1.equals("X") && p2.equals("X") && p3.equals("X")) {

			lbl_1.setTextFill(Color.RED);
			lbl_2.setTextFill(Color.RED);
			lbl_3.setTextFill(Color.RED);
			lblMessage.setText("Winner is X");
		}

		else if (p1.equals("O") && p2.equals("O") && p3.equals("O")) {

			lbl_1.setTextFill(Color.RED);
			lbl_2.setTextFill(Color.RED);
			lbl_3.setTextFill(Color.RED);
			lblMessage.setText("Winner is O");
		}

		else if (p4.equals("X") && p5.equals("X") && p6.equals("X")) {

			lbl_4.setTextFill(Color.RED);
			lbl_5.setTextFill(Color.RED);
			lbl_6.setTextFill(Color.RED);
			lblMessage.setText("Winner is X");
		}

		else if (p4.equals("O") && p5.equals("O") && p6.equals("O")) {

			lbl_4.setTextFill(Color.RED);
			lbl_5.setTextFill(Color.RED);
			lbl_6.setTextFill(Color.RED);
			lblMessage.setText("Winner is O");
		}

		else if (p7.equals("X") && p8.equals("X") && p9.equals("X")) {

			lbl_7.setTextFill(Color.RED);
			lbl_8.setTextFill(Color.RED);
			lbl_9.setTextFill(Color.RED);
			lblMessage.setText("Winner is X");
		}

		else if (p7.equals("O") && p8.equals("O") && p9.equals("O")) {

			lbl_7.setTextFill(Color.RED);
			lbl_8.setTextFill(Color.RED);
			lbl_9.setTextFill(Color.RED);
			lblMessage.setText("Winner is O");
		}

		else if (p1.equals("X") && p4.equals("X") && p7.equals("X")) {

			lbl_1.setTextFill(Color.RED);
			lbl_4.setTextFill(Color.RED);
			lbl_7.setTextFill(Color.RED);
			lblMessage.setText("Winner is X ");
		}

		else if (p1.equals("O") && p4.equals("O") && p7.equals("O")) {

			lbl_1.setTextFill(Color.RED);
			lbl_4.setTextFill(Color.RED);
			lbl_7.setTextFill(Color.RED);
			lblMessage.setText("Winner is O");
		}

		else if (p2.equals("X") && p5.equals("X") && p8.equals("X")) {

			lbl_2.setTextFill(Color.RED);
			lbl_5.setTextFill(Color.RED);
			lbl_8.setTextFill(Color.RED);
			lblMessage.setText("Winner is X");
		}

		else if (p2.equals("O") && p5.equals("O") && p8.equals("O")) {

			lbl_2.setTextFill(Color.RED);
			lbl_5.setTextFill(Color.RED);
			lbl_8.setTextFill(Color.RED);
			lblMessage.setText("Winner is O");
		}

		else if (p3.equals("X") && p6.equals("X") && p9.equals("X")) {

			lbl_3.setTextFill(Color.RED);
			lbl_6.setTextFill(Color.RED);
			lbl_9.setTextFill(Color.RED);
			lblMessage.setText("Winner is X");
		}

		else if (p3.equals("O") && p6.equals("O") && p9.equals("O")) {

			lbl_3.setTextFill(Color.RED);
			lbl_6.setTextFill(Color.RED);
			lbl_9.setTextFill(Color.RED);
			lblMessage.setText("Winner is O");
		}

		else if (p1.equals("X") && p5.equals("X") && p9.equals("X")) {

			lbl_1.setTextFill(Color.RED);
			lbl_5.setTextFill(Color.RED);
			lbl_9.setTextFill(Color.RED);
			lblMessage.setText("Winner is X ");
		}

		else if (p1.equals("O") && p5.equals("O") && p9.equals("O")) {

			lbl_1.setTextFill(Color.RED);
			lbl_5.setTextFill(Color.RED);
			lbl_9.setTextFill(Color.RED);
			lblMessage.setText("Winner is O ");
		}

		else if (p3.equals("X") && p5.equals("X") && p7.equals("X")) {

			lbl_3.setTextFill(Color.RED);
			lbl_5.setTextFill(Color.RED);
			lbl_7.setTextFill(Color.RED);
			lblMessage.setText("Winner is X");
		}

		else if (p3.equals("O") && p5.equals("O") && p7.equals("O")) {

			lbl_3.setTextFill(Color.RED);
			lbl_5.setTextFill(Color.RED);
			lbl_7.setTextFill(Color.RED);
			lblMessage.setText("Winner is O");
		}
//		else {
//			lbl_1.setTextFill(Color.BLUE);
//			lbl_2.setTextFill(Color.BLUE);
//			lbl_3.setTextFill(Color.BLUE);
//			lbl_4.setTextFill(Color.BLUE);
//			lbl_5.setTextFill(Color.BLUE);
//			lbl_6.setTextFill(Color.BLUE);
//			lbl_7.setTextFill(Color.BLUE);
//			lbl_8.setTextFill(Color.BLUE);
//			lbl_9.setTextFill(Color.BLUE);
//
//			lblMessage.setText("Could Always end in A Draw");
//		}
	}

	@FXML
	void reset(ActionEvent event) {
		lbl_1.setText("?");
		lbl_2.setText("?");
		lbl_3.setText("?");
		lbl_4.setText("?");
		lbl_5.setText("?");
		lbl_6.setText("?");
		lbl_7.setText("?");
		lbl_8.setText("?");
		lbl_9.setText("?");

		lbl_1.setTextFill(Color.BLACK);
		lbl_2.setTextFill(Color.BLACK);
		lbl_3.setTextFill(Color.BLACK);
		lbl_4.setTextFill(Color.BLACK);
		lbl_5.setTextFill(Color.BLACK);
		lbl_6.setTextFill(Color.BLACK);
		lbl_7.setTextFill(Color.BLACK);
		lbl_8.setTextFill(Color.BLACK);
		lbl_9.setTextFill(Color.BLACK);

		lblMessage.setText("");

	}

}

/**
 * 	if (!p1.equals("X") && !p2.equals("X") && !p3.equals("X") ||
				!p1.equals("O") && !p2.equals("O") && !p3.equals("O") ||
				!p4.equals("X") && !p5.equals("X") && !p6.equals("X") ||
				!p4.equals("O") && !p5.equals("O") && !p6.equals("O") ||
				!p7.equals("X") && !p8.equals("X") && !p9.equals("X") ||
				!p7.equals("O") && !p8.equals("O") && !p9.equals("O") ||
				
				!p1.equals("X") && !p4.equals("X") && !p7.equals("X") ||
				!p1.equals("O") && !p4.equals("O") && !p7.equals("O") ||

				
				!p2.equals("X") && !p5.equals("X") && !p8.equals("X") ||
				!p2.equals("O") && !p5.equals("O") && !p8.equals("O") ||

				!p3.equals("X") && !p6.equals("X") && !p9.equals("X") ||
				!p3.equals("O") && !p6.equals("O") && !p9.equals("O") ||
				
				
				!p1.equals("X") && !p5.equals("X") && !p9.equals("X") ||
				!p1.equals("O") && !p5.equals("O") && !p9.equals("O") ||

				
				!p3.equals("X") && !p5.equals("X") && !p7.equals("X") ||
				!p3.equals("O") && !p5.equals("O") && !p7.equals("O")

					) {

				lbl_1.setTextFill(Color.Blue);
				lbl_2.setTextFill(Color.Blue);
				lbl_3.setTextFill(Color.Blue);
				lbl_4.setTextFill(Color.Blue);
				lbl_5.setTextFill(Color.Blue);
				lbl_6.setTextFill(Color.Blue);
				lbl_7.setTextFill(Color.Blue);
				lbl_8.setTextFill(Color.Blue);
				lbl_9.setTextFill(Color.Blue);
				
				
				lblMessage.setText("Draw");
			}
 */



