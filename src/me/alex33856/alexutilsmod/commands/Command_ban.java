/*
BukkitLib not created by the developers of this plugin
Plugin AlexUtilsMod is public and open source
To find bukkit lib go to https://github.com/Pravian/BukkitLib
(C) Alex33856 2015 - 2015 This Plugin
 */
package me.alex33856.alexutilsmod.commands;

import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author Alex33856
 */
@CommandPermissions(source = SourceType.ANY, permission = "alexutilsmod.ban")
public class Command_ban extends BukkitCommand {

    @Override
    public boolean run(CommandSender sender, Command command, String commandLabel, String[] args) {
        if (!(sender.hasPermission("alexutilsmod.ban")))
        {
            sender.sendMessage(ChatColor.RED + "Look a enderdragon");
        }
        if (args.length < 3) {
            return showUsage();
        }
                
        final Player player = getPlayer(args[0]);
        if (player == null) {
            sender.sendMessage(ChatColor.BLUE + "I'm very sorry, I couldnt find " + args[0] + ", i tryed my best");
            return true;
        }
        String banReason = StringUtils.join(ArrayUtils.subarray(args, 1, args.length), " ");
            player.kickPlayer(ChatColor.RED + banReason);
            player.setBanned(true);
        return true;
        }
    }

