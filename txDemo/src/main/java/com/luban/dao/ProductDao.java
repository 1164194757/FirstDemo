package com.luban.dao;

import org.springframework.stereotype.Repository;
import com.luban.utils.SqlUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class ProductDao {

    public void update(){
        Connection conn = SqlUtil.getConnection();
        String sql = "update `product` set product_name = '好好好'";
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

    public void print(String s){
        System.out.println(s);
    }
}
