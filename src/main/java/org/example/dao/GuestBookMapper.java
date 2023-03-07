package org.example.dao;

import org.example.vo.GuestBook;

import java.util.List;

public interface GuestBookMapper {
    // 방명록 등록
    void saveGuestBook(GuestBook guestBook);

    // 방명록 전체 목록
    List<GuestBook> findAllGuestBooks();

    // 방명록 읽기
    GuestBook findGuestBook(Long guestbook_id);

    // 방명록 수정
    void updateGuestBook(GuestBook guestBook);

    // 방명록 삭제
    void removeGuestBook(Long guestbook_id);
}
