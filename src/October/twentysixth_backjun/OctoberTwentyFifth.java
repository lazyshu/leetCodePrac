package October.twentysixth_backjun;

public class OctoberTwentyFifth {
    public static void main(String[] args) {
        int n=5;

        if(n==1){
            System.out.println("*");
        }else{
            int space=1;
            for(int i=n;i>1;i--){
                for(int j=i-1; j>0;j--){
                    System.out.print(" ");
                }
                System.out.print("*");
                if(i==n){
                    System.out.println();
                    continue;
                }
                for(int k=0;k<space;k++){ //여기서 꼭대기는 없이 해야해 :(
                    System.out.print(" ");
                }
                space+=2;
                System.out.println("*");

            }



            int last= n*2-1;
            for(int i=0;i<last;i++){
                System.out.print("*");
            }
        }
    }
}
