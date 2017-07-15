package com.books.model;

import java.math.BigDecimal;
import java.util.Date;

public class Books {
    private Integer bookId;

    private String bookName;

    private String bookImage;

    private String bookSynopsis;

    private BigDecimal bookPrice;

    private BigDecimal bookOriginalPrice;

    private Float bookDiscount;

    private String bookAuthor;

    private Date bookTime;

    private String bookPress;

    private String bookDescription;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage == null ? null : bookImage.trim();
    }

    public String getBookSynopsis() {
        return bookSynopsis;
    }

    public void setBookSynopsis(String bookSynopsis) {
        this.bookSynopsis = bookSynopsis == null ? null : bookSynopsis.trim();
    }

    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }

    public BigDecimal getBookOriginalPrice() {
        return bookOriginalPrice;
    }

    public void setBookOriginalPrice(BigDecimal bookOriginalPrice) {
        this.bookOriginalPrice = bookOriginalPrice;
    }

    public Float getBookDiscount() {
        return bookDiscount;
    }

    public void setBookDiscount(Float bookDiscount) {
        this.bookDiscount = bookDiscount;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
    }

    public Date getBookTime() {
        return bookTime;
    }

    public void setBookTime(Date bookTime) {
        this.bookTime = bookTime;
    }

    public String getBookPress() {
        return bookPress;
    }

    public void setBookPress(String bookPress) {
        this.bookPress = bookPress == null ? null : bookPress.trim();
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription == null ? null : bookDescription.trim();
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookImage='" + bookImage + '\'' +
                ", bookSynopsis='" + bookSynopsis + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookOriginalPrice=" + bookOriginalPrice +
                ", bookDiscount=" + bookDiscount +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookTime=" + bookTime +
                ", bookPress='" + bookPress + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                '}';
    }

    public Books() {
    }

    public Books(String bookName, String bookImage, String bookSynopsis, BigDecimal bookPrice, BigDecimal bookOriginalPrice, Float bookDiscount, String bookAuthor, Date bookTime, String bookPress, String bookDescription) {
        this.bookName = bookName;
        this.bookImage = bookImage;
        this.bookSynopsis = bookSynopsis;
        this.bookPrice = bookPrice;
        this.bookOriginalPrice = bookOriginalPrice;
        this.bookDiscount = bookDiscount;
        this.bookAuthor = bookAuthor;
        this.bookTime = bookTime;
        this.bookPress = bookPress;
        this.bookDescription = bookDescription;
    }
}