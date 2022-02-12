package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Alien groku = new Alien();
//        groku.setaId(101);
        groku.setaColor("Green");
        groku.setaName("Groku");

        Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class);

        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();
        session.save(groku);
        tx.commit();

    }

}
