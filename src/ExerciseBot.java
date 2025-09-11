import java.util.Scanner;
import java.util.LinkedHashMap;

public class ExerciseBot {
    LinkedHashMap<String, Integer> exerciseLogs = new LinkedHashMap<>();
    public static void main(String[] args) {
        ExerciseBot.clear();
        System.out.println("Welcome to the exercise bot! Please choose an option.\n");
        System.out.println("[1] Log Exercise");
        System.out.println("[2] List Exercise Logs\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("[?] Choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                LogExercise.log();
                break;
            case 2:
                System.out.println("list exercise method here");
                break;
            default:
                System.out.println("Invalid choice! Try again.");
                break;
        }
    }
    public static void clear() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }
}
