package lazzy.techparts.items;

//import static muramasa.antimatter.Data.*;
//import static muramasa.gregtech.data.Material.*;


import lazzy.techparts.items.materials.Material;
import lazzy.techparts.items.materials.Parts;
import lazzy.techparts.setup.Register;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.Collection;

public class TechPartsItems {

    public static final DeferredRegister<Item> ITEMS = Register.create(ForgeRegistries.ITEMS);
    public static final Collection<RegistryObject<BasicItem>> BASIC_ITEMS = new ArrayList<>();

    public static void init() {

    }

    public static RegistryObject<MatPartItem> registerMatPartItem(Material mat, Parts part){
        return ITEMS.register(mat.getID()+"_"+part.getID(),()->new MatPartItem(mat,part));
    }

    //Private because only for Basic Items
    private static RegistryObject<BasicItem> registerBasicItem(BasicItem.ItemBuilder bitem) {
        RegistryObject<BasicItem> item = ITEMS.register(bitem.getId(), () -> new BasicItem(bitem));
        BASIC_ITEMS.add(item);
        return item;
    }









    //Items starting here

    // TODO: Datagen for Jsons for these

    /*
        MISC
     */

    public static final RegistryObject<BasicItem> COMPUTER_MONITOR = registerBasicItem(new BasicItem.ItemBuilder().id("computer_monitor"));
    public static final RegistryObject<BasicItem> GRAVI_STAR = registerBasicItem(new BasicItem.ItemBuilder().id("gravi_star"));
    public static final RegistryObject<BasicItem> INDUSTRIAL_635 = registerBasicItem(new BasicItem.ItemBuilder().id("industrial_635"));
    public static final RegistryObject<BasicItem> INDUSTRIAL_636 = registerBasicItem(new BasicItem.ItemBuilder().id("industrial_636"));
    public static final RegistryObject<BasicItem> INDUSTRIAL_637 = registerBasicItem(new BasicItem.ItemBuilder().id("industrial_637"));
    public static RegistryObject<BasicItem> QuantumEye = registerBasicItem(new BasicItem.ItemBuilder().id("quantum_eye").tip("Improved Ender Eye"));
    public static RegistryObject<BasicItem> QuantumStat = registerBasicItem(new BasicItem.ItemBuilder().id("quantum_star").tip("Improved Nether Star"));

    /*
        BATTERIES
     */

    public static final RegistryObject<BasicItem> BATTERY_ORB = registerBasicItem(new BasicItem.ItemBuilder().id("battery_orb"));
    public static final RegistryObject<BasicItem> BATTERY_HULL_LARGE = registerBasicItem(new BasicItem.ItemBuilder().id("battery_hull_large").name("Large Battery Hull"));
    public static final RegistryObject<BasicItem> BATTERY_HULL_MEDIUM = registerBasicItem(new BasicItem.ItemBuilder().id("battery_hull_medium").name("Medium Battery Hull"));
    public static final RegistryObject<BasicItem> BATTERY_HULL_SMALL = registerBasicItem(new BasicItem.ItemBuilder().id("battery_hull_small").name("Small Battery Hull"));
    public static final RegistryObject<BasicItem> BATTERY_LARGE_ACID = registerBasicItem(new BasicItem.ItemBuilder().id("battery_large_acid").name("Large Acid Battery"));
    public static final RegistryObject<BasicItem> BATTERY_LARGE_CADMIUM = registerBasicItem(new BasicItem.ItemBuilder().id("battery_large_cadmium").name("Large Cadmium Battery"));
    public static final RegistryObject<BasicItem> BATTERY_LARGE_LITHIUM = registerBasicItem(new BasicItem.ItemBuilder().id("battery_large_lithium").name("Large Lithium Battery"));
    public static final RegistryObject<BasicItem> BATTERY_LARGE_MERCURY = registerBasicItem(new BasicItem.ItemBuilder().id("battery_large_mercury").name("Large Mercury Battery"));
    public static final RegistryObject<BasicItem> BATTERY_LARGE_SODIUM = registerBasicItem(new BasicItem.ItemBuilder().id("battery_large_sodium").name("Large Sodium Battery"));
    public static final RegistryObject<BasicItem> BATTERY_MEDIUM_ACID = registerBasicItem(new BasicItem.ItemBuilder().id("battery_medium_acid").name("Medium Acid Battery"));
    public static final RegistryObject<BasicItem> BATTERY_MEDIUM_CADMIUM = registerBasicItem(new BasicItem.ItemBuilder().id("battery_medium_cadmium").name("Medium Cadmium Battery"));
    public static final RegistryObject<BasicItem> BATTERY_MEDIUM_LITHIUM = registerBasicItem(new BasicItem.ItemBuilder().id("battery_medium_lithium").name("Medium Lithium Battery"));
    public static final RegistryObject<BasicItem> BATTERY_MEDIUM_MERCURY = registerBasicItem(new BasicItem.ItemBuilder().id("battery_medium_mercury").name("Medium Mercury Battery"));
    public static final RegistryObject<BasicItem> BATTERY_MEDIUM_SODIUM = registerBasicItem(new BasicItem.ItemBuilder().id("battery_medium_sodium").name("Medium Sodium Battery"));
    public static final RegistryObject<BasicItem> BATTERY_SMALL_ACID = registerBasicItem(new BasicItem.ItemBuilder().id("battery_small_acid").name("Small Acid Battery"));
    public static final RegistryObject<BasicItem> BATTERY_SMALL_CADMIUM = registerBasicItem(new BasicItem.ItemBuilder().id("battery_small_cadmium").name("Small Cadmium Battery"));
    public static final RegistryObject<BasicItem> BATTERY_SMALL_LITHIUM = registerBasicItem(new BasicItem.ItemBuilder().id("battery_small_lithium").name("Small Lithium Battery"));
    public static final RegistryObject<BasicItem> BATTERY_SMALL_MERCURY = registerBasicItem(new BasicItem.ItemBuilder().id("battery_small_mercury").name("Small Mercury Battery"));
    public static final RegistryObject<BasicItem> BATTERY_SMALL_SODIUM = registerBasicItem(new BasicItem.ItemBuilder().id("battery_small_sodium").name("Small Sodium Battery"));
    public static final RegistryObject<BasicItem> BATTERY_TANTALUM = registerBasicItem(new BasicItem.ItemBuilder().id("battery_tantalum").name("Tantalum Battery"));

