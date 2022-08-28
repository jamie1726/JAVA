public class main {
    public static void main(String[] args) {
        Printer statement1 = new Printer();
        statement1.print();
        ColorPrinter statement2 = new ColorPrinter();
        statement2.print();
        BlackWhitePrinter statement3 = new BlackWhitePrinter();
        statement3.print("black and white");
    }
}
