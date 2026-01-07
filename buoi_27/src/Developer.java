public class Developer extends Employee {

    private double bonusRate;

    public Developer(String id, String name, int baseSalary, double bonusRate) {
        super(id, name, baseSalary);
        this.bonusRate = bonusRate;
    }

    public double getBonusRate() {
        return bonusRate;
    }
    
    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    @Override
    public String toString() {
        return String.format("Developer [id=%s, name=%s, baseSalary=%d, bonusRate=%f]",
        this.getId(), this.getName(), this.getBaseSalary(), this.getBonusRate());
    }
    
}
