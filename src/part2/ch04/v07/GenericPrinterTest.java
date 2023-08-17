package part2.ch04.v07;

public class GenericPrinterTest {
    public static void main(String[] args) {
        Powder powder = new Powder();
        GenericPrinter<Powder> powderPrinter= new GenericPrinter<>();
        //collection framework에 들어가면 굉장히 자주 쓰임

        powderPrinter.setMaterial(powder);
        Powder p = powderPrinter.getMaterial();

        System.out.println(powderPrinter.toString());
    }
}
