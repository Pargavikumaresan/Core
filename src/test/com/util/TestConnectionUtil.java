package test.com.util;

import java.sql.Connection;

import com.util.ConnectionUtil;

public class TestConnectionUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = ConnectionUtil.getConnection();
		System.out.println(con);

	}

}
