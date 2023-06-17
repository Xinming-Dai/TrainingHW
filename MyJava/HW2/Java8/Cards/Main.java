package HW2.Java8.Cards;

public class Main {
    public static void main(String[] args) {
        VisaCard visaCard = new VisaCard("John Doe", "1234567890", 1000.0, "Visa");
        MasterCard masterCard = new MasterCard("Jane Smith", "0987654321", 2000.0, "MasterCard");

        System.out.println("Visa Card Acceptable: " + visaCard.isCardAcceptable(visaCard.cardType));
        System.out.println("MasterCard Acceptable: " + masterCard.isCardAcceptable(masterCard.cardType));

        visaCard.payBill(500.0);
        masterCard.payBill(1000.0);

        CreditCard.refund(100.0);
    }
}
