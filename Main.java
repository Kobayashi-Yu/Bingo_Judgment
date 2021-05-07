import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] s = new int[n][n];

        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        while(scanner.hasNext()){
            String q = scanner.next();
            String[] strArray = q.split("");

            for(String u : strArray) {
                if(u.equals("o")){
                    list.add(1);
                }else{
                    list.add(0);
                }
            }
        }
        //二次元配列に格納
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                s[j][i] = list.get(count);
                count++;
            }
        }

        int coun2 = 0;
        //ビンゴ初期値設定
        boolean bingo =false;
        //ヨコ判定
        for(int i=n;i>0;i--){
            for(int j=0;j<n;j++){
                if(s[n-i][j]==1){
                    count2++;
                }
            }
            if(count2==n){
                bingo = true;
            }
            count2 = 0;
        }
        //タテ判定
        for(int i=n;i>0;i--){
            for(int j=0;j<n;j++){
                if(s[j][n-i]==1){
                    count2++;
                }
            }

            if(count2 == n){
                bingo = true;
            }
            count2 = 0;
        }
        //ナナメ１
        for(int i = 0;i<n;i++){
            if(s[i][i] == 1){
                count2++;
            }
        }
        if(count2 == n){
            bingo = true;
        }
        count2 = 0;
        //ナナメ2
        int t = n-1;
        for(int i=0;i<n;i++){
            if(s[i][t] == 1){
                count2++;
            }
            t--;
        }
        if(count2 == n){
            bingo = true;
        }

        System.out.println(bingo ? "Yes":"No");





    }
}
