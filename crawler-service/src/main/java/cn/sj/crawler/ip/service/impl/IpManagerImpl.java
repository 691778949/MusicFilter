package cn.sj.crawler.ip.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.sj.crawler.base.service.impl.GenericManagerImpl;
import cn.sj.crawler.ip.dao.IpDao;
import cn.sj.crawler.ip.domain.Ip;
import cn.sj.crawler.ip.service.IpManager;

@Component
public class IpManagerImpl extends GenericManagerImpl<Ip,Long> implements IpManager{

	IpDao ipDao;

	@Autowired
	public void setIpDao(IpDao ipDao) {
		this.ipDao = ipDao;
		this.dao=this.ipDao;
	}
	
}
