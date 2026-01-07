public class Manager extends Employee {

    private double bonusRate;

    public Manager(String id, String name, int salary, double coefficientsSalary, double bonusRate) {
        super(id, name, salary, coefficientsSalary);
        this.bonusRate = bonusRate;
    }

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    @Override
    public double calculateActualSalary() {
        return super.calculateActualSalary() * (this.bonusRate + 1);
    }

    @Override
    public String toString() {
        return String.format("Manager [id=%s, name=%s, salary=%d, coefficientsSalary=%f, "
        + "bonusRate=%f]",
        super.getId(), super.getName(), super.getSalary(), super.getCoefficientsSalary(),
        this.bonusRate);
    }
    
}
