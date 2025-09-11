import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.ArrayList;

public class ExerciseBot {
    static LinkedHashMap<String, Integer> exerciseLogs = new LinkedHashMap<>();
    static ArrayList<String> exercises = new ArrayList<>();
    static boolean ranAlready = false;

    public static void main(String[] args) {
        if (!(ranAlready)) {
            exercises.add("Push-Ups");
            exercises.add("Pull-Ups");
            exercises.add("Sit-Ups");

            for (String exercise : exercises) {
                exerciseLogs.put(exercise, 0);
            }
            ranAlready = true;
        }

        ExerciseBot.clear();
        System.out.println("Welcome to the exercise bot! Please choose an option.\n");
        System.out.println("[1] Log Exercise");
        System.out.println("[2] List Exercise Logs");
        System.out.println("[3] Add Exercise\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("[?] Choice: ");

        try {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    LogExercise.log(exerciseLogs, exercises);
                    break;
                case 2:
                    ViewLogs.view(exerciseLogs);
                    break;
                case 3:
                    AddExercise.add(exercises, exerciseLogs);
                default:
                    System.out.println("Invalid choice! Try again.");
                    main(null);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Try again.");
            main(null);
        }

    }
    public static void clear() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }
}
