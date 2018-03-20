/**
 * Created by K4masz on 2017-10-22.
 */
public class Main {
    public static void main(String[] args) {

        Casino casino = Casino.getInstance(10000);


        Player johny = new BlackJackPlayer("Johnny", 2000);
        Player francis = new OneArmedBanditPlayer("Francis", 2000);

        casino.addPlayer(johny);
        casino.addPlayer(francis);

        johny.play();
        francis.play();

//zaimplementować wyświetlanie stanu gotówki do metody play()
        System.out.println(johny.toString());
        System.out.println(francis.toString());

        //stworzyć metodę do printowania w Casino
        System.out.print(casino.getMoney());
    }
}