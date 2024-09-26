package Sesiunea12;

public class TestBank {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        bankA.getBalance();
        bankB.getBalance();
        bankC.getBalance();
    }
}
//       Create an abstract class 'Bank' with an abstract method 'getBalance'.
//       $100, $150 and $200 are deposited in banks A, B and C respectively.
//       'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
//       Call this method by creating an object of each of the three classes.
abstract class Bank{
    abstract void getBalance();
}
class BankA extends Bank{

    @Override
    void getBalance() {
        System.out.println("The balance deposited in bank A is: $100!!!");
    }
}
class BankB extends Bank{

    @Override
    void getBalance() {
        System.out.println("The balance deposited bank B is: $150!!!");
    }
}
class BankC extends Bank{

    @Override
    void getBalance() {
        System.out.println("The balance deposited bank C is: $200!!!");
    }
}