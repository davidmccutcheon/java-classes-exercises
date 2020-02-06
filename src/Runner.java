public class Runner {

    public static void main (String[] args) {
        Car myCar = new Car(1963, "Volvo", 200000, "Zoom");
        myCar.toString();
        myCar.drive(50);
        myCar.toString();

        Rectangle notSquare = new Rectangle(4,13);

        System.out.println(notSquare.getArea());
        System.out.println(notSquare.getDiagonal());
        System.out.println(notSquare.isSquare());
    }



}
