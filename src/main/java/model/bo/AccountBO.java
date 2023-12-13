package model.bo;

import model.bean.Account;
import model.dao.AccountDAO;

public class AccountBO {
	public static Account getAccountByUsername(String username) {
		return AccountDAO.getByUsername(username);
	}
}
