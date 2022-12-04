package stand;
public class LemonadeStand {
    private int lemons, gallonsOfWater, cupsOfSugar, emptyGlasses, glassesOfLemonade;
    private double price, income;
    
    public LemonadeStand(){ price = income = gallonsOfWater = cupsOfSugar = emptyGlasses = glassesOfLemonade = lemons = 0;}
    public LemonadeStand(int initLemons, int initGallonsOfWater){/*TODO*/}

    public int getLemons(){return lemons;}
    public int getGallonsOfWater(){return gallonsOfWater;}
    public int getCupsOfSugar(){return cupsOfSugar;}
    public int getEmptyGlasses(){return emptyGlasses;}
    public int getGlassesOfLemonade(){return glassesOfLemonade;}
    public double getPrice(){return price;}
    public double getIncome(){return income;}
    public void setLemons(int newLemons) {this.lemons = newLemons;}
    public void setGallonsOfWater(int newGallonsOfWater) {this.gallonsOfWater = newGallonsOfWater;}
    public void setCupsOfSugar(int newCupsOfSugar) {this.cupsOfSugar = newCupsOfSugar;}
    public void setEmptyGlasses(int newEmptyGlasses) {this.emptyGlasses = newEmptyGlasses;}
    public void setGlassesOfLemonade(int newGlassesOfLemonade) {this.glassesOfLemonade = newGlassesOfLemonade;}
    public void setPrice(double newPrice) {this.price = newPrice;}
    public void setIncome(double newIncome) {this.income = newIncome;}

    public int sellLemonade(){/*TODO*/ return 1;}
    public int sellMoreLemonade(int requestedGlasses){/*TODO*/ return 1;}
}