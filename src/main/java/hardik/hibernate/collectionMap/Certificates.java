package hardik.hibernate.collectionMap;

/**
 * Created by HARDIK on 15-06-2017.
 */
public class Certificates {

    public Certificates(){}

    public Certificates(int certNo,String certName) {
        this.certName = certName; this.certNo=certNo;
    }

    private int certNo;
    private int cobID;
    private String certName;

    public int getCertNo() {
        return certNo;
    }

    public void setCertNo(int certNo) {
        this.certNo = certNo;
    }

    public int getCobID() {
        return cobID;
    }

    public void setCobID(int cobID) {
        this.cobID = cobID;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if(!(obj instanceof Certificates)) return false;

        Certificates otherCer = (Certificates) obj;
        if(this.cobID !=otherCer.cobID) return false;
        //if (this.certName.equals(otherCer.certName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int tmp = 0;
        tmp = (cobID +certName).hashCode();
        return tmp;
    }
}
