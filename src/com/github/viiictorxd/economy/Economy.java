package com.github.viiictorxd.economy;

import com.github.viiictorxd.economy.command.CommandMoney;
import com.github.viiictorxd.economy.listener.BaseListener;
import com.github.viiictorxd.economy.manager.UserManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Economy extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();

        UserManager userManager = new UserManager();

        getCommand("money").setExecutor(new CommandMoney(userManager));
        Bukkit.getPluginManager().registerEvents(new BaseListener(userManager), this);
    }
}
