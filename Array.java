public class Array {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);

        System.out.println("*************************");

        printArrayContent(cars);
    }

    public static void printArrayContent(String[] arr){
        for(String car: arr){
            System.out.println(car);
        }
    }
}