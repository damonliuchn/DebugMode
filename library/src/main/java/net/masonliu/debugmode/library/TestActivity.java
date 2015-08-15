package net.masonliu.debugmode.library;

import android.app.Activity;
import android.os.Bundle;

public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (DebugModeManager.getInstance().getCallBack() != null) {
            DebugModeManager.getInstance().getCallBack().setTestEnv(this);
            DebugModeManager.getInstance().getCallBack().onNext(this);
        }
        finish();
    }
}
