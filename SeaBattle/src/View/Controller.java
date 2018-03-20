package View;

import Utils.Config;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Board.Board;

import java.io.IOException;
import java.util.Random;

public class Controller extends Application {

    private boolean running = false;
    private Board enemyBoard, playerBoard;

    private int unitsToPlace = Config.MAX_UNITS_PER_BOARD;
    private boolean enemyTurn = false;
    private Random rand = new Random();

    private void enemyMove() {
        while (enemyTurn) {
            int x = rand.nextInt(10);
            int y = rand.nextInt(10);

            Board.Field cell = playerBoard.getField(x, y);
            if (Board.Field.wasShot)
                continue;

            enemyTurn = cell.shoot();

            if (playerBoard.ships == 0) {
                System.out.println("YOU LOSE");
                System.exit(0);
            }
        }

    }
    private void startGame(){}


    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Battle.fxml"));
        primaryStage.setTitle("BattleShips");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setResizable(false);
        primaryStage.show();

    }
}
