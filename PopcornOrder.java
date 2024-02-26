public class PopcornOrder {
    
    private String variety;
    private int numOrdered;

    public PopcornOrder(String v, int n) {
        variety = v;
        numOrdered = n;
    }
    public int getNumOrdered() {
        return numOrdered;
    }
    public String getVariety() {
        return variety;
    }
    
}
