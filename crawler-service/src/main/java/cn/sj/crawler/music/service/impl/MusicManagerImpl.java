package cn.sj.crawler.music.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.sj.crawler.base.service.impl.GenericManagerImpl;
import cn.sj.crawler.music.dao.MusicDao;
import cn.sj.crawler.music.domain.Music;
import cn.sj.crawler.music.service.MusicManager;

@Component
public class MusicManagerImpl extends GenericManagerImpl<Music,Long> implements MusicManager{

	MusicDao musicDao;

	@Autowired
	public void setMusicDao(MusicDao musicDao) {
		this.musicDao = musicDao;
		this.dao=this.musicDao;
	}
	
}
