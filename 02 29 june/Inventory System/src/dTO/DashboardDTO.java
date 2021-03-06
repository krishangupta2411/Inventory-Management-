package dTO;

import dTO.userDTO.RoleDTO;

public class DashboardDTO 
{	
	private String userid;
	private String password;
	private String salutation;
	private String firstname;
	private String middlename;
	private String lastname;
	private String dateofbirth;
	private String gender;
	private String phone;
	private String emailid;
	private String address;
	
	RoleDTO roleDTO;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public RoleDTO getRoleDTO() {
		return roleDTO;
	}

	public void setRoleDTO(RoleDTO roleDTO) {
		this.roleDTO = roleDTO;
	}

	@Override
	public String toString() {
		return "DashboardDTO [userid=" + userid + ", password=" + password + ", salutation=" + salutation
				+ ", firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname
				+ ", dateofbirth=" + dateofbirth + ", gender=" + gender + ", phone=" + phone + ", emailid=" + emailid
				+ ", address=" + address + ", roleDTO=" + roleDTO.toString() + "]";
	}
	
	
}
