package neutron6663.tinkersepicfight;

import neutron6663.tinkersepicfight.data.DefinitionDataProvider;
import neutron6663.tinkersepicfight.data.PartSpriteProvider;
import neutron6663.tinkersepicfight.data.RecipeProvider;
import neutron6663.tinkersepicfight.data.StationSlotLayoutProvider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import neutron6663.tinkersepicfight.data.TEFTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import slimeknights.tconstruct.common.data.tags.BlockTagProvider;
import slimeknights.tconstruct.library.client.data.material.MaterialPartTextureGenerator;
import slimeknights.tconstruct.tools.data.sprite.TinkerMaterialSpriteProvider;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TEF.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TEF {
  public static final String MODID = "tinkersepicfight";

  private static final Logger LOGGER = LogManager.getLogger();

  public TEF() {
    TEFTools.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

  }

  public static Logger getLogger() {
    return LOGGER;
  }

  @SubscribeEvent
  public static void gatherData(GatherDataEvent event) {
    DataGenerator generator = event.getGenerator();
    ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
    BlockTagProvider blockTags = new BlockTagProvider(generator, existingFileHelper);
    if (event.includeServer()) {
      generator.addProvider(new RecipeProvider(generator));
      generator.addProvider(new DefinitionDataProvider(generator, TEF.MODID));
      generator.addProvider(new StationSlotLayoutProvider(generator));
      generator.addProvider(new TEFTagsProvider(generator, blockTags, TEF.MODID, existingFileHelper));
    }
    if (event.includeClient()) {
      TinkerMaterialSpriteProvider materialSprites = new TinkerMaterialSpriteProvider();
      PartSpriteProvider TEFSprites = new PartSpriteProvider(TEF.MODID);
      generator
          .addProvider(
              new MaterialPartTextureGenerator(generator, existingFileHelper, TEFSprites,
                  materialSprites));
    }
  }
}
