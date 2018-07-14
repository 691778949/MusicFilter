package cn.sj.crawler.base.domain;

import java.io.Serializable;


@SuppressWarnings("serial")
public abstract class BaseDomain implements Serializable {

	
	public abstract String toString();


	public abstract boolean equals(Object o);

	public abstract int hashCode();
}
