package net.kyou.agotsm.datagen;

import net.kyou.agotsm.AgotsmMod;
import net.kyou.agotsm.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output,  ExistingFileHelper existingFileHelper) {
        super(output, AgotsmMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.FLUOR);
        simpleItem(ModItems.CHIKEN_WINGS);

        simpleItem(ModItems.DIRT_HELMET);
        simpleItem(ModItems.DIRT_CHESTPLATE);
        simpleItem(ModItems.DIRT_LEGGINGS);
        simpleItem(ModItems.DIRT_BOOTS);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(AgotsmMod.MOD_ID, "item/"+item.getId().getPath()));
    }
}
