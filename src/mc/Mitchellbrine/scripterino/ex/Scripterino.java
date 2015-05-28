package mc.Mitchellbrine.scripterino.ex;

public class Scripterino {
	
	public static String VERSION = "1.0.0";
	public static String UPDATE = "";
	private static boolean isDev = true;
	
	public static void main(String args[]) {
		if (args.length == 0) {
			// This is just a thing in case, if we don't supply any args, we just want to know info
			System.out.println("Scripterino");
			System.out.println("(Powered by Java)");
			System.out.println("- - -");
			String addon = !UPDATE.isEmpty() ? "_" + UPDATE : "";
			addon = isDev ? addon + "_dev" : addon;
			System.out.println("Version: " + VERSION + addon);
			return;
		}
		//String filePath = args[0];
	}

}
