package com.sbc.web2.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import com.sbc.web2.entity.TodoEntity;

@Dao
@ConfigAutowireable
public interface TodoDao {

	@Select
	List<TodoEntity> selectAll();

	@Select
	TodoEntity selectById(String id);

	@Update(sqlFile = true)
	int update(TodoEntity entity);

	@Delete(sqlFile = true)
	int deleteById(String id);
}
