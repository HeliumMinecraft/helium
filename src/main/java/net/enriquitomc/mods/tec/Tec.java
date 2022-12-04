package net.enriquitomc.mods.tec;

import com.mojang.logging.LogUtils;
import net.enriquitomc.mods.helium.common.Mod;
import net.enriquitomc.mods.helium.common.ModProvider;
import org.slf4j.Logger;

public class Tec extends Mod implements ModProvider {
    public static final Logger LOGGER = LogUtils.getLogger();
    @Override
    public void runMod() {
        LOGGER.info("Helium and Tec initialized");
    }

    @Override
    public void registry() {

    }
}
