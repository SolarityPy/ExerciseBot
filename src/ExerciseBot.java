import java.util.Scanner;
public class ExerciseBot {
    public static void main(String[] args) {
        System.out.println("Welcome to the exercise bot! Please choose an option.\n");
        System.out.println("[1] Log Exercise");
        System.out.println("[2] List Exercise Logs\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("[?] Choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("exercise method here");
            case 2:
                System.out.println("list exercise method here");
            default:
                System.out.println("Invalid choice! Try again.");
        }
    }
    public static void clear() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }
}
