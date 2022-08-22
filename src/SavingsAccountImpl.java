public class SavingsAccountImpl
{
    public static void main(String[] args)
    {
        SavingsAccount savings=new SavingsAccount(1234567890,"01/01/01","Savings","Enabled",1000,"abhishek","Savings");

        savings.setAccountBalance(10000);


        System.out.println("");
        System.out.println("AccountBalance : " +savings.getAccountBalance());
        System.out.println("Rate of interest : " +savings.calculateRateOfInterest(10000));
        System.out.println("Depositing 5000");
        System.out.println("New Balance amount : " +savings.depositAmount(10000,5000));
        System.out.println("Withdraw 5000");
        System.out.println("New Balance : " +savings.withdrawAmount(15000,5000));

    }

}
