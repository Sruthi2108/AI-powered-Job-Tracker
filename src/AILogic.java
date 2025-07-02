import java.util.*;

public class AILogic {
    public static List<Job> suggestJobs(List<Job> jobs, Set<String> resumeKeywords) {
        List<Job> matches = new ArrayList<>();
        for (Job job : jobs) {
            String[] words = job.getDescription().toLowerCase().split("\\s+");
            int matchCount = 0;
            for (String word : words) {
                if (resumeKeywords.contains(word)) {
                    matchCount++;
                }
            }
            if (matchCount >= 3) {
                matches.add(job);
            }
        }
        return matches;
    }
}
