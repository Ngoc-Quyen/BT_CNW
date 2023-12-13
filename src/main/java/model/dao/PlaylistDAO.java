package model.dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



import context.DBContext;
import model.bean.Account;
import model.bean.Playlist;
import model.bo.AccountBO;


public class PlaylistDAO {
	public static ArrayList<Playlist> getAllPlaylistDAO() {
		ArrayList<Playlist> playlist = new ArrayList<Playlist>();
        String query = "SELECT * FROM playlist";
        try (PreparedStatement ps = DBContext.getConnection().prepareStatement(query)) {

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // Retrieve values from the ResultSet
                int playlistId = rs.getInt("id");
                String playlistAccountId = rs.getString("account_id");
                Account acc = AccountBO.getAccountByUsername(playlistAccountId);
                String playlistName = rs.getString("name");
                String playlistImg = rs.getString("img");
                String playlistStatus = rs.getString("status");
                // ... other columns
                
                Playlist playlistItem = new Playlist(playlistId, acc, playlistImg, playlistName, playlistStatus);
                playlist.add(playlistItem);
                return playlist;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed");
        }
        return null;
        
	}
	
}
