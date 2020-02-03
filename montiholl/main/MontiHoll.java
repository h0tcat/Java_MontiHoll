package montiholl.main;

import java.util.Random;

/////////////////
//\\\\\\\\\\\\\\
// Monti Holl
//
//    By  h0tcat
//\\\\\\\\\\\\\\
/////////////////
public class MontiHoll {
    public static void main(String[] args) {
        if (!(args.length == 1)) {
            System.out.println("Usage: MontiHoll 試行回数");
            System.exit(0);
        } else {

            int tryloop = Integer.parseInt(args[0]);
            
            Random randomGenerator=new java.util.Random();
            int randomSelect = randomGenerator.nextInt(3);
            int randomSelectOld;
            
            int finalSelect;
            // インスタンス生成

            
            CharengeUser you = new CharengeUser(); // 挑戦者のインスタンス
            
            //モードのフラグ
            //false; 箱の選択を変更しない
            //true; 箱の選択を変更する
            boolean changeBoxIndex=true;
            
            // モンティーホール問題を実行する
            for (int loop = 0; loop < tryloop; loop++) {
                Box blackBox = new Box();

                you.selectBox(randomSelect);
                int teachedIndexNum=blackBox.teachFalseIndex();
                //選択を変更した場合
                if(changeBoxIndex){
                    randomSelectOld=randomSelect;
                    //選んでないやつに変更するまで繰り返し
                    while(!(randomSelect==teachedIndexNum) && !(randomSelect==randomSelectOld))randomSelect=randomGenerator.nextInt(3);
                    finalSelect=you.selectBox(randomSelect);
                    blackBox.openBox(finalSelect);
                }else{
                    //選択を変更しない場合
                    finalSelect=randomSelect;
                    blackBox.openBox(finalSelect);
                }
            }

            System.exit(0);
        }

    }
}