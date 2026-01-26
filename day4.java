//operators\\

// pre increment : and post increment

//   logical operatores: &&, ||, !

// class day4
// {
//     public static void main(String[] args) {
        
//         int x=6;
//         int y=5;

//         boolean result = x<y;

//         System.out.println(result);
//     }
// }


//**********logical operators******************* */
// class day4
// {
//    public static void main(String[] args) {
       
//        int x =4;
//        int y=6;
//        int a=8;
//        int b=7;

//       boolean res = x<y || a>b;
//       boolean res1 = x>y && a>b;


//        System.out.println(res);

//        System.out.println(!res1);


//    } 
// }


//************Conditional statements***************** */
// class day4{

//     public static void main(String[] args) {
        
//         int x = 8;
//         int y = 7;
//         int z = 9;

//         if(x>y && x>z)
//         {
//             System.out.println(x);

//         }
//         else if (y>z)
//          {
//          System.out.println(y);

//         }
//         else 
//         {
//             System.out.println(z);
//         }
//     }
// }

class day4
{
    public static void main(String[] args) {
        int n=5;
        int result =0;

        // if(n%2==0)
        // {
        //     result = 10;
        // }
        // else{
        //     result = 20;
        // }

        // **************? using ternary operator*******************

        result = n%2==0 ? 10 : 20;
        System.out.println(result);

    }
}