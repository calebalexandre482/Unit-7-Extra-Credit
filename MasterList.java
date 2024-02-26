import java.util.*;
public class MasterList<orders> {
    
    private ArrayList<PopcornOrder> orders;

    public MasterList() {
        orders = new ArrayList<PopcornOrder>();
    }
    public int getTotalOrders() {
        int sum = 0;
        for(int i = 0; i < orders.size(); i++) {
            sum += orders.get(i).getNumOrdered();
        }
        return sum;
    }
    public int removeVariety(String var) {
        int count = 0;
        for(int i = orders.size()-1; i >=0; i--) {
            if(orders.get(i).getVariety().equals(var)) {
                count += orders.get(i).getNumOrdered();
                orders.remove(orders.get(i));
            }
        }
        return count;
    }
    public void addOrder(PopcornOrder p) {
        orders.add(p);
    }
    public String toString() {
        String result = "";
        for(int i = 0; i < orders.size(); i++) {
            result += orders.get(i).getNumOrdered() + " " + orders.get(i).getVariety() + ", ";
        }
        if(!result.equals("")) {
            result = result.substring(0, result.length() -2);
        }
        else {
            return "There are no orders";
        }
        return result;
    }
}
