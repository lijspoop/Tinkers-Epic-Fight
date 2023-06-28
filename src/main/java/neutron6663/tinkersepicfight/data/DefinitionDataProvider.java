package neutron6663.tinkersepicfight.data;

import neutron6663.tinkersepicfight.item.Spear;
import neutron6663.tinkersepicfight.item.Tachi;
import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.tinkering.AbstractToolDefinitionDataProvider;
import slimeknights.tconstruct.library.tools.stat.ToolStats;
import slimeknights.tconstruct.tools.TinkerModifiers;
import slimeknights.tconstruct.tools.TinkerToolParts;

public class DefinitionDataProvider extends AbstractToolDefinitionDataProvider {

    public DefinitionDataProvider(DataGenerator generator, String modId) {
        super(generator, modId);
    }

    @Override
    public String getName() {
        return "Tinkers' Epic Fight Tool Definition";
    }

    @Override
    protected void addToolDefinitions() {
        define(Spear.SPEAR)
                .part(TinkerToolParts.smallBlade)
                .part(TinkerToolParts.toughHandle)
                .part(TinkerToolParts.toolHandle)
                .part(TinkerToolParts.toolHandle)
                .stat(ToolStats.ATTACK_DAMAGE, 3.0f)
                .stat(ToolStats.ATTACK_SPEED, 1.6f)
                .stat(ToolStats.MINING_SPEED, 0.5f)
                .stat(ToolStats.DURABILITY, 4.0f)
                .largeToolStartingSlots()
                .trait(TinkerModifiers.piercing, 2)
                .trait(TinkerModifiers.reach, 2);
        /*
         * 
         * define(Greatsword.GREATSWORD)
         * .part(TinkerToolParts.broadBlade)
         * .part(TinkerToolParts.broadBlade)
         * .part(TinkerToolParts.toughHandle)
         * .part(TinkerToolParts.toughHandle)
         * .stat(ToolStats.ATTACK_DAMAGE, 5.0f)
         * .stat(ToolStats.ATTACK_SPEED, 0.5f)
         * .stat(ToolStats.MINING_SPEED, 0.5f)
         * .stat(ToolStats.DURABILITY, 4.0f)
         * .largeToolStartingSlots()
         * .trait(TinkerModifiers.heavy)
         * .trait(TinkerModifiers.twoHanded);
         * 
         * define(Longsword.LONGSWORD)
         * .part(TinkerToolParts.smallBlade)
         * .part(TinkerToolParts.smallBlade)
         * .part(TinkerToolParts.toughHandle)
         * .part(TinkerToolParts.toolHandle)
         * .stat(ToolStats.ATTACK_DAMAGE, 2.5f)
         * .stat(ToolStats.ATTACK_SPEED, 2.0f)
         * .stat(ToolStats.MINING_SPEED, 0.5f)
         * .stat(ToolStats.DURABILITY, 4.0f)
         * .largeToolStartingSlots()
         * .trait(TinkerModifiers.twoHanded);
         */
        define(Tachi.TACHI)
                .part(TinkerToolParts.smallBlade)
                .part(TinkerToolParts.smallBlade)
                .part(TinkerToolParts.toolBinding)
                .part(TinkerToolParts.toolHandle)
                .stat(ToolStats.ATTACK_DAMAGE, 2.0f)
                .stat(ToolStats.ATTACK_SPEED, 2.5f)
                .stat(ToolStats.MINING_SPEED, 0.5f)
                .stat(ToolStats.DURABILITY, 4.0f)
                .largeToolStartingSlots()
                .trait(TinkerModifiers.sweeping, 2)
                .trait(TinkerModifiers.lacerating, 2)
                .trait(TinkerModifiers.twoHanded);
    }

}
