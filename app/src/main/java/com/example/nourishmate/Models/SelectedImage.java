package com.example.nourishmate.Models;

import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class SelectedImage {

    private SelectedImageItem display;

    private SelectedImageItem small;

    private SelectedImageItem thumb;

    public SelectedImageItem getDisplay() {
        return display;
    }

    public SelectedImageItem getSmall() {
        return small;
    }

    public SelectedImageItem getThumb() {
        return thumb;
    }
}
