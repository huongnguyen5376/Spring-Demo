package com.javatpoint.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.javatpoint.beans.User;

public class UserDAO {
	
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(User user) {
		String sql = "insert into UserInfo(UserName,UserPassword) values('" 
				+ user.getUsername() + "','" + user.getPassword() + "')";
		return template.update(sql);
	}

	public int update(User user) {
		String sql = "update UserInfo set UserName='" + user.getUsername() 
						+ "', UserPassword='" + user.getPassword()
						+ "' where UserID=" + user.getId() + "";
		return template.update(sql);
	}

	public int delete(int ID) {
		String sql = "delete from UserInfo where UserID=" + ID + "";
		return template.update(sql);
	}

	public User getUserByID(int ID) {
		String sql = "select * from UserInfo where UserID=?";
		return template.queryForObject(sql, new Object[] { ID }, new BeanPropertyRowMapper<User>(User.class));
	}

	public List<User> getAllUser() {
		return template.query("select * from UserInfo", new RowMapper<User>() {
			public User mapRow(ResultSet rs, int row) throws SQLException {
				User user = new User();
				user.setId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
				return user;
			}
		});
	}
}
