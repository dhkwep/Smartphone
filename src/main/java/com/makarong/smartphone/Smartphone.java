package com.makarong.smartphone;

import org.bukkit.plugin.java.JavaPlugin;

public final class Smartphone extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("플러그인이 활성화되었습니다.");
    }

    @Override
    public void onDisable() {
        System.out.println("플러그인이 비활성화되었습니다.");
    }
}