    /*
        DEVICE PARTS
     */

    public static final RegistryObject<BasicItem> EMITTER_EV = registerBasicItem(new BasicItem.ItemBuilder().id("emitter_ev").name("Primitive Emitter"));
    public static final RegistryObject<BasicItem> EMITTER_HV = registerBasicItem(new BasicItem.ItemBuilder().id("emitter_hv").name("Basic Emitter"));
    public static final RegistryObject<BasicItem> EMITTER_IV = registerBasicItem(new BasicItem.ItemBuilder().id("emitter_iv").name("Improved Emitter"));
    public static final RegistryObject<BasicItem> EMITTER_LV = registerBasicItem(new BasicItem.ItemBuilder().id("emitter_lv").name("Advanced Emitter"));
    public static final RegistryObject<BasicItem> EMITTER_MV = registerBasicItem(new BasicItem.ItemBuilder().id("emitter_mv").name("Quantum Emitter"));

    public static final RegistryObject<BasicItem> ENERGY_PORT = registerBasicItem(new BasicItem.ItemBuilder().id("energy_port"));
    public static final RegistryObject<BasicItem> FLUID_PORT = registerBasicItem(new BasicItem.ItemBuilder().id("fluid_port"));
    public static final RegistryObject<BasicItem> ITEM_PORT = registerBasicItem(new BasicItem.ItemBuilder().id("item_port"));

    public static final RegistryObject<BasicItem> FLUID_REGULATOR_EV = registerBasicItem(new BasicItem.ItemBuilder().id("fluid_regulator_ev").name("Primitive Fluid Regulator"));
    public static final RegistryObject<BasicItem> FLUID_REGULATOR_HV = registerBasicItem(new BasicItem.ItemBuilder().id("fluid_regulator_hv").name("Basic Fluid Regulator"));
    public static final RegistryObject<BasicItem> FLUID_REGULATOR_IV = registerBasicItem(new BasicItem.ItemBuilder().id("fluid_regulator_iv").name("Improved Fluid Regulator"));
    public static final RegistryObject<BasicItem> FLUID_REGULATOR_LV = registerBasicItem(new BasicItem.ItemBuilder().id("fluid_regulator_lv").name("Advanced Fluid Regulator"));
    public static final RegistryObject<BasicItem> FLUID_REGULATOR_MV = registerBasicItem(new BasicItem.ItemBuilder().id("fluid_regulator_mv").name("Quantum Fluid Regulator"));

    public static final RegistryObject<BasicItem> FIELD_GEN_EV = registerBasicItem(new BasicItem.ItemBuilder().id("field_gen_ev").name("Primitive Force Field Generator"));
    public static final RegistryObject<BasicItem> FIELD_GEN_HV = registerBasicItem(new BasicItem.ItemBuilder().id("field_gen_hv").name("Basic Force Field Generator"));
    public static final RegistryObject<BasicItem> FIELD_GEN_IV = registerBasicItem(new BasicItem.ItemBuilder().id("field_gen_iv").name("Improved Force Field Generator"));
    public static final RegistryObject<BasicItem> FIELD_GEN_LV = registerBasicItem(new BasicItem.ItemBuilder().id("field_gen_lv").name("Advanced Force Field Generator"));
    public static final RegistryObject<BasicItem> FIELD_GEN_MV = registerBasicItem(new BasicItem.ItemBuilder().id("field_gen_mv").name("Quantum Force Field Generator"));

