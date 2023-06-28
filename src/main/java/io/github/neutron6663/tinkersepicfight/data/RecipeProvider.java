package io.github.neutron6663.tinkersepicfight.data;

import java.util.function.Consumer;

import io.github.neutron6663.tinkersepicfight.TEFTools;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import slimeknights.tconstruct.common.data.BaseRecipeProvider;
import slimeknights.tconstruct.library.data.recipe.IToolRecipeHelper;

public class RecipeProvider extends BaseRecipeProvider implements IToolRecipeHelper {

    public RecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        String folder = "tools/building/";
        toolBuilding(consumer, TEFTools.spear, folder);

        // toolBuilding(consumer, TEFTools.greatsword, folder);

        // toolBuilding(consumer, TEFTools.longsword, folder);

        toolBuilding(consumer, TEFTools.tachi, folder);
    }

    @Override
    public String getName() {
        return "Tinkers' Epic Fight Recipes";
    }
}