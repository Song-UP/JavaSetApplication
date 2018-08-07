package song.com.mvpdesign_lib.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.OnClick;
import song.com.mvpdesign_lib.R;
import song.com.mvpdesign_lib.presenter.LoginPresenterCompl;

/**
 * Created by Administrator on 2018/8/6.
 */

public class LoginActivity extends AppCompatActivity implements ILoginView {

    @BindView(R.id.et_name) EditText et_name;
    @BindView(R.id.et_name) EditText et_password;
    @BindView(R.id.et_name) Button btn_login;
    @BindView(R.id.btn_clear) Button btn_clear;
    LoginPresenterCompl loginPresenterCompl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginPresenterCompl = new LoginPresenterCompl(this);
    }

    @Override
    public void onClickText() {
        et_name.setText("");
        et_password.setText("");


    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public void onLoginResult(Boolean result, int code) {
        if (result){
            Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "登录失败", Toast.LENGTH_SHORT).show();
        }
    }

    @OnClick(R.id.et_name)
    public void onClcik(View v){
        String name = et_name.getText().toString();
        String passwor = et_password.getText().toString();
        switch (v.getId()){
            case R.id.btn_login:
                loginPresenterCompl.doLogin(name, passwor);
                break;
            case R.id.btn_clear:
                loginPresenterCompl.clear();
                break;
        }
    }

    @Override
    protected void onDestroy() {
        this.loginPresenterCompl.setLoginView(null);
        super.onDestroy();
    }
}
