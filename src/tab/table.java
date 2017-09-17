package tab;

import static java.lang.Math.pow;

 class table {

    public static void main(String[] args) {

        int i;
        System.out.println("a   a^2   a^3");

        for(i=1;i<=5;i++) {
            System.out.print(i +"   "+pow(i,2)+"   "+pow(i,3));
            System.out.println();

        }
        }
    }