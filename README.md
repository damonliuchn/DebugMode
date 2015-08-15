# DebugMode

DebugMode is a library for android developer switch various API environment like testing or staging.

<img src="https://github.com/MasonLiuChn/DebugMode/raw/master/app/doc/1.png"  width="320" height="500"/>

#Usage: 
1. Add callback in your Application
```java
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DebugModeManager.getInstance().setCallBack(new DebugModeManager.CallBack() {
            @Override
            public void setStageEnv(Context context) {
                Toast.makeText(context, "在这里配置预发布环境", Toast.LENGTH_LONG).show();
            }

            @Override
            public void setTestEnv(Context context) {
                Toast.makeText(context, "在这里配置测试环境", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNext(Context context) {
                Intent intent = new Intent(context, MainActivity.class);
                context.startActivity(intent);
            }
        });
    }
}
```
2. import library in gradle，releaseCompile use the debugmode-library-null library so that Code does not increase in your released apk.

```java
repositories {
    maven {
        url "https://github.com/MasonLiuChn/MasonMavenRepository/raw/maven/releases"
    }
}
dependencies {
    debugCompile 'net.masonliu:debugmode-library:1.0.0'
    releaseCompile 'net.masonliu:debugmode-library-null:1.0.0'
}
```


-----
Blog:http://blog.csdn.net/masonblog

Email:MasonLiuChn@gmail.com

##License

    Copyright (c) 2015 Mason Liu

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
    Come on, don't tell me you read that.
