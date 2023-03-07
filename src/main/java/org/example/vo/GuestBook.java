package org.example.vo;

public class GuestBook {
    private Long guestbook_id;
    private String contents;
    private String username;
    private String password;
    private String created_time;

    public Long getGuestbook_id() {
        return guestbook_id;
    }

    public void setGuestbook_id(Long guestbook_id) {
        this.guestbook_id = guestbook_id;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    @Override
    public String toString() {
        return "GuestBook{" +
                "guestbook_id=" + guestbook_id +
                ", contents='" + contents + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", created_time='" + created_time + '\'' +
                '}';
    }
}
