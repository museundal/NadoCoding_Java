package chap_06;

public class _Quiz_06 {

    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0, index);
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";
        }

        return hiddenData;
    }

    public static void main(String[] args) {
        String name = "나코딩";
        String id = "000805-1234567";
        String phone = "010-1234-5678";

        System.out.println(getHiddenData(name,1));
        System.out.println(getHiddenData(id,8));
        System.out.println(getHiddenData(phone,9));


    }
}

