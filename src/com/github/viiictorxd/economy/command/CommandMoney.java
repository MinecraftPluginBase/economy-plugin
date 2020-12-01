package com.github.viiictorxd.economy.command;

import com.github.viiictorxd.economy.entity.User;
import com.github.viiictorxd.economy.manager.UserManager;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class CommandMoney implements CommandExecutor {

    private final UserManager userManager;

    public CommandMoney(UserManager userManager) {
        this.userManager = userManager;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender instanceof ConsoleCommandSender
                || commandSender instanceof RemoteConsoleCommandSender)
            return false;

        User user = userManager.getById(((Player) commandSender).getUniqueId());

        commandSender.sendMessage("§aSaldo: " + user.getQuantity());
        return false;
    }
}
