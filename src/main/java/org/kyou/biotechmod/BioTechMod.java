package org.kyou.biotechmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BioTechMod implements ModInitializer {
    public static final String MOD_ID = "biotechmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Bio Tech Mod");
    }
}
