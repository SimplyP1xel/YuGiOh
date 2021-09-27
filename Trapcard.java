

public class Trapcard {
    public String name;
    public String effect;
    public String type;

    public Trapcard(String name, String effect, String type) {
        this.name=name;
        this.effect=effect;
        this.type=type;
    }

    public void play(){
        System.out.println ("place card");
    }

    public void effect() {
        System.out.println ("activate effect");
    }
}