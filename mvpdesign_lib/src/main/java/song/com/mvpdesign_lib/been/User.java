package song.com.mvpdesign_lib.been;

/**
 * Created by Administrator on 2018/8/6.
 */

public class User {
    private String password;
    private String admin;

    public User(String password, String admin) {
        this.password = password;
        this.admin = admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }
}
