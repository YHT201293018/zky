package nju.software.zky.data.DAO;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@SuppressWarnings("all")
public interface BaseDAO<T> {

	/**��������
	 * @param o
	 * @return
	 */
	public Serializable save(T o);
	
	/**��ȡ���ID
	 *@author vigor_warne
	 *@create_date 2016��1��16��
	 * @param hql
	 * @return
	 */
	public Integer getMaxID(String hql);
	
	/**ɾ������
	 * @param o
	 * @return
	 */
	public boolean delete(T o);
	
	/**���¶���
	 * @param o
	 * @return
	 */
	public boolean update(T o);
	
	/**�޲β�ѯ����
	 * @param hql
	 * @return
	 */
	public List<T> find(String hql);
	
	/**���β�ѯ����
	 * @param hql
	 * @param param
	 * @return
	 */
	public List<T> find(String hql, Object[] param);

	public List<T> find(String hql, List<Object> param);
	
	public List<T> find(String hql, Object[] param, Integer page, Integer rows);

	public List<T> find(String hql, List<Object> param, Integer page, Integer rows);

	public T get(Class<T> c, Serializable id);

	public T get(String hql, Object[] param);

	public T get(String hql, List<Object> param);

	public Long count(String hql);

	public Long count(String hql, Object[] param);

	public Long count(String hql, List<Object> param);
	
	public List<String> findString(String hql,Object[] param);
	
	public List<Integer> findInteger(String hql,Object[] param);
	
	public List<Object[]> countGroupBy(String hql, Object[] param);
	
	public List<Object[]> countGroupBy(String hql, List<Object> param);
}
