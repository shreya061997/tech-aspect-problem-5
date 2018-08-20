package ExamplePackage;
import java.text.*;
import java.util.*;
import java.io.Console;
import java.sql.*;
import accountpackage.AccountBean;
public class UserDAO
{
	static Connection currentCon = null;
	static ResultSet rs = null;
	protected static Connection connection;
	protected PreparedStatement preparedStatement;
	protected CallableStatement callableStatement;
	protected ResultSet resultSet;
	private static AccountBean accountBean = null;
	// private static final Logger logger = Logger.getLogger(BaseDao.class.getName());
	private static String dbURL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static String dbUsername = "SYSTEM";
	private static String dbPassword = "shreya06";
	public static AccountBean login(UserBean bean) throws SQLException {
		//preparing some objects for connection
		accountBean = new AccountBean();
		Statement stmt = null;
		String username = bean.getemailid();
		String password = bean.getPassword();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(dbURL, dbUsername,
					dbPassword);
			String searchQuery =
					"select CANDFIRST_NAME,CANDLAST_NAME,CANDEMAIL_ID,CANDADDRESS,CANDPASSWORD from candidate_shreya " + "where CANDEMAIL_ID='"+username+"' AND CANDPASSWORD='"+password+"'";
					stmt=connection.createStatement();
			rs = stmt.executeQuery(searchQuery);
			while(rs.next()){
				System.out.println("Valid User !");
				accountBean.setFirstName(rs.getString("CANDFIRST_NAME"));
				accountBean.setLastName(rs.getString("CANDLAST_NAME"));
				accountBean.setAddress(rs.getString("CANDADDRESS"));
				accountBean.setEmailid(rs.getString("CANDEMAIL_ID"));
				accountBean.setPassword(rs.getString("CANDPASSWORD"));
				accountBean.setValid(true);
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {}
				stmt = null;
			}
			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}
				currentCon = null;
			}
		}
		return accountBean;
	}
	public static boolean update(UpdateBean bean) throws SQLException {
		//preparing some objects for connection
		boolean flag = false;
		Statement stmt = null;
		String emailid = bean.getemailid();
		String address = bean.getAddress();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(dbURL, dbUsername,
					dbPassword);
			String updateQuery =
					"update candidate_shreya "
							+"set CANDADDRESS='"
							+ address
							+ "'"
							+"where CANDEMAIL_ID='"
							+emailid+"'"
							;
			/*String updateQuery =
"update candidate_shreya "
+"set CANDEMAIL_ID='"
+emailid
+"',CANDADDRESS='"
+ address
+ "'"
+"where CANDIDATEID="
+1
;*/
			stmt=connection.createStatement();
			int n=stmt.executeUpdate(updateQuery);
			if(n>0){
				flag=true;
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {}
				stmt = null;
			}
			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}
				currentCon = null;
			}
		}
		return flag;
	}
	public static int insert(AccountBean bean) throws SQLException {
		//preparing some objects for connection
		int id=0;
		Statement stmt = null,stmt1= null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(dbURL, dbUsername,
					dbPassword);
			String selectQuery="select max(CANDIDATEID) from candidate_shreya";
			stmt=connection.createStatement();
			rs=stmt.executeQuery(selectQuery);
			while(rs.next()){
				id=rs.getInt(1);
			}
			if(id>0){
				String insertQuery =
						"insert into candidate_shreya(CANDIDATEID,CANDFIRST_NAME,CANDLAST_NAME,CANDEMAIL_ID,CANDPASSWORD,"

						+ "CANDADDRESS) "
								+ "values("+(id+1)+",'"+bean.getFirstName()+"',"
								+"'"+bean.getLastName()+"',"
								+"'"+bean.getEmailid()+"',"
								+"'"+bean.getPassword()+"',"
								+"'"+bean.getAddress()+"')";
				stmt1=connection.createStatement();
				int n=stmt.executeUpdate(insertQuery);
				if(n>0){
					System.out.println("Inserted Successfully !!");
				}
				else{
					System.out.println("Not Inserted");
				}
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {}
				stmt = null;
			}
			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}
				currentCon = null;
			}
		}
		return id;
	}
	public static AccountBean Back(UserBean user) {
		accountBean = new AccountBean();
		Statement stmt = null;
		String username = user.getemailid();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(dbURL, dbUsername,
					dbPassword);
			String searchQuery =
					"select CANDFIRST_NAME,CANDLAST_NAME,CANDEMAIL_ID,CANDADDRESS,CANDPASSWORD from candidate_shreya where CANDEMAIL_ID='"
							+ username
							+ "'";
			stmt=connection.createStatement();
			rs = stmt.executeQuery(searchQuery);
			while(rs.next()){
				System.out.println("Valid User !");
				accountBean.setFirstName(rs.getString("CANDFIRST_NAME"));
				accountBean.setLastName(rs.getString("CANDLAST_NAME"));
				accountBean.setAddress(rs.getString("CANDADDRESS"));
				accountBean.setEmailid(rs.getString("CANDEMAIL_ID"));
				accountBean.setPassword(rs.getString("CANDPASSWORD"));
				accountBean.setValid(true);
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {}
				stmt = null;
			}
			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}
				currentCon = null;
			}
		}
		return accountBean;
	}
}
