package HW2.ExceptionHandling;


class CardTypeException extends Exception  
{  
    public CardTypeException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  

class AddressException extends Exception  
{  
    public AddressException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  

public class ExceptionHandler{
    public void handleException(String cardType, String address){
        try {
            if (cardType.equals("AMEX")) {
                throw new CardTypeException("Not acceptable card type");
            } else if (!address.contains("US")) {
                throw new AddressException("Not acceptable address");
            } else {
                throw new Exception("Generic Exception");
            }
        } catch (CardTypeException e) {
            System.out.println("CardTypeException: " + e.getMessage());
        } catch (AddressException e) {
            System.out.println("AddressException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception: " + e.getMessage());
        }
    }
    public static void main(String[] args){
        ExceptionHandler handler = new ExceptionHandler();
        
        // Example usage
        handler.handleException("AMEX", "123 Main Street, London");
        handler.handleException("VISA", "456 Oak Avenue, Los Angeles, US");
        handler.handleException("MasterCard", "789 Elm Road, New York, US");
    }

}

