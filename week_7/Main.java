public class Main {

    public static void main(String[] args) {

        System.out.println("===== Washing Machine =====");

        Appliances washingMachine = new WashingMachine("LG");
        washingMachine.displayBrand();
        washingMachine.turnOn();
        washingMachine.operate();
        washingMachine.turnOff();

        System.out.println();

        System.out.println("===== Refrigerator =====");

        Appliances refrigerator = new Refrigerator("Panasonic");
        refrigerator.displayBrand();
        refrigerator.turnOn();
        refrigerator.operate();
        refrigerator.turnOff();
    }
}