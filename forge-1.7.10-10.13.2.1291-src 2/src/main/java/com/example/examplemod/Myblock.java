/**
 * Created by kagawaminoru on 2015/07/21.
 */
package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class Myblock extends Block {
    public Myblock() {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName(ExampleMod.MODID + "_" + "myblock");
        setBlockTextureName(ExampleMod.MODID + ":" + "myblock");
        setHardness(10.0f);
        setResistance(30.0f);
    }
    public IIcon[] icons = new IIcon[6];

    @Override
    public boolean isOpaqueCube() { return true; }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        for (int i = 0; i < 6; i++) {
            this.icons[i] = register.registerIcon(textureName + "_" + i);

        }
    }

    @Override
    public IIcon getIcon(int side, int metadate) { return icons[side]; }

}