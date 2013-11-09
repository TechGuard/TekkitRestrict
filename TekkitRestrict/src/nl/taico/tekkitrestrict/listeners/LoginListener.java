package nl.taico.tekkitrestrict.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.github.dreadslicer.tekkitrestrict.Log;
import com.github.dreadslicer.tekkitrestrict.TRLimiter;
import com.github.dreadslicer.tekkitrestrict.Log.Warning;

public class LoginListener implements Listener {
	@EventHandler
	public void onPlayerLogin(PlayerJoinEvent e) {
		String playerName = e.getPlayer().getName();
		try {
			TRLimiter.removeExpire(playerName);
			TRLimiter.getOnlineLimiter(e.getPlayer());
		} catch(Exception ex){
			Warning.other("An error occurred in the LoginListener!");
			Log.Exception(ex, false);
		}
	}
}