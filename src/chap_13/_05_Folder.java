package chap_13;

import java.io.File;

public class _05_Folder {
    public static void main(String[] args) {
        String folderName = "Trash";
        File folder = new File(folderName);
        folder.mkdir(); //폴더 생성
        if(folder.exists()){
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        }
        System.out.println("=========================");
        folderName = "Trash" + File.separator+"A"+File.separator+"B"; //File.separator 는 운영체제에 맞는 구분자
        folder = new File(folderName);
        //folder.mkdir(); 단일폴더만 가능
        folder.mkdirs(); // 트리구조 만들려면 이걸 사용하자
        if(folder.exists()){
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        }else {
            System.out.println("폴더 생성 실패(mkdir)");
        }
    }
}
