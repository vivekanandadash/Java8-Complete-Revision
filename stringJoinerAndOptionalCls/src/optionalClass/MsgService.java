package optionalClass;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        User user = new User();

        while (true) {

            System.out.println("Enter your Id (0 to Exit): ");

            int id = s.nextInt();

            // Exit condition
            if (id == 0) {
                System.out.println("Program Ended");
                break;
            }

            Optional<String> userNameByUserId = user.getUserNameByUserId(id);

            if (userNameByUserId.isPresent()) {

                System.out.println(
                        "Hello " + userNameByUserId.get().toUpperCase());

            } else {

                System.out.println("No data found");
            }
        }

        s.close();
    }
}