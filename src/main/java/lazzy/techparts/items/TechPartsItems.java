package lazzy.techparts.items;

//import static muramasa.antimatter.Data.*;
//import static muramasa.gregtech.data.Material.*;


import lazzy.techparts.setup.Register;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.silentchaos512.lib.registry.ItemRegistryObject;

import java.util.function.Supplier;

public class TechPartsItems {

    public static final DeferredRegister<Item> ITEMS = Register.create(ForgeRegistries.ITEMS);

    public static void init() {

    }

    public static <T extends Item> ItemRegistryObject<T> register(String name, Supplier<T> item) {
        return new ItemRegistryObject<>(ITEMS.register(name, item));
    }


    //For "normal" Items
    public static ItemRegistryObject<Item> registerBasicItem(String name) {
        // Registers a generic, basic item with no special properties.
        // Also second step use for MatDeclaration//MatPartItems
        return register(name, () -> new Item(Register.baseProps()));
    }






    //Items starting here

    // TODO: Datagen for Jsons for these
    public static final ItemRegistryObject<Item> COMPUTER_MONITOR = registerBasicItem("computer_monitor");
    public static final ItemRegistryObject<Item> GRAVI_STAR = registerBasicItem("gravi_star");

    //To Seperate simple model from advanced models for BasicItems


    //Splited from registerSimpleModel and registerBasicItem to also use with MatPartItem


