package com.keanurepos.awsimageupload.datastore;

import com.keanurepos.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static{
        USER_PROFILES.add(new UserProfile(UUID.fromString("518cc96b-3bc4-41c1-9f09-da97fc7167a1"), "janetjones",null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("9d20089c-000b-4dd7-8082-beadcadda0b5"), "antoniojunior",null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }

}
