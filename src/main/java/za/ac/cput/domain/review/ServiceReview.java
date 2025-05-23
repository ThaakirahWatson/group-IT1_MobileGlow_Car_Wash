package za.ac.cput.domain.review;

/* MobileGlow Car Wash
   Service Review
   Author: Inga Zekani (221043756)
 */

import java.util.Date;

public class ServiceReview {

    private String reviewID;
    private int rating;
    private String comments;
    private Date reviewDate;

    //default constructor
    public ServiceReview(){

    }

    public ServiceReview(Builder builder){
        this.reviewID = builder.reviewID;
        this.rating = builder.rating;
        this.comments = builder.comments;
        this.reviewDate = builder.reviewDate;

    }

    public String getReviewID() {
        return reviewID;
    }
    public int getRating() {
        return rating;
    }
    public String getComments() {
        return comments;
    }
    public Date getReviewDate() {
        return reviewDate;
    }

    @Override
    public String toString() {
        return "ServiceReview{" +
                "reviewID='" + reviewID + '\'' +
                ", rating=" + rating +
                ", comments='" + comments + '\'' +
                ", reviewDate='" + reviewDate + '\'' +
                '}';
    }

    public static class Builder{
        private String reviewID;
        private int rating;
        private String comments;
        private Date reviewDate;

        public void setReviewID(String reviewID) {
            this.reviewID = reviewID;
        }
        public void setRating(int rating) {
            this.rating = rating;
        }
        public void setComments(String comments) {
            this.comments = comments;
        }
        public void setReviewDate(Date reviewDate) {
            this.reviewDate = reviewDate;
        }
        public Builder copy(ServiceReview review){
            this.reviewID = review.reviewID;
            this.rating = review.rating;
            this.comments = review.comments;
            this.reviewDate = review.reviewDate;
            return this;
        }
        public ServiceReview build(){
            return new ServiceReview(this);
        }
    }
}
