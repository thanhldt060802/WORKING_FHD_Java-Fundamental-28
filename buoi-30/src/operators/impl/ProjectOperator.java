package operators.impl;

import java.util.ArrayList;

import etities.Member;
import etities.Project;
import operators.ProjectOperatorExtension;
import operators.SimpleOperator;

public class ProjectOperator implements SimpleOperator<Project>, ProjectOperatorExtension {

    private MemberOperator mo;
    private ArrayList<Project> projectList;

    public ProjectOperator() {
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
        ArrayList<Project> arr = new ArrayList<>();
        for (Project prj : projectList) {
            if (prj.getProfit() >= minProfit && prj.getProfit() <= maxProfit) {
                arr.add(prj);
            }
        }
        return arr;
    }

    @Override
    public ArrayList<Project> getProjectListWithNumberOfMembersInRange(int min, int max) {
        ArrayList<Project> arr = new ArrayList<>();
        for (Project prj : projectList) {
            if (prj.getMemberList().size() >= min && prj.getMemberList().size() <= max) {
                arr.add(prj);
            }
        }
        return arr;
    }

    @Override
    public ArrayList<Project> getProjectListWithProgressCompleted() {
        ArrayList<Project> arr = new ArrayList<>();
        for (Project prj : projectList) {
            if (prj.getProgress() == 100) {
                arr.add(prj);
            }
        }
        return arr;
    }

    @Override
    public ArrayList<Project> getProjectListContainsMemberWithJobCategoryBy(String jobCategory) {
        ArrayList<Project> arr = new ArrayList<>();
        for (Project prj : projectList) {
            for (int i = 0; i < prj.getMemberList().size(); i++) {
                if (prj.getMemberList().get(i).getJobCategory().equals(jobCategory)) {
                    arr.add(prj);
                    break;
                }
            }
        }
        return arr;
    }

    @Override
    public ArrayList<Project> getProjectListHasNumberOfMemberWithJobCategoryInRange(int min, int max,
            String jobCategory) {
        // ArrayList<Project> arr = new ArrayList<>();
        // for (Project prj : projectList) {
        //     int count = 0;
        //     for (Member mem : prj.getMemberList()) {
        //         if (mem.getJobCategory().equals(jobCategory)) {
        //             count++;
        //         }
        //         if (count > max) {
        //             break;
        //         }
        //     }
        //     if (count >= min && count <= max) {
        //         arr.add(prj);
        //     }
        // }
        // return arr;

        ArrayList<Project> arr = new ArrayList<>();
        P_LOOP:
        for (Project prj : projectList) {
            int count = 0;
            for (Member mem : prj.getMemberList()) {
                if (mem.getJobCategory().equals(jobCategory)) {
                    count++;
                }
                if (count > max) {
                    continue P_LOOP;
                }
            }
            if (count >= min) {
                arr.add(prj);
            }
        }
        return arr;
    }

    @Override
    public double getProfitEarnedForEachMemberOf(Project project) {
        for (Project p : this.projectList) {
            if (p.getId().equals(project.getId())) {
                return p.getProfit() / p.getMemberList().size();
            }
        }
        return 0;
    }

    @Override
    public double getTotalProfitEarned() {
        double totalProfit = 0;
        for (Project p : this.projectList) {
            if (p.getProgress() == 100) {
                totalProfit += p.getProfit();
            }
        }
        return totalProfit;
    }

    @Override
    public void sortByProfitAscending() {
        Project project;
        for (int i = 0; i < this.projectList.size() -1 ; i++) {
            for (int j = i + 1; j < this.projectList.size(); j++) {
                if (projectList.get(i).getProfit() > projectList.get(j).getProfit()) {
                    project = projectList.get(i);
                    projectList.set(i, projectList.get(j));
                    projectList.set(j, project);
                }
            }
        }
    }

    @Override
    public void sortByNumberOfMembersAscending() {
        Project project;
        for (int i = 0; i < this.projectList.size() -1 ; i++) {
            for (int j = i + 1; j < this.projectList.size(); j++) {
                if (projectList.get(i).getMemberList().size() > projectList.get(j).getMemberList().size()) {
                    project = projectList.get(i);
                    projectList.set(i, projectList.get(j));
                    projectList.set(j, project);
                }
            }
        }
    }

    @Override
    public void sortByProgressAscending() {
        Project project;
        for (int i = 0; i < this.projectList.size() -1 ; i++) {
            for (int j = i + 1; j < this.projectList.size(); j++) {
                if (projectList.get(i).getProgress() > projectList.get(j).getProgress()) {
                    project = projectList.get(i);
                    projectList.set(i, projectList.get(j));
                    projectList.set(j, project);
                }
            }
        }
    }

    @Override
    public void sortByIdAscending() {
        Project project;
        for (int i = 0; i < this.projectList.size() -1 ; i++) {
            for (int j = i + 1; j < this.projectList.size(); j++) {
                if (projectList.get(i).getId().compareTo(projectList.get(j).getId()) > 0) {
                    project = projectList.get(i);
                    projectList.set(i, projectList.get(j));
                    projectList.set(j, project);
                }
            }
        }
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
