package it.mcexp.colorchanger;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

  @Override
  public void onEnable() {

    //on player join
    getServer().getPluginManager().registerEvents(new JoinListener(), this);

  }

}
