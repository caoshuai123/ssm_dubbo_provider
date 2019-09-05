package com.css.dubbo;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.css.dubbo.entity.Student;
import com.css.dubbo.service.StudentService;
import com.github.pagehelper.PageInfo;
/**
 * 
 * @author zhuzg
 *
 */
public class BootStart {
	
	/**
	 * 
	 */
	static Logger log= Logger.getLogger(BootStart.class);
	
	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		log.trace("bb");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml"); 
		
		StudentService ss = context.getBean(StudentService.class);
		PageInfo<Student> pageInfo = ss.list(1, 5);
		System.out.print("  pageInfo is " + pageInfo);
		
		log.trace("aa");
		System.in.read();
		
	}

}
