# test4
实验四
截图如下：

![在这里插入图片描述](https://img-blog.csdnimg.cn/2019042116453586.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2tpbmdhZXRoZWxiYWxk,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190421164551262.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2tpbmdhZXRoZWxiYWxk,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190421164604610.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2tpbmdhZXRoZWxiYWxk,size_16,color_FFFFFF,t_70)

![在这里插入图片描述](https://img-blog.csdnimg.cn/20190421164613268.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2tpbmdhZXRoZWxiYWxk,size_16,color_FFFFFF,t_70)



![在这里插入图片描述](https://img-blog.csdnimg.cn/20190421164630732.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2tpbmdhZXRoZWxiYWxk,size_16,color_FFFFFF,t_70)

代码如下：
```
package com.example.a26081.a3;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);


        getFragmentManager().beginTransaction().add(android.R.id.content, new fragment()).commit();

    }

}
```
```

package com.example.a26081.a3;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import java.util.prefs.PreferencesFactory;

public class fragment extends PreferenceFragment {

    @Override

    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preference);

    }

}
```
```

<?xml version="1.0" encoding="utf-8"?>

<PreferenceScreen xmlns:android="http://schemas.android.com/apk/res/android">

    <PreferenceCategory android:title="ln-line preference">

        <CheckBoxPreference

            android:summary="this is a checkbox"

            android:title="CheckBox Preference"

            android:key="checkBox"

            >

        </CheckBoxPreference>

    </PreferenceCategory>

    <PreferenceCategory android:title="Dialog-based preferences">

        <EditTextPreference

            android:dialogTitle="Enter your favorite animal"

            android:summary="An example that uses an edit text dialog"

            android:title="Edit text preference"

            android:key="editText"

            >

        </EditTextPreference>

        <ListPreference

            android:summary="An example that uses a list dialog"

            android:title="List preference"

            android:key="list"

            android:dialogTitle="Choose one"

            android:entries="@array/list"

            android:entryValues="@array/list">

        </ListPreference>

    </PreferenceCategory>

    <PreferenceCategory android:title="Launch preference">

        <PreferenceScreen

            android:summary="Shows another screen of preference"

            android:key="screen"

            android:title="Screen Preference"

            >

            <CheckBoxPreference

                android:key="another_checkBox"

                android:title="Toggle Preference"

                android:summary="Preference that is on the next screen but same hierarchy"

                >

            </CheckBoxPreference>

        </PreferenceScreen>

        <PreferenceScreen

            android:title="Intent preference"

            android:summary="Launches an Activity from an Intent">

            <intent

                android:action="android.intent.action.VIEW"

                android:data="https://www.gogle.com">


            </intent>

        </PreferenceScreen>

    </PreferenceCategory>

    <PreferenceCategory android:title="Preference attributes">

        <CheckBoxPreference

            android:key="parent_checkBox"

            android:title="Parent checkBox preference"

            android:summary="This is visually a parent">


        </CheckBoxPreference>

        <CheckBoxPreference

            android:dependency="parent_checkBox"

            android:key="child_checkBox"

            android:title="Child checkBox preference"

            android:summary="This is visually a child">


        </CheckBoxPreference>

    </PreferenceCategory>

</PreferenceScreen>
```

