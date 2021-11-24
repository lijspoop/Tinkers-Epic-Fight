package cn.mcmod.tinkersepicfight.item;

import cn.mcmod.tinkersepicfight.SpearMain;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TiCItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SpearMain.MODID);

    public static final RegistryObject<SpearTiC> SPEAR = ITEMS.register("spear_tic", SpearTiC::new);
}
