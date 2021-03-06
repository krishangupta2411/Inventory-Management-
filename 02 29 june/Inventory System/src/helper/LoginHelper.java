package helper;

import java.sql.SQLException;

import dAO.CheckUseridPasswordDAO;
import dAO.LoginDAO;
import dAO.SetLastLoginDAO;
import dTO.DashboardDTO;
import dTO.LoginDTO;

public class LoginHelper {
	public boolean checkUseridPassword(LoginDTO loginDTO)
	{
		boolean result=false;
		CheckUseridPasswordDAO checkUseridPasswordDAO = new CheckUseridPasswordDAO();
		
		try 
		{
			result=checkUseridPasswordDAO.checkUserLogin(loginDTO);
		}
		
		catch (SQLException e)
		{
			e.printStackTrace();
			System.out.println("SQL Exception generated in checkUser in LoginHelper");
		}
		return result;
	}
	
	
	public boolean setLastLogin(String userid)
	{
		boolean result=false;
		SetLastLoginDAO setLastLoginDAO = new SetLastLoginDAO();
		try 
		{
			result=setLastLoginDAO.setUserLastLogin(userid);
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
			System.out.println("SQL Exception generated in setLastLogin in LoginHelper");
		}
		
		return result;
	}
	
	
	public DashboardDTO doLogin(String userid)
	{
		DashboardDTO dashboardDTO=null;
		
		System.out.println("DoLogin function called");
		LoginDAO loginDAO = new LoginDAO();
		try 
		{
			dashboardDTO=loginDAO.doLoginDAO(userid);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			System.out.println("SQL Exception generated in doLogin in LoginHelper");
		}
	
		return dashboardDTO;
		
	}
	
	
}
