/*package com.javatpoint.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.javatpoint.beans.Emp;

public class EmpDao {
	final static Logger logger = Logger.getLogger(EmpDao.class);
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Emp p) {
		String sql = "insert into emp99(Name,Salary,Designation) values('" + p.getName() + "'," + p.getSalary() + ",'"
				+ p.getDesignation() + "')";
		logger.debug("Hello world");
		logger.trace("Hello world");
		return template.update(sql);
	}

	public int update(Emp p) {
		String sql = "update emp99 set Name='" + p.getName() + "', Salary=" + p.getSalary() + ", Designation='"
				+ p.getDesignation() + "' where ID=" + p.getId() + "";
		return template.update(sql);
	}

	public int delete(int ID) {
		String sql = "delete from emp99 where ID=" + ID + "";
		return template.update(sql);
	}

	public Emp getEmpByID(int ID) {
		String sql = "select * from emp99 where ID=?";
		return template.queryForObject(sql, new Object[] { ID }, new BeanPropertyRowMapper<Emp>(Emp.class));
	}

	public List<Emp> getEmployees() {
		return template.query("select * from emp99", new RowMapper<Emp>() {
			public Emp mapRow(ResultSet rs, int row) throws SQLException {
				Emp e = new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				e.setDesignation(rs.getString(4));
				return e;
			}
		});
	}
}
*/