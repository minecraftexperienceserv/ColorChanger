package it.mcexp.colorchanger;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

  @EventHandler
  public void onJoin(PlayerJoinEvent event) {
    Player player = event.getPlayer();

    //epic gaming if cascade
      if (player.hasPermission("vip.cavaliere") || player.hasPermission("vip.marchese") || player.hasPermission("vip.duca") || player.hasPermission("vip.principe") || player.hasPermission("vip.re")) {
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "chatcolor lime " + player.getName());
      }

      if (player.hasPermission("plhide.group.staff")) {
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "chatcolor red " + player.getName());
      }

      if (player.hasPermission("bypass")) {
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "chatcolor pink " + player.getName());
      }

    }
  }