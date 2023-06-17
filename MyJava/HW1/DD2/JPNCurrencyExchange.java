package HW1.DD2;

public class JPNCurrencyExchange implements CurrencyExchange{
    
    public Currency getCurrency(){
        return new Currency("JPN");
    }
}
