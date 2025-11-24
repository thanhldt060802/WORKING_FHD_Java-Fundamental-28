package operators;

import java.util.ArrayList;

import etities.Member;

public interface MemberOperatorExtension {
    
    public abstract ArrayList<Member> getMemberListWithJobCategoryBy(String jobCategory);

    public abstract double getProfitEarnedOf(Member member);

    public abstract ArrayList<Member> getMemberListWithProfitEarnedInRange(double minProfit, double maxProfit);

    public abstract ArrayList<Member> getMemberListWithNumberOfProjectsInRange(int min, int max);

    public abstract void sortByProfitEarnedAscending();

    public abstract void sortByNumberOfProjectsAscending();

    public abstract void sortByIdAscending();

}
