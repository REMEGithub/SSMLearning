package com.xia.dao;

import com.xia.pojo.Blog;
import com.xia.utils.IDutils;
import com.xia.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class BlogTest {
    @Test
    public void addBlog() {
        SqlSession session = MyBatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Blog blog = new Blog(IDutils.getId().substring(0, 20), "test2", "admin", new Date(), 991);
        mapper.addBlog(blog);
        /*List<Blog> BlogList=mapper.queryBlogIF();
        for (Blog blog : BlogList) {
            System.out.println(blog.toString());
        }*/
        session.commit();
        session.close();
    }

    @Test
    public void queryBlogIF() {
        SqlSession session = MyBatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title", "test");
        List<Blog> blogs = mapper.queryBlogIF(map);
        for (Blog blog : blogs) {
            System.out.println(blog.getAuthor() + " " + blog.getId());
        }
        session.close();
    }

    @Test
    public void queryBlogChoose(){
        SqlSession session = MyBatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("views", 222);
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog.getAuthor() + " " + blog.getId());
        }
        session.close();
    }
}