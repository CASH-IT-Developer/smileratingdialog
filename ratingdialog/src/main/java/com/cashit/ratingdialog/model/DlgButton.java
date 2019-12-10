package com.cashit.ratingdialog.model;


import com.cashit.ratingdialog.AbstractDlg;

public class DlgButton {
    private String title;
    private int icon;
    private AbstractDlg.OnClickListener onClickListener;

    public DlgButton(String title, int icon, AbstractDlg.OnClickListener onClickListener) {
        this.title = title;
        this.icon = icon;
        this.onClickListener = onClickListener;
    }

    public String getTitle() {
        return title;
    }

    public int getIcon() {
        return icon;
    }

    public AbstractDlg.OnClickListener getOnClickListener() {
        return onClickListener;
    }
}
