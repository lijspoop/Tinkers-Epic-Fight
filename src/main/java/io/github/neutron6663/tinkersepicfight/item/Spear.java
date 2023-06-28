package io.github.neutron6663.tinkersepicfight.item;

import io.github.neutron6663.tinkersepicfight.TEFTools;
import slimeknights.tconstruct.library.tools.ToolDefinition;
import slimeknights.tconstruct.tools.item.small.SwordTool;

public class Spear extends SwordTool {

  public static final ToolDefinition SPEAR = ToolDefinition.builder(TEFTools.spear).meleeHarvest().build();

  public Spear(Properties properties, ToolDefinition toolDefinition) {
    super(properties, toolDefinition);
  }
}
