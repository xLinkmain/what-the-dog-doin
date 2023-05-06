package net.linkmain.what_the_dog_doin;

import net.fabricmc.api.ClientModInitializer;
import net.linkmain.what_the_dog_doin.event.KeyInputHandler;

public class DogModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        KeyInputHandler.register();
    }
}
