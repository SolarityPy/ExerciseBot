import java.util.LinkedHashMap;
import java.util.Scanner;

public class LogExercise {
    public static void log(LinkedHashMap<String, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        ExerciseBot.clear();

        System.out.print("Enter exercise name: ");
        String exercise = scanner.nextLine();
        System.out.print("Enter number of reps: ");
        int reps = scanner.nextInt();

        map.put(exercise, reps);

        System.out.print("Return home? (y/n) ");
        String userInput = scanner.nextLine().toLowerCase();
        if (userInput.equals("y") || userInput.equals("yes")) {
            ExerciseBot.main(null);
        }
        else {
            log(map);
        }

    }
}
