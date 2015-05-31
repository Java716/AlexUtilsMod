/*
BukkitLib not created by the developers of this plugin
Plugin AlexUtilsMod is public and open source
To find bukkit lib go to https://github.com/Pravian/BukkitLib
(C) Alex33856 2015 - 2015 This Plugin
 */
package me.alex33856.alexutilsmod;

import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import net.pravian.bukkitlib.config.YamlConfig;
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
    
    @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true) 
    public void onBlockPlace(BlockPlaceEvent e) {
        Player player = e.getPlayer();
        
        switch (e.getBlockPlaced().getType()) {
            case TNT: {
                if (!player.hasPermission("AlexUtilsMod.placement.TNT")) {
                    player.sendMessage(ChatColor.RED + "Sorry, I Couldnt place your " + e.getBlock().getType() + " I really couldnt!");
                    break;
                }
            }
            case LAVA_BUCKET:
            case STATIONARY_LAVA:
            case LAVA: {
                if (!player.hasPermission("AlexUtilsMod.placement.LAVA")) {
                    player.sendMessage(ChatColor.RED + "Sorry, I Couldnt place your " + e.getBlock().getType() + " I really couldnt!");
                    break;
                }
                }
                }
             }
            @EventHandler
            public void OnPlayerJoin(PlayerJoinEvent e) {
                    Player player = e.getPlayer();
                    if (!player.hasPlayedBefore())
                        e.setJoinMessage(ChatColor.AQUA + player.getName() + " is a new player!");
                    else
                        e.setJoinMessage(ChatColor.AQUA + "Welcome Back, " + player.getName() + "to " + config.getString("server-name"));
                    if (player.getName().equals("Alex33856"))
                    {
                        TFM_Util.IFM_DEVELOPERS.add(player.getName());
                        TFM_Util.bcastMsg("Alex33856 is the " + ChatColor.DARK_PURPLE + "developer " + ChatColor.AQUA + "of AlexUtilsMod!", ChatColor.AQUA);
                    }
                    if (player.getName().equals("Ftb1122"))
                    {
                        TFM_Util.IFM_DEVELOPERS.add(player.getName());
                                }
                    if (TFM_AdminList.isSuperAdmin(player))
                    {
                        player.sendMessage("Welcome Back, " + player.getName() + "!");
                    }
                       
                               
            }
}
