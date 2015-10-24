/*
 * File created by Alex33856
 * (C) Alex33856
 * Files (Jar Files) were not created by Alex33856.
 * All rights reserved to their owners.
 */

package me.alex33856.alexutilsmodrevamped.commands;

import net.pravian.bukkitlib.config.YamlConfig;
import me.alex33856.alexutilsmodrevamped.AlexUtilsMod;
import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

/**
 * Simple Command_adminapplicationifno Class in me.alex33856.alexutilsmodrevamped.commands
 * @author Alex33856 
 */
public class Command_adminapplicationinfo extends BukkitCommand<AlexUtilsMod> {
            public YamlConfig config;
        public AlexUtilsMod plugin;
    @Override
    public boolean run(CommandSender sender, Command command, String commandLabel, String[] args) {
        if (args.length > 0) {
            return showUsage();
        }
        sender.sendMessage(ChatColor.BLUE + "Admin Application Information");
        
                String APPEnabled = config.getString("ServerApplicationEnabled");
               
                if (APPEnabled.contains("On")) {
                    sender.sendMessage(ChatColor.BLUE + config.getString("ServerApplicationMessage"));
                    sender.sendMessage(ChatColor.GREEN + "Step One: " + config.getString("ServerApplicationStepOne"));
                    sender.sendMessage(ChatColor.GREEN + "Step Two: " + config.getString("ServerApplicationStepTwo"));
                    sender.sendMessage(ChatColor.GREEN + "Step Three: " + config.getString("ServerApplicationStepThree"));
                    sender.sendMessage(ChatColor.GREEN + "Step Four: " + config.getString("ServerApplicationStepFour"));
                }
                
                if (APPEnabled.contains("Off"))    {
                    sender.sendMessage(ChatColor.RED + "ERROR: AdminApplications are not enabled.");
                }
                return true;
    }
}

                    
                
      
    
 
