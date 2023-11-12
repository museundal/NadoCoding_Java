package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        //소규모 영화관 좌석
        //3X5 크기의 2차원 배열
        String[][] seats = new String[][]{
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}
        };
        //B2 좌석에 접근하려면
        System.out.println(seats[1][1]);

        String[][] seats2= new String[][]{
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };
        System.out.println(seats[0][2]);

        //3차원 배열도 가능합니다.(세로x가로x높이)

//        String[][][] marray = new String[][][]{
//                {{},{},{}},
//                {{},{},{}},
//                {{},{},{}},
//        };

        String[][][] marray = new String[3][3][3];









    }
}
