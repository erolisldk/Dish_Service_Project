import restaurant_bill_generator.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderService {
    Scanner input = new Scanner(System.in);
    List<Order> orderList = new ArrayList<>();
    // Siparis olusturmak icin method olusturma

    public void createOrder(){
        int dishCode=-1;
        do {
            System.out.println("lutfen urun kodunu giriniz ve cikis icin 0 (sifira) basisiniz");
            dishCode= input.nextInt(); // bu coddaki urun daha once siparis edilmis mi?? buna bakmaliyim

            if ()

        }while (dishCode!=0);
    }

}
