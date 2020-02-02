package montiholl.main;

import java.util.Collections;
import java.util.ArrayList;

public class Box{

    public ArrayList<Boolean> box;

    public Box(){
        this.box=new ArrayList<Boolean>();

        //当たりの入った箱を作る
        for(int loop=0;loop<2+1;loop++) box.add((loop % 3)==0);
        //シャッフルして準備完了
        Collections.shuffle(this.box);
        System.out.println(this.box);
    }
}