package cn.sj.crawler.ip.test;

import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.sj.crawler.base.service.GenericGenerator;
import cn.sj.crawler.ip.domain.Ip;
import cn.sj.crawler.ip.service.IpManager;

public class GetIp extends GenericGenerator{
	
	@Autowired
	IpManager ipManager;
	
	public void getIp() 
	{
		String useragent="Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.98 Safari/537.36";
		String url="http://www.xicidaili.com/nn/";
		for(int i=1;i<100;i++)
		{
			try 
			{
				Document d=Jsoup.connect(url+i).userAgent(useragent).timeout(5*1000).get();
				Elements table=d.select("tbody > tr");
				for(Element row:table)
				{
					String ipStr=row.select("tr > td:nth-child(2)").text();
					String port=row.select("tr > td:nth-child(3)").text();
					if(ipStr!=null&&port!=null)
					{
						Ip ip=new Ip();
						ip.setIp(ipStr);
						ip.setPort(port);
						this.ipManager.save(ip);
					}
				}
				
			}
			catch (Exception e)
			{
				e.printStackTrace();		
			}
		}
	}
	
	@Test
	public void testIp()
	{
		String useragent="Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.98 Safari/537.36";
		List<Ip> ipList=this.ipManager.findAll();
		String url="http://music.163.com/";
		for(Ip ip:ipList)
		{
			System.getProperties().setProperty("proxy", "true");
			System.getProperties().setProperty("http.proxyHost", ip.getIp());
			System.getProperties().setProperty("http.proxyPort", ip.getPort());
			Document d=null;
			try {
				d=Jsoup.connect(url).userAgent(useragent).timeout(5*1000).get();
			}catch (Exception e) {
			}
			System.out.println(ip.getId());
			if(d==null)
			{
				this.ipManager.delete(ip.getId());
				System.err.println(ip.getId());
			}
		}
		
	}

}
