package net.masonliu.debugmode.example;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import net.masonliu.debugmode.library.DebugModeManager;

/**
 * Created by liumeng on 8/15/15.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DebugModeManager.getInstance().setCallBack(new DebugModeManager.CallBack() {
            @Override
            public void setStageEnv(Context context) {
                Toast.makeText(context, "预发布环境", Toast.LENGTH_LONG).show();
            }

            @Override
            public void setTestEnv(Context context) {
                Toast.makeText(context, "测试环境", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNext(Context context) {
                Intent intent = new Intent(context, MainActivity.class);
                context.startActivity(intent);
            }
        });
    }
}
