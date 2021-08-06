package me.kodysimpson.commandspart2;

import me.kodysimpson.commandspart2.commands.FeedCommand;
import me.kodysimpson.commandspart2.commands.GodCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Commandspart2 extends JavaPlugin {

    @Override
    public void onEnable() {

        //Register your commands one by one and provide an instance of the class
        getCommand("god").setExecutor(new GodCommand());
        getCommand("feed").setExecutor(new FeedCommand());

    }

}
