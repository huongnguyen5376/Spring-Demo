package com.javatpoint.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.javatpoint.beans.TeamManage;

public class TeamManageDAO {;

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(TeamManage manage) {
		String sql = "insert into TeamManage(TeamName,CoachName,NationalName) values('" 
					+ manage.getTeam() + "','" + manage.getCoach() + "','"
						+ manage.getNational() + "')";
		return template.update(sql);
	}

	public int update(TeamManage manage) {
		String sql = "update TeamManage set TeamName='" + manage.getTeam()
			+ "', CoachName='" + manage.getCoach() + "', NationalName='"
			+ manage.getNational() + "' where TeamID=" + manage.getId() + "";
		return template.update(sql);
	}

	public int delete(int ID) {
		String sql = "delete from TeamManage where TeamID=" + ID + "";
		return template.update(sql);
	}

	public TeamManage getTeamByID(int ID) {
		String sql = "select * from TeamManage where TeamID=?";
		return template.queryForObject(sql, 
				new Object[] { ID }, 
				new BeanPropertyRowMapper<TeamManage>(TeamManage.class));
	}

	public List<TeamManage> getAllTeam() {
		return template.query("select * from TeamManage", 
				new RowMapper<TeamManage>() {
			public TeamManage mapRow(ResultSet rs, int row) 
						throws SQLException {
				TeamManage manage = new TeamManage();
				manage.setId(rs.getInt(1));
				manage.setTeam(rs.getString(2));
				manage.setCoach(rs.getString(3));
				manage.setNational(rs.getString(4));
				return manage;
			}
		});
	}
}
