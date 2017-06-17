package hardik.hibernate.collectionMap;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;

/**
 * Created by HARDIK on 16-06-2017.
 */
public class ManageCobrands {

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.addResource("CobrandsSet.hbm.xml").buildSessionFactory();

        Session session = sessionFactory.openSession();

             Transaction transaction = null;

            try {
                transaction = session.beginTransaction();
                HashSet set1 = new HashSet();
                set1.add(new Certificates(2222222,"SOAP_Certificate"));
                set1.add(new Certificates(443222222,"REST_Certificate"));
                set1.add(new Certificates(337222222,"FL2_Certificate"));

                Cobrands cob2 = new Cobrands();
                cob2.setCobID(100499999);
                cob2.setCobEnv("Stage");
                cob2.setCobName("Fidelity");
                cob2.setCertificates(set1);

                session.save(cob2);
                transaction.commit();
            }catch (HibernateException hb) {
                transaction.rollback();
                hb.printStackTrace();
            }
            finally {
                session.close();
            }

    }

}
