package cn.mcmod.tinkersepicfight;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class SpearUtil {
    public static ActionResult<ItemStack> useSpear(World level, PlayerEntity player, Hand hand) {
        ItemStack itemStackIn = player.getItemInHand(hand);
        player.getCooldowns().addCooldown(itemStackIn.getItem(), 5);
        ActionResultType result = ActionResultType.SUCCESS;
        if (hand == Hand.MAIN_HAND) {
            ItemStack offhand = player.getOffhandItem();
            if (!offhand.isEmpty() && (offhand.getItem().isShield(offhand, player))) {
                result = ActionResultType.PASS;
            }
        }
        return new ActionResult<>(result, itemStackIn);
    }
    
    public static void DoStingAttack(ItemStack stack, float baseDamage, float exDamage, LivingEntity attacker, LivingEntity target) {
        boolean isPlayer = attacker instanceof PlayerEntity;
        float f = baseDamage, f1 = exDamage;
        if(isPlayer) {
            float f2 = ((PlayerEntity) attacker).getAttackStrengthScale(0.5F);
            f = f * (0.2F + f2 * f2 * 0.8F);
            f1 = f1 * f2;
        }
        f += f1;
        if (SpearConfig.CLASSIC_ATK.get()) {
            f *= 0.5F;
            boolean flag5 = isPlayer
                    ? target.hurt(DamageSource.playerAttack((PlayerEntity) attacker).bypassArmor().bypassMagic(), f)
                    : target.hurt(DamageSource.mobAttack(attacker).bypassArmor().bypassMagic(), f);
            if (flag5) {
                // don't prevent main damage from applying
                target.invulnerableTime = 0;
                target.hurtTime = 0;
                target.level.playSound(null, target, SoundEvents.ANVIL_HIT, target.getSoundSource(), Math.max(1.0F, f), (target.getRandom().nextFloat() - target.getRandom().nextFloat()) * 0.5F + 1.0F);
            }
        }
        else if (!target.hasItemInSlot(EquipmentSlotType.CHEST)) {
            boolean flag5 = isPlayer
                    ? target.hurt(DamageSource.playerAttack((PlayerEntity) attacker), f)
                    : target.hurt(DamageSource.mobAttack(attacker), f);
            if (flag5) {
                // don't prevent main damage from applying
                target.invulnerableTime = 0;
                target.hurtTime = 0;
                target.level.playSound(null, target, SoundEvents.PLAYER_HURT_SWEET_BERRY_BUSH, target.getSoundSource(), Math.max(1.0F, f), (target.getRandom().nextFloat() - target.getRandom().nextFloat()) * 0.5F + 1.0F);
            }
        }
    }

}
