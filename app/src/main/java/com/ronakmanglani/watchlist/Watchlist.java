package com.ronakmanglani.watchlist;

import android.app.Application;

public class Watchlist extends Application {

    // SharedPreference Keys
    public static final String TABLE_USER = "user_settings";
    public static final String LAST_SELECTED = "last_drawer_selection";
    public static final String THUMBNAIL_SIZE = "thumbnail_size";
    public static final String VIEW_MODE = "view_mode";
    public static final String VIEW_TYPE = "view_type";
    public static final int VIEW_MODE_GRID = 1;
    public static final int VIEW_MODE_LIST = 2;
    public static final int VIEW_TYPE_POPULAR = 1;
    public static final int VIEW_TYPE_RATED = 2;
    public static final int VIEW_TYPE_UPCOMING = 3;
    public static final int VIEW_TYPE_PLAYING = 4;

    // Intent Extra + Bundle Argument + Saved Instance State
    public static final String TOOLBAR_TITLE = "toolbar_title";
    public static final String MOVIE_ID = "movie_id";
    public static final String MOVIE_NAME = "movie_name";
    public static final String MOVIE_OBJECT = "movie_object";
    public static final String MOVIE_LIST = "movie_list";
    public static final String REVIEW_OBJECT = "review_object";
    public static final String REVIEW_LIST = "review_list";
    public static final String VIDEO_LIST = "video_list";
    public static final String PAGE_TO_DOWNLOAD = "page_to_download";
    public static final String TOTAL_PAGES = "total_pages";
    public static final String IS_LOADING = "is_loading";
    public static final String IS_LOCKED = "is_locked";

    // Tag for fragment manager
    public static final String TAG_GRID_FRAGMENT = "movie_grid_fragment";
}
