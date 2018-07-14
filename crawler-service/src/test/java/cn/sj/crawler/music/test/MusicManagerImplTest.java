package cn.sj.crawler.music.test;

import org.springframework.beans.factory.annotation.Autowired;

import cn.sj.crawler.base.service.GenericGenerator;
import cn.sj.crawler.music.service.MusicManager;

public class MusicManagerImplTest extends GenericGenerator{

	@Autowired
	MusicManager musicManager;
	
	public void testGetMusic()
	{
		
	}
}
