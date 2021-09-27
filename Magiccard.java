public class Magiccard {
    public String name;
    public String type;
    public String effect;
    public String kind;

    public Magiccard(String name, String type, String effect, String kind) {
        this.name=name;
        this.type=type;
        this.effect=effect;
        this.kind=kind;

    }

    public void play() {
        System.out.println ("place card");
    }

    public void effect() {
        System.out.println ("activate Effect");
    }

}
