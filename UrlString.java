class UrlString{
	public Boolean res = false;
	public UrlString(String arg){
		System.out.println(arg);
		for(int i = 0; i < arg.length(); i++){
			char letter = arg.charAt(i);
			if(letter != " ".charAt(0)){
				System.out.println(letter);
			} else {
				System.out.println("%");
				System.out.println("2");
				System.out.println("0");
			}
		}
		System.out.println(arg);
	}

}
