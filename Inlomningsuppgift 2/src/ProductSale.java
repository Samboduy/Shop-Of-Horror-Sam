public class ProductSale extends Product {
    ProductSale(String name, double worth, int amount) {
        super(name, worth, amount);
    }
   //private Egenskap
    private double procentage = 0.9;

    //setters och getters så man kan kan ändra och kalla på procenten
    public double getProcentage(){
        return procentage;
    }
    public void setProcentage(double newProcentage){
        this.procentage=newProcentage;
    }
//Räknar ut det nya värdet och returnar det
   public double SaleCalc(double value){
       double calc= value * procentage;
        return calc;
   }


}
