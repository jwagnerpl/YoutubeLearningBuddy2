package teamtreehouse.com.youtube_learning_buddy.Model;

import com.google.gson.annotations.SerializedName;

public class Id {

    @SerializedName("videoId")
    String videoId;

    public String getVideoId() {
        return videoId;
    }
}
