package view;

import core.Board;
import core.Field;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import javafx.stage.FileChooser;
import utils.GameConfig;
import utils.enums.ETerrainType;
import utils.enums.EUnitType;
import utils.exceptions.MaxNumberOfUnitTypeOnBoardReachedException;
import utils.exceptions.MaxNumberOfUnitsOnBoardReachedException;

import java.io.*;
import java.util.Random;

import static utils.GameConfig.BOARD_HEIGHT;
import static utils.GameConfig.BOARD_WIDTH;

public class Controller {

    @FXML
    public BoardView playerGrid;
    @FXML
    public BoardView shootingGrid;
    @FXML
    public Button button;
    @FXML
    public Label statusLabel;


    private ObservableList<Node> playerFieldViews;
    private ObservableList<Node> shootingFieldViews;


    private void initBoard(BoardView boardView) {
        boardView.getChildren().clear();

        Board board = boardView.getBoard();
        for (int columnIndex = 0; columnIndex < BOARD_WIDTH; columnIndex++) {
            for (int rowIndex = 0; rowIndex < BOARD_HEIGHT; rowIndex++) {
                FieldView tempFieldView = new FieldView(20, 20);
                boardView.add(tempFieldView, columnIndex, rowIndex);
                board.setField(tempFieldView.getField(), columnIndex, rowIndex);
            }
        }
    }

    //TODO rename this method
    private void colorizeBoard(BoardView boardView) {
        for (Node n : boardView.getChildren()) {
            if (n instanceof Group)
                continue;
            else {
                if (boardView.isShootingBoard())
                    ((Shape) n).setFill(Color.WHITE);
                else
                    ((FieldView) n).applyAppearance();
            }
        }
    } //Method which set appeareance depending on isShootingBoard

    public void initPlayerBoard() {
        initBoard(playerGrid);
        colorizeBoard(playerGrid);
        this.playerFieldViews = playerGrid.getChildren();


    }

    public void initShootingBoard() {
        shootingGrid.setShootingBoard(true);
        initBoard(shootingGrid);
        colorizeBoard(playerGrid);

        this.shootingFieldViews = shootingGrid.getChildren();
    }

    public void loadMapFromFile(ActionEvent actionEvent) {
        initPlayerBoard();

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Load map form file");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
        fileChooser.setInitialDirectory(new File(System.getProperty("user.dir")));
        File selectedFile = fileChooser.showOpenDialog(playerGrid.getScene().getWindow()); //playerGrid used only to retrive Window (there can be any other node)

        String mapData = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(selectedFile));
            mapData = br.readLine();
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < mapData.length() - 1; i++) {
            FieldView tempField = ((FieldView) playerFieldViews.get(i + 1)); //+1 the first element is a Group
            if (mapData.charAt(i) == '0') {
                tempField.setField(new Field(ETerrainType.TERRAIN_TYPE_GROUND));
                tempField.applyAppearance();
            } else {
                tempField.setField(new Field(ETerrainType.TERRAIN_TYPE_WATER));
                tempField.applyAppearance();
            }
        }

    }

    public void newGame(ActionEvent actionEvent) {
        initPlayerBoard();
        placeUnits(playerGrid);
        placeUnits(shootingGrid);
        initShootingBoard();


        /*
            do{
                playerShoot( FieldView shootPosition );
                EnemyShoot();


            }while( playerGrid.areAllUnitsDestroyed() && shootingGrid.areAllUnitsDestroyed() );
        */


    }

    private void placeUnits(BoardView boardView) {
        if (boardView.isShootingBoard())
            //random placement
            placeEnemyUnits(boardView);
        else
            placePlayerUnits(boardView);
    }

    private void placePlayerUnits(BoardView boardView) {
    }

    private void placeEnemyUnits(BoardView boardView) throws MaxNumberOfUnitsOnBoardReachedException, MaxNumberOfUnitTypeOnBoardReachedException {
        Random rand = new Random();


        //Check if max number of units is reached if yes exit if no go on
        if (boardView.getBoard().getUnitsQuantity() == GameConfig.MAX_NUMBER_OF_UNITS)
            throw new MaxNumberOfUnitsOnBoardReachedException("Max quantity");

        //Random Unit type;
        EUnitType type = EUnitType.values()[rand.nextInt(3)];
do {
    //Check if max number of type is reached if yes go up if no take random Unit-Type and begin to place fragments
    if (type.equals(EUnitType.VEHICLE) && boardView.getBoard().getNumberOfVehicles() == GameConfig.NUMBER_OF_VEHICLES)

        if (type.equals(EUnitType.PLANE) && boardView.getBoard().getNumberOfPlanes() == GameConfig.NUMBER_OF_PLANES)

            if (type.equals(EUnitType.SHIP) && boardView.getBoard().getNumberOfShips() == GameConfig.NUMBER_OF_SHIPS)
        else
            continue;
}
while();
        //pick random spot


        //if spot terrain is good take this if no go up

        //

    }
}
