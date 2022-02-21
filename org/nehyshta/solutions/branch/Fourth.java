package org.nehyshta.solutions.branch;

public class Fourth {
    public static void main(String[] args) {
        int a,b, x,y,z;
        isFin(5,5,1,3,5);
    }

    public static void isFin(int a,int b,int x,int y,int z){
        if(x<=a||x<=b &&y<=a ||y<=b){
            System.out.println("will fit");
        }else if(x<=a||x<=b&&z<=a||z<=b){
            System.out.println("will fit");
        } else if(y<=a||y<=b&&z<=a||z<=b){
            System.out.println("will fit");
        }
        else{
            System.out.println("wont fit");
        }
    }
}
