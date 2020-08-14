package mohaimendice.mohaimendice

import org.bukkit.plugin.java.JavaPlugin

class Mohaimendice : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        getCommand("mdice")?.setExecutor(mohadice)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}