    // TODO: 
    /*
    public static RegistryObject<Item> CellTin = createbasicItem("tin_cell");
    public static RegistryObject<Item> CellSteel = createbasicItem("steel_cell");
    public static RegistryObject<Item> CellTungstensteel = createbasicItem("tungstensteel_cell");

    public static RegistryObject<Item> ItemFilter = createbasicItem("item_filter");
    public static RegistryObject<Item> DiamondSawBlade = createbasicItem("diamond_saw_blade");
    public static RegistryObject<Item> DiamondGrindHead = createbasicItem("diamond_grind_head");
    public static RegistryObject<Item> TungstenGrindHead = createbasicItem("tungsten_grind_head");
    public static RegistryObject<Item> IridiumAlloyIngot = createbasicItem("iridium_alloy_ingot"); //.tip("Used to make Iridium Plates");
    public static RegistryObject<Item> IridiumReinforcedPlate = createbasicItem("iridium_reinforced_plate"); //.tip("GT2s Most Expensive Component");
    public static RegistryObject<Item> IridiumNeutronReflector = createbasicItem("iridium_neutron_reflector"); //.tip("Indestructible");
    public static RegistryObject<Item> QuantumEye = createbasicItem("quantum_eye"); //.tip("Improved Ender Eye");
    public static RegistryObject<Item> QuantumStat = createbasicItem("quantum_star"); //.tip("Improved Nether Star");

    //Circuit TEST
    public static RegistryObject<Item> Integrated_circuit_0 = createbasicItem("integrated_circuit_0");
    public static RegistryObject<Item> Integrated_circuit_1 = createbasicItem("integrated_circuit_1");
    public static RegistryObject<Item> Integrated_circuit_2 = createbasicItem("integrated_circuit_2");
    public static RegistryObject<Item> Integrated_circuit_3 = createbasicItem("integrated_circuit_3");
    public static RegistryObject<Item> Integrated_circuit_4 = createbasicItem("integrated_circuit_4");
    public static RegistryObject<Item> Integrated_circuit_5 = createbasicItem("integrated_circuit_5");
    public static RegistryObject<Item> Integrated_circuit_6 = createbasicItem("integrated_circuit_6");
    public static RegistryObject<Item> Integrated_circuit_7 = createbasicItem("integrated_circuit_7");
    public static RegistryObject<Item> Integrated_circuit_8 = createbasicItem("integrated_circuit_8");
    public static RegistryObject<Item> Integrated_circuit_9 = createbasicItem("integrated_circuit_9");
    public static RegistryObject<Item> Integrated_circuit_10 = createbasicItem("integrated_circuit_10");
    public static RegistryObject<Item> Integrated_circuit_11 = createbasicItem("integrated_circuit_11");
    public static RegistryObject<Item> Integrated_circuit_12 = createbasicItem("integrated_circuit_12");
    public static RegistryObject<Item> Integrated_circuit_13 = createbasicItem("integrated_circuit_13");
    public static RegistryObject<Item> Integrated_circuit_14 = createbasicItem("integrated_circuit_14");
    public static RegistryObject<Item> Integrated_circuit_15 = createbasicItem("integrated_circuit_15");
    public static RegistryObject<Item> Integrated_circuit_16 = createbasicItem("integrated_circuit_16");
    public static RegistryObject<Item> Integrated_circuit_17 = createbasicItem("integrated_circuit_17");
    public static RegistryObject<Item> Integrated_circuit_18 = createbasicItem("integrated_circuit_18");
    public static RegistryObject<Item> Integrated_circuit_19 = createbasicItem("integrated_circuit_19");
    public static RegistryObject<Item> Integrated_circuit_20 = createbasicItem("integrated_circuit_20");
    public static RegistryObject<Item> Integrated_circuit_21 = createbasicItem("integrated_circuit_21");
    public static RegistryObject<Item> Integrated_circuit_22 = createbasicItem("integrated_circuit_22");
    public static RegistryObject<Item> Integrated_circuit_23 = createbasicItem("integrated_circuit_23");
    public static RegistryObject<Item> Integrated_circuit_24 = createbasicItem("integrated_circuit_24");

    public static RegistryObject<Item> MotorLV = createbasicItem("motor_lv");
    public static RegistryObject<Item> MotorMV = createbasicItem("motor_mv");
    public static RegistryObject<Item> MotorHV = createbasicItem("motor_hv");
    public static RegistryObject<Item> MotorEV = createbasicItem("motor_ev");
    public static RegistryObject<Item> MotorIV = createbasicItem("motor_iv");
    public static RegistryObject<Item> FluidRegulatorLV = createbasicItem("fluid_regulator_lv");
    public static RegistryObject<Item> FluidRegulatorMV = createbasicItem("fluid_regulator_mv");
    public static RegistryObject<Item> FluidRegulatorHV = createbasicItem("fluid_regulator_hv");
    public static RegistryObject<Item> FluidRegulatorEV = createbasicItem("fluid_regulator_ev");
    public static RegistryObject<Item> FluidRegulatorIV = createbasicItem("fluid_regulator_iv");
    public static RegistryObject<Item> PistonLV = createbasicItem("piston_lv");
    public static RegistryObject<Item> PistonMV = createbasicItem("piston_mv");
    public static RegistryObject<Item> PistonHV = createbasicItem("piston_hv");
    public static RegistryObject<Item> PistonEV = createbasicItem("piston_ev");
    public static RegistryObject<Item> PistonIV = createbasicItem("piston_iv");
    public static RegistryObject<Item> RobotArmLV = createbasicItem("robot_arm_lv");
    public static RegistryObject<Item> RobotArmMV = createbasicItem("robot_arm_mv");
    public static RegistryObject<Item> RobotArmHV = createbasicItem("robot_arm_hv");
    public static RegistryObject<Item> RobotArmEV = createbasicItem("robot_arm_ev");
    public static RegistryObject<Item> RobotArmIV = createbasicItem("robot_arm_iv");
    public static RegistryObject<Item> FieldGenLV = createbasicItem("field_gen_lv");
    public static RegistryObject<Item> FieldGenMV = createbasicItem("field_gen_mv");
    public static RegistryObject<Item> FieldGenHV = createbasicItem("field_gen_hv");
    public static RegistryObject<Item> FieldGenEV = createbasicItem("field_gen_ev");
    public static RegistryObject<Item> FieldGenIV = createbasicItem("field_gen_iv");
    public static RegistryObject<Item> EmitterLV = createbasicItem("emitter_lv");
    public static RegistryObject<Item> EmitterMV = createbasicItem("emitter_mv");
    public static RegistryObject<Item> EmitterHV = createbasicItem("emitter_hv");
    public static RegistryObject<Item> EmitterEV = createbasicItem("emitter_ev");
    public static RegistryObject<Item> EmitterIV = createbasicItem("emitter_iv");
    public static RegistryObject<Item> SensorLV = createbasicItem("sensor_lv");
    public static RegistryObject<Item> SensorMV = createbasicItem("sensor_mv");
    public static RegistryObject<Item> SensorHV = createbasicItem("sensor_hv");
    public static RegistryObject<Item> SensorEV = createbasicItem("sensor_ev");
    public static RegistryObject<Item> SensorIV = createbasicItem("sensor_iv");*/
}

