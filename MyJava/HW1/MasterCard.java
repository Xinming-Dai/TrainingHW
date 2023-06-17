package HW1;
// oop2

public class MasterCard extends CreditCard{
    boolean isCardAcceptable(String cardType){
        return cardType == "master";
    }
}
