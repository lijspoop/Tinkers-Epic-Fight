package cn.mcmod.tinkersepicfight.data;

import java.util.function.Consumer;

import cn.mcmod.tinkersepicfight.item.TiCItemRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import slimeknights.tconstruct.common.data.BaseRecipeProvider;
import slimeknights.tconstruct.library.data.recipe.IToolRecipeHelper;

public class SpearRecipeProvider extends BaseRecipeProvider implements IToolRecipeHelper {

    public SpearRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        String folder = "tools/building/";
        toolBuilding(consumer, TiCItemRegistry.SPEAR, folder);
    }

    @Override
    public String getName() {
        return "Tinker's Spear Tool Recipe";
    }

}
