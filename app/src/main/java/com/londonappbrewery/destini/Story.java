package com.londonappbrewery.destini;

public class Story {
    private int mStory;
    private int mStory_Ans1;
    private int mStory_Ans2;

    public int getStory() {
        return mStory;
    }

    public int getStory_Ans1() {
        return mStory_Ans1;
    }

    public int getStory_Ans2() {
        return mStory_Ans2;
    }

    public void setStory(int story) {
        mStory = story;
    }

    public void setStory_Ans1(int story_Ans1) {
        mStory_Ans1 = story_Ans1;
    }

    public void setStory_Ans2(int story_Ans2) {
        mStory_Ans2 = story_Ans2;
    }

    public Story(int story, int story_Ans1, int story_Ans2) {
        mStory = story;
        mStory_Ans1 = story_Ans1;
        mStory_Ans2 = story_Ans2;
    }
}
