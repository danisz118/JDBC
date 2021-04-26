/**
 * Created by Asus on 21.04.2018.
 */
public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded success");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
