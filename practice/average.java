class average{
   public static void main(String args[])
  {

  int arr[]={3,6,3,5,2,5};
  int sum=0;
  int size= arr.length;
  for(int i=0; i<6; i++)
  {
       sum+=arr[i];
    
  }
  
  double avg= sum/size;
  System.out.println("Average of the elements is:" +avg);
  
  }

}