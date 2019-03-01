import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner ac = new Scanner(System.in);
        System.out.println("Input itemID");
        int ID = sc.nextInt();
        System.out.println("Input name");
        String name = ac.nextLine();
        System.out.println("Input producer");
        String product = ac.nextLine();
        System.out.println("Input price");
        double price = sc.nextDouble();
        Item item = new Item(ID,name,product,price);
        System.out.println("----------------------------");
        System.out.println(item.toString());



    }
}
