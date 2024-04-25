package net.kyou.agotsm.item;

import net.kyou.agotsm.AgotsmMod;
import net.kyou.agotsm.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AgotsmMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ERRORIUM = CREATIVE_MODE_TAB.register("errorium_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ERRORIUM.get()))
                    .title(Component.translatable("creativetab.errorium_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ERRORIUM.get());

                        pOutput.accept(ModBlocks.ERRORIUM_BLOCK.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> AGOTSM_TAB = CREATIVE_MODE_TAB.register("agotsm_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHIKEN_WINGS.get()))
                    .title(Component.translatable("creativetab.agotsm_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CHIKEN_WINGS.get());
                        pOutput.accept(ModItems.FLUOR.get());

                        pOutput.accept(ModItems.DIRT_HELMET.get());
                        pOutput.accept(ModItems.DIRT_CHESTPLATE.get());
                        pOutput.accept(ModItems.DIRT_LEGGINGS.get());
                        pOutput.accept(ModItems.DIRT_BOOTS.get());

                        pOutput.accept(ModBlocks.COMPACTED_DIRT.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
