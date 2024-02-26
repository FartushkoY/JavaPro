package de.telran.Lesson_3_Practice.Task;

/**
 * Есть класс Банковский счет (Account)
 * Характеристики: номер счета, баланс счета (количество денег на счете),
 * статус счета (закрыт, приостановлен, открыт), дата открытия счета, дата закрытия счета.
 * Поведение: положить деньги на счет, снять деньги со счета, сменить статус счета, закрыть счет , вернуть остаток по счету.
 */
public abstract class Account {

    protected String accountNumber;

    protected double balance;

    protected String status;
    protected String openDate;
    protected String closeDate;

    public double getBalance() {
        return balance;
    }

    public abstract void getBalance(double balance);

    public void setStatus(String status) {
        if (status.equals(("opened") || status.equals("closed") ||| status.equals("frozen")) {
            this.status = status;
        } else {
            System.out.println("Incorrect status. Try again.");
        }
    }

    public void closeAccount(String closeDate) {
        if (balance == 0) {
            this.status = "closed";


        }
    }





}

