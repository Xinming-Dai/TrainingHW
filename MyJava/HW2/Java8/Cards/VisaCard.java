package HW2.Java8.Cards;

public class VisaCard extends CreditCard{
    public VisaCard(String holderName, String cardNumber, double accountBalance, String cardType) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.accountBalance = accountBalance;
        this.cardType = cardType;
    }

    boolean isCardAcceptable(String cardType){
        return cardType.equalsIgnoreCase("Visa");
    }
}
