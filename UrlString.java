class UrlString{

	public String res = "";
	public UrlString(char[] str){

		int new_array_size = 0;
		int i;
		boolean first_char_found = false;
		int space_buffer = 0;

		for(i = 0; i < str.length; i++){

			char this_char = str[i];
			if(first_char_found == true){

				if(this_char == ' '){
					space_buffer = 3;
				} else {
					new_array_size += space_buffer;
					new_array_size++;
					space_buffer = 0;
				}

			} else {

				if(this_char != ' '){
					new_array_size++;
					first_char_found = true;
				}

			}

		}

		first_char_found = false;
		char new_string[] = new char[new_array_size];
		System.out.println(new_string.length);
		int new_string_index = 0;

		for(i = 0; i < str.length; i++){

			char this_char = str[i];
			System.out.println(this_char);
			if(first_char_found == true){

				if(this_char == ' '){
					space_buffer = 3;
				} else {
					if(space_buffer != 0){
						space_buffer = 0;
						new_string[new_string_index+1] = '%';
						new_string[new_string_index+2] = '2';
						new_string[new_string_index+3] = '0';
						new_string_index += 3;
						
					}
					new_string[new_string_index+1] = this_char;
					new_string_index++;
					space_buffer = 0;
				}

			} else {

				if(this_char != ' '){
					new_string[0] = this_char;
					first_char_found = true;
				}

			}

		}
		
		System.out.println(new_string);
		

	}
/*
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
*/
}
