package HW1.DD2;

public class USCurrencyExchange implements CurrencyExchange{
    
    public Currency getCurrency(){
        return new Currency("US");
    }
}
