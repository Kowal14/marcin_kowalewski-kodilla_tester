import java.util.Scanner;

public class UserDialogs {
    public static String pickAcolor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write first letter of your favourite color (B-black, G-green, P-purple, W-white):");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color) {
                case "B" : return "BLACK";
                case "G" : return "GREEN";
                case "P" : return "PURPLE";
                case "W" : return "WHITE";
                default:
                    System.out.println("Wrong color. Try again.");
            }
        }

    }
}
