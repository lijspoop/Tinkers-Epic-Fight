package neutron6663.tinkersepicfight.item;

import slimeknights.tconstruct.library.tools.ToolDefinition;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;
import slimeknights.tconstruct.tools.TinkerModifiers;
import slimeknights.tconstruct.tools.item.small.SweepingSwordTool;

public class Longsword extends SweepingSwordTool {

  // public static final ToolDefinition LONGSWORD =
  // ToolDefinition.builder(TEFTools.longsword).meleeHarvest().build();

  public Longsword(Properties properties, ToolDefinition toolDefinition) {
    super(properties, toolDefinition);
  }

  @Override
  protected double getSweepRange(IModifierToolStack tool) {
    return tool.getModifierLevel(TinkerModifiers.expanded.get()) + 3;
  }
}
