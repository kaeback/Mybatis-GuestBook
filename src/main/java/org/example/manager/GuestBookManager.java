package org.example.manager;

import org.example.dao.GuestBookDao;
import org.example.vo.GuestBook;

import java.util.List;

public class GuestBookManager {
    private GuestBookDao dao;

    // 방명록 등록
    public void saveGuestBook(GuestBook guestBook) {
        dao.saveGuestBook(guestBook);
    }

    // 방명록 읽기
    public GuestBook findGuestBook(Long guestbook_id) {
        return dao.findGuestBook(guestbook_id);
    }

    // 방명록 전체 목록
    public List<GuestBook> findAllGuestBooks() {
        return dao.findAllGuestBooks();
    }

    // 방명록 수정
    public void updateGuestBook(GuestBook guestBook) {
        dao.updateGuestBook(guestBook);
    }

    // 방명록 삭제
    public void removeGuestBook(Long guestbook_id) {
        dao.removeGuestBook(guestbook_id);
    }
}
