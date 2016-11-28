/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challemge7;

import java.util.ArrayList;

/**
 *
 * @author shuhei
 */
public class User extends Human{
    
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
