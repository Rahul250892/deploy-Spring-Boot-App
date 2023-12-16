package com.webapp.simple;

import java.util.*;

public class App {
    public static void thrower(){
        throw new RuntimeException();
    }
    public static void main(String[] args) {
        Map<Integer,String> m= new HashMap<>();
//      m.put(109,"Raj");
//
////        m.put(0,"hh");
//        m.put(null,"may");
//        m.put(null,null);
////        m.put(234,"sjhe");
////        Collections.unmodifiableMap(m);
////        m.put(432,"asdas");
//        System.out.println(m.size());
//        System.out.println(m);
//        System.out.println("Ok");


//        try{
//            thrower();
//            System.out.println("I");
//        }catch (RuntimeException e){
//            System.out.println("J");
//        }catch (Exception e){
//            System.out.println("K");
//        }finally {
//            System.out.println("L");
//        }
//        System.out.println("M");
//        int s[]={9};
//        m1(s);
//        System.out.println(s[0]);

//        List<String> list= new ArrayList<>();
//        list.add("A");
//        List<String> a=list;
//        List<String> c=new ArrayList<>(a);
//        list.clear();
//        a.add("B");
//        c.add("C");
//        System.out.println(list);
//        System.out.println(a);
//        System.out.println(c);
    }


    static void m1(int s[]){
        int newS[]={7};
        s=newS;
    }
}
