package cn.sj.crawler.base.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cn.sj.crawler.base.domain.BaseEntity;



public interface GenericManager<T extends BaseEntity, PK extends Serializable> {

	
	public Page<T> findAll(Pageable page);

	
	public List<T> findAll();

	public T findById(PK id);

	public T save(T entity);

	
	public List<T> save(Iterable<T> entities);

	
	public void delete(PK id);
}
