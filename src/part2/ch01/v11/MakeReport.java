package part2.ch01.v11;

public class MakeReport {
    StringBuffer buffer = new StringBuffer();
    //String으로만 +로 작성하면 메모리 오버헤드가 너무 큼
    //그러므로 Buffer(언제든지 늘어날 수 있음)을 사용

    private String line = "================\n";
    private String title = "이름 \t 주소 \t\t 전화번호 \n";
    private void makeHeader(){
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody()
    {
        buffer.append("James \t");
        buffer.append("Seoul Korea \t");
        buffer.append("010-2222-3333\n");

        buffer.append("Tomas \t");
        buffer.append("NewYork US \t");
        buffer.append("010-7777-0987\n");
    }

    private void makeFooter()
    {

        buffer.append(line);
    }

    //getReport만 public
    //어차피 사용자는 결과값만 알면 되기 때문
    //Encapsulation !!
    public String getReport()
    {
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }



}
