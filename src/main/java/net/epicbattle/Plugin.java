package net.epicbattle;

import net.epicbattle.commands.GameCmd;
import net.epicbattle.listeners.JoinQuitListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {

        //Listeners Registry
        getServer().getPluginManager().registerEvents(new JoinQuitListener(this) , this);

        //Commands Registry
        getCommand("game").setExecutor(new GameCmd(this) , this);
    }
}
