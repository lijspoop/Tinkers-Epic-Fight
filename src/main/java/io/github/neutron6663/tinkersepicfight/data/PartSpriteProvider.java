package io.github.neutron6663.tinkersepicfight.data;

import io.github.neutron6663.tinkersepicfight.TEF;
import slimeknights.tconstruct.library.client.data.material.AbstractPartSpriteProvider;

public class PartSpriteProvider extends AbstractPartSpriteProvider {
    public PartSpriteProvider(String modid) {
        super(TEF.MODID);
    }

    @Override
    public String getName() {
        return "Tinkers' Epic Fight Part Sprites";
    }

    @Override
    protected void addAllSpites() {
        buildTool("spear")
                .addBreakableHead("blade")
                .addHandle("handle")
                .addHandle("accessory")
                .addHandle("guard")
                .withLarge();
        /*
         * 
         * buildTool("greatsword")
         * .addBreakableHead("blade")
         * .addHandle("guard")
         * .addHead("accessory")
         * .addHandle("handle")
         * .withLarge();
         * 
         * buildTool("longsword")
         * .addBreakableHead("blade")
         * .addHandle("guard")
         * .addHead("accessory")
         * .addHandle("handle")
         * .withLarge();
         */

        buildTool("tachi")
                .addBreakableHead("blade")
                .addHandle("handle")
                .addHead("accessory")
                .addBinding("guard")
                .withLarge();
    }
}
