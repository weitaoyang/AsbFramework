package com.asb.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asb.framework.dao.ITestDao;
import com.asb.framework.service.ITestService;

@Service("testService")
public class TestServiceImpl implements ITestService
{
	@Autowired
	private ITestDao testDao;

	@Override
	public boolean test(int flag)
	{
		if(flag == 0)
		{
			return testDao.test0();
		}
		else if(flag == 1)
		{
			return testDao.test1();
		}
		return false;
	}

}
