import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int id = 0;
        while(id != 1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ID: ");
            id = sc.nextInt();

            String email = Escalate.oneSwitchToRuleThemAll(id);
            System.out.println(email);
        }
    }
}