/** CIRCUIT ITEMS **//*


    public static RegistryObject<Item> NandChip = createbasicItem("nand_chip").tip("A very simple circuit");
    public static RegistryObject<Item> AdvCircuitParts = createbasicItem("adv_circuit_parts").tip("Used for making Advanced Circuits");
    public static RegistryObject<Item> EtchedWiringMV = createbasicItem("etched_wiring_mv").tip("Circuit board Parts");
    public static RegistryObject<Item> EtchedWiringHV = createbasicItem("etched_wiring_hv").tip("Circuit board Parts");
    public static RegistryObject<Item> EtchedWiringEV = createbasicItem("etched_wiring_ev").tip("Circuit board Parts");
    public static RegistryObject<Item> EngravedCrystalChip = createbasicItem("engraved_crystal_chip").tip("Needed for Circuits");
    public static RegistryObject<Item> EngravedLapotronChip = createbasicItem("engraved_lapotron_chip").tip("Needed for Circuits");

    public static RegistryObject<Item> CircuitBoardCoated = createbasicItem("board_coated").tip("The most basic Board");
    public static RegistryObject<Item> CircuitBoardPhenolic = createbasicItem("board_phenolic").tip("A basic Board");
    public static RegistryObject<Item> CircuitBoardPlastic = createbasicItem("board_plastic").tip("An advanced Board");
    public static RegistryObject<Item> CircuitBoardEpoxy = createbasicItem("board_epoxy").tip("4th Tier Board");
    public static RegistryObject<Item> CircuitBoardFiber = createbasicItem("board_fiber_reinforced").tip("5th Tier Board");
    public static RegistryObject<Item> CircuitBoardMultiFiber = createbasicItem("board_multilayer_fiber_reinforced").tip("6th Tier Board");
    public static RegistryObject<Item> CircuitBoardWetware = createbasicItem("board_wetware").tip("7th Tier Board");

    public static RegistryObject<Item> CircuitBasic = createbasicItem("circuit_basic").tip("The breakthrough to the electrical age");
    public static RegistryObject<Item> CircuitBasicElectronic = createbasicItem("circuit_basic_electronic").tip("A basic Circuit");
    public static RegistryObject<Item> CircuitGood = createbasicItem("circuit_good").tip("A good Circuit");
    public static RegistryObject<Item> CircuitAdv = createbasicItem("circuit_adv").tip("An advanced Circuit");
    public static RegistryObject<Item> CircuitNanoProcessor = createbasicItem("circuit_nanoprocessor").tip("A Nanoprocessor");
    public static RegistryObject<Item> CircuitQuantumProcessor = createbasicItem("circuit_quantumprocessor").tip("A Quantumprocessor");
    public static RegistryObject<Item> CircuitEnergyFlow = createbasicItem("circuit_energy_flow").tip("A High Voltage Processor");
    public static RegistryObject<Item> CircuitWetware = createbasicItem("circuit_wetware").tip("You feel like it's watching you");

    public static RegistryObject<Item> Transistor = createbasicItem("transistor").tip("An integral part to Circuitry");
    public static RegistryObject<Item> Resistor = createbasicItem("resistor").tip("An integral part to Circuitry");
    public static RegistryObject<Item> Capacitor = createbasicItem("capacitor").tip("An integral part to Circuitry");
    public static RegistryObject<Item> VacuumTube = createbasicItem("vacuumtube").tip("A part for the Basic Circuit");

    public static RegistryObject<Item> BatteryTantalum = createbasicItem("battery_tantalum").tip("Reusable");
    public static RegistryObject<Item> BatteryHullSmall = createbasicItem("battery_hull_small").tip("An empty LV Battery Hull");
    public static RegistryObject<Item> BatteryHullMedium = createbasicItem("battery_hull_medium").tip("An empty MV Battery Hull");
    public static RegistryObject<Item> BatteryHullLarge = createbasicItem("battery_hull_large").tip("An empty HV Battery Hull");
    public static RegistryObject<Item> BatterySmallAcid = createbasicItem("battery_small_acid").tip("Single Use");
    public static RegistryObject<Item> BatterySmallMercury = createbasicItem("battery_small_mercury").tip("Single Use");
    public static RegistryObject<Item> BatterySmallCadmium = createbasicItem("battery_small_cadmium").tip("Reusable");
    public static RegistryObject<Item> BatterySmallLithium = createbasicItem("battery_small_lithium").tip("Reusable");
    public static RegistryObject<Item> BatterySmallSodium = createbasicItem("battery_small_sodium").tip("Reusable");
    public static RegistryObject<Item> BatteryMediumAcid = createbasicItem("battery_medium_acid").tip("Single Use");
    public static RegistryObject<Item> BatteryMediumMercury = createbasicItem("battery_medium_mercury").tip("Single Use");
    public static RegistryObject<Item> BatteryMediumCadmium = createbasicItem("battery_medium_cadmium").tip("Reusable");
    public static RegistryObject<Item> BatteryMediumLithium = createbasicItem("battery_medium_lithium").tip("Reusable");
    public static RegistryObject<Item> BatteryMediumSodium = createbasicItem("battery_medium_sodium").tip("Reusable");
    public static RegistryObject<Item> BatteryLargeAcid = createbasicItem("battery_large_acid").tip("Single Use");
    public static RegistryObject<Item> BatteryLargeMercury = createbasicItem("battery_large_mercury").tip("Single Use");
    public static RegistryObject<Item> BatteryLargeCadmium = createbasicItem("battery_large_cadmium").tip("Reusable");
    public static RegistryObject<Item> BatteryLargeLithium = createbasicItem("battery_large_lithium").tip("Reusable");
    public static RegistryObject<Item> BatteryLargeSodium = createbasicItem("battery_large_sodium").tip("Reusable");
    public static RegistryObject<Item> BatteryEnergyOrb = createbasicItem("battery_energy_orb");
    public static RegistryObject<Item> BatteryEnergyOrbCluster = createbasicItem("battery_energy_orb_cluster");

    public static RegistryObject<Item> EmptyShape = createbasicItem("empty_shape_plate").tip("Raw plate to make Molds and Extruder Shapes");
    public static RegistryObject<Item> MoldPlate = createbasicItem("mold_plate").tip("Mold for making Plates");
    public static RegistryObject<Item> MoldGear = createbasicItem("mold_gear").tip("Mold for making Gears");
    public static RegistryObject<Item> MoldGearSmall = createbasicItem("mold_small_gear").tip("Mold for making Small Gears");
    public static RegistryObject<Item> MoldCoinage = createbasicItem("mold_coinage").tip("Secure Mold for making Coins (Don't lose it!)");
    public static RegistryObject<Item> MoldBottle = createbasicItem("mold_bottle").tip("Mold for making Bottles");
    public static RegistryObject<Item> MoldIngot = createbasicItem("mold_ingot").tip("Mold for making Ingots");
    public static RegistryObject<Item> MoldBall = createbasicItem("mold_ball").tip("Mold for making Balls");
    public static RegistryObject<Item> MoldBlock = createbasicItem("mold_block").tip("Mold for making Blocks");
    public static RegistryObject<Item> MoldNugget = createbasicItem("mold_nugget").tip("Mold for making Nuggets");
    public static RegistryObject<Item> MoldAnvil = createbasicItem("mold_anvil").tip("Mold for making Anvils");
    public static RegistryObject<Item> ShapePlate = createbasicItem("shape_plate").tip("Shape for making Plates");
    public static RegistryObject<Item> ShapeRod = createbasicItem("shape_rod").tip("Shape for making Rods");
    public static RegistryObject<Item> ShapeBolt = createbasicItem("shape_bolt").tip("Shape for making Bolts");
    public static RegistryObject<Item> ShapeRing = createbasicItem("shape_ring").tip("Shape for making Rings");
    public static RegistryObject<Item> ShapeCell = createbasicItem("shape_cell").tip("Shape for making Cells");
    public static RegistryObject<Item> ShapeIngot = createbasicItem("shape_ingot").tip("Shape for making Ingots");
    public static RegistryObject<Item> ShapeWire = createbasicItem("shape_wire").tip("Shape for making Wires");
    public static RegistryObject<Item> ShapePipeTiny = createbasicItem("shape_pipe_tiny").tip("Shape for making Tiny Pipes");
    public static RegistryObject<Item> ShapePipeSmall = createbasicItem("shape_pipe_small").tip("Shape for making Small Pipes");
    public static RegistryObject<Item> ShapePipeNormal = createbasicItem("shape_pipe_normal").tip("Shape for making Normal Pipes");
    public static RegistryObject<Item> ShapePipeLarge = createbasicItem("shape_pipe_large").tip("Shape for making Large Pipes");
    public static RegistryObject<Item> ShapePipeHuge = createbasicItem("shape_pipe_huge").tip("Shape for making Huge Pipes");
    public static RegistryObject<Item> ShapeBlock = createbasicItem("shape_block").tip("Shape for making Blocks");
    public static RegistryObject<Item> ShapeHeadSword = createbasicItem("shape_head_sword").tip("Shape for making Sword Blades");
    public static RegistryObject<Item> ShapeHeadPickaxe = createbasicItem("shape_head_pickaxe").tip("Shape for making Pickaxe Heads");
    public static RegistryObject<Item> ShapeHeadShovel = createbasicItem("shape_head_shovel").tip("Shape for making Shovel Heads");
    public static RegistryObject<Item> ShapeHeadAxe = createbasicItem("shape_head_axe").tip("Shape for making Axe Heads");
    public static RegistryObject<Item> ShapeHeadHoe = createbasicItem("shape_head_hoe").tip("Shape for making Hoe Heads");
    public static RegistryObject<Item> ShapeHeadHammer = createbasicItem("shape_head_hammer").tip("Shape for making Hammer Heads");
    public static RegistryObject<Item> ShapeHeadFile = createbasicItem("shape_head_file").tip("Shape for making File Heads");
    public static RegistryObject<Item> ShapeHeadSaw = createbasicItem("shape_head_saw").tip("Shape for making Saw Heads");
    public static RegistryObject<Item> ShapeGear = createbasicItem("shape_gear").tip("Shape for making Gears");
    public static RegistryObject<Item> ShapeGearSmall = createbasicItem("shape_gear_small").tip("Shape for making Small Gears");
    public static RegistryObject<Item> ShapeBottle = createbasicItem("shape_bottle").tip("Shape for making Bottles"); //TODO needed?
    public static RegistryObject<Item> UraniumFuelCell = createbasicItem("uranium_fuel_cell").tip("Fuel cell");
    public static RegistryObject<Item> ThoriumFuelCell = createbasicItem("thorium_fuel_cell").tip("Fuel cell");


    public static StoneType GRANITE_RED = AntimatterAPI.register(StoneType.class, StoneType("granite_red", Material.RedGranite, Texture("block/stone/granite_red"), SoundType.STONE, true));
    public static StoneType GRANITE_BLACK = AntimatterAPI.register(StoneType.class, StoneType("granite_black", Material.BlackGranite, Texture("block/stone/granite_black"), SoundType.STONE, true));
    public static StoneType MARBLE = AntimatterAPI.register(StoneType.class, StoneType("marble", Material.Marble, Texture("block/stone/marble"), SoundType.STONE, true));
    public static StoneType BASALT = AntimatterAPI.register(StoneType.class,StoneType("basalt", Basalt, Texture("block/stone/basalt"), SoundType.STONE, true));

    public static StoneType KOMATIITE = AntimatterAPI.register(StoneType.class, StoneType("komatiite", Material.Komatiite, Texture("block/stone/komatiite"), SoundType.STONE, true));
    public static StoneType LIMESTONE = AntimatterAPI.register(StoneType.class,  StoneType("limestone", Limestone, Texture("block/stone/limestone"), SoundType.STONE, true));
    public static StoneType GREEN_SCHIST = AntimatterAPI.register(StoneType.class, StoneType("green_schist", GreenSchist, Texture("block/stone/green_schist"), SoundType.STONE, true));
    public static StoneType BLUE_SCHIST = AntimatterAPI.register(StoneType.class,  StoneType("blue_schist", BlueSchist, Texture("block/stone/blue_schist"), SoundType.STONE, true));
    public static StoneType KIMBERLITE = AntimatterAPI.register(StoneType.class,  StoneType("kimberlite", Kimberlite, Texture("block/stone/kimberlite"), SoundType.STONE, true));
    public static StoneType QUARTZITE = AntimatterAPI.register(StoneType.class, StoneType("quartzite", Quartzite, Texture("block/stone/quartzite"), SoundType.STONE, true));

    //public static BlockBasic ANTHRACITE_COAL = BlockBasic("anthracite_coal", Texture("block/basic/anthracite_coal");
    //public static BlockBasic ANTHRACITE_COAL = BlockBasic("anthracite_coal", Texture("block/basic/anthracite_coal");


    public static final Cable<?> CABLE_RED_ALLOY = AntimatterAPI.register(Cable.class, Cable<>(RedAlloy, 0, Tier.ULV).amps(1));
    public static final Cable<?> CABLE_COBALT = AntimatterAPI.register(Cable.class, Cable<>(Cobalt, 2, Tier.LV).amps(2)); //L);
    public static final Cable<?> CABLE_LEAD = AntimatterAPI.register(Cable.class, Cable<>(Lead, 2, Tier.LV).amps(2));
    public static final Cable<?> CABLE_TIN = AntimatterAPI.register(Cable.class, Cable<>(Tin, 1, Tier.LV).amps(1));
    public static final Cable<?> CABLE_ZINC = AntimatterAPI.register(Cable.class, Cable<>(Zinc, 1, Tier.LV).amps(1));
    public static final Cable<?> CABLE_SOLDERING_ALLOY = AntimatterAPI.register(Cable.class, Cable<>(SolderingAlloy, 1, Tier.LV).amps(1));
    public static final Cable<?> CABLE_IRON = AntimatterAPI.register(Cable.class, Cable<>(Iron, HC ? 3 : 4, Tier.MV).amps(2)); //M);
    public static final Cable<?> CABLE_NICKEL = AntimatterAPI.register(Cable.class, Cable<>(Nickel, HC ? 3 : 5, Tier.MV).amps(3));
    public static final Cable<?> CABLE_CUPRONICKEL = AntimatterAPI.register(Cable.class, Cable<>(Cupronickel, HC ? 3 : 4, Tier.MV).amps(2));
    public static final Cable<?> CABLE_COPPER = AntimatterAPI.register(Cable.class, Cable<>(Copper, HC ? 2 : 3, Tier.MV).amps(1));
    public static final Cable<?> CABLE_ANNEALED_COPPER = AntimatterAPI.register(Cable.class, Cable<>(AnnealedCopper, HC ? 1 : 2, Tier.MV).amps(1));
    public static final Cable<?> CABLE_KANTHAL = AntimatterAPI.register(Cable.class, Cable<>(Kanthal, HC ? 3 : 8, Tier.HV).amps(4)); //H);
    public static final Cable<?> CABLE_GOLD = AntimatterAPI.register(Cable.class, Cable<>(Gold, HC ? 2 : 6, Tier.HV).amps(3));
    public static final Cable<?> CABLE_ELECTRUM = AntimatterAPI.register(Cable.class, Cable<>(Electrum, HC ? 2 : 5, Tier.HV).amps(2));
    public static final Cable<?> CABLE_SILVER = AntimatterAPI.register(Cable.class,Cable<>(Silver, HC ? 1 : 4, Tier.HV).amps(1));
    public static final Cable<?> CABLE_NICHROME = AntimatterAPI.register(Cable.class, Cable<>(Nichrome, HC ? 4 : 32, Tier.EV).amps(3)); //E);
    public static final Cable<?> CABLE_STEEL = AntimatterAPI.register(Cable.class, Cable<>(Steel, HC ? 2 : 16, Tier.EV).amps(2));
    public static final Cable<?> CABLE_TITANIUM = AntimatterAPI.register(Cable.class, Cable<>(Titanium, HC ? 2 : 12, Tier.EV).amps(4));
    public static final Cable<?> CABLE_ALUMINIUM = AntimatterAPI.register(Cable.class, Cable<>(Aluminium, HC ? 1 : 8, Tier.EV).amps(1));
    public static final Cable<?> CABLE_GRAPHENE = AntimatterAPI.register(Cable.class, Cable<>(Graphene, HC ? 1 : 16, Tier.IV).amps(1)); //I);
    public static final Cable<?> CABLE_OSMIUM = AntimatterAPI.register(Cable.class,Cable<>(Osmium, HC ? 2 : 32, Tier.IV).amps(4));
    public static final Cable<?> CABLE_PLATINUM = AntimatterAPI.register(Cable.class, Cable<>(Platinum, HC ? 1 : 16, Tier.IV).amps(2));
    public static final Cable<?> CABLE_TUNGSTEN_STEEL = AntimatterAPI.register(Cable.class, Cable<>(TungstenSteel, HC ? 1 : 14, Tier.IV).amps(3));
    public static final Cable<?> CABLE_TUNGSTEN = AntimatterAPI.register(Cable.class, Cable<>(Tungsten, HC ? 2 : 12, Tier.IV).amps(1));
    public static final Cable<?> CABLE_HSSG = AntimatterAPI.register(Cable.class, Cable<>(HSSG, HC ? 2 : 128, Tier.LUV).amps(4)); //LU);
    public static final Cable<?> CABLE_NIOBIUM_TITANIUM = AntimatterAPI.register(Cable.class, Cable<>(NiobiumTitanium, HC ? 2 : 128, Tier.LUV).amps(4));
    public static final Cable<?> CABLE_VANADIUM_GALLIUM = AntimatterAPI.register(Cable.class, Cable<>(VanadiumGallium, HC ? 2 : 128, Tier.LUV).amps(4));
    public static final Cable<?> CABLE_YTTRIUM_BARIUM_CUPRATE = AntimatterAPI.register(Cable.class, Cable<>(YttriumBariumCuprate, HC ? 4 : 256, Tier.LUV).amps(4));
    public static final Cable<?> CABLE_NAQUADAH = AntimatterAPI.register(Cable.class, Cable<>(Naquadah, HC ? 2 : 64, Tier.ZPM).amps(2)); //ZP);
    public static final Cable<?> CABLE_NAQUADAH_ALLOY = AntimatterAPI.register(Cable.class, Cable<>(NaquadahAlloy, HC ? 4 : 64, Tier.ZPM).amps(2));
    public static final Cable<?> CABLE_DURANIUM = AntimatterAPI.register(Cable.class, Cable<>(Duranium, HC ? 8 : 64, Tier.ZPM).amps(1));
    public static final Cable<?> CABLE_SUPERCONDUCTOR = AntimatterAPI.register(Cable.class, Cable<>(Superconductor, 0, Tier.MAX).amps(4)); //MA);


    public static final Wire<?> WIRE_RED_ALLOY = AntimatterAPI.register(Wire.class, Wire<>(RedAlloy, 1, Tier.ULV).amps(1));
    public static final Wire<?> WIRE_COBALT = AntimatterAPI.register(Wire.class, Wire<>(Cobalt, 4, Tier.LV).amps(2)); //L);
    public static final Wire<?> WIRE_LEAD = AntimatterAPI.register(Wire.class,  Wire<>(Lead, 4, Tier.LV).amps(2));
    public static final Wire<?> WIRE_TIN = AntimatterAPI.register(Wire.class,  Wire<>(Tin, 2, Tier.LV).amps(1));
    public static final Wire<?> WIRE_ZINC = AntimatterAPI.register(Wire.class, Wire<>(Zinc, 2, Tier.LV).amps(1));
    public static final Wire<?> WIRE_SOLDERING_ALLOY = AntimatterAPI.register(Wire.class, Wire<>(SolderingAlloy, 2, Tier.LV).amps(1));
    public static final Wire<?> WIRE_IRON = AntimatterAPI.register(Wire.class, Wire<>(Iron, HC ? 6 : 8, Tier.MV).amps(2)); //M);
    public static final Wire<?> WIRE_NICKEL = AntimatterAPI.register(Wire.class, Wire<>(Nickel, HC ? 6 : 10, Tier.MV).amps(3));
    public static final Wire<?> WIRE_CUPRONICKEL = AntimatterAPI.register(Wire.class, Wire<>(Cupronickel, HC ? 6 : 8, Tier.MV).amps(2));
    public static final Wire<?> WIRE_COPPER = AntimatterAPI.register(Wire.class, Wire<>(Copper, HC ? 4 : 6, Tier.MV).amps(1)); */
