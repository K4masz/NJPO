import AddressBook.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        DBConnection connection = DBConnection.getInstance();
        Executer exec = new Executer(connection);

        ResultSet result = exec.executeQuery("SELECT * FROM people");
        try {
            while (result.next()) {
                String surname = result.getString("surname");
                String firstname = result.getString("firstname");
                Long phone_number = result.getLong("phone_number");
                int id = result.getInt("id");
                System.out.println(surname + " " + firstname + " " + phone_number + " " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Person adam = new Person("Glowan", "Adam", 123456789);
        exec.executeUpdate("INSERT INTO `people`(`surname`, `firstname`, `phone_number`) VALUES ('"+adam.getSurname()+"','"+adam.getFirstName()+"','"+adam.getPhoneNumber()+"')");

    }
}
