package etities;
import java.util.ArrayList;

public class Project {

    private String id;
    private String name;
    private double profit;
    private double progress;
    private ArrayList<Member> memberList;

    public Project(String id) {
        this.id = id;
    }

    public Project(String id, String name, double profit, double progress) {
        this.id = id;
        this.name = name;
        this.profit = profit;
        this.progress = progress;
        this.memberList = new ArrayList<Member>();
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

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(ArrayList<Member> memberList) {
        this.memberList = memberList;
    }

    @Override
    public String toString() {
        return "Project [id=" + id + ", name=" + name + ", profit=" + profit + ", progress=" + progress
                + ", numberOfMembers=" + memberList.size() + "]";
    }

    
    
}
