//data types 
//1.primitive data types ->integer-(byte,short,int,long), float-(double,float), character, boolean
//2. non-primitive
//integer- int 4bytes, long = 8bytes, short = 2bytes ,byte = 1byte -128 to 128-1
//float - 4bytes
//double -> double is default 8 bytes 
// char -> 2bytes 
// char c = 'k'
// boolean -> true or false
 class Day3
 {

 public static void main(String args[])
    {
        float marks = 6.5f;
        double d =5.6;

        int num1 = 9;
        byte by = 127;
        short sh = 558;
        long l = 555l;

        char c = 'k'; //literals
        boolean b = true;


        System.out.println(num1);



    }


 }

 //****************type conversion and casting********************

//  byte b = 127;
//  int a =256;

//  b=a; -> will not work then b = (byte)a; ->this is casting converting int to byte format
//a=b; -> will work this is conversion


//float f = 1.5f;
// int x = (int) f; here you will numbers after decimals , x=1;


// byte b = 127;
// int a =b;
 
// int a = 257;
// byte k = (byte) a;

// float f =5.6f;
// int t = (int)f;

// System.out.println(a)

//***********type promotion*************

// byte a = 10;
// byte b = 20;

// int result = a*b; here performing operation in byte and storing in int it is called type promotion
