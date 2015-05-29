/*
BukkitLib not created by the developers of this plugin
Plugin AlexUtilsMod is public and open source
To find bukkit lib go to https://github.com/Pravian/BukkitLib
(C) Alex33856 2015 - 2015 This Plugin
 */
package me.alex33856.alexutilsmod.commands;

import me.alex33856.alexutilsmod.AlexUtilsMod;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

/**
 * AlexUtilsMod Command
 * @author Alex33856
 */
// Using BukkitLib permissions 
@CommandPermissions(source = SourceType.ANY)
public class Command_alexutilsmod extends BukkitCommand<AlexUtilsMod> {

    @Override
    public boolean run(CommandSender sender, Command command, String commandLabel, String[] args) {
        if (args.length > 0) {
            return showUsage();
        }
        sender.sendMessage(ChatColor.BLUE + "AlexUtilsMod created by Alex33856!");
        sender.sendMessage(ChatColor.BLUE + "Running Version " + ChatColor.GREEN + this.plugin.getVersion() + "!");
        return true;
    }
    
}
