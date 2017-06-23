class UrlString{
	public String res = "";
	public UrlString(String arg){
		boolean last_space = false;
		for(int i = 0; i < arg.length(); i++){
			char letter = arg.charAt(i);
			if(letter != " ".charAt(0)){
				if(last_space == true && this.res != ""){
					this.res += "%20";
				}
				this.res += letter;
				last_space = false;
			} else {
				if(last_space == false){
				}
				last_space = true;
			}
		}
	}

}
