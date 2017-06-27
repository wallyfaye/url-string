class _Demo {
	public static void main(String[] args){
		if (args.length < 1){
			System.out.println("Please specify one string to test");
			System.exit(0);
		}
		UrlString url_string = new UrlString(args[0].toCharArray());
		String result = new String(url_string.res); 
		System.out.println("The result of \"" + args[0] + "\" is: " + result);
	}
}
