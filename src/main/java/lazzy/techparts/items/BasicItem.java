package lazzy.techparts.items;

import lazzy.techparts.setup.Register;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicItem extends Item {
    private final String tooltip;
    private final String name;
    private final String id;

    public BasicItem(ItemBuilder b) {
        super(b.properties);
        this.tooltip = b.tooltip;
        this.id = b.id;
        this.name = fixname(b.name);



    }

    private String fixname(String name) {
        if(name==null){
            String temp = id.substring(0,1).toUpperCase() + id.substring(1).toLowerCase();
            temp = temp.replaceAll("_"," ");
            temp =  Arrays.stream(temp.split(" "))
                    .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                    .collect(Collectors.joining(" "));
            return temp;
        }else {
            return name;
        }
    }

    @Override
    public void appendHoverText(ItemStack p_41421_, @Nullable Level p_41422_, List<Component> components, TooltipFlag p_41424_) {
        if(!(tooltip == null)){
            components.add(new TranslatableComponent("tooltip.techparts."+getid()));
        }
    }

    public String getTooltip() {
        return tooltip;
    }


    public String getName() {
        return name;
    }

    private String getid() {
        return this.id;
    }

    public static class ItemBuilder{
        private Properties properties = Register.baseProps();
        private String tooltip;
        private String name;

        private String id;

        public ItemBuilder tip(String tip){
            this.tooltip = tip;
            return this;
        }
        public ItemBuilder name(String name){
            this.name = name;
            return this;
        }
        public ItemBuilder id(String id){
            this.id = id;
            return this;
        }

        public BasicItem build(){
            return new BasicItem(this);
        }

        public String getId() {
            return id;
        }
    }
}


