/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challemge7;

import java.util.*;
/**
 *
 * @author shuhei
 */
 public class Dealer extends Human{
    ArrayList <Integer> cards=new ArrayList<>();
    
    // コンストラクタ初期化処理
    public Dealer() {
        for(int i=0;i<4;i++){
            for (int k=1;k<14; k++){
                if (k>10){
                    cards.add(10);
                } else {
                    cards.add(k);
                }
            }
        }
        Collections.shuffle(cards);
    }
    // dealという公開メソッドを用意し、
    //cardsからランダムで2枚のカードをArrayListにして返却。
    public ArrayList deal()  {
        ArrayList <Integer> shoki=new ArrayList<>();
        shoki.add(cards.get(0));
        shoki.add(cards.get(1));
        cards.remove(0);
        cards.remove(0);
        return shoki;
        
    }
    //hitという公開メソッドを用意し、cardsからランダムで
    //1枚のカードをArrayListにして返却してください。
    public ArrayList hit()  {
        ArrayList <Integer> tuika=new ArrayList<>();
        tuika.add(cards.get(0));
        cards.remove(0);
        return tuika;
        
    }
    //setCardは、ArrayListで受けたカード情報を
    //myCardsに追加するように実装してください。
    @Override
    public void setCard(ArrayList al){
    myCard.addAll(al);
    }
    
    //checkSumは、myCardsを確認し、まだカードが必要ならtrue、
    //必要無ければfalseを返却するように実装してください。
    @Override
    public boolean checkSum(){
        int goke=open();
        if(goke>=17){
            return false;
        }else{
            return true;
        }
    }
    
    
    //openは、myCardsのカードの合計値を返却するように実装してください。
    
    @Override
    public int open(){
        int goke=0;
        for(int i=0;i<myCard.size();i++){
            goke +=myCard.get(i);
        }
    return goke;
    }
    
    }

