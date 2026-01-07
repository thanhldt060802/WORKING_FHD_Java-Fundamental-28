package operators.impl;

import java.util.ArrayList;

import etities.Member;
import etities.Project;
import operators.ProjectOperatorExtension;
import operators.SimpleOperator;

public class ProjectOperator implements SimpleOperator<Project>, ProjectOperatorExtension {

    private MemberOperator mo;
    private ArrayList<Project> projectList;

    public ProjectOperator(){
        this.projectList = new ArrayList<Project>();
    }

    public MemberOperator getMo() {
        return mo;
    }

    public void setMo(MemberOperator mo) {
        this.mo = mo;
    }

    public ArrayList<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(ArrayList<Project> projectList) {
        this.projectList = projectList;
    }

    @Override
    public ArrayList<Project> getProjectListWithProfitInRange(double minProfit, double maxProfit) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProjectListWithProfitInRange'");
    }

    @Override
    public ArrayList<Project> getProjectListWithNumberOfMembersInRange(int min, int max) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProjectListWithNumberOfMembersInRange'");
    }

    @Override
    public ArrayList<Member> getProjectListWithProgressCompleted() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProjectListWithProgressCompleted'");
    }

    @Override
    public ArrayList<Member> getProjectListContainsMemberWithJobCategoryBy(String jobCategory) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProjectListContainsMemberWithJobCategoryBy'");
    }

    @Override
    public ArrayList<Member> getProjectListHasNumberOfMemberWithJobCategoryInRange(int min, int max,
            String jobCategory) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProjectListHasNumberOfMemberWithJobCategoryInRange'");
    }

    @Override
    public double getProfitEarnedForEachMemberOf(Project project) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProfitEarnedForEachMemberOf'");
    }

    @Override
    public double getTotalProfitEarned() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTotalProfitEarned'");
    }

    @Override
    public void sortByProfitAscending() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortByProfitAscending'");
    }

    @Override
    public void sortByNumberOfMembersAscending() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortByNumberOfMembersAscending'");
    }

    @Override
    public void sortByProgressAscending() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortByProgressAscending'");
    }

    @Override
    public void sortByIdAscending() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortByIdAscending'");
    }

    @Override
    public void showAll() {
        for (Project p : this.projectList) {
            System.out.println(p);
        }
    }

    @Override
    public void add(Project obj) {
        for (Project p : this.projectList) {
            if (p.getId().equals(obj.getId())) {
                return;
            }
        }
        this.projectList.add(obj);
    }

    @Override
    public void update(Project obj) {
        for (int i = 0; i < this.projectList.size(); i++) {
            if (this.projectList.get(i).getId().equals(obj.getId())) {
                this.projectList.set(i, obj);
                return;
            }
        }
    }

    @Override
    public void removeById(String id) {
        for (Project p : this.projectList) {
            if (p.getId().equals(id)) {
                this.projectList.remove(p);
                return;
            }
        }
    }

    @Override
    public Project searchById(String id) {
        for (Project p : this.projectList) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
    
}
