
public class Customer {
    //privata egenskaper
    private int totalItem;
    private double totalCost;

    private double cost;
    // Setters och Getters så man kan hämta och uppdatera information
    public int getTotalItem(){
        return totalItem;
    }
    public double getTotalCost(){
        return totalCost;
    }
    public double getCost(){
        return cost;
    }

    public void setCost(double newCost){
        this.cost=newCost;
    }

    public void setTotalItem(int newTotalItem){
        this.totalItem = newTotalItem;
    }
    public void setTotalCost(double newTotalCost){
        this.totalCost=newTotalCost;
    }
    // Customer konstruktorn ställer in kostnaden, börjar på noll men
    // när användaren väljer vad hen vill ha så ändras kostnaden
    Customer(double cost){
        setCost(cost);
    }
    /*Buy funktionern, adderar den totala kostnaden med varans kostnad och sparar det ny värdet i totalCost.
    Samma med totalItem förutom att den tar totala antalet varor man har köpt och adderar med ett
     */
    public void buy (){
       setTotalCost(getTotalCost() + getCost());
       setTotalItem(getTotalItem()+1);

    }
    //skriver ut antalet varor och hur mycket det kostade
    void info(){
        System.out.printf("You purchased a total of %d items. The total cost was %.2f",totalItem,totalCost);
    }
}
