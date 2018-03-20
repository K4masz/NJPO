import Game.*;

public class Main {

    public static void main(String[] args) {
        Road road = new Road(10);

        road.addUser(new Pedestrian());
        road.addUser(new Driver());
        road.addUser(new Cyclist());

        road.startSimulation();

    }
}
