package Homework4;

public class ComputerPrices {
    public static void main(String[] args) {
        Computer firstComputer = new Computer(1995, 510.99, "Linux");

        Computer secondComputer = new Computer(2005, 780.99, "Solaris");

        int finalResult = firstComputer.comparePrice(secondComputer);
        switch (finalResult) {
            case -1:
                System.out.println("finalResult holds -1.The first computer has higher price.");
                break;
            case 1:
                System.out.println("finalResult holds 1.The second computer has higher price.");
                break;
            case 0:
                System.out.println("finalResult holds 0.The price is the same.");
                break;
        }
    }
}
