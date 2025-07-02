public class Job {
    private String title;
    private String company;
    private String description;
    private String status;

    public Job(String title, String company, String description, String status) {
        this.title = title;
        this.company = company;
        this.description = description;
        this.status = status;
    }

    public String getTitle() { return title; }
    public String getCompany() { return company; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return "Job Title: " + title + "\nCompany: " + company + "\nStatus: " + status;
    }
}
