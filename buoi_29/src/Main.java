import java.util.ArrayList;

import etities.Member;
import etities.Project;
import operators.impl.MemberOperator;
import operators.impl.ProjectOperator;

public class Main {

    public static void main(String[] args) {

        MemberOperator mo = new MemberOperator();
        ProjectOperator po = new ProjectOperator();

        mo.setPo(po);
        po.setMo(mo);

        // Generate data

        Member member1 = new Member("M01", "A", "Developer");
		Member member2 = new Member("M02", "B", "Tester");
		Member member3 = new Member("M03", "C", "Developer");
		Member member4 = new Member("M04", "D", "Designer");
		Member member5 = new Member("M05", "E", "Developer");
		Member member6 = new Member("M06", "F", "Designer");
        Member member7 = new Member("M07", "D", "Designer");
		Member member8 = new Member("M08", "E", "Tester");
		Member member9 = new Member("M09", "C", "Developer");
		Member member10 = new Member("M10", "A", "Tester");

		Project project1 = new Project("P01", "Web app", 1500, 100);
		project1.getMemberList().add(member1);
		project1.getMemberList().add(member4);
		project1.getMemberList().add(member5);
        project1.getMemberList().add(member7);
        project1.getMemberList().add(member9);
		Project project2 = new Project("P02", "Desktop app", 2600, 87);
		project2.getMemberList().add(member1);
		project2.getMemberList().add(member3);
		project2.getMemberList().add(member4);
		project2.getMemberList().add(member5);
		Project project3 = new Project("P03", "Android app", 2100, 100);
		project3.getMemberList().add(member1);
		project3.getMemberList().add(member2);
		project3.getMemberList().add(member6);
        project3.getMemberList().add(member8);
		project3.getMemberList().add(member10);
		Project project4 = new Project("P04", "Web app", 3100, 87);
		project4.getMemberList().add(member1);
		project4.getMemberList().add(member5);
		project4.getMemberList().add(member6);
        project4.getMemberList().add(member7);

        mo.add(member1);
        mo.add(member2);
        mo.add(member3);
        mo.add(member4);
        mo.add(member5);
        mo.add(member6);
        mo.add(member7);
        mo.add(member8);
        mo.add(member9);
        mo.add(member10);

        po.add(project1);
        po.add(project2);
        po.add(project3);
        po.add(project4);

        // Test function

        // ArrayList<Member> result = mo.getMemberListWithJobCategoryBy("Mananger");
        // printList(result);

        // double result = mo.getProfitEarnedOf(new Member("M11"));
        // System.out.println(result);

        // ArrayList<Member> result = mo.getMemberListWithProfitEarnedInRange(1000, 2000);
        // printList(result);
        // // Test thêm
        // System.out.println("Validate:");
        // // for (Member m : result) {
        // //     System.out.println(String.format("Id=%s, ProfitEarned=%f", m.getId(), mo.getProfitEarnedOf(m)));
        // // }
        // for (Member m : mo.getMemberList()) {
        //     System.out.println(String.format("Id=%s, ProfitEarned=%f", m.getId(), mo.getProfitEarnedOf(m)));
        // }

        // ArrayList<Member> result = mo.getMemberListWithNumberOfProjectsInRange(2, 4);
        // printList(result);
        // System.out.println("Validate:");
        // for (Member m : mo.getMemberList()) {
        //     System.out.println(String.format("Id=%s, NumberOfProjects=%d", m.getId(), mo.getNumberOfProjectsOf(m)));
        // }

        System.out.println("Before sorting:");
        printList(mo.getMemberList());
        mo.sortByProfitEarnedAscending();
        System.out.println("After sorting:");
        printList(mo.getMemberList());
        System.out.println("Validate:");
        for (Member m : mo.getMemberList()) {
            System.out.println(String.format("Id=%s, ProfitEarned=%f", m.getId(), mo.getProfitEarnedOf(m)));
        }
        
    }

    public static <T> void printList(ArrayList<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }

}
