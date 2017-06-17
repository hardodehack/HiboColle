package hardik.hibernate.collectionMap;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by HARDIK on 15-06-2017.
 */
public class Cobrands {

    public Cobrands(){};

    public Cobrands(String cobName,String cobEnv, Set certificates) {
        this.cobName = cobName;
        this.cobEnv = cobEnv;
        this.certificates = certificates;
    }

    private String cobName;
    private int cobID;
    private String cobEnv;

    public void setCobID(int cobID) {
        this.cobID = cobID;
    }

    public String getCobName() {
        return cobName;
    }

    public void setCobName(String cobName) {
        this.cobName = cobName;
    }

    private Set certificates = new HashSet();

    public int getCobID() {
        return cobID;
    }

    public String getCobEnv() {
        return cobEnv;
    }

    public void setCobEnv(String cobEnv) {
        this.cobEnv = cobEnv;
    }

    public Set getCertificates() {
        return certificates;
    }

    public void setCertificates(Set set) {
        this.certificates = set;
    }
}
