package org.hetao.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class mybatisUtil {
    static SqlSessionFactory sqlSessionFactory=null;
    static ThreadLocal<SqlSession> threadLocal=null;
    static {
        String config="mybatis-config.xml";
        try {
            InputStream inputStream= Resources.getResourceAsStream(config);
            sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
         threadLocal=new ThreadLocal<SqlSession>();

    }
    public  static SqlSession getSqlsession()
    {
        SqlSession session=null;
        session=threadLocal.get();
        if(session==null)
        {
            session=sqlSessionFactory.openSession();
            threadLocal.set(session);
        }
        return session;
    }
    public  static void  close(SqlSession session)
    {
        if(session!=null)
        {
            session.close();
            threadLocal.remove();
        }
    }
}
