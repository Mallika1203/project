public class q4{  
public static void main(String args[]){     
int a[][]={{11,23,45},{2,6,9},{3,9,12}};    
int b[][]={{15,23,10},{11,8,5},{31,4,16}};    
       
int mul[][]=new int[3][3];   
        
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
mul[i][j]=0;      
for(int k=0;k<3;k++)      
{      mul[i][j]+=a[i][k]*b[k][j];      
} 
System.out.print(mul[i][j]+" ");   
}
System.out.println();
}    
}} 