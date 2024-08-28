package com.xwork.practise.store;

import com.xwork.practise.data.SideDish;

public class SideDishStore {

    SideDish[] datas = new SideDish[5];
    int index=0;

    public void save(SideDish data) {
        this.datas[this.index] = data;
        this.index++;
    }

    public void display()
    {
        for(SideDish ref : datas)
        {
            if(ref!=null){
                ref.show();

            }else
            {
                System.out.println("ref is null");
            }
        }
    }


}
