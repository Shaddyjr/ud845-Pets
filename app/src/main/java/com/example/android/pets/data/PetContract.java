package com.example.android.pets.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public final class PetContract {

    public static final String CONTENT_AUTHORITY = "com.example.android.pets";
    public static final Uri BASE_CONTENT_URI = Uri.parse(String.format("content://%s", CONTENT_AUTHORITY));
    public static final String PATH_PETS = "pets";
    /**
     * Can't instantiate.
     */
    public PetContract() {
    }

    public static abstract class PetEntry implements BaseColumns{
        public final static String TABLE_NAME        = "pets";
        public final static String _ID               = BaseColumns._ID;
        public final static String COLUMN_PET_NAME   = "name";
        public final static String COLUMN_PET_BREED  = "breed";
        public final static String COLUMN_PET_WEIGHT = "weight";
        /**
         * Must take one of the following values: {@link #GENDER_UNKNOWN},
         * {@link #GENDER_MALE}, {@link #GENDER_FEMALE}.
         */
        public final static String COLUMN_GENDER = "gender";

        public final static int GENDER_UNKNOWN = 0;
        public final static int GENDER_MALE    = 1;
        public final static int GENDER_FEMALE  = 2;

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        /**
         * The MIME type of the {@link #BASE_CONTENT_URI} for a list of pets.
         */
        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        /**
         * The MIME type of the {@link #BASE_CONTENT_URI} for a single pet.
         */
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        public static boolean isValidGender(int gender){
            return gender == PetEntry.GENDER_MALE || gender == PetEntry.GENDER_FEMALE || gender == PetEntry.GENDER_UNKNOWN;
        }
    }
}