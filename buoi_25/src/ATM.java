import java.util.ArrayList;

public class ATM implements DataFileHandling, MainFunction {

    private static final String PATH_FILE = "C:\\Users\\thanh\\Desktop\\data.txt";
    private static final double VAT = 0.2;

    private ArrayList<Account> accountList;
    private Account inUsing;

    public ATM() {
        this.accountList = new ArrayList<Account>();
        // this.loadData(PATH_FILE);

        // Khởi tạo dữ liệu tạm đệ test
        this.accountList.add(new Account("tanthanh", "12345678", 99.4500));
        this.accountList.add(new Account("hoangphuc", "123AA321", 56.0000));
        this.accountList.add(new Account("hoangtam", "def123xyz", 192.9586));
    }

    @Override
    public void showAllAccounts() {
        System.out.println("Show all account:");

        for (Account account : this.accountList) {
            System.out.println(account);
        }
    }

    @Override
    public void login(String id, String pin) {
        System.out.println("Login:");

        for (Account account : this.accountList) {
            if (account.getId().equals(id) && account.getPin().equals(pin)) {
                this.inUsing = account;
                System.out.println("Login success!");
                return;
            }
        }
        System.out.println("Login failed!");
    }

    @Override
    public void recharge(double money) {
        System.out.println("Recharge:");

        if (this.inUsing == null) {
            System.out.println("Recharge failed! Cause: Do not login yet!");
            return;
        }

        double originalBalance = this.inUsing.getBalance();
        this.inUsing.setBalance(originalBalance + money);
        // this.saveData(PATH_FILE);
        System.out.println("Recharge success!");
    }

    @Override
    public void withdraw(double money) {
        System.out.println("Withdraw:");

        if (this.inUsing == null) {
            System.out.println("Withdraw failed! Cause: Do not login yet!");
            return;
        }

        money = money * (1  + VAT);

        double originalBalance = this.inUsing.getBalance();
        if (originalBalance < money) {
            System.out.println("Withdraw failed! Cause: Not enough balance!");
            return;
        }
        this.inUsing.setBalance(originalBalance - money);
        // this.saveData(PATH_FILE);
        System.out.println("Withdraw success!");
    }

    @Override
    public void transfer(String id, double money) {
        System.out.println("Transfer:");

        if (this.inUsing == null) {
            System.out.println("Transfer failed! Cause: Do not login yet!");
            return;
        }

        double vatMoney = money * (1 + VAT);

        double inUsingOriginalBalance = this.inUsing.getBalance();
        if (inUsingOriginalBalance < vatMoney) {
            System.out.println("Transfer failed! Cause: Not enough balance!");
            return;
        }

        for (Account account : this.accountList) {
            if (account.getId().equals(id)) {
                if (account.getId().equals(this.inUsing.getId())) {
                    System.out.println("Transfer failed! Cause: Owner account!");
                    return;
                }

                this.inUsing.setBalance(inUsingOriginalBalance - vatMoney);

                double accountTransferOriginalBalance = account.getBalance();
                account.setBalance(accountTransferOriginalBalance + money);

                // this.saveData(PATH_FILE);
                System.out.println("Transfer success!");
                return;
            }
        }
        System.out.println("Transfer failed! Cause: Account not existed!");
    }

    @Override
    public void logout() {
        System.out.println("Logout:");

        if (this.inUsing == null) {
            System.out.println("Logout failed! Cause: Do not login yet!");
            return;
        }

        this.inUsing = null;
        System.out.println("Logout success!");
    }

    @Override
    public void loadData(String pathFile) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loadData'");
    }

    @Override
    public void saveData(String pathFile) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveDate'");
    }
    
}
