package com.example.examplemod.item.base;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

public class Item1Gen extends AxeItem {
    public Item1Gen() {
        super(
        		Tiers.DIAMOND, 0, 0f, 
        		new Item.Properties()
        		.tab(CreativeModeTab.TAB_MISC)
        		.fireResistant()
        		.stacksTo(64)
        		.rarity(Rarity.COMMON));
    }
    
    @Override
	public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
    	int EFFECT_DURATION = 10 * 1000;
    	int level = 5;
    	
    	if(!player.hasEffect(MobEffects.DOLPHINS_GRACE) || player.getEffect(MobEffects.DOLPHINS_GRACE).getAmplifier() < (level - 1)){
            player.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, EFFECT_DURATION, level - 1, false, false, false));
        }
        else{
            //Update the duration of the effect.
            player.getEffect(MobEffects.DOLPHINS_GRACE).update(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, EFFECT_DURATION, level - 1, false, false, false));
        }
    	
		return super.use(world, player, hand);
	}
    
    @Override
    @OnlyIn(Dist.CLIENT)
    public boolean isFoil(ItemStack itemStack){    	
    	return true;
    }
}
