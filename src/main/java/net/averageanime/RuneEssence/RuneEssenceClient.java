package net.averageanime.RuneEssence;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.Identifier;



@Environment(value= EnvType.CLIENT)
public class RuneEssenceClient implements ClientModInitializer {

    public static final String MOD_ID = "rune_essence";
    public static Identifier asId(String path) {
        return new Identifier(MOD_ID, path);
    }
    @Override
    public void onInitializeClient() {

    }
}
