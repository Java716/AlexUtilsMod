/*
BukkitLib not created by the developers of this plugin
Plugin AlexUtilsMod is public and open source
To find bukkit lib go to https://github.com/Pravian/BukkitLib
(C) Alex33856 2015 - 2015 This Plugin
 */
package me.alex33856.alexutilsmod;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

/**
 * AUM_Listener Class.
 * @author Alex33856
 */
public class AUM_Listener implements Listener {
    
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
            }
