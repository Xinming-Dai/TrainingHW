package HW1;
// oop2

public class VisaCard extends CreditCard{
    boolean isCardAcceptable(String cardType){
        return cardType == "visa";
    }
}
