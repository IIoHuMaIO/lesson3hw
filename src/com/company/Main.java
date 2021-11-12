package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000.0);
        boolean isLimitException = false;
        while (true) {
            System.out.println("У вас осталось: " + bankAccount.getAmount()+ " сом");
                try {
                    bankAccount.withDraw(6000.0);

                } catch (LimitException limitException){
                    System.out.println(limitException.getMessage());
                    System.out.println("Cписали: " + bankAccount.getAmount());
                    try {
                        bankAccount.withDraw(bankAccount.getAmount());
                    } catch (LimitException e) {
                        e.printStackTrace();
                    }
                    if (bankAccount.getAmount() == 0){
                        break;
                    }
                }
            }
        }
    }
