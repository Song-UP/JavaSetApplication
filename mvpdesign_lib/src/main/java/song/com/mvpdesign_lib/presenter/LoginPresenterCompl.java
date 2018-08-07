package song.com.mvpdesign_lib.presenter;

import song.com.mvpdesign_lib.been.User;
import song.com.mvpdesign_lib.view.ILoginView;

/**
 * Created by Administrator on 2018/8/6.
 */

public class LoginPresenterCompl implements ILoginPresenter {
    private ILoginView loginView;
    private User user;

    public void setLoginView(ILoginView loginView) {
        this.loginView = loginView;
    }

    public LoginPresenterCompl(ILoginView loginView) {
        this.loginView = loginView;
        user = new User("张三", "123456");
    }

    @Override
    public void clear() {
        loginView.onClickText();

    }

    @Override
    public void doLogin(String name, String password) {
        boolean result = false;
        int code = 0;
        if (name.equals(user.getAdmin()) && password.equals(user.getPassword())){
            result = true;
            code = 1;
        }else {
            result = false;
            code = 1;
        }
        loginView.onLoginResult(result, code);

    }
}
