package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static Session session;

	static {
		// �������ö���
		Configuration config = new Configuration().configure();
		// ��������ע�����
		ServiceRegistry serverRegistry = new ServiceRegistryBuilder()
				.applySettings(config.getProperties()).buildServiceRegistry();
		// �����Ự����
		sessionFactory = config.buildSessionFactory(serverRegistry);
	}

	//��ȡSessionFactory����
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	//��ȡSession����
	public static Session getSession() {
		// �����Ự����
		if(session==null)
		session = sessionFactory.openSession();
		return session;
	}
	
	//�ر�Session
	public static void closeSession(Session session){
		if(session!=null)
			session.close();
	}
}
