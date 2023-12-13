package model.bean;

import java.io.IOException;


/**
 * Servlet implementation class Playlist
 */

public class Playlist {
	private static final long serialVersionUID = 1L;
       
    private int id;
    private Account account_id;
    private String img;
    private String name;
    private String status;
    
    public Playlist(int id, Account account_id, String img, String name, String status) {
		super();
		this.id = id;
		this.account_id = account_id;
		this.img = img;
		this.name = name;
		this.status = status;
	}
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Account getAccount_id() {
		return account_id;
	}
	
	public void setAccount_id(Account account_id) {
		this.account_id = account_id;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
    
    
    

}
