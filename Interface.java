package L_E_Funtional_Interface_Inheritance;

///         Lamda Expressions            ///


// interface Interf
//{
//    public void m1();
//    default  void m2()
//    {}
//    public static void m3()
//    {}
//}

//---------------------------------------------------------------------------------------------


//interface  A
//{
//    public  void m1();
//}
//
//interface  B extends  A
//{
//    public  void m1();  // Valid as it is same m1 method
//    public  void m2();  //Invalid no new methods ca nbe extends into B if @Funtional_Interface is used
//}


//interface  Interf
//{
//    public  void m1();
//}
//
////class Demo implements Interf                    // No Need of Lines 32-38
////{
////    @Override
////    public void m1() {
////        System.out.println("Hello...");
////    }
////}
//
//
//class  Test
//{
//    public static void main(String[] args)
//    {
////         Demo d=new Demo();
////         d.m1();
//
//         Interf i = ()-> System.out.println("Hello...by lamda Expression");  //parent reference can hold child object
//         i.m1();
//    }
//}

interface  Interf
{
    public void add( int a, int b);
}
//class Demo implements Interf            // NO need of lines 57-63
//{
//    @Override
//    public void add(int a, int b) {
//        System.out.println("The sum : " +(a+b));
//    }
//}

class Test
{
    public static void main(String[] args) {
        Interf i = (a, b) ->  System.out.println("The sum : " +(a+b));
        i.add(3,9);
        i.add(10,8);
        i.add(3,34);
    }
}








