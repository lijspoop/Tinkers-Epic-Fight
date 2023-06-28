package io.github.neutron6663.tinkersepicfight.item;

import io.github.neutron6663.tinkersepicfight.TEFTools;
import slimeknights.tconstruct.library.tools.ToolDefinition;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;
import slimeknights.tconstruct.tools.TinkerModifiers;
import slimeknights.tconstruct.tools.item.small.SweepingSwordTool;

public class Tachi extends SweepingSwordTool {

  public static final ToolDefinition TACHI = ToolDefinition.builder(TEFTools.tachi).meleeHarvest().build();

  public Tachi(Properties properties, ToolDefinition toolDefinition) {
    super(properties, toolDefinition);
  }

  @Override
  protected double getSweepRange(IModifierToolStack tool) {
    return tool.getModifierLevel(TinkerModifiers.expanded.get()) + 3;
  }
}
