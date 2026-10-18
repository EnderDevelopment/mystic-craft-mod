package com.enderdevelopment.magic_world;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod("magic_world")
public class MagicWorldMod {
    public MagicWorldMod(IEventBus eventBus) {
                // Register the Magic Wand item
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation("magic_world", "magic_wand"), new MagicWandItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        // Register the Mana Recharge block
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation("magic_world", "mana_recharge_block"), new ManaRechargeBlock(BlockBehaviour.Properties.of().strength(2.0f)));
    }
}