package cn.mcmod.tinkersepicfight.data;

import cn.mcmod.tinkersepicfight.SpearMain;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import slimeknights.tconstruct.library.client.data.material.MaterialPartTextureGenerator;
import slimeknights.tconstruct.tools.data.sprite.TinkerMaterialSpriteProvider;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {
    @SubscribeEvent
    public static void dataGen(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if(event.includeServer()) {
            generator.addProvider(new SpearRecipeProvider(generator));
            generator.addProvider(new SpearDefinitionDataProvider(generator, SpearMain.MODID));
            generator.addProvider(new SpearStationSlotLayoutProvider(generator));
        }
        if (event.includeClient()) {
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
            TinkerMaterialSpriteProvider materialSprites = new TinkerMaterialSpriteProvider();
            SpearTextureProvider SpearSprites = new SpearTextureProvider(SpearMain.MODID);
//            generator.addProvider(new GeneratorPartTextureJsonGenerator(generator, SpearMain.MOD_ID, partSprites));
            generator.addProvider(new MaterialPartTextureGenerator(generator, existingFileHelper, SpearSprites, materialSprites));
        }
    }
}
