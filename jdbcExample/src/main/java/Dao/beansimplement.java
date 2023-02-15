package Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class beansimplement implements Dao {
	@Autowired
	JdbcTemplate abc;

	@Override
	public void insertRecords() {
		abc.update("insert  into emp values(101,'jai',45000)");
		abc.update("insert  into emp values(102,'Gagan',42000)");

	}

	@Override
	public List<?> selectData() {
		// TODO Auto-generated method stub
		return abc.queryForList("select * from emp");
	}

}
