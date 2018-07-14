package cn.sj.crawler.ip.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.sj.crawler.base.service.GenericGenerator;
import cn.sj.crawler.ip.domain.Ip;
import cn.sj.crawler.ip.service.IpManager;

public class IpManagerIpmlTest extends GenericGenerator{

	@Autowired
	IpManager ipManager;
	
	@Test
	public void testAdd()
	{
		Ip ip=new Ip();
		ip.setIp("666666");
		ip.setPort("8080");
		this.ipManager.save(ip);
	}
}
