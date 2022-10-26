package Lesson3;

public class OrangePrice_A1 {
    public static void main(String[] args) {
        Orange orange = new Orange();
        orange.addPrice(50);
        Orange orange1 = new Orange();
        orange1.addPrice(100);
        Orange orange2 = new Orange();
        orange2.addPrice(150);
        System.out.println("Total cost: " + Orange.orangePrice);

    }

    public static class Orange {
        public static int orangePrice = 0;

        public void addPrice(int price) {
            orangePrice += price;

        }
    }
}
