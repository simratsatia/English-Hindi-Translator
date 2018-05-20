package com.example.android.translator;

/**
 * Created by Simratpal Singh on 4/1/2017.
 */

public class Word {
    private String mEnglishTranslation;
    private String mHindiTranslation;
    private String mImageResourceId1;
    //1 is for english remember idiot
    private String mImageResourceId2;
    //2 is for hindi rememeber


    public Word (String english, String hindi ,String image, String image2){
        this.mEnglishTranslation=english;
        this.mHindiTranslation=hindi;

        this.mImageResourceId1=image;
        this.mImageResourceId2=image2;
    }

    public String getmEnglishTranslation(){
        return mEnglishTranslation;
    }

    public String getmHindiTranslation(){
        return mHindiTranslation;

    }



    public String getmImageResourceId1(){
        return mImageResourceId1;
    }

    public String getmImageResourceId2(){
        return mImageResourceId2;
    }
}
