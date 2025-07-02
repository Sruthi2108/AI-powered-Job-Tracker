import java.io.*;
import java.util.*;

public class ResumeParser {
    public static Set<String> extractKeywords(String filePath) {
        Set<String> keywords = new HashSet<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("[^a-zA-Z0-9]+");
                for (String word : words) {
                    if (word.length() > 3) {
                        keywords.add(word);
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading resume: " + e.getMessage());
        }
        return keywords;
    }
}
