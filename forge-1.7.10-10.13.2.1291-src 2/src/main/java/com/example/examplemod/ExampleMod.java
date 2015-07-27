package com.example.examplemod;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    public static final Block rainbow = new RainbowBlock();


    @EventHandler
    public void init(FMLInitializationEvent event)
    {

		GameRegistry.addRecipe(new ItemStack(Blocks.diamond_block),
                "AAA",
                "AAA",
                "AAA",
                'A',Blocks.dirt);

        GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 50),
                " A ",
                "CBC",
                "CBC",
                'A', new ItemStack(Items.skull, 1, 4),
                'B', Blocks.tnt,
                'C', Items.gunpowder);

        GameRegistry.registerBlock(new com.example.examplemod.Myblock(), "myblock");

        GameRegistry.registerBlock(rainbow, "RainbowBlock");
        GameRegistry.addRecipe(new ItemStack(rainbow), "A", "A", Blocks.dirt);



    }
}
