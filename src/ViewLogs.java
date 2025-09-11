import java.util.LinkedHashMap;
import java.util.Scanner;

public class ViewLogs {
    public static void view(LinkedHashMap<String, Integer> exerciseLogs) {
        for (String exercise : exerciseLogs.keySet()) {
            System.out.println(exercise + ": " + exerciseLogs.get(exercise));
        }
        System.out.print("Return home? (y/n) ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        if (userInput.equals("y") || userInput.equals("yes")) {
            ExerciseBot.main(null);
        }
        else {
            view(exerciseLogs);
        }
    }
}
