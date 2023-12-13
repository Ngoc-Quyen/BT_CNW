package model.bo;

import java.io.IOException;
import java.util.ArrayList;
import model.bean.Playlist;
import model.dao.PlaylistDAO;


public class PlaylistBO  {
	public static ArrayList<Playlist> getAllPlayList() {
		System.out.print("BO: " + PlaylistDAO.getAllPlaylistDAO());
		return PlaylistDAO.getAllPlaylistDAO();
	}
}
