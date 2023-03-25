package lazzy.techparts.items.materials;

public enum Texture {
    DULL ("dull"),
    EMERALD ("emerald"),
    FINE ("fine"),
    FLINT ("flint"),
    GEM_H ("gem_h"),
    GEM_V ("gem_v"),
    LAPIS ("lapis"),
    LIGNITE ("lignite"),
    MAGNETIC ("magnetic"),
    METALLIC ("metallic"),
    QUARTZ ("quartz"),
    REDSTONE("redstone"),
    ROUGH("rough"),
    RUBY("ruby"),
    SHINY("shiny"),
    NONE("none"),
    DIAMOND("diamond");

    private final String id;

    Texture(String id){
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
