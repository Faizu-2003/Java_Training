 public class Demo {
{        System.out.println("hello world from non-static");
}            
        
        static{
            System.out.println("hello world from static-block-2");
        }
        public static void main(String[] args) {
            Demo d=new Demo();
        }
}
