package como.laioffer.eventcity;

/**
 * Created by jiahechang on 6/20/17.
 */

public class Event {

    /*/**
     * All data for a event.
     */

//    private String description;
//

//
//    /**
//     * Getters for private attributes of Event class.
//     */
//
//
//    public String getDescription() {
//        return this.description;
//    }
    private String title;
    private String address;
    private int good2;
    private int good;
    private int bad;
    private int commentNumber;
    private String id;
    private String location;
    private long time;
    private String username;
    private String description;
    private int repost;
    private String imgUri = "";

    /**
     * Constructor
     */
    public Event() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBad() {
        return bad;
    }

    public void setBad(int bad) {
        this.bad = bad;
    }

    public int getGood() {
        return good;
    }
    public void setGood(int good) {
        this.good = good;
    }


    public int getGood2() {return good2;};
    public void setGood2(int good2) {this.good2 = good2;}


    public String getTitle() {
        return this.title;
    }

    public String getAddress() {
        return this.address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUser() {
        return username;
    }

    public void setUser(String username) {
        this.username = username;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
    public String getLocation() { return location; }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(int commentNumber) {
        this.commentNumber = commentNumber;
    }

    public void setTitle(String title) {this.title = title;}

    public void setAddress(String address) {this.address = address;}

    public int getRepost() {
        return repost;
    }

    public void setRepost(int repost) {
        this.repost = repost;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }


}


