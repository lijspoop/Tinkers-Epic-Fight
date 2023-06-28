package io.github.neutron6663.tinkersepicfight.data;

import static slimeknights.tconstruct.common.TinkerTags.Items.AOE;
import static slimeknights.tconstruct.common.TinkerTags.Items.DURABILITY;
import static slimeknights.tconstruct.common.TinkerTags.Items.HARVEST;
import static slimeknights.tconstruct.common.TinkerTags.Items.MELEE_PRIMARY;
import static slimeknights.tconstruct.common.TinkerTags.Items.MULTIPART_TOOL;
import static slimeknights.tconstruct.common.TinkerTags.Items.SWORD;
import static slimeknights.tconstruct.common.TinkerTags.Items.ONE_HANDED;
import static slimeknights.tconstruct.common.TinkerTags.Items.TWO_HANDED;

import io.github.neutron6663.tinkersepicfight.TEFTools;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag.INamedTag;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TEFTagsProvider extends ItemTagsProvider {

    public TEFTagsProvider(DataGenerator generator, BlockTagsProvider provider, String folder,
            ExistingFileHelper existingFileHelper) {
        super(generator, provider, folder, existingFileHelper);
    }

    @Override
    public String getName() {
        return "Tinkers' Epic Fight Item Tags";
    }
    
    @Override
    protected void addTags() {
        addTEFTags(TEFTools.spear, MULTIPART_TOOL, DURABILITY, HARVEST, MELEE_PRIMARY, ONE_HANDED, SWORD, AOE);
        // addTEFTags(TEFTools.spear, MULTIPART_TOOL, DURABILITY, HARVEST,
        // MELEE_PRIMARY, TWO_HANDED, SWORD, AOE);
        // addTEFTags(TEFTools.spear, MULTIPART_TOOL, DURABILITY, HARVEST,
        // MELEE_PRIMARY, TWO_HANDED, SWORD, AOE);
        addTEFTags(TEFTools.tachi, MULTIPART_TOOL, DURABILITY, HARVEST, MELEE_PRIMARY, TWO_HANDED, SWORD, AOE);
    }

    @SafeVarargs
    private final void addTEFTags(IItemProvider tool, INamedTag<Item>... tags) {
        Item item = tool.asItem();
        for (INamedTag<Item> tag : tags) {
            tag(tag).add(item);
        }
    }
}