package net.linkmain.what_the_dog_doin.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_CATEGORY_DOGS = "Open Dog Menu";
    public static final String KEY_MENU_DOG = "What The Dog Doin?";

    public static KeyBinding dogMenuKey;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(dogMenuKey.wasPressed()) {
                client.player.sendMessage(Text.of("This will open da dog menu just lemme code it in lol"), true);
                //client.player.applyDamage(new DamageSource("FALL"), 10f);
            }
        });
    }

    public static void register() {
        dogMenuKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
           KEY_CATEGORY_DOGS,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_K,
                KEY_MENU_DOG
        ));

        registerKeyInputs();
    }

}
