package com.xwork.practise.store;

import com.xwork.practise.data.Market;

public class MarketStore {

    Market[] datas = new Market[5];
    int index=0;

    public void save(Market data)
    {
        this.datas[this.index]=data;
        this.index++;
    }

    public void display()
    {
        for(Market ref : datas)
        {
            if(ref!=null)
            {
                ref.show();
            }else
            {
                System.out.println("ref is null");
            }
        }
    }
}
