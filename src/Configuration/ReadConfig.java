package Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig
{

	//public static String config_path = "C:\\Users\\cpolukonda\\OneDrive - Cox Enterprises, Inc\\Latest\\2018\\Automation\\Selenium\\Eclipse-Workspace\\Fusion_Automation\\bin\\Configuration\\Config.Properties";
	public static String config_path = "D:\\prasad ramdasu\\COX_PROJECT\\COX_Automation\\Selinium_Projects\\Cox-Eclipse_Workspace\\Fusion_Auto_Selinium\\bin\\Configuration\\Config.Properties";
	public static String config_variable = "medwait";
	public static String config_data = null;
	
	public static String GetData(String config_variable) throws IOException
	{
			// TODO Auto-generated method stub
			Properties config = new Properties();
			
			FileInputStream fip= new FileInputStream(config_path);
			config.load(fip);
			config_data = config.getProperty(config_variable);
			System.out.println(config_variable + " is " + config.getProperty(config_variable));
			System.out.println(config.getProperty(config_variable).getClass().getSimpleName());
			return config_data;
		}
	}