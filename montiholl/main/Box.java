package montiholl.main;

import java.util.Collections;
import java.util.ArrayList;

public class Box{

    protected static ArrayList<Boolean> blackBox;

    public Box(){
        blackBox=new ArrayList<Boolean>();

        //当たりの入った箱を作る
        for(int loop=0;loop<2+1;loop++) blackBox.add((loop % 3)==0);
        //シャッフルして準備完了
        Collections.shuffle(blackBox);
    }

    //ハズレの箱を教える
    public int teachFalseIndex(){
        boolean isTrueElement;
        for(int boxIndex=0;boxIndex<3;boxIndex++){
            isTrueElement=blackBox.get(boxIndex);
            //もし当たりの箱ではなかったら(ハズレの箱だったら)ハズレのインデックスを返す
            if(!(isTrueElement)) 
                return boxIndex;
        }
        return -1;
    }

    public void openBox(int selectBoxIndex){
        System.out.println(blackBox);
        if(blackBox.get(selectBoxIndex)) 
            System.out.println("おめでとうございます! あたりです!!");
        else
            System.out.println("ハズレです。残念...");
    }
}