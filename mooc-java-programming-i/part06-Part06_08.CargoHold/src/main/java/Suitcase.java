import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumTotalWeight;

    public Suitcase(int maximumWeight){
        this.items = new ArrayList<>();
        this.maximumTotalWeight = maximumWeight;
    }

    public void addItem(Item item) {

        if (this.totalWeight() + item.getWeight() <= maximumTotalWeight) {
            this.items.add(item);
        }
    }

    public int totalWeight() {
        int sumOfWeights = 0;
        for (Item entry : items) {
            sumOfWeights += entry.getWeight();
        }

        return sumOfWeights;
    }

    public void printItems(){
        for(Item item1 : items){
            System.out.println(item1.getName()+" ("+item1.getWeight()+" kg)");
        }
    }

    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        Item heaviest = items.get(0);
        for(Item item : items){
            if(item.getWeight()>heaviest.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }

    public String toString(){
        int totalWeight = 0;
        if(items.isEmpty()){
            return "no items (0 kg)";
        }
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        if(items.size()==1){
            return "1 item (" + totalWeight + " kg)";
        }
        return items.size() + " items (" + totalWeight + " kg)";
    }
}
