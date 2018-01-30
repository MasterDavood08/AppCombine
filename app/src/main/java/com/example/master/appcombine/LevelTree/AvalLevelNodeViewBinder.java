package com.example.master.appcombine.LevelTree;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.master.appcombine.R;

import me.texy.treeview.TreeNode;
import me.texy.treeview.TreeView;
import me.texy.treeview.base.BaseNodeViewBinder;

public class AvalLevelNodeViewBinder extends BaseNodeViewBinder{
    TextView textView;
    ImageView imageView;
    TreeView treeView;
    public AvalLevelNodeViewBinder(View itemView, TreeView treeView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.node_name_view);
        imageView = (ImageView) itemView.findViewById(R.id.arrow_img);
        this.treeView = treeView;
    }


    @Override
    public int getLayoutId() {
        return R.layout.item_aval_level;
    }

    @Override
    public void bindView(final TreeNode treeNode) {
        textView.setText(treeNode.getValue().toString());
        imageView.setRotation(treeNode.isExpanded() ? -90 : 0);

    }

    @Override
    public void onNodeToggled(TreeNode treeNode, boolean expand) {
        if (expand) {

//            treeView.collapseAll();
//            treeView.expandNode(treeNode);

            imageView.animate().rotation(-90).setDuration(200).start();
        } else {
            imageView.animate().rotation(0).setDuration(200).start();
        }
    }
}