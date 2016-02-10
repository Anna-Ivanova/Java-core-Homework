 class fin{
 public static void main (String[]args){
 int[]prices={3, 2, 4, 1, 6, 5, 4};
       int max;
       int min;
       int index=0;
       max=prices[0];
    min=prices[prices.length-1];
       for (int i=0; i<prices.length;i++ ){
               if(prices [i]>max){
                       max=prices[i];
                       index=i;
                       
                               }
               for(int j=prices.length-1;j>prices[index];j--){
               if(prices[j]<min){
                       min=prices[j];
               } 
       }
       }
       int loss=max-min;
       System.out.println(loss);


       }
}
