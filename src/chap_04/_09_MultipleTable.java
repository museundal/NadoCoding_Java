package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
    //구구단

        for (int i = 0; i < 8; i++) {
            for(int j=0;j<9;j++){
                System.out.println((i+2)+"*"+(j+1)+"="+(i+2)*(j+1));
            }
        }
        System.out.println();
        for (int i = 2; i < 10; i++) {
            for(int j=1;j<10;j++){
                System.out.println(i+"*"+j+"="+(i*j));
            }
        }

    } // main
}
