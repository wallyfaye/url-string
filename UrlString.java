class UrlString{
	public String res = "";
	public UrlString(String arg){
		for(int i = 0; i < arg.length(); i++){
			char letter = arg.charAt(i);
			if(letter != " ".charAt(0)){
				this.res += letter;
			} else {
				this.res += "%20";
			}
		}
	}

}
