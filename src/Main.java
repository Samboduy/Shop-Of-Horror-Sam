import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*Ställer up ny scanner, börjar sätta igång med vad mina
        classer ska innehålla,*/
        Scanner user = new Scanner(System.in);
        Customer bought = new Customer(0);
        Product mask = new Product("Mask",235.50,14);
        Product plasticKnife = new Product("Plastic knife",45.50
                ,3);
        ProductSale fakeBlood = new ProductSale("Fake blood",89.10
                ,44);


        /*räknar ut det nya värdet till produkten sparar det i saleWorth
        ,nya värdet ersätter det gamla
         */
        double saleWorth = fakeBlood.SaleCalc(fakeBlood.getWorth());
        fakeBlood.setWorth(saleWorth);





        //skriver ut menyn samt använder boolena för att sen kuna avsluta affären
        boolean exit =true;
        while(exit){
            System.out.print("1. "); mask.info();
            System.out.print("2. "); plasticKnife.info();
            System.out.print("3. "); fakeBlood.info();
            System.out.println("4. Quit");
            /*tar in användaren val 1-4 och kollar om varan är i lager eller inte
            annars så skrivs ett medelande ut. Om det finns i lager så använder
            jag metoden buy i produkt classen samt i Customer classen
             */
            int userInput = user.nextInt();
            if (userInput==1 && mask.getAmount()>0){
                mask.buy();
                bought.setCost(mask.getWorth());
                bought.buy();
            } else if (userInput==1 && mask.getAmount()==0) {
                System.out.println("Out of stock");
            }
            if (userInput==2 && plasticKnife.getAmount()>0){
                plasticKnife.buy();
                bought.setCost(plasticKnife.getWorth());
                bought.buy();
            } else if (userInput==2 && plasticKnife.getAmount()==0) {
                System.out.println("Out of stock");
            }
            if (userInput==3 && fakeBlood.getAmount()>0){
                fakeBlood.buy();
                bought.setCost(fakeBlood.getWorth());
                bought.buy();
            } else if (userInput==3 && fakeBlood.getAmount()==0) {
                System.out.println("Out of stock");

            }
            //stänger av spelet, meddelar totala kostnaden och
            // hur många saker man har köpt
            else if (userInput==4) {
                exit=false;
                bought.info();
            }

        }

    }


}