package DataDriven;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

//import DataDriven.UserInfo;

public class UserInfo
{
	private String username;
	private String password;
	
	
	public UserInfo()
	{
		
	}
	public UserInfo(String username,String password)
	{
		super();
		this.username= username;
		this.password=password;
		
	}	
	
	public String getusername()
	{
		return username;
		
	}
	
	public void setusername(String username)
	{
		this.username = username;
	}
	 
	public String getPassword()
	{
		return password;
	}
    
	public void setPassword(String password)
	{
		this.password=password;
	}
	
	
	@Override
	public String toString()
	{
		return "UserInfo[username="+username+", password="+password+"]";
	}
	
	
	// getting data from csv file for user	
	
	@SuppressWarnings("resource")
	public static ArrayList<UserInfo> getUserDataFromCsvFile()
	{
		
		ArrayList<UserInfo> unfList=null;
		try{
			File myObj= new File("E:\\Selenium Setup\\datadriven.csv");
			unfList = new ArrayList<UserInfo>();
			Scanner myReader= new Scanner(myObj);
			int count=0;
			while (myReader.hasNextLine()) 
			{
				String data= myReader.nextLine();
				if (count !=0)
				{
					String[] info =data.split("\\,");
					unfList.add(new UserInfo(info[0],info[1]));
					//unfList.add(new UserInfo(info[0], info[1]));
					
				}
				++count;
				
			}
			
		}catch (Exception e)
			{
				e.printStackTrace();
				// TODO: handle exception
			}
			return unfList;
	}
}
