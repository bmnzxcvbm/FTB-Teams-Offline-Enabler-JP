package com.clefal.ftb_teams_offline_enabler;

import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.connect.IMixinConnector;

public class MixinConnector implements IMixinConnector {
    @Override
    public void connect() {
        Mixins.addConfiguration(
                "ftb_teams_offline_enabler.mixins.json"
        );
    }
}