    public static RegistryObject<BasicItem> MotorLV = registerBasicItem(new BasicItem.ItemBuilder().id("motor_lv").name("Primitive Motor"));
    public static RegistryObject<BasicItem> MotorMV = registerBasicItem(new BasicItem.ItemBuilder().id("motor_mv").name("Basic Motor"));
    public static RegistryObject<BasicItem> MotorHV = registerBasicItem(new BasicItem.ItemBuilder().id("motor_hv").name("Improved Motor"));
    public static RegistryObject<BasicItem> MotorEV = registerBasicItem(new BasicItem.ItemBuilder().id("motor_ev").name("Advanced Motor"));
    public static RegistryObject<BasicItem> MotorIV = registerBasicItem(new BasicItem.ItemBuilder().id("motor_iv").name("Quantum Motor"));

    public static RegistryObject<BasicItem> PistonLV = registerBasicItem(new BasicItem.ItemBuilder().id("piston_lv").name("Primitive Piston"));
    public static RegistryObject<BasicItem> PistonMV = registerBasicItem(new BasicItem.ItemBuilder().id("piston_mv").name("Basic Piston"));
    public static RegistryObject<BasicItem> PistonHV = registerBasicItem(new BasicItem.ItemBuilder().id("piston_hv").name("Improved Piston"));
    public static RegistryObject<BasicItem> PistonEV = registerBasicItem(new BasicItem.ItemBuilder().id("piston_ev").name("Advanced Piston"));
    public static RegistryObject<BasicItem> PistonIV = registerBasicItem(new BasicItem.ItemBuilder().id("piston_iv").name("Quantum Piston"));

    public static RegistryObject<BasicItem> PUMP_EV = registerBasicItem(new BasicItem.ItemBuilder().id("pump_ev").name("Primitive Pump"));
    public static RegistryObject<BasicItem> PUMP_HV = registerBasicItem(new BasicItem.ItemBuilder().id("pump_hv").name("Basic Pump"));
    public static RegistryObject<BasicItem> PUMP_IV = registerBasicItem(new BasicItem.ItemBuilder().id("pump_iv").name("Improved Pump"));
    public static RegistryObject<BasicItem> PUMP_LV = registerBasicItem(new BasicItem.ItemBuilder().id("pump_lv").name("Advanced Pump"));
    public static RegistryObject<BasicItem> PUMP_MV = registerBasicItem(new BasicItem.ItemBuilder().id("pump_mv").name("Quantum Pump"));

    public static RegistryObject<BasicItem> RobotArmLV = registerBasicItem(new BasicItem.ItemBuilder().id("robot_arm_lv").name("Static Robot Arm"));
    public static RegistryObject<BasicItem> RobotArmMV = registerBasicItem(new BasicItem.ItemBuilder().id("robot_arm_mv").name("Long Static Robot Arm"));
    public static RegistryObject<BasicItem> RobotArmHV = registerBasicItem(new BasicItem.ItemBuilder().id("robot_arm_hv").name("Flexible Robot Arm"));
    public static RegistryObject<BasicItem> RobotArmEV = registerBasicItem(new BasicItem.ItemBuilder().id("robot_arm_ev").name("Single Joint Robot Arm"));
    public static RegistryObject<BasicItem> RobotArmIV = registerBasicItem(new BasicItem.ItemBuilder().id("robot_arm_iv").name("Double Joint Robot Arm"));

    public static RegistryObject<BasicItem> SensorLV = registerBasicItem(new BasicItem.ItemBuilder().id("sensor_lv").name("Primitive Sensor"));
    public static RegistryObject<BasicItem> SensorMV = registerBasicItem(new BasicItem.ItemBuilder().id("sensor_mv").name("Basic Sensor"));
    public static RegistryObject<BasicItem> SensorHV = registerBasicItem(new BasicItem.ItemBuilder().id("sensor_hv").name("Improved Sensor"));
    public static RegistryObject<BasicItem> SensorEV = registerBasicItem(new BasicItem.ItemBuilder().id("sensor_ev").name("Advanced Sensor"));
    public static RegistryObject<BasicItem> SensorIV = registerBasicItem(new BasicItem.ItemBuilder().id("sensor_iv").name("Quantum Sensor"));


