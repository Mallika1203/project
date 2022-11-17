class output{
    public static void main(String args[]){
        char c[]= {'A', '1', ' ', 'a', 's'};
        for(int i=0; i<4; ++i)
        {
            i++;
            if(Character.isDigit(c[i])){
                System.out.println(c[i]+ " is digit");
            }
        }
        
    }
}