package chap_13;

import java.io.File;

public class _08_DeleteFile {
    public static void main(String[] args) {
        File file = new File("text.txt");
        if(file.delete()){
            System.out.println("파일 삭제 성공 : " + file.getName());
        }else {
            System.out.println("파일 삭제 실패 : " + file.getName());
        }
        
        File folder = new File("A/B/C"); // 부모폴더를 바로 삭제할 수 는 없다, 순차적으로 지워야 한다.
        if(folder.exists()){
            if(folder.delete()){
                System.out.println("폴더 삭제 성공 : " + folder.getName());
            }
            else {
                System.out.println("폴더 삭제 실패 : " + folder.getName());
            }
        }
        File folder2 = new File("Trash"); // 반복문 통해서 하위폴더까지 삭제하기
        deleteFolder(folder2);
        
        if(deleteFolder(folder2)){
            System.out.println("폴더 삭제 성공 : " + folder2.getAbsolutePath());
        }else {
            System.out.println("폴더 삭제 실패 : "+folder2.getAbsolutePath() );
        }
    }
    public static boolean deleteFolder(File folder){
        if(folder.isDirectory()){ // 폴더사 실제로 폴더 인지 확인 
            for(File file : folder.listFiles()){
                deleteFolder(file); // 재귀호출 , 내용을 삭제 
            }
        }
        System.out.println("삭제 대상 : "  + folder.getAbsolutePath());
        return folder.delete(); // boolean 반환
    }
}
