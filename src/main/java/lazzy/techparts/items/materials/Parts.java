package lazzy.techparts.items.materials;

public enum Parts {
    DUST("dust"),
    DUST_SMALL("dust_small"),
    DUST_TINY("dust_small"),
    RAW("raw_ore"),
    CRUSHED("crsuhed_ore"),
    CENTRIFUGED("centrifuged_crushed_ore"),
    PURIFIED("purified_crushed_ore"),

    INGOT("ingot"),
    NUGGET("nugget"),
    GEM("gem"),
    POLISHED("polished_gem"),
    LENSE("lense"),

    PLATE("plate"),
    ROD("rod"),
    RING("ring"),
    FOIL("foiled"),
    BOLT("bolt"),
    SCREW("screw"),
    GEAR("gear"),
    SMALLGEAR("small_gear"),
    WIRE("wire"),
    ROTOR("rotor"),
    BUZZSAW_BLADE("buzzsaw_blade"),
    DENSEPLATE("dense_plate"),
    BLOCK("block"),
    FRAME("frame");

    private final String id;
    private final String name;
    Parts(String id) {
        this(id,id.substring(0,1).toUpperCase() + id.substring(1).toLowerCase());
    }

    Parts(String id,String name){
        this.id = id;
        this.name = name;
    }

    public final String getID(){
        return this.id;
    }

    @Override
    public String toString() {
        return id;
    }

    public String getName() {
        return name;
    }
}
