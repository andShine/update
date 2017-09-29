package com.andshine.demo.update;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.andshine.update.library.IUpdateParser;
import com.andshine.update.library.UpdateInfo;
import com.andshine.update.library.UpdateManager;

public class MainActivity extends AppCompatActivity {

    private static String URL = "检查更新地址（自行替换）";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkUpdate();
    }

    private void checkUpdate() {
        UpdateManager.create(this)
                .setUrl(URL)
                .setManual(true)
                .setNotifyId(998)
                .setWifiOnly(false)
                .setParser(new IUpdateParser() {
                    @Override
                    public UpdateInfo parse(String source) throws Exception {
                        UpdateInfo info = new UpdateInfo();
                        // 可自动解析source,可参考：https://github.com/czy1121/update
                        // 目前仅，跳过md5验证
                        info.hasUpdate = true;
                        info.url = "此处填apk下载地址";
                        info.versionCode = 20170831;
                        info.versionName = "1.5.0";
                        info.size = 2391601;
                        info.updateContent = "新增***";
                        info.md5 = "fasdfhkasdh";
                        info.isSilent = false;
                        return info;
                    }
                })
                .check();
    }

}
