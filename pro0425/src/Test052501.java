import java.util.Scanner;

public class Test052501 {
    //勾股数元组
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for (int i = num1; i <num2 ; i++) {
            for (int j = i+1; j <num2 ; j++) {
                for (int k = j+1; k <num2 ; k++) {
                    if (Math.pow(i,2)+Math.pow(j,2) == Math.pow(k,2)  ){
                        System.out.print("  "+i);
                        System.out.print("  "+j);
                        System.out.println("  "+k);
                    }
                }
            }
        }
    }


    public int Prime(int a,int b){
        int max = Math.max(a,b);
        for (int i = 2; i <max ; i++) {
            if (a%i ==0 || b%i ==0){
                return 1;
            }
        }
        return 0;
    }

//    public int PrimeTri(int x,int y,int z){
////        if (Prime(x,y) || Prime(x,z) || Prime(y,z)){
//            return 1;
//        }else {
//            return 0;
//        }
//    }
}
