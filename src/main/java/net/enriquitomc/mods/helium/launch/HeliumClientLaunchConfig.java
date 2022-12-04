package net.enriquitomc.mods.helium.launch;

import cpw.mods.modlauncher.api.ILaunchHandlerService;

import cpw.mods.modlauncher.api.ITransformingClassLoaderBuilder;
import cpw.mods.modlauncher.api.ServiceRunner;
import java.util.concurrent.Callable;

public abstract class HeliumClientLaunchConfig implements ILaunchHandlerService {
    @Override
    public String name() {
        return "heliumclient";
    }

    @Override
    public ServiceRunner launchService(String[] args, ModuleLayer layer) {
        return () -> {


            Class.forName(layer.findModule("minecraft").orElseThrow(), "net.minecraft.client.main.Main").getMethod("main", String[].class).invoke(null, (Object) args);
        };

    }
}
