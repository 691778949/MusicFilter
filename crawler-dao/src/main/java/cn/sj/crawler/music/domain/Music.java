package cn.sj.crawler.music.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.sj.crawler.base.domain.BaseEntity;

@Table(name="CRAWLER_MUSIC")
@Entity
public class Music extends BaseEntity{

	private static final long serialVersionUID = 1L;
	
	@Column(name="NAME")
	String name;
	
	@Column(name="NETEASE_ID")
	String netease_id;
	
	@Column(name="COMMENT")
	String comment;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNetease_id() {
		return netease_id;
	}

	public void setNetease_id(String netease_id) {
		this.netease_id = netease_id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
