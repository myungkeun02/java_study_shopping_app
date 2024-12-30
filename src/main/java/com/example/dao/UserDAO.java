package com.example.dao;

import com.example.db.DBConnection;
import com.example.model.AdminUser;
import com.example.model.RegularUser;
import com.example.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    public User findUserByUsername(String username) {
        String query = "SELECT * FROM users WHERE username = ?";
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String userType = resultSet.getString("user_type");
                User user;

                if (userType.equals("ADMIN")) {
                    user = new AdminUser(resultSet.getString("username"), resultSet.getString("password"));
                } else {
                    user = new RegularUser(resultSet.getString("username"), resultSet.getString("password"));
                }

                user.addPoints(resultSet.getInt("points"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
