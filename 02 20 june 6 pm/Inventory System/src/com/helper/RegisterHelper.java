package com.helper;

import java.sql.SQLException;

import dAO.RegisterDAO;
import dTO.RegisterDTO;

public class RegisterHelper {

	public boolean doRegister(RegisterDTO userDTO) throws ClassNotFoundException, SQLException {
		boolean getresult = false;
		RegisterDAO registerDAO = new RegisterDAO();
		getresult=registerDAO.doRegister(userDTO);
		return getresult;
	}

}