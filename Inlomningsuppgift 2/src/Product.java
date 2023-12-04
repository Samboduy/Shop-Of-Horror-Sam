import java.util.*;

public class Product {
    //privata egenskaper
    private String name;
    private double worth;
    private int amount;

    //Getters och setters för de privata egenskaperna så man kan ändra på dem
    // sen om man vill
    public double getWorth(){
      return worth;
    }
    public int getAmount(){
        return amount;
    }
    public String getName(){
        return name;
    }

    public void setWorth(double newWorth){
        this.worth=newWorth;
    }
    public void setAmount(int newAmount){
        this.amount = newAmount;
    }
    public void setName(String newName){
        this.name = newName;
    }
    //Product konstruktorn, tar in information om varan, namn, värde, och antalet
        Product(String name,double worth, int amount){
            setName(name);
            setWorth(worth);
            setAmount(amount);
        }
        //skriver ut informationen på varan, namn, värde och antalet kvar
        void info(){
            System.out.printf("%s %3.2f SEK, %d left\n", this.name, this.worth, this.amount);
        }
        //buy funktionen, kollar att antalet varor är över noll,
        // sänker antalet med ett. Annars om antalet är noll
        // skriver ut ett medelande
        void buy(){
            if (getAmount()>0) {
                setAmount(getAmount()-1);
            } else if (getAmount()==0) {
                System.out.println("Sold out, buy something else");
            }
        }

}