/*  public static final Wire<?> WIRE_ANNEALED_COPPER = AntimatterAPI.register(Wire.class, Wire<>(AnnealedCopper, HC ? 2 : 4, Tier.MV).amps(1));
    public static final Wire<?> WIRE_KANTHAL = AntimatterAPI.register(Wire.class, Wire<>(Kanthal, HC ? 6 : 16, Tier.HV).amps(4)); //H);
    public static final Wire<?> WIRE_GOLD = AntimatterAPI.register(Wire.class, Wire<>(Gold, HC ? 4 : 12, Tier.HV).amps(3));
    public static final Wire<?> WIRE_ELECTRUM = AntimatterAPI.register(Wire.class, Wire<>(Electrum, HC ? 4 : 10, Tier.HV).amps(2));
    public static final Wire<?> WIRE_SILVER = AntimatterAPI.register(Wire.class, Wire<>(Silver, HC ? 2 : 8, Tier.HV).amps(1));
    public static final Wire<?> WIRE_NICHROME = AntimatterAPI.register(Wire.class, Wire<>(Nichrome, HC ? 8 : 64, Tier.EV).amps(3)); //E);
    public static final Wire<?> WIRE_STEEL = AntimatterAPI.register(Wire.class, Wire<>(Steel, HC ? 4 : 32, Tier.EV).amps(2));
    public static final Wire<?> WIRE_TITANIUM = AntimatterAPI.register(Wire.class,  Wire<>(Titanium, HC ? 4 : 24, Tier.EV).amps(4));
    public static final Wire<?> WIRE_ALUMINIUM = AntimatterAPI.register(Wire.class,Wire<>(Aluminium, HC ? 2 : 16, Tier.EV).amps(1));
    public static final Wire<?> WIRE_GRAPHENE = AntimatterAPI.register(Wire.class,  Wire<>(Graphene, HC ? 2 : 32, Tier.IV).amps(1)); //I);
    public static final Wire<?> WIRE_OSMIUM = AntimatterAPI.register(Wire.class,Wire<>(Osmium, HC ? 4 : 64, Tier.IV).amps(4));
    public static final Wire<?> WIRE_PLATINUM = AntimatterAPI.register(Wire.class, Wire<>(Platinum, HC ? 2 : 32, Tier.IV).amps(2));
    public static final Wire<?> WIRE_TUNGSTEN_STEEL = AntimatterAPI.register(Wire.class, Wire<>(TungstenSteel, HC ? 2 : 28, Tier.IV).amps(3));
    public static final Wire<?> WIRE_TUNGSTEN = AntimatterAPI.register(Wire.class, Wire<>(Tungsten, HC ? 2 : 12, Tier.IV).amps(1));
    public static final Wire<?> WIRE_HSSG = AntimatterAPI.register(Wire.class, Wire<>(HSSG, HC ? 4 : 256, Tier.LUV).amps(4)); //LU);
    public static final Wire<?> WIRE_NIOBIUM_TITANIUM = AntimatterAPI.register(Wire.class,Wire<>(NiobiumTitanium, HC ? 4 : 256, Tier.LUV).amps(4));
    public static final Wire<?> WIRE_VANADIUM_GALLIUM = AntimatterAPI.register(Wire.class, Wire<>(VanadiumGallium, HC ? 4 : 256, Tier.LUV).amps(4));
    public static final Wire<?> WIRE_YTTRIUM_BARIUM_CUPRATE = AntimatterAPI.register(Wire.class, Wire<>(YttriumBariumCuprate, HC ? 8 : 512, Tier.LUV).amps(4));
    public static final Wire<?> WIRE_NAQUADAH = AntimatterAPI.register(Wire.class,Wire<>(Naquadah, HC ? 4 : 128, Tier.ZPM).amps(2)); //ZP);
    public static final Wire<?> WIRE_NAQUADAH_ALLOY = AntimatterAPI.register(Wire.class,Wire<>(NaquadahAlloy, HC ? 8 : 128, Tier.ZPM).amps(2));
    public static final Wire<?> WIRE_DURANIUM = AntimatterAPI.register(Wire.class,Wire<>(Duranium, HC ? 16 : 128, Tier.ZPM).amps(1));
    public static final Wire<?> WIRE_SUPERCONDUCTOR = AntimatterAPI.register(Wire.class,Wire<>(Superconductor, 1, Tier.MAX).amps(4)); //MA);

    public static final FluidPipe<?> FLUID_PIPE_COPPER = AntimatterAPI.register(FluidPipe.class,FluidPipe<>(Copper, 1696, true).caps(1).pressures(getPressures(300)));
    public static final FluidPipe<?> FLUID_PIPE_STAINLESS_STEEL = AntimatterAPI.register(FluidPipe.class,FluidPipe<>(StainlessSteel, 2428, true).caps(1).pressures(getPressures(750)));
    public static final FluidPipe<?> FLUID_PIPE_TITANIUM = AntimatterAPI.register(FluidPipe.class, FluidPipe<>(Titanium, 1668, true).caps(1).pressures(getPressures(900)));
    public static final FluidPipe<?> FLUID_PIPE_TUNGSTEN_STEEL = AntimatterAPI.register(FluidPipe.class,FluidPipe<>(TungstenSteel, 3587, true).caps(1).pressures(getPressures(1200)));
    //public static final FluidPipe<?> FLUID_PIPE_TUNGSTEN_CARBIDE = AntimatterAPI.register(FluidPipe.class,FluidPipe<>(TungstenCarbide, 3837, true).caps(1).pressures(getPressures(1350)));

}
*/

