package net.id.rpf;

import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;
import net.id.rpf.item.RPFItems;
import org.slf4j.Logger;

public class RolyPolyFramework implements ModInitializer {
	public static final String MODID = "rpf";
	public static final Logger LOG = LogUtils.getLogger();

	@Override
	public void onInitialize() {
		LOG.info("Granting unto the world the gift of Isopods...");

		RPFItems.init();

		LOG.info("Roly Poly Framework has successfully initialized!");
		LOG.info("Go mlem Azazelthedemonlord as thanks");
	}
}
