package utils;

public class GameConfig { //TODO make this being saved in database
    //BOARD DIMENSIONS
    public static int BOARD_WIDTH = 22;
    public static int BOARD_HEIGHT = 14;

    //UNIT QUANTITIES
    public static int NUMBER_OF_SHIPS = 3;
    public static int NUMBER_OF_VEHICLES = 2;
    public static int NUMBER_OF_PLANES = 1;

    //UNIT TYPES QUANTITIES
    //SHIPS
    public static int NUMBER_OF_ONE_POLE = 3;
    public static int NUMBER_OF_TWO_POLE = 0;
    public static int NUMBER_OF_THREE_POLE = 0;
    public static int NUMBER_OF_FOUR_POLE = 0;

    //VEHICLES
    public static int NUMBER_OF_TWO_ELEMENT_VEHICLES = 1;
    public static int NUMBER_OF_THREE_ELEMENT_VEHICLES = 1;
    public static int NUMBER_OF_FOUR_ELEMENT_VEHICLES = 0;

    //MAX UNITS
    public static int MAX_NUMBER_OF_UNITS = (NUMBER_OF_PLANES + NUMBER_OF_VEHICLES + NUMBER_OF_SHIPS);


}
