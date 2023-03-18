package lazzy.techparts.items.materials;

public enum Material {
    BRASS(0xffb400,"brass"),
    MANASTEEL(0x0063FF,"manasteel"),
    CONSTANTAN(0xf6d898,"constantan");
    private final int rbg;
    private final String id;
    private final String name;

    private final String style;

    Material(int rbg, String id){
        this(rbg,id,id.substring(0,1).toUpperCase() + id.substring(1).toLowerCase());
    }

    Material(int rbg, String id,String name){
        this.rbg = rbg;
        this.id = id;
        this.name = name;
        this.style = "dull";
    }

    public final int getRbg() {

        return this.rbg;
    }

    public String getName() {
        return name;
    }

    public final String getID()
    {
        return this.id;
    }

    public String getStyle() {
        return style;
    }
}
