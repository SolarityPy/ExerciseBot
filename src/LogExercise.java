import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class LogExercise {
    public static void log(LinkedHashMap<String, Integer> map, ArrayList<String> exercises) {
        ExerciseBot.clear();
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<Integer, String> temp = new LinkedHashMap<>();

        for (int i = 0; i < exercises.size(); i++) {
            temp.put(i, exercises.get(i));
            System.out.println("[" + i + "] " + exercises.get(i));
        }

        System.out.print("\nEnter the exercise that you did: ");
        int choice = scanner.nextInt();

        String exercise = temp.get(choice);

        if (exercise == null) {
            System.out.println("Invalid choice!");
            log(map, exercises);
        }

        System.out.print("Enter number of reps: ");
        int reps = scanner.nextInt();
        scanner.nextLine();
        map.put(exercise, reps);

        System.out.print("Return home? (y/n) ");
        String userInput = scanner.nextLine();

        if (userInput.equals("y") || userInput.equals("yes")) {
            ExerciseBot.main(null);
        }
        else {
            log(map, exercises);
        }

    }
}
