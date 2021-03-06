package dAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class SetLastLoginDAO {
	
		public boolean setUserLastLogin(String userid) throws SQLException
		{
			boolean getResult=false;
			String date = (new Date()).toString();
			
			Connection con = null;
			
			PreparedStatement pstmt1 =null;
			
			try
			{
				con = CommonDAO.getConnection();
				con.setAutoCommit(false);
		
				pstmt1=con.prepareStatement(CommonSQL.Set_User_Last_Login_SQL);
				pstmt1.setString(1, date);
				pstmt1.setString(2, userid);
				
				
				int noOfRowsEffected1 = pstmt1.executeUpdate();
				if(noOfRowsEffected1>0)
					{	
						con.commit();
						getResult=true;	
						System.out.println("Last Login Saved successfully");
					}
				
			} 
			catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
				System.out.println("ClassNotFound Exception generated in setUserLastLogin in setastLoginDAO");
				
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
				System.out.println("SQL Exception generated in setUserLastLogin in setastLoginDAO");
				
			}
			finally
			{	
				if(pstmt1!=null)
					{
						pstmt1.close();
					}
			
				if(con!=null)
					{
						con.close();
					}
			}
			
			return getResult;
		}

}
