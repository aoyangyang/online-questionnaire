package com.looc.onlinequestionnaire.dao;


import com.looc.onlinequestionnaire.bean.Questionnaires;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

/**
 * @author chenPeng
 * @version 1.0.0
 * @ClassName QuestionnairesDao.java
 * @Description TODO 问卷
 * @createTime 2019年06月23日 11:39:00
 */
public interface QuestionnairesDao  extends JpaRepository<Questionnaires,Integer>, JpaSpecificationExecutor<Questionnaires> {
    @Query(value = "select q.* from questionnaires q where q.id=?1 and q.delete_token=0",nativeQuery = true)
    Questionnaires getQu(Integer id);
}
