package com.willfp.ecomobs.tick

import com.willfp.eco.util.setClientsideDisplayName
import com.willfp.eco.util.toComponent
import com.willfp.ecomobs.mob.LivingMob
import org.bukkit.entity.Player

class TickHandlerDisplayName : TickHandler {
    override fun tick(mob: LivingMob, tick: Int) {
        if (tick % 5 != 0) {
            return
        }
    }
}
