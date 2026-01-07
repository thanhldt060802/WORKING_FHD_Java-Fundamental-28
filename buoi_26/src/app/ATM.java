package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ATM implements DataFileHandling, MainFunction {

    // private static final String PATH_FILE = "E:\\WORKING\\FHD\\repositories\\Java-28\\buoi-26\\src\\datafile\\accounts.txt";
    private static final String PATH_FILE = "src\\datafile\\accounts.dat";  // Bắt đầu ở vị trí root project
    private static final int BATCH_SIZE_FLUSHING = 5; // Số lượng dòng (có thể là độ lờn dữ liệu đã ghi xuống RAM)

    private static final double VAT = 0.2;

    private ArrayList<Account> accountList;
    private Account inUsing;

    public ATM() {
        this.accountList = new ArrayList<Account>();
        this.loadData(PATH_FILE);

        // Khởi tạo dữ liệu tạm đệ test
        // this.accountList.add(new Account("tanthanh", "12345678", 99.4500));
        // this.accountList.add(new Account("hoangphuc", "123AA321", 56.0000));
        // this.accountList.add(new Account("hoangtam", "def123xyz", 192.9586));
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

        this.saveData(PATH_FILE);
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

        this.saveData(PATH_FILE);
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

                this.saveData(PATH_FILE);
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
        // File file = new File(pathFile);
        // try (
        //     FileReader fr = new FileReader(file);
        //     BufferedReader br = new BufferedReader(fr);
        // ) {
        //     while(true) {
        //         String line = br.readLine();  // Ví dụ: line = "tanthanh, 12345678, 99.4500"
        //         if (line == null) {
        //             return;
        //         }

        //         // Lý là định dạng từng dòng dữ liệu có dạng: "id, pin, balance"
        //         String[] parts = line.split(", ");  // Ví dụ: parts = ["tanthanh" "12345678" "99.4500"]

        //         String id = parts[0];
        //         String pin = parts[1];
        //         double balance = Double.parseDouble(parts[2]);
        //         Account account = new Account(id, pin, balance);
        //         this.accountList.add(account);
        //     }
        // } catch (Exception e) {
        //     System.out.println("Load data from " + pathFile + " failed!");
        //     e.printStackTrace();
        // }

        File file = new File(pathFile);
        try (
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            while (true) {
                this.accountList.add((Account)ois.readObject());
            }
        } catch (EOFException e) {  // Do nothing
        } catch (Exception e) {
            System.out.println("Load data from " + pathFile + " failed!");
        }
    }

    @Override
    public void saveData(String pathFile) {
        // File file = new File(pathFile);
        // try (
        //     FileWriter fw = new FileWriter(file);
        //     BufferedWriter br = new BufferedWriter(fw);
        // ) {
        //     int batchSize = BATCH_SIZE_FLUSHING;
        //     for (Account account : this.accountList) {
        //         if (batchSize <= 0) {
        //             br.flush();
        //             batchSize = BATCH_SIZE_FLUSHING;
        //         }

        //         br.write(account.toFileString() + "\n");
        //         batchSize--;
        //     }
        //     // br.flush();  // Không cần, vì đang dùng try-with-resource thì nó sẽ tự động close resource
        // } catch (Exception e) {
        //     System.out.println("Save data to " + pathFile + " failed!");
        //     e.printStackTrace();
        // }

        File file = new File(pathFile);
        try (
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            for (Account account : this.accountList) {
                oos.writeObject(account);
            }
        } catch (Exception e) {
            System.out.println("Save data to " + pathFile + " failed!");
            e.printStackTrace();
        }
    }

    public static void generateObjectFile() {
        File file = new File(PATH_FILE);
        try (
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(new Account("tanthanh", "12345678", 99.4500));
            oos.writeObject(new Account("hoangphuc", "123AA321", 56.0000));
            oos.writeObject(new Account("hoangtam", "def123xyz", 192.9586));
        } catch (Exception e) {
            System.out.println("Save data to " + PATH_FILE + " failed!");
            e.printStackTrace();
        }
    }
    
}
