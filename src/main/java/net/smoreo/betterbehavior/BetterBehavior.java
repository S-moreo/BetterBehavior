package net.smoreo.betterbehavior;

import net.fabricmc.api.ModInitializer;
import net.smoreo.betterbehavior.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Modifier;

//Lets get cooking!
public class BetterBehavior implements ModInitializer {
	public static final String MOD_ID = "betterbehavior";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
