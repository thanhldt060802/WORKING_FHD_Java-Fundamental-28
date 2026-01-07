public class Designer extends Employee {

    private int numberOfCompletedProjects;
    private int numberOfProjectsUnderImplementation;
    private double bonusPerCompletedProject;
    private double bonusPerProjectUnderImplementation;

    public Designer(String id, String name, int salary, double coefficientsSalary, int numberOfCompletedProjects,
            int numberOfProjectsUnderImplementation, double bonusPerCompletedProject,
            double bonusPerProjectUnderImplementation) {
        super(id, name, salary, coefficientsSalary);
        this.numberOfCompletedProjects = numberOfCompletedProjects;
        this.numberOfProjectsUnderImplementation = numberOfProjectsUnderImplementation;
        this.bonusPerCompletedProject = bonusPerCompletedProject;
        this.bonusPerProjectUnderImplementation = bonusPerProjectUnderImplementation;
    }

    public int getNumberOfCompletedProjects() {
        return numberOfCompletedProjects;
    }

    public void setNumberOfCompletedProjects(int numberOfCompletedProjects) {
        this.numberOfCompletedProjects = numberOfCompletedProjects;
    }

    public int getNumberOfProjectsUnderImplementation() {
        return numberOfProjectsUnderImplementation;
    }

    public void setNumberOfProjectsUnderImplementation(int numberOfProjectsUnderImplementation) {
        this.numberOfProjectsUnderImplementation = numberOfProjectsUnderImplementation;
    }

    public double getBonusPerCompletedProject() {
        return bonusPerCompletedProject;
    }

    public void setBonusPerCompletedProject(double bonusPerCompletedProject) {
        this.bonusPerCompletedProject = bonusPerCompletedProject;
    }

    public double getBonusPerProjectUnderImplementation() {
        return bonusPerProjectUnderImplementation;
    }

    public void setBonusPerProjectUnderImplementation(double bonusPerProjectUnderImplementation) {
        this.bonusPerProjectUnderImplementation = bonusPerProjectUnderImplementation;
    }
    
    @Override
    public double calculateActualSalary() {
        return super.calculateActualSalary() + this.numberOfCompletedProjects * this.bonusPerCompletedProject + 
        this.numberOfProjectsUnderImplementation * this.bonusPerProjectUnderImplementation;
    }

    @Override
    public String toString() {
        return String.format("Designer [id=%s, name=%s, salary=%s, coefficientsSalary=%f, "
        + "numberOfCompletedProjects=%d, numberOfProjectsUnderImplementation=%d, "
        + "bonusPerCompletedProject=%f, bonusPerProjectUnderImplementation=%f]",
        super.getId(), super.getName(), super.getSalary(), super.getCoefficientsSalary(),
        this.numberOfCompletedProjects, this.numberOfProjectsUnderImplementation,
        this.bonusPerCompletedProject, this.bonusPerProjectUnderImplementation);
    }
    
}
