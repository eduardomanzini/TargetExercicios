package target;

public class reveterString {

	public static void main(String[] args) {
		
		String obj = "targetEstagio";
		System.out.println(obj);
		
		
		char[] ch = obj.toCharArray();
	    int inicial = 0;
	    int fim = ch.length-1;
	    char temp;
	   
	    
	    while(fim>inicial){
	        temp = ch[inicial];
	        ch[inicial] = ch[fim];
	        ch[fim] = temp;
	        fim--;
	        inicial++;
	    }
	    
	    
	    obj = new String(ch);
	    System.out.println(obj);
	}

}
