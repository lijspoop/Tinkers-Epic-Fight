package io.github.neutron6663.tinkersepicfight;

import io.github.neutron6663.tinkersepicfight.item.Spear;
import io.github.neutron6663.tinkersepicfight.item.Tachi;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import slimeknights.mantle.registration.object.ItemObject;
import slimeknights.mantle.util.SupplierItemGroup;
import slimeknights.tconstruct.common.TinkerModule;
import slimeknights.tconstruct.common.registration.ItemDeferredRegisterExtension;
import slimeknights.tconstruct.library.tools.SlotType;
import slimeknights.tconstruct.library.tools.helper.ModifierLootingHandler;
import slimeknights.tconstruct.library.utils.BlockSideHitListener;
import slimeknights.tconstruct.tools.item.small.SwordTool;

import java.util.function.Supplier;

public class TEFTools extends TinkerModule {

  protected static final ItemDeferredRegisterExtension ITEMS = new ItemDeferredRegisterExtension(TEF.MODID);

  public TEFTools() {
    SlotType.init();
    BlockSideHitListener.init();
    ModifierLootingHandler.init();
  }

  public static final ItemGroup TAB_TOOLS = new SupplierItemGroup(TEF.MODID, "tools",
      () -> TEFTools.spear.get().getRenderTool());

  private static final Supplier<Item.Properties> TOOL = () -> new Item.Properties().tab(TAB_TOOLS);

  public static final ItemObject<Spear> spear = ITEMS.register("spear",
      () -> new Spear(TOOL.get().addToolType(SwordTool.TOOL_TYPE, 0), Spear.SPEAR));

  // public static final ItemObject<Spear> greatsword =
  // ITEMS.register("greatsword",) () -> new
  // Greatsword(TOOL.get().addToolType(SwordTool.TOOL_TYPE, 0),
  // Greatsword.GREATSWORD));
  // public static final ItemObject<Spear> longsword =
  // ITEMS.register("longsword",) () -> new
  // Longsword(TOOL.get().addToolType(SwordTool.TOOL_TYPE, 0),
  // Longsword.LONGSWORD));

  public static final ItemObject<Tachi> tachi = ITEMS.register("tachi",
      () -> new Tachi(TOOL.get().addToolType(SwordTool.TOOL_TYPE, 0), Tachi.TACHI));
}