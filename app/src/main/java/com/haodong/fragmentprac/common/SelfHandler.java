package com.haodong.fragmentprac.common;

import android.os.Handler;
import android.os.Message;

import com.haodong.fragmentprac.listener.HandlerContainer;

import java.lang.ref.WeakReference;

/**
 * @author linghailong
 * @date on 2018/11/5
 * @email 105354999@qq.com
 * @describe :
 */
public class SelfHandler<T extends Handler> extends Handler {
    protected WeakReference<T>mRef;

    public SelfHandler(WeakReference<T> mRef) {
        this.mRef = mRef;
    }

    public SelfHandler(T obj) {
        this.mRef=new WeakReference<>(obj);
    }
    public T getContainer() {
        return mRef.get();
    }

    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        HandlerContainer container= (HandlerContainer) getContainer();
        if (container!=null){
            container.handleMessage(msg);
        }

    }
}
