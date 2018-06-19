package vis.dvp.com.yxjtest.demo.view;

import android.os.Bundle;
import android.widget.TextView;

import com.wuxiaolong.androidmvpsample.common.mvp.view.MvpActivity;
import com.wuxiaolong.androidmvpsample.demo.module.MainModel;
import com.wuxiaolong.androidmvpsample.demo.presenter.MainPresenter;
import com.wuxiaolong.androidmvpsample.demo.view.MainView;

import vis.dvp.com.yxjtest.R;

public class MainActivity extends MvpActivity<MainPresenter> implements MainView {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        setCenterText("123");
    }
    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }


    @Override
    public void getDataSuccess(MainModel model, String type) {
        //接口成功回调
        dataSuccess(model);
    }

    @Override
    public void getDataFail(String msg) {
        toastShow("请求失败");

    }


    private void dataSuccess(MainModel model) {
      toastShow("请求成功");
    }
}
