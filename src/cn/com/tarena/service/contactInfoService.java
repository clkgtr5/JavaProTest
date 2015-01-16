package cn.com.tarena.service;

import java.util.List;

import cn.com.tarena.pojo.Contactinfo;

public interface contactInfoService {
	public List getContactInfoList();
	public boolean updateContactInfo(Contactinfo upcontactinfo);
}
