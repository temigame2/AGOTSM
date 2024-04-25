package net.kyou.agotsm.item;

import net.kyou.agotsm.AgotsmMod;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Properties;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AgotsmMod.MOD_ID);

    public static final RegistryObject<Item> FLUOR = ITEMS.register("fluor",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHIKEN_WINGS = ITEMS.register("chiken_wings",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ERRORIUM = ITEMS.register("errorium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIRT_HELMET = ITEMS.register("dirt_helmet",
            () -> new ArmorItem(ModArmorMaterials.DIRT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> DIRT_CHESTPLATE = ITEMS.register("dirt_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DIRT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> DIRT_LEGGINGS = ITEMS.register("dirt_leggings",
            () -> new ArmorItem(ModArmorMaterials.DIRT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> DIRT_BOOTS = ITEMS.register("dirt_boots",
            () -> new ArmorItem(ModArmorMaterials.DIRT, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
