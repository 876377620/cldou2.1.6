package com.yang.cloudapi.model;

import java.io.Serializable;
import java.util.HashMap;

/**
 * <p>
 * 
 * </p>
 *
 * @author dal.anhuifeng
 * @since 2017-04-18
 */
public class PageBean implements Serializable {

    private static final long serialVersionUID = 1L;

	private Integer pageNumber;
	private Integer pageSize;
	private HashMap<String,Object> queryParams;

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public HashMap<String, Object> getQueryParams() {
		return queryParams;
	}

	public void setQueryParams(HashMap<String, Object> queryParams) {
		this.queryParams = queryParams;
	}
}
