package committee.nova.alarideable.mixin;

import net.minecraft.world.entity.animal.horse.ZombieHorse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ZombieHorse.class)
public abstract class MixinZombieHorse {
    @Redirect(method = "mobInteract", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/animal/horse/ZombieHorse;isTamed()Z"))
    private boolean redirect$mobInteract(ZombieHorse instance) {
        return true;
    }
}
