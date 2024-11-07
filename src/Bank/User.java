package Bank;

public class User {
    private String username;
    private String password;
    private BankAccount account;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }
public void displayAccountDetails(){
        if (account != null ){
            System.out.println(" Account Number:" + account.getAccountNumber());
            System.out.println("balance: " + account.getBalance());
        } else {
            System.out.println("No account for this user");
        }

}
public void updateUsername(String newUsername){
        this.username = newUsername;

}
public void updatePassword(String newPassword){
        this.password = newPassword;
}
}
