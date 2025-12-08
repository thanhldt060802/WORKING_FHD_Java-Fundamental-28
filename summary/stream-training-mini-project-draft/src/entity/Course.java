package entity;

public class Course {  // Khoá học
    
    private Long id;  // Mã khoá học
    private String name;  // Tên khoá học
    private int credit;  // Số tín chỉ

    public Course(Long id, String name, int credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", credit=" + credit + "]";
    }
    
}
