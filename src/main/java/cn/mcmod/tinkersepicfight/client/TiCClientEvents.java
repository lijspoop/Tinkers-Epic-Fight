package cn.mcmod.tinkersepicfight.client;

import cn.mcmod.tinkersepicfight.item.TiCItemRegistry;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import slimeknights.tconstruct.tools.ToolClientEvents;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TiCClientEvents {
    @SubscribeEvent
    public static void itemColors(ColorHandlerEvent.Item event) {
            final ItemColors colors = event.getItemColors();
            ToolClientEvents.registerToolItemColors(colors, TiCItemRegistry.SPEAR);
    }
}