    /*
        METALS AND ALLOYS
     */
    public static RegistryObject<BasicItem> IridiumAlloyIngot = registerBasicItem(new BasicItem.ItemBuilder().id("iridium_alloy_ingot"));
    public static RegistryObject<BasicItem> IridiumReinforcedPlate = registerBasicItem(new BasicItem.ItemBuilder().id("iridium_reinforced_plate"));
    public static RegistryObject<BasicItem> IridiumNeutronReflector = registerBasicItem(new BasicItem.ItemBuilder().id("iridium_neutron_reflector"));

    /*
        CIRCUITS UND BOARDS
     */

    public static final RegistryObject<BasicItem> BOARD_COATED = registerBasicItem(new BasicItem.ItemBuilder().id("board_coated").tip("The most basic Board"));
    public static final RegistryObject<BasicItem> BOARD_PHENOLIC = registerBasicItem(new BasicItem.ItemBuilder().id("board_phenolic").tip("A basic Board"));
    public static final RegistryObject<BasicItem> BOARD_PLASTIC = registerBasicItem(new BasicItem.ItemBuilder().id("board_plastic").tip("An advanced Board"));
    public static final RegistryObject<BasicItem> BOARD_EPOXY = registerBasicItem(new BasicItem.ItemBuilder().id("board_epoxy").tip("4th Tier Board"));
    public static final RegistryObject<BasicItem> BOARD_FIBER_REINFORCED = registerBasicItem(new BasicItem.ItemBuilder().id("board_fiber_reinforced").tip("5th Tier Board"));
    public static final RegistryObject<BasicItem> BOARD_MULTILAYER_FIBER_REINFORCED = registerBasicItem(new BasicItem.ItemBuilder().id("board_multilayer_fiber_reinforced").tip("6th Tier Board"));
    public static final RegistryObject<BasicItem> BOARD_WETWARE = registerBasicItem(new BasicItem.ItemBuilder().id("board_wetware").tip("7th Tier Board"));

    public static final RegistryObject<BasicItem> ADV_CIRCUIT_PARTS = registerBasicItem(new BasicItem.ItemBuilder().id("adv_circuit_parts"));
    public static RegistryObject<BasicItem> NandChip = registerBasicItem(new BasicItem.ItemBuilder().id("nand_chip"));



    public static final RegistryObject<BasicItem> CIRCUIT_BOARD_BASIC = registerBasicItem(new BasicItem.ItemBuilder().id("circuit_board_basic").name("Basic Circuit Board"));
    public static final RegistryObject<BasicItem> CIRCUIT_BOARD_EMPTY = registerBasicItem(new BasicItem.ItemBuilder().id("circuit_board_empty").name("Empty Circuit Board"));
    public static final RegistryObject<BasicItem> CIRCUIT_BOARD_PROCESSOR = registerBasicItem(new BasicItem.ItemBuilder().id("circuit_board_processor").name("Processor Circuit Board"));
    public static final RegistryObject<BasicItem> CIRCUIT_BOARD_PROCESSOR_EMPTY = registerBasicItem(new BasicItem.ItemBuilder().id("circuit_board_processor_empty").name("Empty Processor Circuit Board"));
    public static final RegistryObject<BasicItem> CIRCUIT_DATA_CONTROL = registerBasicItem(new BasicItem.ItemBuilder().id("circuit_data_control").name("Data Control Circuit Board"));
    public static final RegistryObject<BasicItem> CIRCUIT_DATA_ORB = registerBasicItem(new BasicItem.ItemBuilder().id("circuit_data_orb").name("Data Orb"));
    public static final RegistryObject<BasicItem> CIRCUIT_DATA_STORAGE = registerBasicItem(new BasicItem.ItemBuilder().id("circuit_data_storage").name("Data Storage Circuit Board"));

    public static final RegistryObject<BasicItem> CIRCUIT_BASIC = registerBasicItem(new BasicItem.ItemBuilder().id("circuit_basic").tip("The breakthrough to the electrical age").name("Primitive Circuit"));
    public static final RegistryObject<BasicItem> CIRCUIT_BASIC_ELECTRONIC = registerBasicItem(new BasicItem.ItemBuilder().id("circuit_basic_electronic").tip("A basic Circuit").name("Basic Circuit"));
    public static final RegistryObject<BasicItem> CIRCUIT_GOOD = registerBasicItem(new BasicItem.ItemBuilder().id("circuit_good").tip("A good Circuit").name("Improved Circuit"));
    public static final RegistryObject<BasicItem> CIRCUIT_ADV = registerBasicItem(new BasicItem.ItemBuilder().id("circuit_adv").tip("An advanced Circuit").name("Advanced Circuit"));
    public static final RegistryObject<BasicItem> CIRCUIT_NANOPROCESSOR = registerBasicItem(new BasicItem.ItemBuilder().id("circuit_nanoprocessor").tip("A Nanoprocessor").name("Nanoprocessor Circuit"));
    public static final RegistryObject<BasicItem> CIRCUIT_QUANTUMPROCESSOR = registerBasicItem(new BasicItem.ItemBuilder().id("circuit_quantumprocessor").tip("A Quantumprocessor").name("Quantum Circuit"));
    public static final RegistryObject<BasicItem> CIRCUIT_ENERGY_FLOW = registerBasicItem(new BasicItem.ItemBuilder().id("circuit_energy_flow").tip("A High Voltage Processor").name("High Voltage Circuit"));
    public static final RegistryObject<BasicItem> CIRCUIT_WETWARE = registerBasicItem(new BasicItem.ItemBuilder().id("circuit_wetware").tip("You feel like it's watching you").name("Advanced AI Circuit"));

