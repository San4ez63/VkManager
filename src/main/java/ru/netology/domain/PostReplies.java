package ru.netology.domain;

public class PostReplies {
    private int idReplies;
    private int dateReplies;
    private String userName;
    private String textReplies;
    private int countLikeReplies;
    private String buttonComplain;
    private String linkReply;

    public int getIdReplies() {
        return idReplies;
    }

    public void setIdReplies(int idReplies) {
        this.idReplies = idReplies;
    }

    public int getDateReplies() {
        return dateReplies;
    }

    public void setDateReplies(int dateReplies) {
        this.dateReplies = dateReplies;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTextReplies() {
        return textReplies;
    }

    public void setTextReplies(String textReplies) {
        this.textReplies = textReplies;
    }

    public int getCountLikeReplies() {
        return countLikeReplies;
    }

    public void setCountLikeReplies(int countLikeReplies) {
        this.countLikeReplies = countLikeReplies;
    }

    public String getButtonComplain() {
        return buttonComplain;
    }

    public void setButtonComplain(String buttonComplain) {
        this.buttonComplain = buttonComplain;
    }

    public String getLinkReply() {
        return linkReply;
    }

    public void setLinkReply(String linkReply) {
        this.linkReply = linkReply;
    }
}
