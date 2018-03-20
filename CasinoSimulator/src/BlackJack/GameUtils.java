package BlackJack;

import java.util.HashMap;

/**
 * Created by K4masz on 2017-11-28.
 */
public class GameUtils {
    private static HashMap signValues = new HashMap<Character, Integer>();

    public GameUtils(){
        populateSignValues();
    }

    public int getSignValue(char sign){
        return (int)signValues.get(sign);
    }

    private void populateSignValues(){
        signValues.put('2',2);
        signValues.put('3',3);
        signValues.put('4',4);
        signValues.put('5',5);
        signValues.put('6',6);
        signValues.put('7',7);
        signValues.put('8',8);
        signValues.put('9',9);
        signValues.put('X', 10);
        signValues.put('J',10);
        signValues.put('Q',10);
        signValues.put('K',10);
        signValues.put('A',11);
    }
}
