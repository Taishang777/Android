package com.taishang.dtjm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout title;
    private LayoutInflater inflater;
    private LinearLayout layouTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化组件
        initView();
    }

    private void initView() {
        title = findViewById(R.id.title);
        inflater = this.getLayoutInflater();
        layouTitle = (LinearLayout) inflater.inflate(R.layout.title, null);

        findViewById(R.id.shujia).setOnClickListener(this);
        findViewById(R.id.shucheng).setOnClickListener(this);
        findViewById(R.id.geren).setOnClickListener(this);
    }

    /**
     * 点击事件处理
     * @param v
     */
    @Override
    public void onClick(View v) {
        // 获取头部资源
        layouTitle = (LinearLayout) inflater.inflate(R.layout.title, null);

        switch (v.getId()) {
            // 加载书架
            case R.id.shujia:
                jz_ShuJia();
                break;
            // 加载书城
            case R.id.shucheng:
                jz_ShuCheng();
                break;
            // 加载个人中心
            case R.id.geren:
                jz_GeRen();
                break;
            default:
                break;
        }
    }

    /**
     * 初始化书架
     */
    private void jz_ShuJia() {
        // 加载书架头部
        title.removeAllViews();
        layouTitle.removeViews(1,2);
        title.addView(layouTitle);
    }

    /**
     * 初始化书城
     */
    private void jz_ShuCheng() {
        // 加载书城头部
        title.removeAllViews();
        layouTitle.removeViewAt(0);
        layouTitle.removeViewAt(1);
        title.addView(layouTitle);
    }

    /**
     * 初始化个人中心
     */
    private void jz_GeRen() {
        // 加载个人中心头部
        title.removeAllViews();
        layouTitle.removeViews(0, 2);
        title.addView(layouTitle);
    }
}
