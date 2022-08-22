public abstract class BankAccount
{
    private long accountNumber;
    private String accountOpeningData;
    private String modeOfOperation;
    private String internetBanking;
    int accountBalance;


    public BankAccount(long accountNumber, String accountOpeningData, String modeOfOperation, String internetBanking, int accountBalance) {

        this.accountNumber = accountNumber;
        this.accountOpeningData = accountOpeningData;
        this.modeOfOperation = modeOfOperation;
        this.internetBanking = internetBanking;
        this.accountBalance = accountBalance;
    }


    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountOpeningData() {
        return accountOpeningData;
    }

    public void setAccountOpeningData(String accountOpeningData) {
        this.accountOpeningData = accountOpeningData;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    public String getInternetBanking() {
        return internetBanking;
    }

    public void setInternetBanking(String internetBanking) {
        this.internetBanking = internetBanking;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int showAccountBalance()
    {
        return accountBalance;
    }

    public abstract double calculateRateOfInterest(float rateOfInterest);


}
