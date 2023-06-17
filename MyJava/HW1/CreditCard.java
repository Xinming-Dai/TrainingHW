package HW1;
// oop2


abstract class CreditCard {
    String holderName, cardNumber, cardType;
    double accountBalance;

    abstract boolean isCardAcceptable(String cardType);

    public boolean payBill(double bill){
        if (accountBalance < bill){
            return false;
        }
        else {
            accountBalance = accountBalance - bill;
            return true;
        }
    };
}
