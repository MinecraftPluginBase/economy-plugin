package com.github.viiictorxd.economy.listener;

import com.github.viiictorxd.economy.entity.User;
import com.github.viiictorxd.economy.manager.UserManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class BaseListener implements Listener {

    private final UserManager userManager;

    public BaseListener(UserManager userManager) {
        this.userManager = userManager;
    }

    @EventHandler
    private void onPlayerJoin(PlayerJoinEvent event) {
        final Player player = event.getPlayer();

        if (!userManager.getUsers().containsKey(player.getUniqueId()))
            userManager.getUsers().put(player.getUniqueId(), new User(player.getUniqueId(), player.getName()));
    }
}
