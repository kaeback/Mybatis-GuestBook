package org.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.example.config.MybatisConfig;
import org.example.vo.GuestBook;

import java.util.List;

public class GuestBookDao {
    private SqlSessionFactory sqlSessionFactory = MybatisConfig.getSqlSessionFactory();

    // 방명록 등록
    public void saveGuestBook(GuestBook guestbook) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            GuestBookMapper mapper = sqlSession.getMapper(GuestBookMapper.class);
            mapper.saveGuestBook(guestbook);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 방명록 전체 목록
    public List<GuestBook> findAllGuestBooks() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            GuestBookMapper mapper = sqlSession.getMapper(GuestBookMapper.class);
            return mapper.findAllGuestBooks();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // 방명록 읽기
    public GuestBook findGuestBook(Long guestbook_id) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            GuestBookMapper mapper = sqlSession.getMapper(GuestBookMapper.class);
            return mapper.findGuestBook(guestbook_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // 방명록 수정
    public void updateGuestBook(GuestBook guestBook) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            GuestBookMapper mapper = sqlSession.getMapper(GuestBookMapper.class);
            mapper.updateGuestBook(guestBook);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 방명록 삭제
    public void removeGuestBook(Long guestbook_id) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            GuestBookMapper mapper = sqlSession.getMapper(GuestBookMapper.class);
            mapper.removeGuestBook(guestbook_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
