//
//import org.hibernate.SessionFactory
//import javax.persistence.EntityManagerFactory
//
//import javax.persistence.PersistenceUnit
//
//
//class SomeHibernateRepository {
//    @PersistenceUnit
//    private val emf: EntityManagerFactory? = null
//    protected val sessionFactory: SessionFactory
//        protected get() = emf!!.unwrap(SessionFactory::class.java)
//}