    public static RegistryObject<BasicItem> Integrated_circuit_0 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_0"));
    public static RegistryObject<BasicItem> Integrated_circuit_1 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_1"));
    public static RegistryObject<BasicItem> Integrated_circuit_2 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_2"));
    public static RegistryObject<BasicItem> Integrated_circuit_3 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_3"));
    public static RegistryObject<BasicItem> Integrated_circuit_4 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_4"));
    public static RegistryObject<BasicItem> Integrated_circuit_5 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_5"));
    public static RegistryObject<BasicItem> Integrated_circuit_6 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_6"));
    public static RegistryObject<BasicItem> Integrated_circuit_7 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_7"));
    public static RegistryObject<BasicItem> Integrated_circuit_8 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_8"));
    public static RegistryObject<BasicItem> Integrated_circuit_9 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_9"));
    public static RegistryObject<BasicItem> Integrated_circuit_10 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_10"));
    public static RegistryObject<BasicItem> Integrated_circuit_11 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_11"));
    public static RegistryObject<BasicItem> Integrated_circuit_12 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_12"));
    public static RegistryObject<BasicItem> Integrated_circuit_13 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_13"));
    public static RegistryObject<BasicItem> Integrated_circuit_14 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_14"));
    public static RegistryObject<BasicItem> Integrated_circuit_15 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_15"));
    public static RegistryObject<BasicItem> Integrated_circuit_16 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_16"));
    public static RegistryObject<BasicItem> Integrated_circuit_17 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_17"));
    public static RegistryObject<BasicItem> Integrated_circuit_18 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_18"));
    public static RegistryObject<BasicItem> Integrated_circuit_19 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_19"));
    public static RegistryObject<BasicItem> Integrated_circuit_20 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_20"));
    public static RegistryObject<BasicItem> Integrated_circuit_21 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_21"));
    public static RegistryObject<BasicItem> Integrated_circuit_22 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_22"));
    public static RegistryObject<BasicItem> Integrated_circuit_23 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_23"));
    public static RegistryObject<BasicItem> Integrated_circuit_24 = registerBasicItem(new BasicItem.ItemBuilder().id("integrated_circuit_24"));

    /*
        ELECTRICS
     */

    public static RegistryObject<BasicItem> ENGRAVED_CRYSTAL_CHIP = registerBasicItem(new BasicItem.ItemBuilder().id("engraved_crystal_chip"));
    public static RegistryObject<BasicItem> ENGRAVED_LAPOTRON_CHIP = registerBasicItem(new BasicItem.ItemBuilder().id("engraved_lapotron_chip"));
    public static RegistryObject<BasicItem> ETCHED_WIRING_EV = registerBasicItem(new BasicItem.ItemBuilder().id("etched_wiring_ev").name("Basic Etched Wiring"));
    public static RegistryObject<BasicItem> ETCHED_WIRING_HV = registerBasicItem(new BasicItem.ItemBuilder().id("etched_wiring_hv").name("Improved Etched Wiring"));
    public static RegistryObject<BasicItem> ETCHED_WIRING_MV = registerBasicItem(new BasicItem.ItemBuilder().id("etched_wiring_mv").name("Advanced Etched Wiring"));

    public static final RegistryObject<BasicItem> CAPACITOR = registerBasicItem(new BasicItem.ItemBuilder().id("capacitor"));
    public static RegistryObject<BasicItem> Resistor = registerBasicItem(new BasicItem.ItemBuilder().id("resistor").tip("An integral part to Circuitry"));
    public static RegistryObject<BasicItem> Transistor = registerBasicItem(new BasicItem.ItemBuilder().id("transistor").tip("An integral part to Circuitry"));
    public static RegistryObject<BasicItem> VacuumTube = registerBasicItem(new BasicItem.ItemBuilder().id("vacuumtube").tip("A part for the Basic Circuit"));


