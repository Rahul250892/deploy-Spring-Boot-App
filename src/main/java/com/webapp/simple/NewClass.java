package com.webapp.simple;

public class NewClass {

    static class P{
       {
            System.out.println("1");
        }
        static {
            System.out.println("2");
        }
    }
    static class child extends P{
        {
            System.out.println("3");
        }
        static {
            System.out.println("4");
        }
    }

    static Integer div(int x, int y){
        try{
            return x/y;
        }finally {
            System.out.println("finall");
        }
    }
    public static void main(String[] args) {
        //child c= new child();
//        try{
//            System.out.println(div(2,0));
//        }catch (Exception e){
//            System.out.println("div");
//        }
//        String m= "feb";
//        changS(m);
//        System.out.println(m);
//        System.out.println();

    }

    static class M{
        int price;
    }
    static  void changS(String m){
        m="jan";
    }
    static void changArr(String[] holy){
        holy[1]="5";
    }

    static void changeOb(M m){
        m.price=32;
    }
}
