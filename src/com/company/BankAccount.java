package com.company;

public class BankAccount {
    double amount;
    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        amount = getAmount() + sum;
        System.out.println("На вашем счете: " + getAmount());
    }
    public double withDraw (double sum) throws LimitException{
        amount = getAmount() - sum;
        System.out.println("На счете осталось: " + getAmount());
        if(sum > amount){
            throw new LimitException("На счету недостаточно средств", getAmount());
        }
        return getAmount();
    }

}
