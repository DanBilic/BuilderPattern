public class Main {
    public static void main(String[] args) {
        HouseBuilder whb = new WoodHouseBuilder();
        Director engineer = new Director(whb);

        engineer.constructHouse();
        System.out.println(engineer.getHouse());
    }
}
