public class Director {
    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public void constructHouse(){
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildMaterial();
        this.houseBuilder.buildKitchen();
        this.houseBuilder.buildRoof();
    }

    public House getHouse(){
        return this.houseBuilder.getHouse();
    }
}
