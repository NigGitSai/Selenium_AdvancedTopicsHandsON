package InterviewPrograms;

public class IndexOfFirstNonReaptingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndexOfFirstNonReaptingChar obj = new IndexOfFirstNonReaptingChar();
		System.out.println(obj.firstUniqChar("loveleetcode"));
	}

public int firstUniqChar(String s) {
        
        char[] charArr = s.toCharArray();
        int  count = 1;
        char uniqueChar = charArr[0];
        int charPos =0;
        for(int i=0;i<charArr.length;i++){
        	charPos =i;
        	count = 0;
            for(int j=i+1;j<charArr.length;j++){
            	
                if(charArr[i] == charArr[j]){
                	break;
                      
                } else {
                	 count++;    
                }
                
            }
            if(count == (charArr.length-1)-charPos){
                return i;
            } 
        }
        
        if(count == 1){
            return -1;
        }
        return -1;
    }
}
