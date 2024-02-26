import java.util.*;
public class Main {
    public static void main(String[] args) {
        PopcornOrder one = new PopcornOrder("Jalapeno Cheese", 1);
        PopcornOrder two = new PopcornOrder("Butter Microwave", 3);
        PopcornOrder three = new PopcornOrder("Butter Microwave", 2);
        PopcornOrder four = new PopcornOrder("Caramel with Sea Salt", 2);
        PopcornOrder five = new PopcornOrder("Caramel with Sea Salt", 5);
        PopcornOrder six = new PopcornOrder("Kettle Corn", 4);

        MasterList popcorn2023 = new MasterList();
        popcorn2023.addOrder(one);
        popcorn2023.addOrder(two);
        popcorn2023.addOrder(three);
        popcorn2023.addOrder(four);
        popcorn2023.addOrder(five);
        popcorn2023.addOrder(six);
        System.out.println(popcorn2023);
        System.out.println(popcorn2023.getTotalOrders());
        System.out.println(popcorn2023.removeVariety("Butter Microwave"));
        System.out.println(popcorn2023.removeVariety("Sea Salt Splash"));
        System.out.println(popcorn2023.removeVariety("Kettle Corn"));
        System.out.println(popcorn2023);
        
        MasterList popcorn2024 = new MasterList();
        System.out.println(popcorn2024.getTotalOrders());
        System.out.println(popcorn2024.removeVariety("Butter Microwave"));
        System.out.println(popcorn2024.removeVariety("Sea Salt Splash"));
        System.out.println(popcorn2024.removeVariety("Kettle Corn"));
        System.out.println(popcorn2024);
    }
}