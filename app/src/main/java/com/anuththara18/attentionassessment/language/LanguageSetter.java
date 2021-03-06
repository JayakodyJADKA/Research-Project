package com.anuththara18.attentionassessment.language;

import android.content.Context;
import android.content.res.Resources;

public class LanguageSetter {

    private static String language;
    private static Context context;
    private static Resources resources;


    public static void setLanguage(String language){
        com.anuththara18.attentionassessment.language.LanguageSetter.language = language;
    }
    public static String getLanguage(){
        return com.anuththara18.attentionassessment.language.LanguageSetter.language;
    }

    public static Resources getresources(){
        return com.anuththara18.attentionassessment.language.LanguageSetter.resources;
    }
    public static void changeLanguage(String language, Context c){

        //if user select prefered language as English then
        if(language.equals("English"))
        {
            context = LocaleHelper.setLocale(c, "en");
            resources = context.getResources();

        }
        //if user select prefered language as Tamil then
        if(language.equals("தமிழ்"))
        {
            context = LocaleHelper.setLocale(c, "ta");
            resources = context.getResources();

        }
        //if user select prefered language as Sinhala then
        if(language.equals("සිංහල"))
        {
            context = LocaleHelper.setLocale(c, "si");
            resources = context.getResources();

        }
    }
}
