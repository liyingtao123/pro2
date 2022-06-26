

//1716. 计算力扣银行的钱
public class Test0519 {
    public int totalMoney(int n) {
        int total=0;
        int wnum =1;
        int dnum =1;
        for (int i = 0; i <n ; i++) {
            total+=wnum+dnum-1;
            dnum++;
            if (dnum==8){
                dnum =1;
                wnum++;
            }
        }
        return total;
    }


    //1716. 计算力扣银行的钱
    public int totalMoney1(int n) {
        int tatal =0;
        int wnum = n/7;
        int num1 = n%7;
        if (n<7){
            tatal = n*(1+n)/2;
        }else {
            int sum1 = wnum*(28+28+(wnum-1)*7)/2;
            int sum2 = num1*((wnum+1)+(wnum+1)+(num1-1))/2;
            tatal = sum1+sum2;
        }
        return tatal;
    }
}
