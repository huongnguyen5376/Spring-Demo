package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import sql.ConnectDB;
import model.UserInfo;

public class UserInfoDAO {
  // insert
  public static int insertUser(UserInfo userInfo) {
    int status = 0;
    Connection connection = ConnectDB.getConnection();
    try {
      PreparedStatement statement = connection.prepareStatement(
          "insert into UserInfo(UserName, UserPassword) values (?,?)");
      statement.setString(1, userInfo.getUsername());
      statement.setString(2, userInfo.getPassword());
      status = statement.executeUpdate();
      connection.close();
    } 
    catch (Exception e) {
      e.printStackTrace();
    }
    return status;
  }
  // update
  public static int updateUser(UserInfo userInfo) {
    int status = 0;
    try {
      Connection connection = ConnectDB.getConnection();
      PreparedStatement statement = connection.prepareStatement(
          "update UserInfo set UserName=?, UserPassword=? where UserID=?");
      statement.setString(1, userInfo.getUsername());
      statement.setString(2, userInfo.getPassword());
      statement.setInt(3, userInfo.getId());
      status = statement.executeUpdate();
      connection.close();
    } 
    catch (Exception e) {
      e.printStackTrace();
    }
    return status;
  }
  // delete
  public static int deleteUser(int id) {
    int status = 0;
    try {
      Connection connection = ConnectDB.getConnection();
      PreparedStatement statement = connection.prepareStatement(
          "delete from UserInfo where UserID=?");
      statement.setInt(1, id);
      status = statement.executeUpdate();
      connection.close();
    } 
    catch (Exception e) {
      e.printStackTrace();
    }
    return status;
  }
  // get by ID
  public static UserInfo getUserInfoById(int id) {
    UserInfo info = new UserInfo();
    try {
      Connection connection = ConnectDB.getConnection();
      PreparedStatement statement = connection.prepareStatement(
          "select * from UserInfo where UserID=?");
      statement.setInt(1, id);
      ResultSet resultSet = statement.executeQuery();
      if (resultSet.next()) {
        info.setId(resultSet.getInt(1));
        info.setUsername(resultSet.getString(2));
        info.setPassword(resultSet.getString(3));
      }
      connection.close();
    } 
    catch (Exception e) {
      e.printStackTrace();
    }
    return info;
  }
  // get All
  public static List<UserInfo> getAllUser() {
    List<UserInfo> list = new ArrayList<UserInfo>();
    try {
      Connection connection = ConnectDB.getConnection();
      PreparedStatement statement = connection.prepareStatement(
          "select * from UserInfo");
      ResultSet resultSet = statement.executeQuery();
      while (resultSet.next()) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(resultSet.getInt(1));
        userInfo.setUsername(resultSet.getString(2));
        userInfo.setPassword(resultSet.getString(3));
        list.add(userInfo);
      }
      connection.close();
    } 
    catch (Exception e) {
      e.printStackTrace();
    }
    return list;
  }
  // get username and password
  public static UserInfo getUserInfo(String user, String password) {
	  	UserInfo info = null;
	    try {
	      Connection connection = ConnectDB.getConnection();
	      PreparedStatement statement = connection.prepareStatement(
	          "select * from UserInfo where UserName=? and UserPassword=?");
	      statement.setString(1, user);
	      statement.setString(2, password);
	      ResultSet resultSet = statement.executeQuery();
	      if (resultSet.next()) {
	    	info = new UserInfo();
	        //info.setId(resultSet.getInt(1));
	        info.setUsername(resultSet.getString(2));
	        info.setPassword(resultSet.getString(3));
	      }
	      connection.close();
	    } 
	    catch (Exception e) {
	      e.printStackTrace();
	    }
	    return info;
	  }
}
