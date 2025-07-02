import java.util.*;

public class JobTracker {
    private List<Job> jobs = new ArrayList<>();

    public void addJob(Job job) {
        jobs.add(job);
    }

    public void updateStatus(String title, String status) {
        for (Job job : jobs) {
            if (job.getTitle().equalsIgnoreCase(title)) {
                job.setStatus(status);
                return;
            }
        }
        System.out.println("Job not found.");
    }

    public void showJobs() {
        for (Job job : jobs) {
            System.out.println(job + "\n");
        }
    }

    public List<Job> getJobs() {
        return jobs;
    }
}
