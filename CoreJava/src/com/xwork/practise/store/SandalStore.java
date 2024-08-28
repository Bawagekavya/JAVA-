package com.xwork.practise.store;

import com.xwork.practise.data.Sandal;

public class SandalStore {

    Sandal [] datas = new Sandal[5];
    int index=0;

    public void save(Sandal data)
    {
        this.datas[this.index]=data;
        this.index++;
    }

    public void display()
    {
        for(Sandal ref : datas)
        {
            if(ref!=null)
            {
                ref.show();
            }
            else{
                System.out.println("ref is null");
            }
        }
    }
}
