public class Array_Dulplicate {
        public static void main(String[] args) {
            int a[]={2,3,1,2,3};
            int res[]={};
            for(int i=0;i<a.length;i++){
                int num=a[i];
                int count=1;
                for(int j=i+1;j<a.length;j++){
                    if(num==a[j]){
                        count++;

                    }
                }
                System.out.println(count);

            }


        }

}
