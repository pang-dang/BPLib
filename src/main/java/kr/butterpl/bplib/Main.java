package kr.butterpl.bplib;

import com.butterpl.bplib.nms.version.VersionController;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Getter
    private static Main instance;

    @Override
    public void onEnable() {
        instance = this;

        VersionController.initialize(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}