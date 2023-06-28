package io.github.neutron6663.tinkersepicfight.data;

import io.github.neutron6663.tinkersepicfight.TEFTools;
import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.tinkering.AbstractStationSlotLayoutProvider;
import slimeknights.tconstruct.tools.TinkerToolParts;

public class StationSlotLayoutProvider extends AbstractStationSlotLayoutProvider {

    public StationSlotLayoutProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public String getName() {
        return "Tinkers' Epic Fight Station Slot Layouts";
    }

    @Override
    protected void addLayouts() {
        defineModifiable(TEFTools.spear)
                .sortIndex(SORT_WEAPON)
                .addInputItem(TinkerToolParts.smallBlade, 44, 26)
                .addInputItem(TinkerToolParts.toughHandle, 44, 44)
                .addInputItem(TinkerToolParts.toolHandle, 26, 44)
                .addInputItem(TinkerToolParts.toolHandle, 8, 62)
                .build();
        /*
         * 
         * defineModifiable(TEFTools.greatsword)
         * .sortIndex(SORT_WEAPON)
         * .addInputItem(TinkerToolParts.broadBlade, 26, 26)
         * .addInputItem(TinkerToolParts.broadBlade, 44, 44)
         * .addInputItem(TinkerToolParts.toughHandle, 26, 44)
         * .addInputItem(TinkerToolParts.toughHandle, 8, 62)
         * .build();
         * 
         * defineModifiable(TEFTools.longsword)
         * .sortIndex(SORT_WEAPON)
         * .addInputItem(TinkerToolParts.smallBlade, 44, 26)
         * .addInputItem(TinkerToolParts.smallBlade, 26, 44)
         * .addInputItem(TinkerToolParts.toughHandle, 26, 62)
         * .addInputItem(TinkerToolParts.toolHandle, 8, 62)
         * .build();
         */
        defineModifiable(TEFTools.tachi)
                .sortIndex(SORT_WEAPON)
                .addInputItem(TinkerToolParts.smallBlade, 26, 26)
                .addInputItem(TinkerToolParts.smallBlade, 26, 44)
                .addInputItem(TinkerToolParts.toolBinding, 26, 62)
                .addInputItem(TinkerToolParts.toolHandle, 8, 62)
                .build();
    }

}
