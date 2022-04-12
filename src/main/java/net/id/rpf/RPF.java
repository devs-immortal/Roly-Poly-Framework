package net.id.rpf;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RPF implements ModInitializer {

	public static final String MODID = "rpf";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		LOGGER.info("Granting unto the world the gift of Isopods...");



		LOGGER.info("Roly Poly Framework has successfully initialized!");
		LOGGER.info("Go mlem Azazelthedemonlord as thanks");
	}
}
