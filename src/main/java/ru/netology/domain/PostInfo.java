package ru.netology.domain;

public class PostInfo {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private HeaderPostTab headerPostTab;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String postAuthor;
    private int postDate;
    private MenuWrap menuWrap;
    private String postText;
    private String postImgUrl;
    private String copyright;
    private FooterCountButton footerCountButton;
    private ButtonLike buttonLike;
    private ButtonComment buttonComment;
    private ButtonShare buttonShare;
    private PostReplies postReplies;
    private PostSource postSource;
    private Geo geo;
    private String postType;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public HeaderPostTab getHeaderPostTab() {
        return headerPostTab;
    }

    public void setHeaderPostTab(HeaderPostTab headerPostTab) {
        this.headerPostTab = headerPostTab;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
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

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
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

    public PostSource getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

}

