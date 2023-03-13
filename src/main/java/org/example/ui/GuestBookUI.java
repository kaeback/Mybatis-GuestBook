package org.example.ui;

import org.example.manager.GuestBookManager;
import org.example.vo.GuestBook;

import java.util.List;
import java.util.Scanner;

public class GuestBookUI {
    private Scanner scanner = new Scanner(System.in);
    private GuestBookManager manager = new GuestBookManager();

    public GuestBookUI() {
        while (true) {
            mainMenu();
            String input = scanner.nextLine();
            switch (input) {
                case "1": addGuestBook(); break;
                case "2": addGuestBook(); break;
                case "3": addGuestBook(); break;
                case "4": addGuestBook(); break;
                case "5": addGuestBook(); break;
                default: System.out.println("다시 선택해 주세요");
            }
        }
    }

    // 메인 매뉴
    public void mainMenu() {
        System.out.println("1. 방명록 등록");
        System.out.println("2. 방명록 검색");
        System.out.println("3. 방명록 수정");
        System.out.println("4. 방명록 삭제");
        System.out.println("5. 방명록 전체출력");
        System.out.print("선택> ");
    }

    // 방명록 등록
    public void addGuestBook() {
        System.out.print("방명록 내용: ");
        String contents = scanner.nextLine();
        System.out.print("작성자: ");
        String username = scanner.nextLine();
        System.out.print("패스워드: ");
        String password = scanner.nextLine();
        GuestBook guestBook = new GuestBook(contents, username, password);
        manager.saveGuestBook(guestBook);
        System.out.println("방명록을 등록했습니다.");
    }

    // 방명록 수정
    public void updateGuestBook() {
        System.out.println("수정할 방명록 번호: ");
        Long guestbook_id = scanner.nextLong();
        GuestBook guestBook = manager.findGuestBook(guestbook_id);
        if (guestBook != null) {
            System.out.print("수정할 내용: ");
            String contents = scanner.nextLine();
            guestBook.setContents(contents);
            manager.updateGuestBook(guestBook);
            System.out.println("방명록을 수정했습니다.");
        } else {
            System.out.println("수정할 방명록이 없습니다.");
        }
    }

    // 방명록 삭제
    public void removeGuestBook() {
        System.out.print("삭제할 방명록 번호: ");
        Long guestbook_id = scanner.nextLong();
        GuestBook guestBook = manager.findGuestBook(guestbook_id);
        if (guestBook != null) {
            manager.removeGuestBook(guestbook_id);
        } else {
            System.out.println("삭제할 방명록이 없습니다.");
        }
    }

    // 방명록 전체 보기
    public void showAllGuestBooks() {
        List<GuestBook> guestBooks = manager.findAllGuestBooks();
        for (GuestBook guestBook : guestBooks) {
            System.out.println(guestBooks);
        }
    }
}
