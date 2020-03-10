package com.example.instaslam;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("User")

public class User extends ParseObject
{
    public static final String KEY_PROFILE = "ProfilePic";

    public ParseFile getImage()
    {
        return getParseFile(KEY_PROFILE);
    }

    public void setImage(ParseFile parseFile)
    {
        put(KEY_PROFILE, parseFile);
    }
}
