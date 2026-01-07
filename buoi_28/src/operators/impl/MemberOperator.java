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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMemberListWithProfitEarnedInRange'");
    }

    @Override
    public ArrayList<Member> getMemberListWithNumberOfProjectsInRange(int min, int max) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMemberListWithNumberOfProjectsInRange'");
    }

    @Override
    public void sortByProfitEarnedAscending() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortByProfitEarnedAscending'");
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
