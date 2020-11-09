public class StoneHouseBuilder extends HouseBuilder{
    private House house;

    public StoneHouseBuilder(){
    this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Keller aus Stein, mit Strom und Wasserleitungen");

    }

    @Override
    public void buildMaterial() {
        house.setMaterial("Spezielle Mauersteine");
    }

    @Override
    public void buildKitchen() {
        house.setKitchen("Granit Küche");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Black roof");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
