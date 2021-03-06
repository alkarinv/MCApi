package test.mc.alk.testbukkit;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Logger;

import mc.alk.mc.MCPlayer;

import org.bukkit.GameMode;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;
import org.bukkit.Warning.WarningState;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.help.HelpMap;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemFactory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.map.MapView;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.ServicesManager;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.scheduler.BukkitScheduler;

import com.avaje.ebean.config.ServerConfig;

public class TestBukkitServer implements Server{

	public static Map<String,World> worlds = new HashMap<String,World>();
	public static boolean disableThreads = false;
	public static Map<String,MCPlayer> players = new HashMap<String,MCPlayer>();

	@Override
	public void sendPluginMessage(Plugin source, String channel, byte[] message) {


	}

	@Override
	public Set<String> getListeningPluginChannels() {

		return null;
	}

	@Override
	public String getName() {

		return null;
	}

	@Override
	public String getVersion() {

		return null;
	}

	@Override
	public Player[] getOnlinePlayers() {

		return null;
	}

	@Override
	public int getPort() {

		return 0;
	}

	@Override
	public int getViewDistance() {

		return 0;
	}

	@Override
	public String getIp() {

		return null;
	}

	@Override
	public String getServerName() {

		return null;
	}

	@Override
	public String getServerId() {

		return null;
	}

	@Override
	public String getWorldType() {
		return null;
	}

	@Override
	public boolean getGenerateStructures() {

		return false;
	}

	@Override
	public boolean getAllowEnd() {

		return false;
	}

	@Override
	public boolean getAllowNether() {

		return false;
	}

	@Override
	public boolean hasWhitelist() {

		return false;
	}

	@Override
	public void setWhitelist(boolean value) {


	}

	@Override
	public Set<OfflinePlayer> getWhitelistedPlayers() {

		return null;
	}

	@Override
	public int broadcastMessage(String message) {

		return 0;
	}

	@Override
	public String getUpdateFolder() {

		return null;
	}

	@Override
	public File getUpdateFolderFile() {

		return null;
	}

	@Override
	public int getTicksPerAnimalSpawns() {

		return 0;
	}

	@Override
	public int getTicksPerMonsterSpawns() {

		return 0;
	}

	@Override
	public Player getPlayer(String name) {

		return null;
	}

	@Override
	public Player getPlayerExact(String name) {

		return null;
	}

	@Override
	public PluginManager getPluginManager() {

		return null;
	}

	@Override
	public BukkitScheduler getScheduler() {

		return null;
	}

	@Override
	public ServicesManager getServicesManager() {

		return null;
	}

	@Override
	public List<World> getWorlds() {

		return null;
	}

	@Override
	public World createWorld(WorldCreator creator) {

		return null;
	}

	@Override
	public boolean unloadWorld(String name, boolean save) {

		return false;
	}

	@Override
	public boolean unloadWorld(World world, boolean save) {

		return false;
	}

	@Override
	public World getWorld(String world) {
		if (worlds.containsKey(world))
			return worlds.get(world);
		worlds.put(world, new TestBukkitWorld(world));
		return worlds.get(world);
	}

	@Override
	public World getWorld(UUID uid) {

		return null;
	}

	@Override
	public MapView createMap(World world) {

		return null;
	}

	@Override
	public PluginCommand getPluginCommand(String name) {

		return null;
	}

	@Override
	public void savePlayers() {


	}

	@Override
	public boolean dispatchCommand(CommandSender sender, String commandLine)
			throws CommandException {

		return false;
	}

	@Override
	public void configureDbConfig(ServerConfig config) {


	}

	@Override
	public boolean addRecipe(Recipe recipe) {

		return false;
	}

	@Override
	public List<Recipe> getRecipesFor(ItemStack result) {

		return null;
	}

	@Override
	public void clearRecipes() {


	}

	@Override
	public boolean getOnlineMode() {

		return false;
	}

	@Override
	public boolean getAllowFlight() {

		return false;
	}

	@Override
	public int broadcast(String message, String permission) {

		return 0;
	}

	@Override
	public OfflinePlayer getOfflinePlayer(String name) {

		return null;
	}

	@Override
	public Set<String> getIPBans() {

		return null;
	}

	@Override
	public void banIP(String address) {


	}

	@Override
	public Set<OfflinePlayer> getOperators() {

		return null;
	}

	@Override
	public GameMode getDefaultGameMode() {

		return null;
	}

	@Override
	public ConsoleCommandSender getConsoleSender() {

		return null;
	}

	@Override
	public OfflinePlayer[] getOfflinePlayers() {

		return null;
	}

	@Override
	public Messenger getMessenger() {

		return null;
	}

	@Override
	public HelpMap getHelpMap() {

		return null;
	}

	@Override
	public Inventory createInventory(InventoryHolder owner, InventoryType type) {

		return null;
	}

	@Override
	public Inventory createInventory(InventoryHolder owner, int size) {

		return null;
	}

	@Override
	public Inventory createInventory(InventoryHolder owner, int size,
			String title) {

		return null;
	}

	@Override
	public int getAmbientSpawnLimit() {

		return 0;
	}

	@Override
	public String getBukkitVersion() {

		return null;
	}

	@Override
	public long getConnectionThrottle() {

		return 0;
	}

	@Override
	public Map<String, String[]> getCommandAliases() {

		return null;
	}

	@Override
	public Set<OfflinePlayer> getBannedPlayers() {

		return null;
	}

	@Override
	public int getAnimalSpawnLimit() {

		return 0;
	}

	@Override
	public ItemFactory getItemFactory() {

		return null;
	}

	@Override
	public int getMaxPlayers() {

		return 0;
	}

	@Override
	public MapView getMap(short id) {

		return null;
	}

	@Override
	public Logger getLogger() {

		return null;
	}

	@Override
	public int getMonsterSpawnLimit() {

		return 0;
	}

	@Override
	public String getMotd() {

		return null;
	}

	@Override
	public String getShutdownMessage() {

		return null;
	}

	@Override
	public int getSpawnRadius() {

		return 0;
	}

	@Override
	public void setSpawnRadius(int value) {


	}

	@Override
	public boolean useExactLoginLocation() {

		return false;
	}

	@Override
	public void shutdown() {


	}

	@Override
	public void unbanIP(String address) {


	}

	@Override
	public void setDefaultGameMode(GameMode mode) {


	}

	@Override
	public File getWorldContainer() {

		return null;
	}

	@Override
	public int getWaterAnimalSpawnLimit() {

		return 0;
	}

	@Override
	public WarningState getWarningState() {

		return null;
	}

	@Override
	public boolean isHardcore() {

		return false;
	}

	@Override
	public void reloadWhitelist() {


	}

	@Override
	public List<Player> matchPlayer(String name) {

		return null;
	}

	@Override
	public void reload() {


	}

	@Override
	public Iterator<Recipe> recipeIterator() {

		return null;
	}

	@Override
	public void resetRecipes() {


	}

	@Override
	public boolean isPrimaryThread() {

		return false;
	}

}
