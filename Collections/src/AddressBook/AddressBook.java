package AddressBook;

import java.util.Comparator;

public class AddressBook implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (((Person) o1).getSurname().charAt(0) < ((Person) o2).getSurname().charAt(0)) {
            return 1;
        } else if (((Person) o1).getSurname().charAt(0) > ((Person) o2).getSurname().charAt(0)) {
            return -1;
        } else {
            return 0;

        }
    }
}
