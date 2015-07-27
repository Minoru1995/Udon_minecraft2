package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by kagawaminoru on 2015/07/27.
 */
public class RainbowBlock extends Block {
    public RainbowBlock(){
        super(Material.tnt);
        setCreativeTab(CreativeTabs.tabBlock);

        setBlockName(ExampleMod.MODID + "RainbowBlock");
        setBlockTextureName(ExampleMod.MODID + ":" + "myblock");

        setHardness(100f);
    }

    @Override
    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player){
        System.out.println("Hello");
    }
}
