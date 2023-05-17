class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] split = polynomial.split("\\s\\+\\s");       
        int con = 0;                                          
        int unk = 0;                                          
        for(int i = 0; i < split.length; i++) {
            if(split[i].matches("^[0-9]+$")) {              
                con += Integer.parseInt(split[i]);            
            } else if(split[i].equals("x")) {               
                unk += 1;                                    
            } else if(split[i].contains("x")) {             
                unk += Integer.parseInt(split[i].substring(0, split[i].length() - 1));  
            }
        }
        
        if(unk != 0 && con == 0) {          
            if(unk == 1) answer = "x";      
            else answer = unk + "x";      
        }
        if(unk == 0 && con != 0) {          
            answer = String.valueOf(con); 
        }
        if(unk != 0 && con != 0) {                    
            if(unk == 1) answer = "x" + " + " + con;  
            else answer = unk + "x" + " + " + con;  
        }
        return answer;
    }
}
