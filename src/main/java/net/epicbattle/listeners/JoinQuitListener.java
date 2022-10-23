package net.epicbattle.listeners;

import net.epicbattle.Plugin;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinQuitListener implements Listener {

    Plugin plugin;
    public JoinQuitListener(Plugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    private void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage(ChatColor.translateAlternateColorCodes('&',"&e<+> " + event.getPlayer().getDisplayName()));
    }

    @EventHandler
    private void onPlayerQuit(PlayerQuitEvent event) {
        event.setQuitMessage(ChatColor.translateAlternateColorCodes('&',"&c<-> " + event.getPlayer().getDisplayName()));
    }

}
