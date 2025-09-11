import java.util.Scanner;

public class LogExercise {
    public static void log() {
        ExerciseBot.clear();
        System.out.print("Return home? (y/n) ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().toLowerCase();
        if (userInput.equals("y") || userInput.equals("yes")) {
            ExerciseBot.main(null);
        }
        else {
            log();
        }

    }
}
