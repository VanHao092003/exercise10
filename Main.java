import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Document document = new Document();
        System.out.println("------------------ enter string ---------------------");
        System.out.print("string: "); String string = scanner.nextLine();
        string  = document.fix(string);
        System.out.println("String after conversion: " + string);
        scanner.close();
    }
}
