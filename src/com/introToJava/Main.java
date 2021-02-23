package com.introToJava;

public class Main
{
    public static void main(String[] args)
    {
        //#region static

        // create 3 bank instances
        final Bank joesBank = new Bank("joe", "abc123");
        final Bank myBank = new Bank("stefan", "abc123");
        final Bank yourBank = new Bank("drew", "abc123");
        // lets see how many bank instances we have using our static method
        Bank.printNumberOfAccounts();

        //#endregion

        //#region final

        /* final
         *
         * The final keyword is used to specify that the given variable
         * cannot be redefined. It is best practice to make any variable
         * that you do not plan on changing final. Final variables can be
         * declared and then later defined with no errors.
         * Example:
         *      public class myClass
         *      {
         *          // here "foo" is declared but not defined
         *          final int foo;
         *          public myClass(int n)
         *          {
         *              // "foo" is defined in the constructor. After being defined
         *              // here it will never be able to be redefined
         *              foo = n;
         *          }
         *      }
         */
        final int money = 0;
        // this would throw an error if I uncommented it because money is final
        // money = 100;

        //#endregion

    }
}
