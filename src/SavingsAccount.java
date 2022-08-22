public class SavingsAccount extends BankAccount
{

    private String accountHolderName;
    private String accountType;

    public SavingsAccount(long accountNumber, String accountOpeningData, String modeOfOperation, String internetBanking, int accountBalance, String accountHolderName, String accountType)
    {
        super(accountNumber, accountOpeningData, modeOfOperation, internetBanking, accountBalance);
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
    }

    @Override
    public double calculateRateOfInterest(float rateOfInterest)
    {
        double rate=0;
        rate=(getAccountBalance()*4/100);

        return rate;
    }

    public float depositAmount(float accountBalance,float depositAmount)
    {
        float newAccountBalance = accountBalance + depositAmount;
        return newAccountBalance;
    }

    public float withdrawAmount(float accountBalance,float withdrawalAmount)
    {
        float updatedAccountBalance = 0;
        if (accountBalance > withdrawalAmount) {
            updatedAccountBalance = accountBalance - withdrawalAmount;
        }
        else
        {
            System.out.println("Insufficient funds");
        }
        return updatedAccountBalance;
    }

}
