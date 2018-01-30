package com.example.master.appcombine.LevelTree;

import android.view.View;

import me.texy.treeview.TreeView;
import me.texy.treeview.base.BaseNodeViewBinder;
import me.texy.treeview.base.BaseNodeViewFactory;

public class MyNodeViewFactory extends BaseNodeViewFactory {
    public TreeView treeView;


    @Override
    public BaseNodeViewBinder getNodeViewBinder(View view, int level) {
        switch (level) {
            case 0:
                return new AvalLevelNodeViewBinder(view, treeView);
            case 1:
                return new DovomLevelNodeViewBinder(view);
            case 100:
                return new QLevelNodeViewBinder(view);
            case 101:
                return new ALevelNodeViewBinder(view);
            case 99:
                return new DLevelNodeViewBinder(view);
            default:
                return null;
        }
    }

}
