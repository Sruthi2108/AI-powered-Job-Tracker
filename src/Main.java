import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JobTracker tracker = new JobTracker();

        // Sample jobs
        tracker.addJob(new Job("Java Developer", "TCS", "Java Spring Hibernate MySQL", "Applied"));
        tracker.addJob(new Job("Python Developer", "Infosys", "Python Flask NLP AI", "Not Applied"));
        tracker.addJob(new Job("Full Stack Engineer", "Wipro", "JavaScript React Node MongoDB", "Interview"));

        while (true) {
            System.out.println("\n1. Show Jobs\n2. Update Status\n3. Suggest Jobs from Resume\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    tracker.showJobs();
                    break;

                case 2:
                    System.out.print("Enter job title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter new status: ");
                    String status = sc.nextLine();
                    tracker.updateStatus(title, status);
                    break;

                case 3:
                    System.out.print("Enter resume file path: ");
                    String path = sc.nextLine();
                    Set<String> keywords = ResumeParser.extractKeywords(path);
                    List<Job> suggestions = AILogic.suggestJobs(tracker.getJobs(), keywords);
                    System.out.println("\nSuggested Jobs:");
                    for (Job job : suggestions) {
                        System.out.println(job);
                    }
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
