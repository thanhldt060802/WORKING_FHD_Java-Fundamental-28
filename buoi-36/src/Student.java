public class Student {
    
    private String id;
    private String name;
    private double avg;
    
    public Student(String id, String name, double avg) {
        this.id = id;
        this.name = name;
        this.avg = avg;
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

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", avg=" + avg + "]";
    }

}
