package cn.mcmod.tinkersepicfight.data;

import cn.mcmod.tinkersepicfight.SpearConfig;
import cn.mcmod.tinkersepicfight.item.SpearTiC;
import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.tinkering.AbstractToolDefinitionDataProvider;
import slimeknights.tconstruct.library.tools.stat.ToolStats;
import slimeknights.tconstruct.tools.TinkerModifiers;
import slimeknights.tconstruct.tools.TinkerToolParts;

public class SpearDefinitionDataProvider extends AbstractToolDefinitionDataProvider {

    public SpearDefinitionDataProvider(DataGenerator generator, String modId) {
        super(generator, modId);
    }

    @Override
    public String getName() {
        return "Tinker's Spear Tool Definition";
    }

    @Override
    protected void addToolDefinitions() {
        define(SpearTiC.SPEAR)
            .part(TinkerToolParts.smallBlade)
            .part(TinkerToolParts.toughHandle)
            .part(TinkerToolParts.toolHandle)
            .part(TinkerToolParts.toolHandle)
            .stat(ToolStats.ATTACK_DAMAGE, 3.0f)
            .stat(ToolStats.ATTACK_SPEED, 1.6f)
            .stat(ToolStats.MINING_SPEED, 0.5f)
            .stat(ToolStats.DURABILITY, SpearConfig.SPEAR_DURABILITY.get().floatValue())
            .largeToolStartingSlots()
            .trait(TinkerModifiers.twoHanded)
            .trait(TinkerModifiers.piercing)
            .trait(TinkerModifiers.reach);
    }

}
