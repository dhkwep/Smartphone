package com.makarong.smartphone;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Smartphone extends JavaPlugin implements Listener {

    ConsoleCommandSender consol = Bukkit.getConsoleSender();

    @Override
    public void onEnable() {
        System.out.println("플러그인이 활성화되었습니다.");
        consol.sendMessage(ChatColor.AQUA+"[ 플러그인이 활성화 되었습니다 ]");
        getServer().getPluginManager().registerEvents(this,this);
    }

    @Override
    public void onDisable() {
        System.out.println("플러그인이 비활성화되었습니다.");
        consol.sendMessage(ChatColor.RED+"[ 플러그인이 비활성화 되었습니다 ]");
    }

    @EventHandler
    public void join(PlayerJoinEvent e) {
        e.setJoinMessage(ChatColor.YELLOW+"[ 입장하였습니다! ]");
    }
}