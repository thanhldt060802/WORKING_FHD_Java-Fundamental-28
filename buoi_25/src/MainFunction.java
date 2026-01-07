public interface MainFunction {

    public abstract void showAllAccounts();

    public abstract void login(String id, String pin);

    public abstract void recharge(double money);

    public abstract void withdraw(double money);

    public abstract void transfer(String id, double money);

    public abstract void logout();
    
}
