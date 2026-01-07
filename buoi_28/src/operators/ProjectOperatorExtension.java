package operators;

import java.util.ArrayList;

import etities.Member;
import etities.Project;

public interface ProjectOperatorExtension {

    public abstract ArrayList<Project> getProjectListWithProfitInRange(double minProfit, double maxProfit);

    public abstract ArrayList<Project> getProjectListWithNumberOfMembersInRange(int min, int max);

    public abstract ArrayList<Member> getProjectListWithProgressCompleted();

    public abstract ArrayList<Member> getProjectListContainsMemberWithJobCategoryBy(String jobCategory);

    public abstract ArrayList<Member> getProjectListHasNumberOfMemberWithJobCategoryInRange(int min, int max, String jobCategory);

    public abstract double getProfitEarnedForEachMemberOf(Project project);

    public abstract double getTotalProfitEarned();

    public abstract void sortByProfitAscending();

    public abstract void sortByNumberOfMembersAscending();

    public abstract void sortByProgressAscending();

    public abstract void sortByIdAscending();
    
}
