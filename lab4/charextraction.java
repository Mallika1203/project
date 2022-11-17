class getbytes{
    void getbytemethod(String S){
        
        byte[] barr=S.getBytes();
        for(int i=0;i<barr.length; i++){
            System.out.println(barr[i]);
        }
    }


}

class getchars{
    void getcharmethod(String S, int start, int end){
        char buf[]= new char[end-start];
        S.getChars(start, end, buf, 0);
        System.out.println(buf);


    }
}

class chararray{
    void tochararraymethod(String S){
        char[] ch= S.toCharArray();
        for(int i=0; i<ch.length; i++){
            System.out.println(ch[i]);
        }
    }

}
class charextraction{
    public static void main(String args[]){
         getbytes a = new getbytes();
         getchars b = new getchars();
         chararray c = new chararray();
         System.out.println("getBytes() method: ");
         a.getbytemethod("HELLOWORLD");
         System.out.println("getChar() method: ");
         b.getcharmethod("Getchar method implementation", 7, 20 );
         System.out.println("tochararray() method: ");
         c.tochararraymethod("OOPS Lab assignment");

    }
}