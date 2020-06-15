package com.example.testapp;

public class News implements INews {
    private int mId;
    private String mTitle, mPublishDate, mAuthor, mContent;
    private float mAverageRate;
    private int []rateList= new int[3];

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmPublishDate() {
        return mPublishDate;
    }

    public void setmPublishDate(String mPublishDate) {
        this.mPublishDate = mPublishDate;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public void setmAuthor(String mAuthor) {
        this.mAuthor = mAuthor;
    }

    public String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent;
    }

    public float getmAverageRate() {
        return mAverageRate;
    }

    public void setmAverageRate(float mAverageRate) {
        this.mAverageRate = mAverageRate;
    }

    @Override
    public void display() {
        System.out.println("Title: "+this.mTitle);
        System.out.println("PublishDate: "+this.mPublishDate);
        System.out.println("Author: "+this.mAuthor);
        System.out.println("Content: "+this.mContent);
        System.out.println("AverageRate: "+this.mAverageRate);
        System.out.println();
    }

    public int[] getRateList() {
        return rateList;
    }

    public void setRateList(int[] rateList) {
        this.rateList = rateList;
    }

    public void calculate(){
        int t=0;
        for(int i=0;i<3;i++)
            t+=rateList[i];
        this.mAverageRate= (float)t/3;
    }


}
