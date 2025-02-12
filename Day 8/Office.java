package tamilnadu.chennai;
public class Office {
   final  int salary=45000;
    public Office(){
    System.out.println("the main office");
   }
        public static void main(String[] args) {
            Office off=new Office();
            off.work();
            
        }
         public void work(){
            System.out.println("working in office");
        }
        void recuit(){
            System.out.println("recruitment");
        }
       protected void wfm(){
            System.out.println("work from home");
        }
       private void do_business_plan(){
                System.out.println();

        }
}
