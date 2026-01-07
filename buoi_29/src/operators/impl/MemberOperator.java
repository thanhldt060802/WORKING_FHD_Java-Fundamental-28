package operators.impl;

import java.util.ArrayList;

import etities.Member;
import etities.Project;
import operators.MemberOperatorExtension;
import operators.SimpleOperator;

public class MemberOperator implements SimpleOperator<Member>, MemberOperatorExtension {

    private ProjectOperator po;
    private ArrayList<Member> memberList;

    public MemberOperator() {
        this.memberList = new ArrayList<Member>();
    }

    public ProjectOperator getPo() {
        return po;
    }

    public void setPo(ProjectOperator po) {
        this.po = po;
    }

    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(ArrayList<Member> memberList) {
        this.memberList = memberList;
    }

    @Override
    public ArrayList<Member> getMemberListWithJobCategoryBy(String jobCategory) {
        ArrayList<Member> result = new ArrayList<Member>();
        for (Member m : this.memberList) {
            if (m.getJobCategory().equals(jobCategory)) {
                result.add(m);
            }
        }
        return result;
    }

    @Override
    public double getProfitEarnedOf(Member member) {
        double profitEarned = 0;
        for (Project p : this.po.getProjectList()) {
            for (Member m : p.getMemberList()) {
                if (m.getId().equals(member.getId())) {
                    double profitPerMember = p.getProfit() / p.getMemberList().size();
                    profitEarned += profitPerMember;
                    break;
                }
            }
        }
        return profitEarned;
    }

    @Override
    public ArrayList<Member> getMemberListWithProfitEarnedInRange(double minProfit, double maxProfit) {
        ArrayList<Member> result = new ArrayList<Member>();
        for (Member m : this.memberList) {
            double profitEarned = this.getProfitEarnedOf(m);
            if (profitEarned >= minProfit & profitEarned <= maxProfit) {
                result.add(m);
            }
        }
        return result;
    }

    private int getNumberOfProjectsOf(Member member) {
        int numberOfProjects = 0;
        for (Project p : this.po.getProjectList()) {
            for (Member m : p.getMemberList()) {
                if (m.getId().equals(member.getId())) {
                    numberOfProjects++;
                    break;
                }
            }
        }
        return numberOfProjects;
    }

    /*
    duyệt từng phần tử m trong memberList, ứng với mỗi phần tử m:
        duyệt từng phần tử p trong projectList, ứng với mỗi phần tử p:
            duyệt từng phần tử m1 trong p.memberList, ứng với mỗi phần tử m1:
                nếu m1 == m (tìm thấy m trong p) thì:
                    làm gì?
                ngược:
                    làm gì?
    */

    @Override
    public ArrayList<Member> getMemberListWithNumberOfProjectsInRange(int min, int max) {
        ArrayList<Member> result = new ArrayList<Member>();
        for (Member m : this.memberList) {
            // Tính số lượng dự án mà thành viên m đã tham gia
            int numberOfProjects = this.getNumberOfProjectsOf(m);
            if (numberOfProjects >= min && numberOfProjects <= max) {
                result.add(m);
            }
        }
        return result;
    }

    /*
    duyệt bắt đầu từ chỉ mục i = 0 trong mảng arr cho đến i < n - 1:
        cho minIndex = i lúc bấy giờ
        duyệt bắt đầu từ j = i + 1 trong mảng arr cho đến khi j < n:
            nếu arr[j] < arr[minIndex] thì:
                cho minIndex = j
        hoán đổi giữa arr[i] và arr[minIndex]
    */

    @Override
    public void sortByProfitEarnedAscending() {
        for (int i = 0; i < this.memberList.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < this.memberList.size(); j++) {
                if (this.getProfitEarnedOf(this.memberList.get(j)) < this.getProfitEarnedOf(this.memberList.get(minIndex))) {
                    minIndex = j;
                }
            }
            Member temp = this.memberList.get(i);
            this.memberList.set(i, this.memberList.get(minIndex));
            this.memberList.set(minIndex, temp);
        }
    }

    @Override
    public void sortByNumberOfProjectsAscending() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortByNumberOfProjectsAscending'");
    }

    @Override
    public void sortByIdAscending() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortByIdAscending'");
    }

    @Override
    public void showAll() {
        for (Member m : this.memberList) {
            System.out.println(m);
        }
    }

    @Override
    public void add(Member obj) {
        for (Member m : this.memberList) {
            if (m.getId().equals(obj.getId())) {
                return;
            }
        }
        this.memberList.add(obj);
    }

    @Override
    public void update(Member obj) {
        for (int i = 0; i < this.memberList.size(); i++) {
            if (this.memberList.get(i).getId().equals(obj.getId())) {
                this.memberList.set(i, obj);
                return;
            }
        }
    }

    @Override
    public void removeById(String id) {
        for (Member m : this.memberList) {
            if (m.getId().equals(id)) {
                this.memberList.remove(m);
                return;
            }
        }
    }

    @Override
    public Member searchById(String id) {
        for (Member m : this.memberList) {
            if (m.getId().equals(id)) {
                return m;
            }
        }
        return null;
    }
    
}
