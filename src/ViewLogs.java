import java.util.LinkedHashMap;

public class ViewLogs {
    public static void view(LinkedHashMap<String, Integer> exerciseLogs) {
        for (String exercise : exerciseLogs.keySet()) {
            System.out.println(exercise + ": " + exerciseLogs.get(exercise));
        }
    }
}
