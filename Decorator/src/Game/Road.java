package Game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Road {
    private Field[][] board;
    private ArrayList<RoadUser> users;
    private Random rand;
    private Scanner input;
    private boolean crash = false;
    private int xSize, ySize;

    public Road(int size) {
        this.users = new ArrayList<RoadUser>();
        this.board = new Field[size][size];
        this.initBoard();
        this.rand = new Random();
        this.input = new Scanner(System.in);
        this.xSize = size;
        this.ySize = size;
    }

    public Road(int xSize, int ySize) {
        this.users = new ArrayList<RoadUser>();
        this.board = new Field[xSize][ySize];
        this.initBoard();
        this.rand = new Random();
        this.input = new Scanner(System.in);
        this.xSize = xSize;
        this.ySize = ySize;
    }

    private void initBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new Field();
            }
        }
    }

    private void nextStep() {
        EDirection direction;
        Vector move;
        int newX, newY, i = 0;
        for (RoadUser user : users) {

            do {
                direction = takeDirection();
            } while (!isMovePossible(user, direction));

            move = calculateMovement(direction);
            newX = user.getX() + (move.getX() * user.getSpeed());
            newY = user.getY() + (move.getY() * user.getSpeed());

            if (board[newX][newY].isEmpty()) {
                board[user.getX()][user.getY()].setUser(null);
                board[newX][newY].setUser(user);
                user.setX(newX);
                user.setY(newY);

                RoadUser newUser = this.transformUser(user);
                newUser.setX(user.getX());
                newUser.setY(user.getY());

                users.set(i, newUser);
            } else {
                System.out.println(board[newX][newY].getUser().toString() + " ~ " + user.toString());
                this.crash = true;
                break;
            }
            i++;
        }
    }

    private RoadUser transformUser(RoadUser user) {
        int chance = rand.nextInt(11);

        if (chance > 7)
            return new Pedestrian(user);
        if (chance <= 7 && chance >= 4)
            return new Cyclist(user);
        if (chance < 4)
            return new Driver(user);
        return null;
    }

    private Vector calculateMovement(EDirection direction) {
        switch (direction) {
            case LEFT: {
                //x = user.getX() - user.getSpeed();
                return new Vector(-1, 0);
            }
            case RIGHT: {
                //x = user.getX() + user.getSpeed();
                return new Vector(1, 0);
            }
            case UP: {
                //y = user.getY() - user.getSpeed();
                return new Vector(0, -1);
            }
            case DOWN: {
                //y = user.getY() + user.getSpeed();
                return new Vector(0, 1);
            }
        }
        return null;
    }

    private EDirection takeDirection() {
        return EDirection.values()[rand.nextInt(4)];
    }

    private boolean isMovePossible(RoadUser user, EDirection direction) {
        switch (direction) {
            case LEFT: {
                return (user.getX() - user.getSpeed()) < 0 ? false : true;
            }
            case RIGHT: {
                return (user.getX() + user.getSpeed()) > xSize - 1 ? false : true;
            }
            case UP: {
                return (user.getY() - user.getSpeed()) < 0 ? false : true;
            }
            case DOWN: {
                return (user.getY() + user.getSpeed()) > ySize - 1 ? false : true;
            }

        }
        return false;
    }

    public void addUser(RoadUser user) {
        users.add(user);
    }

    private void addToRoad() {
        int x, y;
        for (RoadUser user : users) {
            x = rand.nextInt(this.xSize);
            y = rand.nextInt(this.ySize);

            while (!(board[x][y].isEmpty())) {
                x = rand.nextInt(this.xSize);
                y = rand.nextInt(this.ySize);
            }

            board[x][y].setUser(user);
            user.setX(x);
            user.setY(y);
            continue;

        }
    }

    public void startSimulation() {

        System.out.print("ROAD SIMULATOR\n 1)continuous work \n 2)step work (enter key to step)\n>");
        int decision = input.nextInt();
        input.nextLine();
        this.addToRoad();
        this.printBoard();
        while (crash == false) {

            this.nextStep();
            this.printBoard();
            if (decision == 2)
                input.nextLine();
        }

    }

    private void printBoard() {
        System.out.println("--------------------------STEP------------------------------");
        for (Field[] i : board) {
            for (Field j : i) {
                if (j.getUser() == null)
                    System.out.print(". ");
                else
                    System.out.print(j.getUser().getSign() + " ");
            }
            System.out.print("\n");
        }
        if (crash)
            System.out.println("CRASH HAPPENED");
        System.out.println("--------------------------OVER------------------------------");
    }
}
