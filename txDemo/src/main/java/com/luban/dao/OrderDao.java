package com.luban.dao;

import org.springframework.stereotype.Repository;
import com.luban.utils.SqlUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class OrderDao {
    public void update(){
        Connection conn = SqlUtil.getConnection();
        String sql = "update `order` set order_no='123'";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            int i = ps.executeUpdate();
            System.out.println("result:" + i);
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
