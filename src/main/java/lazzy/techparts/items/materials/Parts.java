package lazzy.techparts.items.materials;

public enum Parts {
    //OREPROCESS
    DUST("dust"),
    DUST_SMALL("dust_small"),
    DUST_IMPURE("dust_impure"),
    DUST_PURE("dust_pure"),
    DUST_TINY("dust_tiny"),
    ORE_RAW("raw_ore"),
    ORE_CRUSHED("crushed_ore"),
    ORE_CENTRIFUGED("crushed_centrifuged"),
    ORE_PURIFIED("crushed_purified"),
    ORE_CHUNK("chunk"),

    //DONE INGOT
    INGOT("ingot"),
    INGOT_HOT("ingot_hot"),
    NUGGET("nugget"),
    BLOCK("block"),


    //PARTS
    PLATE("plate"),
    ROD("rod"),
    RING("ring"),
    FOIL("foil"),
    BOLT("bolt"),
    SCREW("screw"),
    GEAR("gear"),
    GEAR_SMALL("gear_small"),
    WIRE("wire_fine"),
    ROTOR("rotor"),
    PLATE_DENSE("plate_dense"),
    FRAME("frame"),

    //TOOLS
    TOOL_BUZZSAW("buzzsaw_blade","Buzzsaw Blade"),
    TOOL_CHAINSAW("chainsaw_bit","Chainsaw Bit"),
    TOOL_DRILL("drill_bit","Drill Bit"),
    CELL("cell"),

    //GEM
    GEM("gem"),
    GEM_BRITTLE("gem_brittle"),
    GEM_CHIPPED("gem_chipped"),
    GEM_EXQUIISITE("gem_exquisite"),
    GEM_FLAWED("gem_flawed"),
    GEM_FLAWLESS("gem_flawless"),
    GEM_POLISHED("gem_polished"),
    LENS("lens");







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
