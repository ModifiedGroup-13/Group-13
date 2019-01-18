package dataDrivenModel;

import base.CommonAPI;

import java.sql.*;

public class TestConnectToMySql extends CommonAPI {
    public static Connection connectmysql() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/manir?useSSL=false&allowPublicKeyRetrieval=true";
        String userName = "root";
        String passWord = "abcd1234";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connect = DriverManager.getConnection(url, userName, passWord);// Connection is an interface,
        return connect;
    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("DB is Connected");
        String query = "select * from customers";
        Statement statement = connectmysql().createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            System.out.println(resultSet.getString("id") +" "+ resultSet.getString("name") +" "+ resultSet.getString("level"));
        }
    }
}
