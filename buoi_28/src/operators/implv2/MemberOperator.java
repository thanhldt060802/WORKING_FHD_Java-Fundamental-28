package operators.implv2;

import java.util.ArrayList;

import etities.Member;
import operators.MemberOperatorExtension;

public class MemberOperator extends ImplSimpleOperatorV2<Member> implements MemberOperatorExtension {

    private ProjectOperator po;

    public MemberOperator() {

    }

    public ProjectOperator getPo() {
        return po;
    }

    public void setPo(ProjectOperator po) {
        this.po = po;
    }

    @Override
    public ArrayList<Member> getMemberListWithJobCategoryBy(String jobCategory) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMemberListWithJobCategoryBy'");
    }

    @Override
    public double getProfitEarnedOf(Member member) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProfitEarnedOf'");
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
    
}
