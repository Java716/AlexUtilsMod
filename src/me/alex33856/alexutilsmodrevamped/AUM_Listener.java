/*
BukkitLib not created by the developers of this plugin
Plugin AlexUtilsMod is public and open source
To find bukkit lib go to https://github.com/Pravian/BukkitLib
(C) Alex33856 2015 - 2015 This Plugin
 */
package me.alex33856.alexutilsmodrevamped;

import net.pravian.bukkitlib.config.YamlConfig;
import static org.bukkit.Bukkit.broadcastMessage;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * AUM_Listener Class.
 * @author Alex33856
 */
public class AUM_Listener implements Listener {
        public YamlConfig config;
        public AlexUtilsMod plugin;
    
    @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true) 
    public void onBlockPlace(BlockPlaceEvent e) {
        Player player = e.getPlayer();
        
    }
            @EventHandler
            public void OnPlayerJoin(PlayerJoinEvent e) {
                    Player player = e.getPlayer();
                    if (!player.hasPlayedBefore()) {
                        config.getString("ServerJoinMessage").replace("serverName", config.getString("ServerName"));
                        config.getString("ServerJoinMessage".replace("player", player.getName()));
                         e.setJoinMessage(config.getString("ServerJoinMessage"));
                    }
                      if (player.hasPlayedBefore())
                        e.setJoinMessage(ChatColor.AQUA + "Welcome Back, " + player.getName() + "to " + config.getString("server-name"));
                    if (player.getName().equals("Alex33856"))
                    {
                        broadcastMessage("Alex33856 is the " + ChatColor.DARK_PURPLE + "developer " + ChatColor.AQUA + "of AlexUtilsMod!");
                    }
            }
}