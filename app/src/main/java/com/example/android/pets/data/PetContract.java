package com.example.android.pets.data;

import android.provider.BaseColumns;

public final class PetContract {
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

    }
}
