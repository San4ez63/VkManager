package ru.netology.domain;

public class PostInfo {
    private int id;
    private HeaderPostTab headerPostTab;
    private String postAuthor;
    private int postDate;
    private MenuWrap menuWrap;
    private String postText;
    private String postImgUrl;
    private FooterCountButton footerCountButton;
    private ButtonLike buttonLike;
    private ButtonComment buttonComment;
    private ButtonShare buttonShare;
    private PostReplies postReplies;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HeaderPostTab getHeaderPostTab() {
        return headerPostTab;
    }

    public void setHeaderPostTab(HeaderPostTab headerPostTab) {
        this.headerPostTab = headerPostTab;
    }

    public String getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor;
    }

    public int getPostDate() {
        return postDate;
    }

    public void setPostDate(int postDate) {
        this.postDate = postDate;
    }

    public MenuWrap getMenuWrap() {
        return menuWrap;
    }

    public void setMenuWrap(MenuWrap menuWrap) {
        this.menuWrap = menuWrap;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getPostImgUrl() {
        return postImgUrl;
    }

    public void setPostImgUrl(String postImgUrl) {
        this.postImgUrl = postImgUrl;
    }

    public FooterCountButton getFooterCountButton() {
        return footerCountButton;
    }

    public void setFooterCountButton(FooterCountButton footerCountButton) {
        this.footerCountButton = footerCountButton;
    }

    public ButtonLike getButtonLike() {
        return buttonLike;
    }

    public void setButtonLike(ButtonLike buttonLike) {
        this.buttonLike = buttonLike;
    }

    public ButtonComment getButtonComment() {
        return buttonComment;
    }

    public void setButtonComment(ButtonComment buttonComment) {
        this.buttonComment = buttonComment;
    }

    public ButtonShare getButtonShare() {
        return buttonShare;
    }

    public void setButtonShare(ButtonShare buttonShare) {
        this.buttonShare = buttonShare;
    }

    public PostReplies getPostReplies() {
        return postReplies;
    }

    public void setPostReplies(PostReplies postReplies) {
        this.postReplies = postReplies;
    }
}

