package com.sbc.web2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sbc.web2.dao.TodoDao;
import com.sbc.web2.entity.TodoEntity;;

@Service
@Transactional
public class TodoService {

	@Autowired
	TodoDao todoDao;

	public List<TodoEntity> getTodoList(){
		return todoDao.selectAll();
	}
}
