package nl.taico.tekkitrestrict.config;

import java.io.File;
import java.util.ArrayList;

public class GeneralConfig extends TRConfig {
	public static String s = File.separator;
	public static ArrayList<String> defaultContents(boolean extra){
		ArrayList<String> tbr = new ArrayList<String>(130);
		tbr.add("######################################################################");
		tbr.add("## Configuration file for TekkitRestrict                            ##");
		tbr.add("## Authors: Taeir, DreadEnd (aka DreadSlicer)                       ##");
		tbr.add("## BukkitDev: http://dev.bukkit.org/server-mods/tekkit-restrict/    ##");
		tbr.add("## Please ask questions/report issues on the BukkitDev page.        ##");
		tbr.add("######################################################################");
		tbr.add("");
		tbr.add("######################################################################");
		tbr.add("## Some fast notes for you all. First, every option in this file is ##");
		tbr.add("## Reloadable. That means that by typing \"/tr admin reload\" in-game ##");
		tbr.add("## (with the \"tekkitrestrict.admin.reload\" permission), or by       ##");
		tbr.add("## typing \"tr admin reload\" in the console, you can reload every    ##");
		tbr.add("## single config change in this file.                               ##");
		tbr.add("##                                                                  ##");
		tbr.add("## Have fun, Play safe. Good luck.                                  ##");
		tbr.add("## * DreadEnd * out.                                                ##");
		tbr.add("######################################################################");
		tbr.add("# Patch ComputerCraft once to prevent some server crashes with");
		tbr.add("# ComputerCraft computers.");
		tbr.add("# Default: true");
		tbr.add("PatchComputerCraft: true");
		if (extra) tbr.add("#:-;-:# PatchComputerCraft");
		tbr.add("");
		tbr.add("# Change the lowest possible time for RedPower Timers to the value set");
		tbr.add("# in ModModifications.config.yml");
		tbr.add("# Default: true");
		tbr.add("UseAutoRPTimer: true");
		if (extra) tbr.add("#:-;-:# UseAutoRPTimer");
		tbr.add("");
		tbr.add("# TekkitRestrict has a Limiter. With it, you can set how many of a");
		tbr.add("# certain block a player may have placed at a time.");
		tbr.add("# For example, you could limit the amount of collectors Mk. 3 someone");
		tbr.add("# can have by limiting 126:2 to 1 in the Advanced.config.yml.");
		tbr.add("#");
		tbr.add("# This option toggles the use of this limiter on or off.");
		tbr.add("# Default: true");
		tbr.add("UseItemLimiter: true");
		if (extra) tbr.add("#:-;-:# UseItemLimiter");
		tbr.add("");
		tbr.add("# Should LimitedCreative be enabled?");
		tbr.add("# Default: true");
		tbr.add("UseLimitedCreative: true");
		if (extra) tbr.add("#:-;-:# UseLimitedCreative");
		tbr.add("");
		tbr.add("# If UseOpenAlc is false, the command /openalc will be disabled.");
		tbr.add("# Default: true");
		tbr.add("UseOpenAlc: true");
		if (extra) tbr.add("#:-;-:# UseOpenAlc");
		tbr.add("");
		tbr.add("# Should NoItem (Bans items) be enabled?");
		tbr.add("# Default: true");
		tbr.add("UseNoItem: true");
		if (extra) tbr.add("#:-;-:# UseNoItem");
		tbr.add("");
		tbr.add("# If KickFromConsole is true, the console will execute the /kick");
		tbr.add("# command instead of the default Bukkit kick when a player gets");
		tbr.add("# kicked by TekkitRestrict (e.g. for hacking).");
		tbr.add("# Useful if you want to log kicks or use a different bansystem.");
		tbr.add("# Default: false");
		tbr.add("KickFromConsole: false");
		if (extra) tbr.add("#:-;-:# KickFromConsole");
		tbr.add("");
		tbr.add("######################################################################");
		tbr.add("############################## Updater ###############################");
		tbr.add("# Should TekkitRestrict check for an update when the server starts?");
		tbr.add("# Default: true");
		tbr.add("CheckForUpdateOnStartup: true");
		if (extra) tbr.add("#:-;-:# CheckForUpdateOnStartup");
		tbr.add("");
		tbr.add("# Should the update be downloaded automatically if there is one?");
		tbr.add("# Default: true");
		tbr.add("Auto-Update: true");
		if (extra) tbr.add("#:-;-:# Auto-Update");
		tbr.add("");
		tbr.add("# Should TekkitRestrict update to beta versions?");
		tbr.add("# If you are currently running a beta version, this option is ignored.");
		tbr.add("# Default: false");
		tbr.add("UpdateToBetaVersions: false");
		if (extra) tbr.add("#:-;-:# UpdateToBetaVersions");
		tbr.add("");
		tbr.add("# Should TekkitRestrict update to development versions?");
		tbr.add("# If you are currently running a dev version, this option is ignored.");
		tbr.add("# Default: false");
		tbr.add("UpdateToDevelopmentVersions: false");
		if (extra) tbr.add("#:-;-:# UpdateToDevelopmentVersions");
		tbr.add("");
		tbr.add("######################################################################");
		tbr.add("############################## TMetrics ##############################");
		tbr.add("# Lately Metrics by Hidendra hasn't been very reliable. The graphs");
		tbr.add("# show things I can hardly believe. I would like to know how many");
		tbr.add("# servers actually use TekkitRestrict, what systems they are");
		tbr.add("# running on and how much memory is dedicated to those servers.");
		tbr.add("#");
		tbr.add("# For this reason I decided to make my own metrics system called");
		tbr.add("# TMetrics.");
		tbr.add("#");
		tbr.add("# TMetrics sends the data to http://metrics.taico.nl/, my own website,");
		tbr.add("# where the data will be stored. Every server will get a unique ID");
		tbr.add("# that makes sure there will be few to no duplicates in the");
		tbr.add("# database. This UID is stored in a file in the tekkitrestrict plugin");
		tbr.add("# directory, and I ask you to never delete it.");
		tbr.add("#");
		tbr.add("# TMetrics will send the following information:");
		tbr.add("# - The version of TekkitRestrict you are using");
		tbr.add("# - The version of Minecraft you are using");
		tbr.add("# - If onlinemode is on or off");
		tbr.add("# - The amount of players online");
		tbr.add("# - The system you are running the server on");
		tbr.add("# - If that system is 32 or 64 bit");
		tbr.add("# - The amount of cores your system has.");
		tbr.add("# - The amount of memory allocated to your Minecraft server");
		tbr.add("# - The version of Java you are using");
		tbr.add("#");
		tbr.add("# When the server starts, TMetrics will send system data to let");
		tbr.add("# the server know if something has changed (Memory allocated,");
		tbr.add("# Operating system, Java version, etc.). After that, TMetrics will");
		tbr.add("# ping my server every 15 minutes. On these pings it will only send");
		tbr.add("# the amount of players online.");
		tbr.add("#");
		tbr.add("# If you don't want to send these metrics, you can set UseTMetrics");
		tbr.add("# to false.");
		tbr.add("UseTMetrics: true");
		if (extra) tbr.add("#:-;-:# UseTMetrics");
		tbr.add("");
		tbr.add("# Should TMetrics give warnings in the console when submitting the");
		tbr.add("# statistics failed?");
		tbr.add("ShowTMetricsWarnings: true");
		if (extra) tbr.add("#:-;-:# ShowTMetricsWarnings");
		tbr.add("");
		tbr.add("######################################################################");
		tbr.add("######################################################################");
		tbr.add("# Do NOT change this. It will reset the config files if you do.");
		tbr.add("ConfigVersion: 1.7");
		tbr.add("");
		tbr.add("######################################################################");
		return tbr;
	}
	
	public static void upgradeFile(){
		upgradeFile("General", convertDefaults(defaultContents(true)));
	}
}
