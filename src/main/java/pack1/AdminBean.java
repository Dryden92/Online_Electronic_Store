package pack1;

import java.io.Serializable;

public class AdminBean implements Serializable
{
	private String uname;
	private String pword;
	private String fname;
	private String lname;
	private String addr;
	private String mid;
	private String phno;
	
	public String getUname()
	{
		return uname;
	}
	public void setUname(String uname)
	{
		this.uname = uname;
	}
	public String getPword()
	{
		return pword;
	}
	public void setPword(String pword)
	{
		this.pword = pword;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname)
	{
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) 
	{
		this.lname = lname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) 
	{
		this.addr = addr;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) 
	{
		this.mid = mid;
	}
	public String getPhno() 
	{
		return phno;
	}
	public void setPhno(String phno) 
	{
		this.phno = phno;
	}
	
	
}
