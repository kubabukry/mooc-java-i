import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        if(this.totalWeight()+ suitcase.totalWeight()<= this.maximumWeight){
            this.suitcases.add(suitcase);
        }
    }

    public int totalWeight(){
        int totalWeight = 0;
        for(Suitcase suitcase : suitcases){
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }

    public void printItems(){
        for(Suitcase suitcase : suitcases){
            suitcase.printItems();
        }
    }

    public String toString(){
        return suitcases.size()+" suitcases ("+this.totalWeight()+" kg)";
    }
}
