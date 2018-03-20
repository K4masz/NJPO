package core;

import core.elements.Fragment;

import java.util.List;

public class GameManager {
    private static GameManager ourInstance = new GameManager();
    public static GameManager getInstance() {
        return ourInstance;
    }

    List<Fragment> editableFragments;

    private GameManager() {
    }

    public void placeFragment(){
        //TODO przetrzymwanie - typ jednostki budowanej
    }

    public void confirmUnit(){
        //
    }
}
