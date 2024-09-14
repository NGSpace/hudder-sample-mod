package customhud_example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.ngspace.hudder.compilers.utils.Compilers;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {
	public static final String MOD_ID = "customhud_example";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override public void onInitialize() {
		Compilers.registerCompiler("custom compiler", "customhud_example.CustomCompiler");
	}
}