package com.example.examplemod.item.base;




import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;

import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;
import java.util.List;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;


public class Item2Gen extends Item {
    public Item2Gen() {
        super(new Item.Properties()
        		.tab(CreativeModeTab.TAB_MISC)
        		.stacksTo(16)
        		.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).alwaysEat().meat().build())
        		.rarity(Rarity.EPIC));
    }
    
    @Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if(entity instanceof LivingEntity livingEntity) {
			if (selected) {
				int EFFECT_DURATION = 10 * 1;
		    	int level = 5;
		    	
		    	if(!livingEntity.hasEffect(MobEffects.DOLPHINS_GRACE) || livingEntity.getEffect(MobEffects.DOLPHINS_GRACE).getAmplifier() < (level - 1)){
		    		livingEntity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, EFFECT_DURATION, level - 1, false, false, false));
		        }
		        else{
		            //Update the duration of the effect.
		        	livingEntity.getEffect(MobEffects.DOLPHINS_GRACE).update(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, EFFECT_DURATION, level - 1, false, false, false));
		        }
			}
			//todo
		}
	}
    
    @Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {

		return super.finishUsingItem(itemstack, world, entity);
	}

    @OnlyIn(Dist.CLIENT)
    @Override
    public void appendHoverText(ItemStack stack, Level world, List<Component> tooltip, TooltipFlag flag) {
    	tooltip.add(new TranslatableComponent("tooltip.examplemod.item.my_2_item"));
    }

}
