package cn.com.tarena.service;

import java.util.List;

import cn.com.tarena.pojo.users;

public interface userListService {
	public List getuserList();

	public users getuserByloginInfo(users paramUser);
	
	public boolean updateUsers(users upUser);
}
