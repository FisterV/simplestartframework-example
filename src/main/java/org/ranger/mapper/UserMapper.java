package org.ranger.mapper;


import java.util.Map;

import org.simplestartframwork.context.annotation.component.Persistent;
import org.simplestartframwork.data.annotation.Options;
import org.simplestartframwork.data.annotation.SQL;
import org.simplestartframwork.data.annotation.SQL.SQLType;

@Persistent
public interface UserMapper {
	
	@SQL(type=SQLType.INSERT,value="INSERT INTO tb_user	(user_name, password) VALUES (${username}, ${password})")
	@Options(backfillParmaryKey=true,columnName="user_id",propteryName="user_id")
	int insert(Map<String,Object> entity);

}
