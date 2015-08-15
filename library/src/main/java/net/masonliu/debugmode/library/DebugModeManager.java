package net.masonliu.debugmode.library;

import android.content.Context;

/**
 * Created by liumeng on 8/3/15.
 */
public class DebugModeManager {

    private volatile static DebugModeManager _instance;

    private DebugModeManager() {

    }

    public static DebugModeManager getInstance() {
        if (_instance == null) {
            synchronized (DebugModeManager.class) {
                if (_instance == null) {
                    _instance = new DebugModeManager();
                }
            }
        }
        return _instance;
    }

    public interface CallBack {
        void setStageEnv(Context context);

        void setTestEnv(Context context);

        void onNext(Context context);
    }

    private CallBack callBack;

    public void setCallBack(CallBack callBack) {
        this.callBack = callBack;
    }

    public CallBack getCallBack() {
        return callBack;
    }
}
