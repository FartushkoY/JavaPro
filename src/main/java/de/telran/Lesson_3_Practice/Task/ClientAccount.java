package de.telran.Lesson_3_Practice.Task;

public abstract class ClientAccount extends Account{

    protected String accountOwner;

    protected double maxDeposit;


    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        if (accountOwner != null && accountOwner.length() > 0) {
            this.accountOwner = accountOwner;
        } else {
            System.out.println("Incorrect owner. Try again.");
        }
    }








}
