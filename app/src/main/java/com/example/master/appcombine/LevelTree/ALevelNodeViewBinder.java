package com.example.master.appcombine.LevelTree;

import android.view.View;
import android.widget.TextView;

import com.example.master.appcombine.R;

import me.texy.treeview.TreeNode;
import me.texy.treeview.base.BaseNodeViewBinder;

/**
 * Created by zxy on 17/4/23.
 */

public class ALevelNodeViewBinder extends BaseNodeViewBinder {

    TextView textView;


    public ALevelNodeViewBinder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.node_name_view);

    }


    @Override
    public int getLayoutId() {
        return R.layout.item_a_level;
    }

    @Override
    public void bindView(final TreeNode treeNode) {
        textView.setText(treeNode.getValue().toString());

    }

}
