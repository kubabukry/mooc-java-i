public class Item {
    private String id;
    private String name;

    public Item (String id, String name){
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object compared){
        Item comparedItem = (Item) compared;
        if(this.id.equals(comparedItem.id)){
            return true;
        }
        return false;
    }

    public String toString(){
        return this.id+": "+this.name;
    }
}
