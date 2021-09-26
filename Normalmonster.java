//Yu-GI-OH

public class Normalmonster {
    public int atk;
    public int def;
    public int level;
    public String name;
    public String type;
    public Normalmonster(String name, int atk, int def, int level, String type) {
        this.level=level;
        this.def=def;
        this.type=type;
        this.atk=atk;
        this.name=name;
    }

    public void attack() {
        System.out.println("attack");
    }

    public void defend() {
        System.out.println("defend");
    }
}