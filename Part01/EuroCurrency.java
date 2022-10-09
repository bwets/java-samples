package Part01;

public class EuroCurrency extends Currency {
    @Override
    public void formatPrice(int amountInCents) {
        
        int a = amountInCents /100;
        int cents = amountInCents % 100;
        System.out.println("The price is " + a + "," + cents+ "€.");
        
    }
    
}
