import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.books.dao.BooksMapper;
import com.books.model.Books;
import com.books.services.BooksService;
import com.books.services.impl.BooksServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * 测试类
 */
public class MapperTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testAdd() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BooksMapper mapper = sqlSession.getMapper(BooksMapper.class);
        Books books = new Books();
        books.setBookAuthor("li");
        books.setBookDiscount(2.8f);
        mapper.insert(books);
        sqlSession.commit();
    }

    @Test
    public void testGet() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BooksMapper mapper = sqlSession.getMapper(BooksMapper.class);

        Books books = mapper.selectByPrimaryKey(1);
        System.out.println(books);

    }

    @Test
    public void testSelectByPriceDesc() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BooksMapper mapper = sqlSession.getMapper(BooksMapper.class);
        List<Books> books = mapper.selectByPriceDesc();
        books.forEach(obj -> System.out.println(obj));
    }

    @Test
    public void testImpl() {
        BooksService booksService = new BooksServiceImpl();
        List<Books> books = booksService.selectByPriceDESC();
        String s = JSON.toJSONString(books);
        System.out.println(s);
    }

}