    /*
        CHEMISTRY
    */
    public static final RegistryObject<BasicItem> CELL_STEEL = registerBasicItem(new BasicItem.ItemBuilder().id("cell_steel").name("Steel Cell"));
    public static final RegistryObject<BasicItem> CELL_TIN = registerBasicItem(new BasicItem.ItemBuilder().id("cell_tin").name("Tin Cell"));

    public static final RegistryObject<BasicItem> STICKY_RESIN = registerBasicItem(new BasicItem.ItemBuilder().id("sticky_resin"));

    public static RegistryObject<BasicItem> UraniumFuelCell = registerBasicItem(new BasicItem.ItemBuilder().id("uranium_fuel_cell").tip("Fuel cell"));
    public static RegistryObject<BasicItem> ThoriumFuelCell = registerBasicItem(new BasicItem.ItemBuilder().id("thorium_fuel_cell").tip("Fuel cell"));


    /*
        COMBS
     */

    public static final RegistryObject<BasicItem> COMB_ALUMINIUM = registerBasicItem(new BasicItem.ItemBuilder().id("comb_aluminium"));
    public static final RegistryObject<BasicItem> COMB_CERTUS = registerBasicItem(new BasicItem.ItemBuilder().id("comb_certus"));
    public static final RegistryObject<BasicItem> COMB_CHROME = registerBasicItem(new BasicItem.ItemBuilder().id("comb_chrome"));
    public static final RegistryObject<BasicItem> COMB_COAL = registerBasicItem(new BasicItem.ItemBuilder().id("comb_coal"));
    public static final RegistryObject<BasicItem> COMB_COPPER = registerBasicItem(new BasicItem.ItemBuilder().id("comb_copper"));
    public static final RegistryObject<BasicItem> COMB_DIAMOND = registerBasicItem(new BasicItem.ItemBuilder().id("comb_diamond"));
    public static final RegistryObject<BasicItem> COMB_EMERALD = registerBasicItem(new BasicItem.ItemBuilder().id("comb_emerald"));
    public static final RegistryObject<BasicItem> COMB_GOLD = registerBasicItem(new BasicItem.ItemBuilder().id("comb_gold"));
    public static final RegistryObject<BasicItem> COMB_IRIDIUM = registerBasicItem(new BasicItem.ItemBuilder().id("comb_iridium"));
    public static final RegistryObject<BasicItem> COMB_IRON = registerBasicItem(new BasicItem.ItemBuilder().id("comb_iron"));
    public static final RegistryObject<BasicItem> COMB_LAPIS = registerBasicItem(new BasicItem.ItemBuilder().id("comb_lapis"));
    public static final RegistryObject<BasicItem> COMB_LEAD = registerBasicItem(new BasicItem.ItemBuilder().id("comb_lead"));
    public static final RegistryObject<BasicItem> COMB_LIGNITE = registerBasicItem(new BasicItem.ItemBuilder().id("comb_lignite"));
    public static final RegistryObject<BasicItem> COMB_MANGANESE = registerBasicItem(new BasicItem.ItemBuilder().id("comb_manganese"));
    public static final RegistryObject<BasicItem> COMB_NAQUADAH = registerBasicItem(new BasicItem.ItemBuilder().id("comb_naquadah"));
    public static final RegistryObject<BasicItem> COMB_NICKEL = registerBasicItem(new BasicItem.ItemBuilder().id("comb_nickel"));
    public static final RegistryObject<BasicItem> COMB_OIL = registerBasicItem(new BasicItem.ItemBuilder().id("comb_oil"));
    public static final RegistryObject<BasicItem> COMB_OLIVINE = registerBasicItem(new BasicItem.ItemBuilder().id("comb_olivine"));
    public static final RegistryObject<BasicItem> COMB_PLATINUM = registerBasicItem(new BasicItem.ItemBuilder().id("comb_platinum"));
    public static final RegistryObject<BasicItem> COMB_PLUTONIUM = registerBasicItem(new BasicItem.ItemBuilder().id("comb_plutonium"));
    public static final RegistryObject<BasicItem> COMB_REDSTONE = registerBasicItem(new BasicItem.ItemBuilder().id("comb_redstone"));
    public static final RegistryObject<BasicItem> COMB_RESIN = registerBasicItem(new BasicItem.ItemBuilder().id("comb_resin"));
    public static final RegistryObject<BasicItem> COMB_RUBY = registerBasicItem(new BasicItem.ItemBuilder().id("comb_ruby"));
    public static final RegistryObject<BasicItem> COMB_SAPPHIRE = registerBasicItem(new BasicItem.ItemBuilder().id("comb_sapphire"));
    public static final RegistryObject<BasicItem> COMB_SILVER = registerBasicItem(new BasicItem.ItemBuilder().id("comb_silver"));
    public static final RegistryObject<BasicItem> COMB_SLAG = registerBasicItem(new BasicItem.ItemBuilder().id("comb_slag"));
    public static final RegistryObject<BasicItem> COMB_STEEL = registerBasicItem(new BasicItem.ItemBuilder().id("comb_steel"));
    public static final RegistryObject<BasicItem> COMB_STONE = registerBasicItem(new BasicItem.ItemBuilder().id("comb_stone"));
    public static final RegistryObject<BasicItem> COMB_TIN = registerBasicItem(new BasicItem.ItemBuilder().id("comb_tin"));
    public static final RegistryObject<BasicItem> COMB_TITANIUM = registerBasicItem(new BasicItem.ItemBuilder().id("comb_titanium"));
    public static final RegistryObject<BasicItem> COMB_TUNGSTEN = registerBasicItem(new BasicItem.ItemBuilder().id("comb_tungsten"));
    public static final RegistryObject<BasicItem> COMB_URANIUM = registerBasicItem(new BasicItem.ItemBuilder().id("comb_uranium"));
    public static final RegistryObject<BasicItem> COMB_ZINC = registerBasicItem(new BasicItem.ItemBuilder().id("comb_zinc"));

    
    /*
        TOOLS
     */
    public static final RegistryObject<BasicItem> CONVEYOR_EV = registerBasicItem(new BasicItem.ItemBuilder().id("conveyor_ev").name("Basic Conveyor"));
    public static final RegistryObject<BasicItem> CONVEYOR_HV = registerBasicItem(new BasicItem.ItemBuilder().id("conveyor_hv").name("Improved Conveyor"));
    public static final RegistryObject<BasicItem> CONVEYOR_IV = registerBasicItem(new BasicItem.ItemBuilder().id("conveyor_iv").name("Speedy Conveyor"));
    public static final RegistryObject<BasicItem> CONVEYOR_LV = registerBasicItem(new BasicItem.ItemBuilder().id("conveyor_lv").name("Fast Conveyor"));
    public static final RegistryObject<BasicItem> CONVEYOR_MV = registerBasicItem(new BasicItem.ItemBuilder().id("conveyor_mv").name("Super Fast Conveyor"));

