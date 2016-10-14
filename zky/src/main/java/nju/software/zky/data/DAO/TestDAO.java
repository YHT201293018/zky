package nju.software.zky.data.DAO;


import nju.software.zky.data.dataobject.Test;
import nju.software.zky.data.DAO.BaseDAO;

@SuppressWarnings(value = { "unchecked" })
public interface TestDAO extends BaseDAO<Test>{

	public Test getById(int id);
//	
//	public void save(Test test) {
//		log.debug("saving Test instance");
//		try{
//			getHibernateTemplate().save(test);
//			log.debug("save successful");
//		}catch (RuntimeException re){
//			log.error("save failed",re);
//			throw re;
//		}
//	}
//	public void delete(Test test){
//		log.debug("deleting Test instance");
//		try{
//			getHibernateTemplate().delete(test);
//			log.debug("delete succeful");
//		}catch (RuntimeException re){
//			log.error("delete faied",re);
//			throw re;
//		}
//	}
//	public Test findById(java.lang.Integer id){
//		log.debug("getting Test instance with id:");
//		try{
//			Test instance = (Test) getHibernateTemplate().get("nju.software.zky.data.dataobject.Test", id);
//			return instance;
//		}catch(RuntimeException re){
//			log.error("get failed",re);
//			throw re;
//		}
//	}
//	public List<Test> findByExample(Test instance){
//		log.debug("finding Test instance by example");
//		try {
//			List<Test> results = getHibernateTemplate()
//					.findByExample(instance);
//			log.debug("find by example successful, result size: "
//					+ results.size());
//			return results;
//		} catch (RuntimeException re) {
//			log.error("find by example failed", re);
//			throw re;
//		}
//	}
//	public List findByProperty(String propertyName, Object value) {
//		log.debug("finding Test instance with property: " + propertyName
//				+ ", value: " + value);
//		try {
//			String queryString = "from Test as model where model."
//					+ propertyName + "= ?";
//			return getHibernateTemplate().find(queryString, value);
//		} catch (RuntimeException re) {
//			log.error("find by property name failed", re);
//			throw re;
//		}
//	}
//	public List findAll() {
//		log.debug("finding all Test instances");
//		try {
//			String queryString = "from Test";
//			return getHibernateTemplate().find(queryString);
//		} catch (RuntimeException re) {
//			log.error("find all failed", re);
//			throw re;
//		}
//	}
//	
//	public Integer findMaxJyJbId() {
//		log.debug("finding Max JyJbId");
//		try {
//			String queryString = "SELECT MAX(jyid) FROM DzdaJyJbOld";
//
//			List list =  getHibernateTemplate().find(queryString);
//			int id;
//			if(list!=null && !list.isEmpty()) {
//				id=list.get(0)==null?0:(Integer)list.get(0);
//			} else {
//				id = 0;
//			}
//			return id;
//		} catch (RuntimeException re) {
//			log.error("find by property name failed", re);
//			throw re;
//		}
//	}
//	
//	public Test merge(Test detachedInstance) {
//		log.debug("merging Test instance");
//		try {
//			Test result = getHibernateTemplate().merge(
//					detachedInstance);
//			log.debug("merge successful");
//			return result;
//		} catch (RuntimeException re) {
//			log.error("merge failed", re);
//			throw re;
//		}
//	}
//
//	public void attachDirty(Test instance) {
//		log.debug("attaching dirty Test instance");
//		try {
//			getHibernateTemplate().saveOrUpdate(instance);
//			log.debug("attach successful");
//		} catch (RuntimeException re) {
//			log.error("attach failed", re);
//			throw re;
//		}
//	}
//
//	public void attachClean(Test instance) {
//		log.debug("attaching clean Test instance");
//		try {
//			getHibernateTemplate().lock(instance, LockMode.NONE);
//			log.debug("attach successful");
//		} catch (RuntimeException re) {
//			log.error("attach failed", re);
//			throw re;
//		}
//	}
//	
//	public int insert(Test po) throws Exception {
//		log.debug("saving DzdaJyJbOld instance");
//		try {
//			getHibernateTemplate().save(po);
//			getHibernateTemplate().flush();
//			log.debug("get Test po", po);
//			return po.getId();
//		} catch (Exception ex) {
//			log.error("Test po", po);
//			throw new RuntimeException(
//					"UnChecked Exception occur when creating record: "
//							+ ex.getMessage());
//		}
//	}
//	public Test getById(int id) {
//		// TODO Auto-generated method stub
//		return this.get(Test.class, id);
//	}
//	public void save1(Test test){
//		log.debug("saving Test instance");
//		try {
//			System.err.println("saving Test");
//			getHibernateTemplate().save(test);
//			log.debug("save successful");
//		} catch (RuntimeException re) {
//			log.error("save failed", re);
//			throw re;
//		}
//	}
}
