package cn.sj.crawler.ip.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.sj.crawler.base.domain.BaseEntity;

@Table(name="CRAWLER_IP")
@Entity
public class Ip extends BaseEntity{

	private static final long serialVersionUID = 1L;
	
	@Column(name="ip")
	String ip;
	
	@Column(name="port")
	String port;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "Ip [ip=" + ip + ", port=" + port + "]";
	}
	
}
