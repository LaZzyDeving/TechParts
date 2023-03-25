package lazzy.techparts.fluids;

import lazzy.techparts.Ref;
import lazzy.techparts.setup.Register;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.Collection;

import static lazzy.techparts.TechParts.ITEM_GROUP;

public class TPFluidDeclations {

    public static void init(){
        registerFluids();
    }
    public static final DeferredRegister<Fluid> FLUIDS = Register.create(ForgeRegistries.FLUIDS);
    public static final Collection<TPFluidInstance> TP_FLUIDS = new ArrayList<>();

    public static TPFluidInstance RAW_ORE_MEAT;


    public static FluidAttributes.Builder waterbuilder(){
        return FluidAttributes.builder(
                        new ResourceLocation(Ref.ID,"block/fluid/liquid"),
                        new ResourceLocation( "block/water_flow"))
                .overlay(new ResourceLocation("block/water_overlay"));
    }

                                                          //ARBG
    public static FluidAttributes.Builder waterbuilder(int color){
        return FluidAttributes.builder(
                new ResourceLocation(Ref.ID,"block/fluid/liquid"),
                new ResourceLocation( "block/water_flow"))
        .overlay(new ResourceLocation("block/water_overlay"))
                .color(color);
    }

    public static void registerFluids(){


        TP_FLUIDS.add(new TPFluidInstance("glue",waterbuilder(), ITEM_GROUP));

        TP_FLUIDS.add(new TPFluidInstance("fermented_biomass",waterbuilder(0xd964d943), ITEM_GROUP));

    }

}
