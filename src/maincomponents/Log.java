package maincomponents;

import org.apache.log4j.Logger;

public class Log {

	public Log() {
		// TODO Auto-generated constructor stub
	}
	private static Logger Log = Logger.getLogger(Log.class.getName());
	
	public static void info(String message){
		Log.info(message);
	}

}
