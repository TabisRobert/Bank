package Bank;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public abstract class Account {
    private String clientName;
    private String clientSurname;
    private long accountNumber;
    private boolean condition;

    public Account(String clientName, String clientSurname, long accountNumber, boolean condition) {
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.accountNumber = accountNumber;
        this.condition = condition;
    }

    public void createAccount() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String surname = sc.nextLine();
        long number = sc.nextLong();
        String condition = sc.nextLine();
        boolean accountCondition = false;
        if (condition.equals("aktywne")){
            accountCondition = true;
        } else if (condition.equals("nieaktywne")){
            accountCondition = false;
        } else {
            System.out.println("Błędny status konta, srpóbuj ponownie");
        }

    }
    public void addMoney(){}
    private enum AccountType{;
        private String personal;
        private String company;
    }
    abstract void getType();

}
