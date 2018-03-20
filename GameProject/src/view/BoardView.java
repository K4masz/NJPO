package view;

import core.Board;
import javafx.scene.layout.GridPane;

public class BoardView extends GridPane { //TODO BOARD w GridPane


    private Board board;
    private boolean isShootingBoard;

    public BoardView() {
        this.board = new Board();
        this.isShootingBoard = false;
    }

    public BoardView(Board board, boolean isShootingBoard) {
        this.board = board;
        this.isShootingBoard = isShootingBoard;
    }

    public Board getBoard() {
        return board;
    }

    public boolean isShootingBoard() {
        return isShootingBoard;
    }

    public void setShootingBoard(boolean shootingBoard) {
        isShootingBoard = shootingBoard;
    }


}
