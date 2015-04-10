package com.asb.framework.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test/*")
public class TestController
{
	/* 接收参数的时候: 
	 * 如果地址栏/springmvc/hello.htm上面没有传递参数,那么当id为int型的时候会报错,当id为Integer的时候值为null
	 * 当地址栏为/springmvc/hello.htm?id=10的时候,action中有三种接收方式 
	 * 1、String hello(@RequestParam(value = "userid") int id),这样会把地址栏参数名为userid的值赋给参数id,如果用地址栏上的参数名为id,则接收不到 
	 * 2、String hello(@RequestParam int id),这种情况下默认会把id作为参数名来进行接收赋值 
	 * 3、String hello(int id),这种情况下也会默认把id作为参数名来进行接收赋值 
	 * 注:如果参数前面加上@RequestParam注解,如果地址栏上面没有加上该注解的参数,例如:id,那么会报404错误,找不到该路径 
	 */  
	@RequestMapping("test.do")
	@ResponseBody
	public Object test(HttpServletRequest request)
	{
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		if (isMultipart)
		{
			String realPath = "d:\\realPath";
			String tempPath = "d:\\tempPath";
			File dir = new File(realPath);
			File dir2 = new File(tempPath);
			if (!dir.exists()) dir.mkdir();
			if (!dir2.exists()) dir2.mkdir();

			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setRepository(dir2);
			factory.setSizeThreshold(1024 * 1024 * 2);
			ServletFileUpload upload = new ServletFileUpload(factory);

			try
			{
				List<FileItem> items = upload.parseRequest(request);

				for (FileItem item : items)
				{
					if (item.isFormField())
					{
						String name = item.getFieldName();
						String value = item.getString("utf-8");
						System.out.println(name + " = " + value);
					}
					else
					{
						String name = item.getName();
						item.write(new File(dir, System.currentTimeMillis()+ name.substring(name.lastIndexOf("."))));
					}
				}
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		
		List<String> a = new ArrayList<String>();
		a.add("aaa");
		a.add("bbb");
		
		Map returnMap = new HashMap();
		returnMap.put("errorCode", 1000);
		returnMap.put("errorMsg", "上传成功");
		returnMap.put("list", a);
		return returnMap;
	}
	
	
}