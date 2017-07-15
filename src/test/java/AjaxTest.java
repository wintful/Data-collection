import com.books.dao.BooksMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * Created by Admin on 2017/7/11.
 */
public class AjaxTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void responseJson() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BooksMapper booksMapper = sqlSession.getMapper(BooksMapper.class);
        System.out.println(booksMapper.selectByPrimaryKey(1));
    }

}
