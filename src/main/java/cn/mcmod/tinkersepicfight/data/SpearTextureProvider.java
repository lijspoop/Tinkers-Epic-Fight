package cn.mcmod.tinkersepicfight.data;

import slimeknights.tconstruct.library.client.data.material.AbstractPartSpriteProvider;

public class SpearTextureProvider extends AbstractPartSpriteProvider{

    public SpearTextureProvider(String modID) {
        super(modID);
    }

    @Override
    protected void addAllSpites() {
        buildTool("Spear").addBreakableHead("blade").addHandle("guard").addHandle("handle").addHandle("accessory");
    }

    @Override
    public String getName() {
        return "Tinker's Spear Tool Texture";
    }

}
