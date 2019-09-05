package com.css.dubbo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.css.dubbo.entity.Student;
import com.css.dubbo.mapper.StudentMapper;
import com.css.dubbo.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service(interfaceClass=StudentService.class)
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentMapper stuMapper;

	@Override
	public PageInfo<Student> list(Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		
		return new PageInfo<>(stuMapper.list());
	}

}
