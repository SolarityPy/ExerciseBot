import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class AddExercise {
    public static void add(ArrayList<String> exercises, LinkedHashMap<String, Integer> exerciseLogs) {
        ExerciseBot.clear();
        System.out.print("What exercise would you like to add? ");
        Scanner scanner = new Scanner(System.in);
        String exercise = scanner.nextLine();

        exercises.add(exercise);
        exerciseLogs.put(exercise, 0);

        System.out.print("Return home? (y/n) ");
        String userInput = scanner.nextLine();

        if (userInput.equals("y") || userInput.equals("yes")) {
            ExerciseBot.main(null);
        }
        else {
            add(exercises, exerciseLogs);
        }
    }
}
