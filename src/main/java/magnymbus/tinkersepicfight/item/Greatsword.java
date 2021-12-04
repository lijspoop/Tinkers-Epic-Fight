package magnymbus.tinkersepicfight.item;

import magnymbus.tinkersepicfight.TEFTools;
import slimeknights.tconstruct.library.tools.ToolDefinition;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;
import slimeknights.tconstruct.tools.TinkerModifiers;
import slimeknights.tconstruct.tools.item.small.SweepingSwordTool;

public class Greatsword extends SweepingSwordTool {

  // public static final ToolDefinition GREATSWORD =
  // ToolDefinition.builder(TEFTools.greatsword).meleeHarvest().build();

  public Greatsword(Properties properties, ToolDefinition toolDefinition) {
    super(properties, toolDefinition);
  }

  @Override
  protected double getSweepRange(IModifierToolStack tool) {
    return tool.getModifierLevel(TinkerModifiers.expanded.get()) + 3;
  }
}
