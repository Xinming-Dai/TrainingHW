package HW1.DD2;

public class CurrencyExchangeFactory {
    public CurrencyExchange getCurrencyExchange(String countryName){
         if(countryName == null){
            return null;
         }		
         if(countryName.equalsIgnoreCase("CHN")){
            return new CHNCurrencyExchange();
            
         } else if(countryName.equalsIgnoreCase("JPN")){
            return new JPNCurrencyExchange();
            
         } else if(countryName.equalsIgnoreCase("US")){
            return new USCurrencyExchange();
         }
         
         return null;

    }
}
