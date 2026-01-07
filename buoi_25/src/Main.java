import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ATM atm = new ATM();

        // atm.showAllAccounts();

        // atm.recharge(100);
        // atm.withdraw(150);
        // atm.transfer("abc", 50);

        // atm.showAllAccounts();
        
        atm.logout();

        atm.login("tanthanh", "12345678");

        atm.logout();

        atm.recharge(100);
        // atm.withdraw(150);
        // atm.withdraw(50);
        // atm.transfer("abc", 50);
        // atm.transfer("tanthanh", 50);

        // atm.showAllAccounts();

        // ArrayList<Integer> list = new ArrayList<Integer>();
        // list.add(2);
        // list.add(4);
        // list.add(6);
        // list.add(8);
        // list.add(10);
        // for (Integer element : list) {
        //     System.out.println("Index=" + list.indexOf(element) + ", Value=" + element);
        // }
        /*
         * Với lần lặp đầu tiên thì element = arr[0]
         * Với lần lặp thứ 2 thì element = arr[1]
         * Với lần lặp thứ 3 thì element = arr[2]
         * Với lần lặp thứ 4 thì element = arr[3]
         * Với lần lặp thứ 5 thì element = arr[4]
         */

    }

}
