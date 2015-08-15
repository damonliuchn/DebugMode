package net.masonliu.debugmode.library;

import android.app.Activity;
import android.os.Bundle;


public class StageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (DebugModeManager.getInstance().getCallBack() != null) {
            DebugModeManager.getInstance().getCallBack().setStageEnv(this);
            DebugModeManager.getInstance().getCallBack().onNext(this);
        }
        finish();
    }
}