    public static final RegistryObject<BasicItem> DATA_STICK = registerBasicItem(new BasicItem.ItemBuilder().id("data_stick"));
    public static RegistryObject<BasicItem> DIAMOND_SAW_BLADE = registerBasicItem(new BasicItem.ItemBuilder().id("diamond_saw_blade"));
    public static RegistryObject<BasicItem> DIAMOND_GRIND_HEARD = registerBasicItem(new BasicItem.ItemBuilder().id("diamond_grind_head"));
    public static RegistryObject<BasicItem> TungstenGrindHead = registerBasicItem(new BasicItem.ItemBuilder().id("tungsten_grind_head"));

    /*
        SHAPES
     */
    public static RegistryObject<BasicItem> EmptyShape = registerBasicItem(new BasicItem.ItemBuilder().id("empty_shape_plate").tip("Raw plate to make Molds and Extruder Shapes"));
    public static RegistryObject<BasicItem> MoldPlate = registerBasicItem(new BasicItem.ItemBuilder().id("mold_plate").tip("Mold for making Plates"));
    public static RegistryObject<BasicItem> MoldGear = registerBasicItem(new BasicItem.ItemBuilder().id("mold_gear").tip("Mold for making Gears"));
    public static RegistryObject<BasicItem> MoldGearSmall = registerBasicItem(new BasicItem.ItemBuilder().id("mold_small_gear").tip("Mold for making Small Gears"));
    public static RegistryObject<BasicItem> MoldCoinage = registerBasicItem(new BasicItem.ItemBuilder().id("mold_coinage").tip("Secure Mold for making Coins (Don't lose it!)"));
    public static RegistryObject<BasicItem> MoldBottle = registerBasicItem(new BasicItem.ItemBuilder().id("mold_bottle").tip("Mold for making Bottles"));
    public static RegistryObject<BasicItem> MoldIngot = registerBasicItem(new BasicItem.ItemBuilder().id("mold_ingot").tip("Mold for making Ingots"));
    public static RegistryObject<BasicItem> MoldBall = registerBasicItem(new BasicItem.ItemBuilder().id("mold_ball").tip("Mold for making Balls"));
    public static RegistryObject<BasicItem> MoldBlock = registerBasicItem(new BasicItem.ItemBuilder().id("mold_block").tip("Mold for making Blocks"));
    public static RegistryObject<BasicItem> MoldNugget = registerBasicItem(new BasicItem.ItemBuilder().id("mold_nugget").tip("Mold for making Nuggets"));
    public static RegistryObject<BasicItem> MoldAnvil = registerBasicItem(new BasicItem.ItemBuilder().id("mold_anvil").tip("Mold for making Anvils"));
    public static RegistryObject<BasicItem> ShapePlate = registerBasicItem(new BasicItem.ItemBuilder().id("shape_plate").tip("Shape for making Plates"));
    public static RegistryObject<BasicItem> ShapeRod = registerBasicItem(new BasicItem.ItemBuilder().id("shape_rod").tip("Shape for making Rods"));
    public static RegistryObject<BasicItem> ShapeBolt = registerBasicItem(new BasicItem.ItemBuilder().id("shape_bolt").tip("Shape for making Bolts"));
    public static RegistryObject<BasicItem> ShapeRing = registerBasicItem(new BasicItem.ItemBuilder().id("shape_ring").tip("Shape for making Rings"));
    public static RegistryObject<BasicItem> ShapeCell = registerBasicItem(new BasicItem.ItemBuilder().id("shape_cell").tip("Shape for making Cells"));
    public static RegistryObject<BasicItem> ShapeIngot = registerBasicItem(new BasicItem.ItemBuilder().id("shape_ingot").tip("Shape for making Ingots"));
    public static RegistryObject<BasicItem> ShapeWire = registerBasicItem(new BasicItem.ItemBuilder().id("shape_wire").tip("Shape for making Wires"));
    public static RegistryObject<BasicItem> ShapePipeTiny = registerBasicItem(new BasicItem.ItemBuilder().id("shape_pipe_tiny").tip("Shape for making Tiny Pipes"));
    public static RegistryObject<BasicItem> ShapePipeSmall = registerBasicItem(new BasicItem.ItemBuilder().id("shape_pipe_small").tip("Shape for making Small Pipes"));
    public static RegistryObject<BasicItem> ShapePipeNormal = registerBasicItem(new BasicItem.ItemBuilder().id("shape_pipe_normal").tip("Shape for making Normal Pipes"));
    public static RegistryObject<BasicItem> ShapePipeLarge = registerBasicItem(new BasicItem.ItemBuilder().id("shape_pipe_large").tip("Shape for making Large Pipes"));
    public static RegistryObject<BasicItem> ShapePipeHuge = registerBasicItem(new BasicItem.ItemBuilder().id("shape_pipe_huge").tip("Shape for making Huge Pipes"));
    public static RegistryObject<BasicItem> ShapeBlock = registerBasicItem(new BasicItem.ItemBuilder().id("shape_block").tip("Shape for making Blocks"));
    public static RegistryObject<BasicItem> ShapeHeadSword = registerBasicItem(new BasicItem.ItemBuilder().id("shape_head_sword").tip("Shape for making Sword Blades"));
    public static RegistryObject<BasicItem> ShapeHeadPickaxe = registerBasicItem(new BasicItem.ItemBuilder().id("shape_head_pickaxe").tip("Shape for making Pickaxe Heads"));
    public static RegistryObject<BasicItem> ShapeHeadShovel = registerBasicItem(new BasicItem.ItemBuilder().id("shape_head_shovel").tip("Shape for making Shovel Heads"));
    public static RegistryObject<BasicItem> ShapeHeadAxe = registerBasicItem(new BasicItem.ItemBuilder().id("shape_head_axe").tip("Shape for making Axe Heads"));
    public static RegistryObject<BasicItem> ShapeHeadHoe = registerBasicItem(new BasicItem.ItemBuilder().id("shape_head_hoe").tip("Shape for making Hoe Heads"));
    public static RegistryObject<BasicItem> ShapeHeadHammer = registerBasicItem(new BasicItem.ItemBuilder().id("shape_head_hammer").tip("Shape for making Hammer Heads"));
    public static RegistryObject<BasicItem> ShapeHeadFile = registerBasicItem(new BasicItem.ItemBuilder().id("shape_head_file").tip("Shape for making File Heads"));
    public static RegistryObject<BasicItem> ShapeHeadSaw = registerBasicItem(new BasicItem.ItemBuilder().id("shape_head_saw").tip("Shape for making Saw Heads"));
    public static RegistryObject<BasicItem> ShapeGear = registerBasicItem(new BasicItem.ItemBuilder().id("shape_gear").tip("Shape for making Gears"));
    public static RegistryObject<BasicItem> ShapeGearSmall = registerBasicItem(new BasicItem.ItemBuilder().id("shape_gear_small").tip("Shape for making Small Gears"));
    public static RegistryObject<BasicItem> ShapeBottle = registerBasicItem(new BasicItem.ItemBuilder().id("shape_bottle").tip("Shape for making Bottles")); //TODO needed?

}


    //TODO DROPS ?
    // Stones like Marble ?


/*


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

}
*/

