package etities;
public class Member {

    private String id;
    private String name;
    private String jobCategory;
    
    public Member(String id) {
        this.id = id;
    }

    public Member(String id, String name, String jobCategory) {
        this.id = id;
        this.name = name;
        this.jobCategory = jobCategory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    @Override
    public String toString() {
        return "Member [id=" + id + ", name=" + name + ", jobCategory=" + jobCategory + "]";
    }
    
}
