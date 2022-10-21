
public class Bird {
    private String name;
    private String latin;
    private int observations;

    public Bird(String name, String latin){
        this.name = name;
        this.latin = latin;
        this.observations = 0;
    }

    public String getName() {
        return this.name;
    }

    public void addObservation(){
        this.observations++;
    }

    public String toString(){
        return this.name+" ("+this.latin+"): "+this.observations+" observations";
    }
}
