// Interface  for bank account operations
interface GetBankAccount {
    void getDeposit();  // Method to handle deposit
    void getWithdraw(); // Method to handle withdrawal
}

// Main class to test the bank account functionalities
public class BankAccount {
    public static void main(String[] args) {
        // Creating an instance of CheckingAccount and assigning it to GetBankAccount reference
        GetBankAccount b = new CheckingAccount();
       
        // Calling the deposit method
        b.getDeposit();
       
        // Calling the withdraw method
        b.getWithdraw();
    }
}

// Class implementing the GetBankAccount interface
class CheckingAccount implements GetBankAccount {
    // Implementation of the getDeposit method
    public void getDeposit() {
        System.out.println("Show deposit");
    }

    // Implementation of the getWithdraw method
    public void getWithdraw() {
        System.out.println("Show withdraw");
    }
}
