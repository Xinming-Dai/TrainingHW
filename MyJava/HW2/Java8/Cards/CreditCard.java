package HW2.Java8.Cards;

abstract class CreditCard {
    String holderName;
    String cardNumber;
    String cardType;
    double accountBalance;

    abstract boolean isCardAcceptable(String cardType);

    public void payBill(double bill){
        accountBalance -= bill;
        System.out.println("Bill paid using the credit card.");
    }

    static void refund(double amount){
        System.out.println("Refund initiated for $" + amount);
    }
}
