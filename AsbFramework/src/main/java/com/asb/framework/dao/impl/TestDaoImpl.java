package com.asb.framework.dao.impl;

import org.springframework.stereotype.Repository;

import com.asb.framework.dao.ITestDao;

@Repository("testDao")
public class TestDaoImpl implements ITestDao
{
	@Override
	public boolean test0()
	{
		return false;
	}

	@Override
	public boolean test1()
	{
		return true;
	}
	
}
