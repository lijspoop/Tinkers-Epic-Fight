package cn.mcmod.tinkersepicfight.data;

import cn.mcmod.tinkersepicfight.item.TiCItemRegistry;
import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.tinkering.AbstractStationSlotLayoutProvider;
import slimeknights.tconstruct.tools.TinkerToolParts;

public class SpearStationSlotLayoutProvider extends AbstractStationSlotLayoutProvider {

    public SpearStationSlotLayoutProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public String getName() {
        return "Tinker's Spear Tinker Station Slot Layouts";
    }

    @Override
    protected void addLayouts() {
        defineModifiable(TiCItemRegistry.SPEAR)
        .sortIndex(SORT_WEAPON)
        .addInputItem(TinkerToolParts.smallBlade, 62, 8)
        .addInputItem(TinkerToolParts.toughHandle, 44, 26)
        .addInputItem(TinkerToolParts.toolHandle, 26, 44)
        .addInputItem(TinkerToolParts.toolHandle, 8, 62)
        .build();
    }

}
