package cn.mcmod.tinkersepicfight;

import net.minecraftforge.common.ForgeConfigSpec;

public class SpearConfig {
    public static ForgeConfigSpec COMMON_CONFIG;
    public static ForgeConfigSpec.BooleanValue CLASSIC_ATK;
    public static ForgeConfigSpec.DoubleValue SPEAR_DURABILITY;
    static {
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
        COMMON_BUILDER.comment("General settings").push("general");
        CLASSIC_ATK = COMMON_BUILDER.comment("Is the spear attack like classic TiC (Armor-piercing)")
                .define("classic_attack", false);
        SPEAR_DURABILITY = COMMON_BUILDER.comment("the durability multiplier of Spear")
                .defineInRange("spear_durability", 1.1D, 0.1D, 2D);
        COMMON_BUILDER.pop();
        COMMON_CONFIG = COMMON_BUILDER.build();
    }
}
