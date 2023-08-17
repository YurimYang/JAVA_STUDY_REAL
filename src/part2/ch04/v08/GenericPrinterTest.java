package part2.ch04.v08;


public class GenericPrinterTest {
    public static void main(String[] args) {
        Powder powder = new Powder();
        GenericPrinter<Powder> powderPrinter= new GenericPrinter<>();
        //Powder 클래스가 Material 클래스를 상속받았으므로 사용할 수 있는 구조 !

        powderPrinter.setMaterial(powder);
        Powder p = powderPrinter.getMaterial();

        System.out.println(powderPrinter.toString());


    }
}
