package committee.nova.alarideable.mixin;

import net.minecraft.world.entity.animal.horse.SkeletonHorse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(SkeletonHorse.class)
public abstract class MixinSkeletonHorse {
    @Redirect(method = "mobInteract", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/animal/horse/SkeletonHorse;isTamed()Z"))
    private boolean redirect$mobInteract(SkeletonHorse instance) {
        return true;
    }
}
