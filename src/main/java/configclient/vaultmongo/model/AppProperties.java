package configclient.vaultmongo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppProperties {

    @Value("${db-uname}")
    private String userName;

    @Value("${db-pw}")
    private String password;

    @Value("${db-host}")
    private String url;

    @Value("${db-threadPool}")
    private int treadPool;

    public AppProperties() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getTreadPool() {
        return treadPool;
    }

    public void setTreadPool(int treadPool) {
        this.treadPool = treadPool;
    }

    @Override
    public String toString() {
        return "AppProperties{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                ", treadPool=" + treadPool +
                '}';
    }
}
