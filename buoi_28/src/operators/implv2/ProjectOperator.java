package operators.implv2;

import java.util.ArrayList;

import etities.Member;
import etities.Project;
import operators.ProjectOperatorExtension;

public class ProjectOperator extends ImplSimpleOperatorV2<Project> implements ProjectOperatorExtension {

    private MemberOperator mo;

    public ProjectOperator() {

    }

    public MemberOperator getMo() {
        return mo;
    }

    public void setMo(MemberOperator mo) {
        this.mo = mo;
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
    
}
