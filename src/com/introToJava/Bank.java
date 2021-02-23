package com.introToJava;

public class Bank
{
    /* static
     *
     * The static keyword makes the method or property a part of the class,
     * not a method or property of any instance of said class.
     *
     */
    private static int accountHolders = 0;

    /**
     *
     * @param username username of bank account
     * @param password password of bank account
     */
    public Bank(String username, String password)
    {
        // every time a new bank is created, we increase the amount of
        // account holders to show the amount of people who have an account
        accountHolders++;
    }
    /*
     * Because this method is static, it can only be accessed like so:
     *      Bank.printNumberOfAccounts();
     * Trying to access it with an instance of the class will throw an error:
     *      final Bank myBank = new Bank("joe", "abc123");
     *      myBank.printNumberOfAccounts(); // Error
     */
    public static void printNumberOfAccounts()
    {
        System.out.println(accountHolders);
    }
}
