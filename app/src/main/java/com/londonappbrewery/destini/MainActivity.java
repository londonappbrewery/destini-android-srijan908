package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button mTopButton;
    private Button mBottomButton;
    private TextView mStory;
    private Story mStorySet[] = new Story[] {new Story(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
            new Story(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
            new Story(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2)};
    private End mStoryEnd[] = new End[] {new End(R.string.T4_End),
            new End(R.string.T5_End),
            new End(R.string.T6_End)};
    private int mBottomButtonCount;
    private int mTopButtonCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);

        mStory = (TextView) findViewById(R.id.storyTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateQuestion(0);
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateQuestion(1);
            }
        });

    }

    private void updateQuestion(int set) {
       if (set == 0) {
           mTopButtonCount = mTopButtonCount +1;
           mStory.setText(mStorySet[2].getStory());
           mTopButton.setText(mStorySet[2].getStory_Ans1());
           mBottomButton.setText(mStorySet[2].getStory_Ans2());
           if (mTopButtonCount == 2 && (mBottomButtonCount ==0 || mBottomButtonCount == 1)) {
               mStory.setText(mStoryEnd[2].getEnd());
               mTopButton.setVisibility(View.INVISIBLE);
               mBottomButton.setVisibility(View.INVISIBLE);
           }
           if (mTopButtonCount == 1 && mBottomButtonCount ==1){
               mStory.setText(mStorySet[2].getStory());
               mTopButton.setText(mStorySet[2].getStory_Ans1());
               mBottomButton.setText(mStorySet[2].getStory_Ans2());
           }/*
           if (mTopButtonCount == 2 && mBottomButtonCount ==1){
               mStory.setText(mStoryEnd[2].getEnd());
               mTopButton.setVisibility(View.INVISIBLE);
               mBottomButton.setVisibility(View.INVISIBLE);
           }
           */
       }
       else if (set == 1) {
           mBottomButtonCount = mBottomButtonCount + 1;
           mStory.setText(mStorySet[1].getStory());
           mTopButton.setText(mStorySet[1].getStory_Ans1());
           mBottomButton.setText(mStorySet[1].getStory_Ans2());
           if (mBottomButtonCount == 2) {
               mStory.setText(mStoryEnd[0].getEnd());
               mTopButton.setVisibility(View.INVISIBLE);
               mBottomButton.setVisibility(View.INVISIBLE);
           }
           if ((mBottomButtonCount == 2 && mTopButtonCount == 1) || mBottomButtonCount == 1 && mTopButtonCount == 1) {
               mStory.setText(mStoryEnd[1].getEnd());
               mTopButton.setVisibility(View.INVISIBLE);
               mBottomButton.setVisibility(View.INVISIBLE);
           }/*
           if (mBottomButtonCount == 1 && mTopButtonCount == 1) {
               mStory.setText(mStoryEnd[1].getEnd());
               mTopButton.setVisibility(View.INVISIBLE);
               mBottomButton.setVisibility(View.INVISIBLE);
           }
           */
       }
    }
}
