package com.css.dubbo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.css.dubbo.entity.Student;



@Mapper
public interface StudentMapper {
	
	@Select("select * from student")
	List<Student> list();
	
}
